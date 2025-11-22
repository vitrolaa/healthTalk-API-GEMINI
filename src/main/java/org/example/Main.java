package org.example;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class Main {
    public static void main(String[] args) {

        Client client = new Client();

        GenerateContentResponse response =
                client.models.generateContent(
                        "gemini-3-pro-preview",
                        "Eu não tenho vontade de sair ou ver ninguém, prefiro ficar sozinho, oque você poderia me recomendar fazer?",
                        null);

        System.out.println(response.text());
    }
}