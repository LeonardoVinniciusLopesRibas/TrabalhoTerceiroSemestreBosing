/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria.model;

/**
 *
 * @author yuriz
 */
public class LivroPedido {
    
        
    private Livro livro;
    private int qtdVenda;
    private double vlPrecoUnitario;
    private double vlDesconto;

    public LivroPedido() {
    }

    public LivroPedido(Livro livro, int qtdVenda, double vlPrecoUnitario, double vlDesconto) {
        this.livro = livro;
        this.qtdVenda = qtdVenda;
        this.vlPrecoUnitario = vlPrecoUnitario;
        this.vlDesconto = vlDesconto;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getQtdVenda() {
        return qtdVenda;
    }

    public void setQtdVenda(int qtdVenda) {
        this.qtdVenda = qtdVenda;
    }

    public double getVlPrecoUnitario() {
        return vlPrecoUnitario;
    }

    public void setVlPrecoUnitario(double vlPrecoUnitario) {
        this.vlPrecoUnitario = vlPrecoUnitario;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    @Override
    public String toString() {
        return "LivroPedido{" + "livro=" + livro + ", qtdVenda=" + qtdVenda + ", vlPrecoUnitario=" + vlPrecoUnitario + ", vlDesconto=" + vlDesconto + '}' ;
    }

    
}
