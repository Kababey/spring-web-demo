package com.example.demo;

import jakarta.validation.constraints.AssertTrue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;



@RestController
public class PersonController {
    @PostMapping("/people")
    public ResponseEntity<ArrayList<Person>> getPeople(@RequestBody ArrayList<Person> people){
        incrementAges(people);

        return ResponseEntity.status(202)
                .header("Agalar", "<3")
                .body(people);
    }



    public void incrementAges(ArrayList<Person> people){
        for(Person person : people){
            person.incrementAge();
        }
    }

}
