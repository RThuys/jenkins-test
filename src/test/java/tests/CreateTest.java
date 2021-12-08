package tests;

import models.Animal;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.*;
import java.util.ArrayList;

public class CreateTest {

    @Test
    public void createAnAnimal() throws IOException {
        Animal animal = new Animal("Fox", "fox-2");

        System.out.println(animal.name);


//        HttpClient client = HttpClient.newHttpClient();
//
//        HttpRequest request = HttpRequest.newBuilder()
//                .uri(URI.create("http://localhost:4200/api/animals"))
//                .build();
//
//        var response = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
//                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
//                .join();
//
//        System.out.println(response);

        URL url = new URL("http://localhost:3000/api/animals");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

//        System.out.println(con.getContent());

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer content = new StringBuffer();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();

        System.out.println(content);

        JSONObject jo = new JSONObject(content);

        System.out.println(jo);

    }
}
