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
public class Livraria {
    private String nmFantasia;
    private String cnpj;
    private ArrayList<Pedido> listaLivro;

    public Livraria() {
    this.listaLivro = new ArrayList<>();
    
    }

    public Livraria(String nmFantasia, String cnpj, ArrayList<Pedido> listaLivro) {
        this.listaLivro = new ArrayList<>();
        
        this.nmFantasia = nmFantasia;
        this.cnpj = cnpj;
        this.listaLivro = listaLivro;
    }

    public String getNmFantasia() {
        return nmFantasia;
    }

    public void setNmFantasia(String nmFantasia) {
        this.nmFantasia = nmFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Pedido> getListaLivro() {
        return listaLivro;
    }

    public void setListaLivro(ArrayList<Pedido> listaLivro) {
        this.listaLivro = listaLivro;
    }

    @Override
    public String toString() {
        return "Livraria{" + "nmFantasia=" + nmFantasia + ", cnpj=" + cnpj + ", listaLivro=" + listaLivro  + '}' ;
    }
    
    
    
    
}
