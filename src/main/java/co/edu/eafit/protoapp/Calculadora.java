package co.edu.eafit.protoapp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Calculadora {

    
    // multiplica el numero
    public Double cuadrado(Double numero) {
        try {

            URL url = new URL("https://w8rs3evrl4.execute-api.us-east-1.amazonaws.com/Prod/hello");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
    
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
    
            BufferedReader br = new BufferedReader(new InputStreamReader(
                (conn.getInputStream())));
    
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
    
            conn.disconnect();
    
          } catch (MalformedURLException e) {
    
            e.printStackTrace();
    
          } catch (IOException e) {
    
            e.printStackTrace();
    
          }
    
        }
        return numero * numero;
    }

    
}
