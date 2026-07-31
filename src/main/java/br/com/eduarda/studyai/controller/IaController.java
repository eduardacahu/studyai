package br.com.eduarda.studyai.controller;

import br.com.eduarda.studyai.service.GeminiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IaController {

    private final GeminiService geminiService;

    public IaController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @GetMapping("/perguntar")
    public String perguntar(@RequestParam String pergunta) {
        return geminiService.perguntar(pergunta);
    }
}