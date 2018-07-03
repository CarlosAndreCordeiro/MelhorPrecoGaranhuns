package com.example.milenamacedo.melhorprecogaranhuns;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JsonConversor{
    public static void main(String[] args) {

        Gson gson = new Gson();

        try {

            BufferedReader br = new BufferedReader(new FileReader("C:\\produtos.json"));

            //Converte String JSON para objeto Java
            Informacoes obj = gson.fromJson(br, Informacoes.class);

            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}