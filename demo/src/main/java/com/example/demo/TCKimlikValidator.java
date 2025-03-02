package com.example.demo;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class TCKimlikValidator implements ConstraintValidator<TCKimlikNo, String> {

    public void initialize(TCKimlikNo constraint) {

    }

    public boolean isValid(String tcKimlikNo, ConstraintValidatorContext context) {
        return false;
    }
}
