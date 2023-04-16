/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria.model;

import java.util.ArrayList;

/**
 *
 * @author yuriz
 */
public class Livro {
    private int idLivro;
    private String nomeLivro;
    private ArrayList<String> generoLivro;
    private String editoraLivro;
    private String autorLivro;
    private String resenha;
    private int anoLancamento;
    private int numeroPaginas;
    private int qtdEstoque;
    private double preco;

    public Livro() {
    }

    public Livro(int idLivro, String nomeLivro, ArrayList<String> generoLivro, String editoraLivro, String autorLivro, String resenha, int anoLancamento, int numeroPaginas, int qtdEstoque, double preco) {
        this.generoLivro = new ArrayList<>();
        
        this.idLivro = idLivro;
        this.nomeLivro = nomeLivro;
        this.generoLivro = generoLivro;
        this.editoraLivro = editoraLivro;
        this.autorLivro = autorLivro;
        this.resenha = resenha;
        this.anoLancamento = anoLancamento;
        this.numeroPaginas = numeroPaginas;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public ArrayList<String> getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(ArrayList<String> generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getResenha() {
        return resenha;
    }

    public void setResenha(String resenha) {
        this.resenha = resenha;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        
    }
    
    
    @Override
    public String toString() {
        return "Livro{" + "idLivro=" + idLivro + "\n" + ", nomeLivro=" + nomeLivro + "\n" + ", generoLivro=" + generoLivro + "\n" + ", editoraLivro=" + editoraLivro + "\n" + ", autorLivro=" + autorLivro + "\n" + ", resenha=" + resenha + "\n" + ", anoLancamento=" + anoLancamento + "\n" + ", numeroPaginas=" + numeroPaginas + "\n" + ", qtdEstoque=" + qtdEstoque + "\n" + ", preco=" + preco + "\n" + '}' ;
    }
    
}
