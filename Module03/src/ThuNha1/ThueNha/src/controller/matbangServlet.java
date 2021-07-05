package controller;

import model.Matbang;
import service.matbangService;
import service.matbangServicelmpl;

import javax.imageio.metadata.IIOMetadataNode;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "matbangServlet", urlPatterns = {"/matbang",""})
public class matbangServlet extends HttpServlet {
    private  matbangService service = new matbangServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                CreateMatbang(request,response);
                break;
            case "edit":
                EditMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);

        }
    }

    private void EditMatbang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void CreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id_matbang");
        String trangthai = request.getParameter("trangthai");
        float dientich = Float.parseFloat(request.getParameter("dientich"));
        int tang  = Integer.parseInt(request.getParameter("tang"));
        String loai = request.getParameter("loai");
        float gia = Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau = request.getParameter("ngaybatdau");
        String ngayketthuc = request.getParameter("ngayketthuc");
        Matbang matbang =  new Matbang(id,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc);
        service.save(matbang);
        ListMatbang(request,response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                ShowCreateMatbang(request,response);
                break;
            case "edit":
                ShowEditMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);
        }
    }

    private void ListMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs",matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowEditMatbang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void ShowCreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("matbang", service.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
        dispatcher.forward(request,response);
    }
}
