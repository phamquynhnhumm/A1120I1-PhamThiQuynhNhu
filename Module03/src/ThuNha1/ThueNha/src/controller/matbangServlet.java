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
                break;
            case "share":
                ShareMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);

        }
    }

    private void ShareMatbang(HttpServletRequest request, HttpServletResponse response) {
//          <input type="checkbox" id="loai" name="loai" >
//                <label for="loai"> Tìm kiếm theo loại</label><br>
//
//                <input type="checkbox" id="gia" name="gia" >
//                <label for="gia"> Tìm kiếm theo giá</label><br>
//
//                <input type="checkbox" id="tang" name="tang" >
//                <label for="tang"> Tìm kiếm theo tầng</label><br><br>
//                <input type="submit" value="tìm kiếm">

        String timkiem1 = request.getParameter("timkiem1");
        String timkiem2 = request.getParameter("timkiem2");
        String timkiem3 = request.getParameter("timkiem3");
        String gtriloai = request.getParameter("gtriloai");
        String gtrigia = request.getParameter("gtrigia");
        String giatrtang = request.getParameter("giatrtang");
        System.out.println("gia trim dang tim kiem theo1 " + timkiem1);
        System.out.println("gia trim dang tim kiem theo 2" + timkiem2);
        System.out.println("gia trim dang tim kiem theo 3" + timkiem3);
        if(timkiem1 != null && timkiem2 != null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo 3 gia trị");
        }
        else if(timkiem1 != null && timkiem2 != null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo loai va gia");
        }
        else if(timkiem1 != null && timkiem2 == null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo loai va tang");
        }
        else if(timkiem1 == null && timkiem2 != null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo gia va tang");
        }
        else if(timkiem1 != null && timkiem2 == null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo loai");
        }
        else if(timkiem1 == null && timkiem2 != null && timkiem3 == null)
        {
            System.out.println("tìm kiem theo gia");
        }
        else if(timkiem1 == null && timkiem2 == null && timkiem3 != null)
        {
            System.out.println("tìm kiem theo tang");
        }
    }

    private void DeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs", matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request, response);
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

//        if(validate.dateIf(ngaybatdau,ngayketthuc) >4)
//        {
//            System.out.println("thoi  gian dung : " + validate.dateIf(ngaybatdau,ngayketthuc));
//        }
//        else {
//            System.out.println("thoi gian sai :" + validate.dateIf(ngaybatdau,ngayketthuc));
//        }

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
            case "delete":
                ShowDeleteMatbang(request,response);
                break;
            case "share":
                ShowShareMatbang(request,response);
                break;
            default:
                ListMatbang(request,response);
        }
    }

    private void ShowShareMatbang(HttpServletRequest request, HttpServletResponse response) {

    }

    private void ShowDeleteMatbang(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println("xoa id" + id);
        service.remove(id);
        List<Matbang> matbangs = service.finAll();
        request.setAttribute("matbangs", matbangs);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/matbang/list.jsp");
        dispatcher.forward(request, response);
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
