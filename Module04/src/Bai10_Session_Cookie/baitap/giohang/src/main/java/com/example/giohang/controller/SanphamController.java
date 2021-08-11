package com.example.giohang.controller;

import com.example.giohang.model.entity.SanPham;
import com.example.giohang.model.service.SanphamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("muahangTalk")
public class SanphamController {
    @Autowired
    private SanphamService sanphamService;

    @ModelAttribute("muahangTalk")
    public List<SanPham> muahangTalm()
    {
        return new ArrayList<>();
    }

    @GetMapping(value = "/")
    private String viewlist(Model model)
    {
        model.addAttribute("sanphams", sanphamService.findAll());
        return "/list";

    }
    @GetMapping(value = "/view")
    private String chitieit (@RequestParam("id") Integer id, Model model)
    {
        model.addAttribute("sanphams", sanphamService.finById(id));
        return "/view";
    }

    @GetMapping(value = "/giohang")
    private String giohang(@RequestParam("id") Integer id,@ModelAttribute(name = "muahangTalk") List<SanPham> muahangTalk, Model model)
    {
        SanPham sanPham = sanphamService.finById(id);
        muahangTalk.add(sanPham);
        model.addAttribute("muahangTalk",muahangTalk);
        model.addAttribute("mgs","thêm giỏ hàng thành công");
        return "/giohang";
    }
}
