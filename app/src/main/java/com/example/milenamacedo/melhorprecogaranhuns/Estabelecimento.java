package com.example.milenamacedo.melhorprecogaranhuns;

import java.util.Date;
import java.util.List;

/**
 * Created by Milena Macedo on 14/06/2018.
 */

public class Estabelecimento {

    private Endereco endereco;
    private String nome;
    private Date dataVendas;
    private List<Produto> produtos;

    public Estabelecimento(Endereco endereco, String nome, Date dataVendas, List<Produto> produtos) {
        this.endereco = endereco;
        this.nome = nome;
        this.dataVendas = dataVendas;
        this.produtos = produtos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataVendas() {
        return dataVendas;
    }

    public void setDataVendas(Date dataVendas) {
        this.dataVendas = dataVendas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
