package com.example.milenamacedo.melhorprecogaranhuns;

/**
 * Created by Milena Macedo on 14/06/2018.
 */

public class Endereco {
    private String estado;
    private String cidade;
    private String cep;
    private String bairro;
    private String rua;
    private String numero;
    private String COmplemento;


    public Endereco(String estado, String cidade, String cep, String bairro, String rua, String numero, String COmplemento) {
        this.estado = estado;
        this.cidade = cidade;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.COmplemento = COmplemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCOmplemento() {
        return COmplemento;
    }

    public void setCOmplemento(String COmplemento) {
        this.COmplemento = COmplemento;
    }
}
