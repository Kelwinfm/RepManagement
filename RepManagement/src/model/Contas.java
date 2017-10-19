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
public class Contas extends Despesas{
    private String tipo;
    private boolean pago;//pago true ou nao pago false

    /**
     *
     * @param tipo
     * @param pago
     */
    public Contas(int mes, int ano, float valor, Date dataVenc, String tipo, boolean pago) {
        super(mes, ano, valor, dataVenc);
        this.tipo = tipo;
        this.pago = pago;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPago() {
        return true;
    }

    public void setPago(boolean pago) {
        this.pago = true;
    }
    
    public void gerarRelatorio(){
        
    }
    public void consultarRelatorio(){
        
    }
    public void adicionarConta(){
        
    }
    public void calcContas(){
        
    }
}
