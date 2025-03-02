package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // class anotasyonuna @RestController yazarak Bütün metotlar @ResponseBody olur
public class StudentController {
    @GetMapping("/student")
    public ResponseEntity<Student> student(){
        return ResponseEntity.status(202)
                .header("Hata", "False")
                .body(new Student("Talha", 22, "kababey111@gmail.com"));

    }
}
