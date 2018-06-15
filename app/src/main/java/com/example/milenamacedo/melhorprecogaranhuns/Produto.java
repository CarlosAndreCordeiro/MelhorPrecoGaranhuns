package com.example.milenamacedo.melhorprecogaranhuns;

/**
 * Created by Milena Macedo on 14/06/2018.
 */

public class Produto {

    private String nome;
    private String marca;
    private String codigoBarra;
    private double preco;
    private String gtin;

    public Produto(String nome, String marca, String codigoBarra, double preco, String gtin) {
        this.nome = nome;
        this.marca = marca;
        this.codigoBarra = codigoBarra;
        this.preco = preco;
        this.gtin = gtin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getGtin() {
        return gtin;
    }

    public void setGtin(String gtin) {
        this.gtin = gtin;
    }
}
