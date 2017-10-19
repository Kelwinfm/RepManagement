/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author kelwi
 */
public abstract class Despesas {
    
    protected int mes;
    protected int ano;
    protected float valor;
    protected Date dataVenc;
    /**
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     */
    public Despesas(int mes, int ano, float valor, Date dataVenc) {
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.dataVenc = dataVenc;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(Date dataVenc) {
        this.dataVenc = dataVenc;
    }

    
}
