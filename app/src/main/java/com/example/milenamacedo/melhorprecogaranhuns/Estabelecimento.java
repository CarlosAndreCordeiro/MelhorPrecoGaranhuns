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
    private String  cnpj;
    private List<Produto> produtos;

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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Estabelecimento(Endereco endereco, String nome, Date dataVendas, String cnpj, List<Produto> produtos) {
        this.endereco = endereco;
        this.nome = nome;
        this.dataVendas = dataVendas;
        this.cnpj = cnpj;
        this.produtos = produtos;

    }
}
