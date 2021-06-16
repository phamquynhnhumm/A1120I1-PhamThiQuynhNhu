package controller;

import service.UserService;
import service.UserServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/user",""})
public class UserServlet extends HttpServlet {
    private UserService service = new UserServicelmpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
                showCreatrFrom(request,response);
                break;
            case "edit":
                showEditFrom(request,response);
                break;
            default:
                ListUser(request,response);
        }


    }

    private void ListUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("user",service.findAll());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/user/list.jsp");
        dispatcher.forward(request,response);
    }

    private void showEditFrom(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showCreatrFrom(HttpServletRequest request, HttpServletResponse response) {
    }
}
