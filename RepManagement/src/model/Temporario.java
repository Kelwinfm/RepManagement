/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kelwin
 * @see Moradores
 */
public class Temporario extends Moradores{
    private int periodo;
    /**
     *
     * @param periodo
     */
    public Temporario(String nome, String contato, String cpf, float saldoDevedor,float valorFixo,int periodoMinimo) {
       super(nome, contato, cpf, saldoDevedor, valorFixo);
       this.periodo = periodoMinimo;

    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    @Override 
    public float totalPagar(float valorFixo){
        float contas = 0;
        return (getPeriodo()*valorFixo)+contas;
    }
}