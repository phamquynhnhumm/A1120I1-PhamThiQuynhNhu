package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class chuyentien{
    @GetMapping("/chuyen")
    public String chuyen()
    {
        return "index";
    }
    @PostMapping("/chuyen")
    public String tinh(@RequestParam("vnd") int vnd, Model model)
    {
        model.addAttribute("usd", vnd*23);
        return "index";
    }
}
