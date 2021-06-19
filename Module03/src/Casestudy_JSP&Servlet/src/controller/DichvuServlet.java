package controller;

import model.*;
import service.DichvuService;
import service.DichvuServicelmpl;
import service.KieuthuService;
import service.KieuthuServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DichvuServlet", urlPatterns = "/dichvu")
public class DichvuServlet extends HttpServlet {
    public DichvuService service = new DichvuServicelmpl();
    public KieuthuService kieuthuService = new KieuthuServicelmpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                CreateDichvu(request,response);
                break;
            case "edit":
                EditDichvu(request,response);
                break;
            case "search":
                SearchDichvu(request,response);
                break;
            case "delete":
                DeleteDichvu(request,response);
                break;
            case "sort":
                SortDichvu(request,response);
                break;
            default:
                ListDichvu(request,response);
        }



    }

    private void SortDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void ListDichvu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("dichvu",service.finAll());
        List<Dichvu> a = service.finAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/dichvu/list.jsp");
        dispatcher.forward(request,response);
        System.out.println(a);
    }

    private void DeleteDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void SearchDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void EditDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void CreateDichvu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id= request.getParameter("id");
        String ten = request.getParameter("ten");
        Float dientich =Float.parseFloat(request.getParameter("dientich"));
        float chiphi = Float.parseFloat(request.getParameter("chiphi"));
        String songuoi =request.getParameter("songuoi");
        String id_kieuthue = request.getParameter("id_kieuthue");
        System.out.println("kieu thue id: " + id_kieuthue);
        Dichvu dichvu = new Dichvu(id,ten,dientich,chiphi,songuoi, new Kieuthue(id_kieuthue));
        service.save(dichvu );
        ListDichvu(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action="";
        }
        switch (action)
        {
            case "create":
                showCreateDichvu(request,response);
                break;
            case "edit":
                showEditDichvu(request,response);
                break;
            case "search":
                showSearchDichvu(request,response);
                break;
            case "delete":
                showDeleteDichvu(request,response);
                break;
            case "sort":
                showSortDichvu(request,response);
                break;
            default:
                ListDichvu(request,response);
        }
    }
    private void showSortDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showDeleteDichvu(HttpServletRequest request, HttpServletResponse response) {
    }
    private void showSearchDichvu(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditDichvu(HttpServletRequest request, HttpServletResponse response) {
    }
    private void showCreateDichvu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Kieuthue> kieuthue = kieuthuService.finAll();
        request.setAttribute("kieuthue",kieuthue);
        RequestDispatcher dispatcher= request.getRequestDispatcher("/dichvu/create.jsp");
        dispatcher.forward(request,response);
    }
}
