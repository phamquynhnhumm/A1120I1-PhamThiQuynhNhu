package controller;

import service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HopdongServlet",urlPatterns = "/hopdong")
public class HopdongServlet extends HttpServlet {
    private HopdongService service = new HopdongServicelmpl();
    private DichvuService dichvuService = new DichvuServicelmpl();
    private KhachhangService khachhangService = new KhachhangServicelpml();
    private  NhanvienService nhanvienService = new NhanvienServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action = "";
        }
        switch (action)
        {
            case "create":
                CreateHopdong(request,response);
                break;
            default:
                ListHopdong(request,response);
        }
    }

    private void CreateHopdong(HttpServletRequest request, HttpServletResponse response) {
    }

    private void ListHopdong(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("hopdong",service.finAll());
        System.out.println("ds hp ding:" +service.finAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/hopdong/list.jsp");
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action == null)
        {
            action = "";
        }
        switch (action)
        {
            case "create":
                CreateHopdong(request,response);
                break;
            default:
                ListHopdong(request,response);
        }
    }
}
