package controller;

import model.Khachhang;
import service.KhachhangService;
import service.KhachhangServicelpml;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "KhachhangServlet", urlPatterns = {"/khachhang",""})
public class KhachhangServlet extends HttpServlet {
    private KhachhangService service = new KhachhangServicelpml();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        System.out.println("ddoppoer");
        switch (action)
        {
            case "create":
                CreateKhachhang(request,response);
                break;
            default:
                ListKhachhang(request,response);
        }
    }

    private void CreateKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                showCreateKhachhang(request,response);
                break;
            case "edit":
                showEditKhachhang(request,response);
                break;
            case "search":
                showSearchKhachhang(request,response);
                break;
            case "delete":
                showDeleteKhachhang(request,response);
                break;
            case "sort":
                showSortKhachhang(request,response);
                break;
            default:
                ListKhachhang(request,response);
        }


    }

    private void ListKhachhang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("đang list ds khách hàng");
        request.setAttribute("khachhang",service.finAll());
        List<Khachhang> a = service.finAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/khachhang/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showSortKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showDeleteKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showSearchKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showCreateKhachhang(HttpServletRequest request, HttpServletResponse response) {
    }
}
