package controller;

import model.Matbang;
import service.matbangService;
import service.matbangServicelmpl;

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
                CreateMatbang();
                break;
            case "eidt":
                EditMatbang();
                break;
            default:
                ListMatbang();

        }
    }

    private void CreateMatbang() {
    }

    private void EditMatbang() {
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
                ShowCreateMatbang();
                break;
            case "eidt":
                ShowEditMatbang();
                break;
            default:
                ListMatbang();
        }
    }

    private void ShowEditMatbang() {
    }

    private void ShowCreateMatbang() {
    }

    private void ListMatbang() {

    }
}
