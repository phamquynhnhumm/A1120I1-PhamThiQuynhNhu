package com.codegym.controller;

import com.codegym.model.bean.Student;
import com.codegym.model.service.IStudentService;
import com.codegym.model.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/students")
public class MainController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/list")
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    public String getAllStudent(Model model) {
        model.addAttribute("listStudent", studentService.findAll());
        return "/list_student";
    }

    @GetMapping("/create")
    //@RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showFormCreate(Model model) {
        model.addAttribute("student", new Student());
        return "/create_student";
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute("student")Student student, RedirectAttributes redirectAttributes) {
        studentService.save(student);
        redirectAttributes.addFlashAttribute("msg", "Thêm mới thành công");
        return "redirect:/students/list";
    }

}
