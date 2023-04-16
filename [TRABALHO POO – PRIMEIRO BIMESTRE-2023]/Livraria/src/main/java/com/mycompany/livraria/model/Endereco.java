/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria.model;

/**
 *
 * @author yuriz
 */
public class Endereco {
   private String nomeRua;
   private int numeroCasa;
   private String dsComplemento;
   private String bairro;
   private String sigla_estado;
   private String cep;

    public Endereco() {
    }

    public Endereco(String nomeRua, int numeroCasa, String dsComplemento, String bairro, String sigla_estado, String cep) {
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.dsComplemento = dsComplemento;
        this.bairro = bairro;
        this.sigla_estado = sigla_estado;
        this.cep = cep;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getSigla_estado() {
        return sigla_estado;
    }

    public void setSigla_estado(String sigla_estado) {
        this.sigla_estado = sigla_estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereco{" + "nomeRua=" + nomeRua + ", numeroCasa=" + numeroCasa + ", dsComplemento=" + dsComplemento + ", bairro=" + bairro + ", sigla_estado=" + sigla_estado + ", cep=" + cep + '}' ;
    }
   
    
}
