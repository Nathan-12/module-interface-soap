package org.nathan.moduleinterfacesoap.service;

import org.nathan.moduleinterfacesoap.model.ClienteREST;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RestClientService {

    private final WebClient webClient;

    public RestClientService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("https://6633b8f7f7d50bbd9b4a76de.mockapi.io").build();
    }

    public List<ClienteREST> getAllClients() {
        return this.webClient.get()
                .uri("/clientes/cliente")
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ClienteREST>>() {})
                .block();
    }

}
