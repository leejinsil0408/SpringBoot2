package com.example.demo.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi")
    public String NiceToMeetYou(Model model) {
        System.out.println("hi init");
        model.addAttribute("data","jin");
        return "hello";
    }

    @GetMapping("/bye")
    public String SeeYouNext(Model model) {
        model.addAttribute("data","jin");
        return "goodbye";
    }
}
