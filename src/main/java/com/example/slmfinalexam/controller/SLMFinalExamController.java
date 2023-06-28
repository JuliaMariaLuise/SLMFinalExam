package com.example.slmfinalexam.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class SLMFinalExamController {

    @GetMapping("/modify")
    public String modifyString(String string) {
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (i % 2 == 1) {
                // Convert every second character to uppercase
                currentChar = Character.toUpperCase(currentChar);
            }

            modifiedString.append(currentChar);
        }

        return modifiedString.toString();
    }
}


