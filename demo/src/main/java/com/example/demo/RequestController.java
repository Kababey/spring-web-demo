package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // Rest dönen requesti json objesi olarak veriyor
// Controller ise farklı TODO: Bak
public class RequestController {
    @RequestMapping ("/courses/{courseNumber}")
    public String parsePath(@PathVariable Long courseNumber, @RequestParam String name, @RequestParam String                                                                                                                           instructor){
        System.out.println(courseNumber + " " + name + " " + instructor);
        return courseNumber + " " + name + " " + instructor;
    }
}
