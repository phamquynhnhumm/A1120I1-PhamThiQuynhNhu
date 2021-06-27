package controller;

import service.UserService;
import service.UserServicelmpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserServicelmpl();
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        String ten = request.getParameter("ten");
        String matkhau = request.getParameter("matkhau");
        String message = "Sai ten hoặc mật khẩu ";

        System.out.println(session);
        System.out.println("co" + service.finByName(ten,matkhau));
        if (service.finByName(ten,matkhau)) {
            session.setAttribute("ten", ten);
            session.setAttribute("matkhau", matkhau);

// tạo Cookie lưu mk
            Cookie cookie = new Cookie("ten",ten);
            cookie.setMaxAge(30); //thời gian sống cua cookie là 30s
            response.addCookie(cookie);

            RequestDispatcher dispatcher = request.getRequestDispatcher("trangchu.jsp");
            dispatcher.forward(request, response);
        }
        else {
            session.setAttribute("message", "Bạn đã nhập sai tên hoặc mật khẩu!");
            response.sendRedirect(request.getContextPath() + "/index.jsp?error=0");

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text.html");



    }
}
