package br.com.eduarda.studyai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class GeminiService {

    @Value("${gemini.api.key}")
    private String apiKey;

    private final RestClient restClient = RestClient.create();

    public String perguntar(String pergunta) {

        String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-3.6-flash:generateContent";

        Map<String, Object> body = Map.of(
            "contents", List.of(
                Map.of(
                    "parts", List.of(
                        Map.of(
                            "text",
                            "Responda em português do Brasil, em texto simples, sem Markdown, sem asteriscos e sem hashtags. Mantenha acentos, pontuação e caracteres normais da língua portuguesa. " + pergunta+ pergunta
                        )
                    )
                )
            )
        );

        Map resposta = restClient.post()
                .uri(url)
                .header("x-goog-api-key", apiKey)
                .header("Content-Type", "application/json")
                .body(body)
                .retrieve()
                .body(Map.class);

        List candidates = (List) resposta.get("candidates");
        Map candidate = (Map) candidates.get(0);
        Map content = (Map) candidate.get("content");
        List parts = (List) content.get("parts");
        Map part = (Map) parts.get(0);

        return part.get("text").toString();
    }
}