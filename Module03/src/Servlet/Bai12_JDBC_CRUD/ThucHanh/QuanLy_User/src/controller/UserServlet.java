package controller;

import model.User;
import service.IUsersService;
import service.IUsersServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = {"/user",""})
public class UserServlet extends HttpServlet {
    private static final  long serialVersionUID = 1L;
    private IUsersServicelmpl iUsersService;
    public  void  init()
    {
        iUsersService =  new IUsersServicelmpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(  action == null)
        {
            action ="";
        }
        switch (action)
        {
            case "create":
                insertUser(request,response);
                break;
            case "edit":
                updateUsers(request,response);
                break;
            default:
                lisyUser(request,response);
                break;
        }
    }

    private void lisyUser(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateUsers(HttpServletRequest request, HttpServletResponse response) {
    }

    private void insertUser(HttpServletRequest request, HttpServletResponse response) {
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
                showCreateFrom(request,response);
                break;
            case "eidt":
                showEditFrom(request,response);
                break;
            case "view":
                showViewFrom(request,response);
                break;
            case "delete":
                showDeleteFrom(request,response);
                break;
            default:
                showList(request,response);
                break;
        }



    }

    private void showCreateFrom(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showEditFrom(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showViewFrom(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showDeleteFrom(HttpServletRequest request, HttpServletResponse response) {
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) {
        List<User> user = iUsersService.selectAllUser();
        request.setAttribute("user",user);
        System.out.println("in chao");
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
        try {
            dispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
