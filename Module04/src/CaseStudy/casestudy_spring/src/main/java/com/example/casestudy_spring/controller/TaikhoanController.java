package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.taikhoan.User;
import com.example.casestudy_spring.model.service.UserService;
import com.example.casestudy_spring.model.service.VaitroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TaikhoanController {

    @Autowired
    private UserService userService;

    @Autowired
    private VaitroService vaitroService;

    @GetMapping(value = "/")
    private String viewDangnhap(Model model, User user) {
        model.addAttribute("users1", new User());
        return "/user/list";
//        return "/trangchu/list";

    }
    @PostMapping(value = "/dangnhap")
    private String DangNhap(@RequestParam("tenUser") String tenUser, @RequestParam("matKhau") String matKhau, RedirectAttributes redirectAttributes, Model model) {
        if (userService.dangnhap(tenUser, matKhau) == 1) {
            model.addAttribute("tenUsers", tenUser);
            return "/trangchu";
        } else {
            model.addAttribute("mgs", "sai ten hoac  mat khau");
            return "redirect:/";
        }
    }

//    @GetMapping("/user/create")
//    private String ViewCrete()



}
