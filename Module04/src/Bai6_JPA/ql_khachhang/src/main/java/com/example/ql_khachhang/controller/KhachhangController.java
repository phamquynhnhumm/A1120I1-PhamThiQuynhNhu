package com.example.ql_khachhang.controller;

import com.example.ql_khachhang.model.entity.Khachhang;
import com.example.ql_khachhang.model.service.KhachhangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.plaf.basic.BasicSplitPaneUI;

@Controller
public class KhachhangController {

    @Autowired
    private KhachhangService khachhangService;

    @GetMapping( value = "/khachhang")
    private String list(Model model)
    {
        model.addAttribute("khachhangs", khachhangService.findAll());
        return "/list";
    }

    @GetMapping(value = "/create")
    private String viewCreate(Khachhang khachhang, Model model)
    {
        model.addAttribute("khachhangs", new Khachhang());
        return "/create";
    }

    @PostMapping( value = "/create")
    private String Create(Khachhang khachhang, Model model)
    {
        this.khachhangService.save(khachhang);
        return "redirect:/khachhang";
    }

    @GetMapping( value = "/edit")
    private String viewEdit(Khachhang khachhang, Model model, @RequestParam Integer id)
    {
        model.addAttribute("khachhangs", khachhangService.finById(id));
        return "/edit";
    }

    @PostMapping( value = "/edit")
    private String Edit(Khachhang khachhang )
    {
        this.khachhangService.save(khachhang);
        return "redirect:/khachhang";
    }

    @GetMapping(value = "/delete")
   private String delete(Khachhang khachhang, @RequestParam Integer id)
    {
        khachhangService.remove(khachhang);
        return "redirect:/khachhang";
    }

}
