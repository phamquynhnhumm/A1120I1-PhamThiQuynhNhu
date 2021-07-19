package controller;


import model.homthu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thu
{
    @GetMapping("/home")
    public String home(Model model)
    {
        int[] size = {5,10,15,25,50,100};
        String[] languages = { "English", "Vietnamese", "Japanese", "Chinese" };
        String[] thurac = { "thurac"};
        model.addAttribute("ngonngu", languages);
        model.addAttribute("size",size);
        model.addAttribute("thurac",thurac);
        model.addAttribute("homthu", new homthu());
        return "home";
    }

    @PostMapping("/home")
    public String viewthu(@ModelAttribute("homthu") homthu homthu, BindingResult result, ModelMap model)
    {

        model.addAttribute("ngonngu",homthu.getNgonngu());
        model.addAttribute("size", homthu.getSize());
        model.addAttribute("thurac",homthu.getThurac());
        model.addAttribute("noidung",homthu.getNoidung());
        return "view";
    }
}
