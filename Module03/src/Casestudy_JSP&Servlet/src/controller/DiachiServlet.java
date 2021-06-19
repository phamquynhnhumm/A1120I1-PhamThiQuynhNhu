package controller;

import model.Diachi;
import model.Khachhang;
import model.Loaikhach;
import service.DiachiService;
import service.DiachiServicelmpl;
import service.LoaikhachService;
import service.LoaikhachServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DiachiServlet",urlPatterns = "/diachi")
public class DiachiServlet extends HttpServlet {
   private   DiachiService service = new DiachiServicelmpl();
    private LoaikhachService loaikhachService = new LoaikhachServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                CreateDiachi(request, response);
                break;
            case "edit":
                EditDiachi(request, response);
                break;
            case "delete":
                DeleteDiachi(request, response);
                break;

            default:
                ListDiachi(request, response);
        }
    }

    private void CreateDiachi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String id_diachi =request.getParameter("id");
         String sonha = request.getParameter("sonha");
         String xa =request.getParameter("xa");
         String huyen  =request.getParameter("huyen");
         String tinh  =request.getParameter("tinh");
         String quocgia  =request.getParameter("quocgia");
         Diachi diachi = new Diachi(id_diachi,sonha,xa,huyen,tinh,quocgia);
         System.out.println("id dia ci" +id_diachi);
         service.save(diachi);
        ListDiachi(request,response);

         ListDiachi(request, response);
    }
    private void EditDiachi(HttpServletRequest request, HttpServletResponse response) {
    }
    private void DeleteDiachi(HttpServletRequest request, HttpServletResponse response) {
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
                showCreateDiachi(request, response);
                break;
            case "edit":
                showEditDiachi(request, response);
                break;
            case "delete":
                showDeleteDiachi(request, response);
                break;

            default:
                ListDiachi(request, response);
        }


    }
    private void ListDiachi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id_diachi =request.getParameter("id");
        List<Diachi> diachi = service.finAll();
         request.setAttribute("diachi",diachi);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/diachi/diachimoithem.jsp");
        dispatcher.forward(request,response);
    }
    private void showDeleteDiachi(HttpServletRequest request, HttpServletResponse response) {
    }
    private void showEditDiachi(HttpServletRequest request, HttpServletResponse response) {
    }
    private void showCreateDiachi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher= request.getRequestDispatcher("/diachi/create.jsp");
        dispatcher.forward(request,response);
    }

}
