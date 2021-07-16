package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hellocontrolers {
   @GetMapping("/hello")
    public String helloWror(){
        return "nhu quynh hi hi";
    }
}
