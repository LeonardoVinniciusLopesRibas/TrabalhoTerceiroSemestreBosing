/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author yuriz
 */
public class Pedido {
    
    private int nrPedido;
    private Cliente cliente;
    private ArrayList<LivroPedido> listaLivro;
    private ArrayList<FormaPagamento> formasPagto;
    private double valorTotal;

    public Pedido() {
        this.listaLivro = new ArrayList<>();
        this.formasPagto = new ArrayList<>();
    }

    public Pedido(int nrPedido, Cliente cliente, ArrayList<LivroPedido> listaLivro, ArrayList<FormaPagamento> formasPagto , double valorTotal) {
        this.listaLivro = new ArrayList<>();
        this.formasPagto = new ArrayList<>();
        
        this.nrPedido = nrPedido;
        this.cliente = cliente;
        this.listaLivro = listaLivro;
        this.formasPagto = formasPagto;
        this.valorTotal = valorTotal;
    }

    public int getNrPedido() {
        return nrPedido;
    }

    public void setNrPedido(int nrPedido) {
        this.nrPedido = nrPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<LivroPedido> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<LivroPedido> listaLivro) {
        this.listaLivro = listaLivro;
    }

    public ArrayList<FormaPagamento> getFormasPagto() {
        return formasPagto;
    }

    public void setFormasPagto(ArrayList<FormaPagamento> formasPagto) {
        this.formasPagto = formasPagto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nrPedido=" + nrPedido + ", cliente=" + cliente + ", listaLivro=" + listaLivro + ", formasPagto=" + formasPagto + '}'; 
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    public void adicionarItemVenda(LivroPedido livroPedido) {
    listaLivro.add(livroPedido);
    }
     
   public void atualizarEstoque(Pedido pedido) {
    for (LivroPedido livroPedido : pedido.getListaLivro()) {
        Livro livro = livroPedido.getLivro();
        if(livro.getQtdEstoque() >= livroPedido.getQtdVenda()) {
            livro.setQtdEstoque(livro.getQtdEstoque() - livroPedido.getQtdVenda());
        } else {
            int estoqueAtual = livro.getQtdEstoque();
            int quantiaPedida = livroPedido.getQtdVenda();
            int quantiaDisponivel = estoqueAtual > 0 ? estoqueAtual : 0;

            String mensagem = "Não há estoque suficiente para o livro \"" + livro.getNomeLivro() + "\".\n"
                + "Estoque atual: " + estoqueAtual + "\n"
                + "Quantidade pedida: " + quantiaPedida + "\n"
                + "Quantidade disponível: " + quantiaDisponivel + "\n"
                + "Insira outra quantidade para o livro:";
            int quantiaNova = Integer.parseInt(JOptionPane.showInputDialog(mensagem));

            while (quantiaNova > quantiaDisponivel) {
                mensagem = "Não há estoque suficiente para a quantidade informada.\n"
                    + "Estoque atual: " + estoqueAtual + "\n"
                    + "Quantidade pedida: " + quantiaPedida + "\n"
                    + "Quantidade disponível: " + quantiaDisponivel + "\n"
                    + "Insira outra quantidade para o livro:";
                quantiaNova = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            }

            livro.setQtdEstoque(livro.getQtdEstoque() - quantiaNova);
            livroPedido.setQtdVenda(quantiaNova);
        }
    }
}
   
   public void calcularValorTotal() {
    double valorTotal = 0.0;
    for (LivroPedido livroPedido : listaLivro) {
        valorTotal += (livroPedido.getVlPrecoUnitario() - livroPedido.getVlDesconto()) * livroPedido.getQtdVenda();
    }
    this.valorTotal = valorTotal;
    }
    
}
