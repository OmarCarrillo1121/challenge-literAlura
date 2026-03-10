package com.omarcarrillo.literalura.service;

import java.net.URI;
import java.net.http.*;

public class ConsumoAPI {
    public String obtenerDatos(String url) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
}