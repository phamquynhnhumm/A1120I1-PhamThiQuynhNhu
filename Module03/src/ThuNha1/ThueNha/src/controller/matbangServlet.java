package controller;

import common.validate;
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
    private validate validate = new validate();
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
            case "delete":
                DeleteMatbang(request,response);
            default:
                ListMatbang(request,response);

        }
    }

    private void DeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        ListMatbang(request,response);
    }

    private void EditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String trangthai = request.getParameter("trangthai");
        float dientich = Float.parseFloat(request.getParameter("dientich"));
        int tang  = Integer.parseInt(request.getParameter("tang"));
        String loai = request.getParameter("loai");
        float gia = Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau = request.getParameter("ngaybatdau");
        String ngayketthuc = request.getParameter("ngayketthuc");

        Matbang matbang =  new Matbang(id,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc);
        System.out.println("id sua la:" + matbang);
        service.update(id,matbang);
        ListMatbang(request,response);
    }

    private void CreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String trangthai = request.getParameter("trangthai");
        float dientich = Float.parseFloat(request.getParameter("dientich"));
        int tang  = Integer.parseInt(request.getParameter("tang"));
        String loai = request.getParameter("loai");
        float gia = Float.parseFloat(request.getParameter("gia"));
        String ngaybatdau = request.getParameter("ngaybatdau");
        String ngayketthuc = request.getParameter("ngayketthuc");

        if(validate.dateIf(ngaybatdau,ngayketthuc))
        {
            System.out.println("thoi  gian dung : " + validate.dateIf(ngaybatdau,ngayketthuc));
        }
        else {
            System.out.println("thoi gian sai :" + validate.dateIf(ngaybatdau,ngayketthuc));
        }

        if(service.finByIdTrung(id) == true) // chưa có id
        {
            Matbang matbang =  new Matbang(id,trangthai,dientich,tang,loai,gia,ngaybatdau,ngayketthuc);
            service.save(matbang);
            ListMatbang(request,response);
        }
        else
        {
            request.setAttribute("message","Mã mặt bằng vừa thêm đã tồn tại");
            RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
            dispatcher.forward(request,response);
        }
        System.out.println(" gia tri nul hay không" + service.finByIdTrung(id));
        System.out.println("ngay bay dayu va ket tuc" + ngaybatdau + ngayketthuc);

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
            case "delete" :
                ShowDeleteMatbang(request,response);
            default:
                ListMatbang(request,response);
        }
    }

    private void ShowDeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        ListMatbang(request,response);
    }

    private void ListMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs",matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowEditMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String id = request.getParameter("id");
        request.setAttribute("matbang",service.finById(id));
        System.out.println("id là :" + id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/edit.jsp");
        dispatcher.forward(request,response);
    }

    private void ShowCreateMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("matbang", service.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/create.jsp");
        dispatcher.forward(request,response);
    }
}
