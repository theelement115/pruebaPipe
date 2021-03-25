package co.edu.eafit.protoapp;



import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;

public class Calculadora {

    
    // multiplica el numero
    public Double cuadrado(Double numero) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://w8rs3evrl4.execute-api.us-east-1.amazonaws.com/Prod/hello/"))
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
