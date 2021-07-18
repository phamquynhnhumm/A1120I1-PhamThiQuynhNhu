package controller;


import model.Khachhang;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

@GetMapping("/khachhang")
public String showForm(ModelMap modelMap)
    {
        modelMap.addAttribute("khachhang",new Khachhang());
        return "khachhang/create";
    }


    @PostMapping("/khachhang")
    public String hienthi(@ModelAttribute("khachhang") Khachhang khachhang, BindingResult result, ModelMap modelMap)
    {
        modelMap.addAttribute("ten", khachhang.getTen());
        modelMap.addAttribute("sdt",khachhang.getSdt());
        modelMap.addAttribute("id",khachhang.getId());
        return "khachhang/list";

    }
}
