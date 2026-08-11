package br.com.eduarda.studyai.service;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
LocalDate hoje = LocalDate.now(ZoneId.of("America/Sao_Paulo"));

String dataAtual = hoje.format(
    DateTimeFormatter.ofPattern("dd/MM/yyyy")
);
        Map<String, Object> body = Map.of(
            "contents", List.of(
                Map.of(
                    "parts", List.of(
                        Map.of(
                            "text",
                            
"Hoje é " + dataAtual + ". " +
"Você é um assistente de estudos. " +
"Responda exatamente ao que foi pedido, sem acrescentar explicações desnecessárias. " +
"Use português brasileiro com acentuação correta. " +
"Nunca utilize Markdown, asteriscos, hashtags ou emojis. " +
"Se a pergunta envolver a data atual, utilize esta data. " +
"Pergunta: " + pergunta
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