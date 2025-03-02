package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
    @RequestMapping("/welcome")
    public String welcome(@RequestParam String name, @RequestParam String surname){
        System.out.println(name + " " + surname);
        return "welcome.html";
    }

}
