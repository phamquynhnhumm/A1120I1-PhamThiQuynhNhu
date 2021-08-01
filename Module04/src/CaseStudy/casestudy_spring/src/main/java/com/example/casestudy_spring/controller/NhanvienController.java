package com.example.casestudy_spring.controller;

import com.example.casestudy_spring.model.entity.nhanvien.NhanVien;
import com.example.casestudy_spring.model.service.BophanService;
import com.example.casestudy_spring.model.service.NhanvienService;
import com.example.casestudy_spring.model.service.TrinhdoService;
import com.example.casestudy_spring.model.service.VitriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NhanvienController {
    @Autowired
    private NhanvienService nhanvienService;

    @Autowired
    private TrinhdoService trinhdoService;

    @Autowired
    private VitriService vitriService;

    @Autowired
    private BophanService bophanService;

    @GetMapping(value = "/nhanvien")
    private String list(@RequestParam(value = "page", defaultValue = "0") int page, Model model)
    {
        Sort sort = Sort.by("idNhanVien").and(Sort.by("tenNhanVien")).descending();
        model.addAttribute("nhanviens",nhanvienService.findAll(PageRequest.of(page,2,sort)));
        return "/nhanvien/list";
    }

    @GetMapping(value = "/nhanvien/create")
    private String viewCreate(Model model)
    {
        model.addAttribute("nhanviens", new NhanVien());
        model.addAttribute("trinhdos", trinhdoService.findAll());
        model.addAttribute("vitris", vitriService.findAll());
        model.addAttribute("bophans", bophanService.findAll());
        return "/nhanvien/create";
    }

}
