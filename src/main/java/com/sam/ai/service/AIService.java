package com.sam.ai.service;

import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.ai.ollama.api.OllamaModel;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AIService {

    @Autowired
    OllamaChatModel chatModel;

    public String generateResult(String prompt){

        ChatResponse chatResponse = chatModel.call(
                new Prompt(prompt,
                        OllamaOptions.create()
                                .withModel(OllamaModel.MISTRAL.getModelName()))

        );

        return chatResponse.getResult().getOutput().getContent();

    }
}
