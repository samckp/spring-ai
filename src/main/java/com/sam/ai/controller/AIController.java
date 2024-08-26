package com.sam.ai.controller;

import com.sam.ai.service.AIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

    @Autowired
    AIService aiService;

    @GetMapping("/generate")
    public String generatedResult(@RequestParam("prompt") String prompt){

        return aiService.generateResult(prompt);
    }
}
