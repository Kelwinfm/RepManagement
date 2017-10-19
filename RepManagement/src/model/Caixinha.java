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
 */
public class Caixinha extends Despesas {
    private float montante;
    private float valorIndividual;
    
    public Caixinha(int mes, int ano, float valor, Date dataVenc, float montante, float valorIndividual) {
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.dataVenc = dataVenc;
        this.montante = montante;
        this.valorIndividual = valorIndividual;
    }

    public float getMontante() {
        return montante;
    }

    public void setMontante(float montante) {
        this.montante = montante;
    }

    public float getValorIndividual() {
        return valorIndividual;
    }

    public void setValorIndividual(float valorIndividual) {
        this.valorIndividual = valorIndividual;
    }    
    public void creditarValor(){
        
    }
    public void debitarValor(){
        
    }
    public void exibirMontante(){
        
    }
}
