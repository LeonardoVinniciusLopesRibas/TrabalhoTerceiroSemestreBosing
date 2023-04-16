/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria.model;

/**
 *
 * @author yuriz
 */
public class FormaPagamento {
    
    private int cdFormaPagto;
    private String dsFormaPagto;

    public FormaPagamento() {
    }

    public FormaPagamento(int cdFormaPagto, String dsFormaPagto) {
        this.cdFormaPagto = cdFormaPagto;
        this.dsFormaPagto = dsFormaPagto;
    }

    public int getCdFormaPagto() {
        return cdFormaPagto;
    }

    public void setCdFormaPagto(int cdFormaPagto) {
        this.cdFormaPagto = cdFormaPagto;
    }

    public String getDsFormaPagto() {
        return dsFormaPagto;
    }

    public void setDsFormaPagto(String dsFormaPagto) {
        this.dsFormaPagto = dsFormaPagto;
    }

    @Override
    public String toString() {
        return "FormaPagamento{" + "cdFormaPagto=" + cdFormaPagto + ", dsFormaPagto=" + dsFormaPagto + '}' ;
    }
}
