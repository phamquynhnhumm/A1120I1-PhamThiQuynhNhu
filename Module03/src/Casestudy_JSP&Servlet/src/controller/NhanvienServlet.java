package controller;

import service.NhanvienService;
import service.NhanvienServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "NhanvienServlet")
public class NhanvienServlet extends HttpServlet {
    private NhanvienService service = new NhanvienServicelmpl();
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                CreateNhanvien(request,response);
                break;
            case "edit":
                EditNhanvien(request,response);
                break;
            case "search":
                SearchNhanvien(request,response);
                break;
            case "delete":
                DeleteNhanvien(request,response);
                break;
            default:
                ListNhanvien(request,response);
        }
    }

    private void DeleteNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void SearchNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void EditNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void CreateNhanvien(HttpServletRequest request, HttpServletResponse response) {
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
                showCreateNhanvien(request,response);
                break;
            case "edit":
                showEditNhanvien(request,response);
                break;
            case "search":
                showSearchNhanvien(request,response);
                break;
            case "delete":
                showDeleteNhanvien(request,response);
                break;
            default:
                ListNhanvien(request,response);
        }

    }

    private void showDeleteNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showSearchNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void ListNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showCreateNhanvien(HttpServletRequest request, HttpServletResponse response) {
    }
}
