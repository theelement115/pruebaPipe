package co.edu.eafit.protoapp;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;
import jdk.incubator.http.HttpResponse.BodyHandler;

public class Calculadora {

    
    // multiplica el numero
    public Double cuadrado(Double numero) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create("https://w8rs3evrl4.execute-api.us-east-1.amazonaws.com/Prod/hello/"))
              .GET()
              .build();
        try {
            HttpResponse<String> respuesta=client.send(request, BodyHandler.asString());
            respuesta.body();
            return numero * numero;
        } catch (IOException | InterruptedException e) {
            // TODO Auto-generated catch block
            return numero * numero;
        }  
    }

    
}
