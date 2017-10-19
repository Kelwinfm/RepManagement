/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author kelwin
 * @see Moradores
 */
public class Permanente extends Moradores {
    private  Date dataEntrada;
    private  String rg;
 /**
     *

     * @param dataEntrada
     * @param rg
     */
    public Permanente(String nome, String contato, String cpf, float saldoDevedor,float valorFixo, Date dataEntrada,String rg) {
        super(nome, contato, cpf, saldoDevedor, valorFixo);
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
  
}
