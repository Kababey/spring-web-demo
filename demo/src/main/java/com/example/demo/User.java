package com.example.demo;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@lombok.Getter
@lombok.Setter
@lombok.ToString
@lombok.RequiredArgsConstructor
@Component
public class User {
    @NotBlank(message = "name can't be empty")
    private String name;
    @NotBlank(message = "surname can't be empty")
    private String surname;
    @Min(value=12, message = "Age must be greater than 12")
    @Max(value=100, message = "Age must be less than 100")
    private Integer age;
    @NotBlank(message = "username can't be empty")
    private String username;
    @NotBlank(message = "password can't be empty")
    @Email(message = "E-mail is invalid")
    private String email;
    @Size(min = 11, max = 11, message = "TCK No must be 11 characters")
    private String tckNo;
    @PastOrPresent(message = "Date of born is invalid")
    private LocalDateTime dateofBorn;
    @Size(max = 250, message = "Residence can't be longer than 250 characters")
    private String residence;

    @AssertTrue(message = "Username must be different from \"admin\"")
    public boolean isNotAdmin(){
        return !username.equals("admin");
    }

}
