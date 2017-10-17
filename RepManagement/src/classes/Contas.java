/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author kelwin
 */
public class Contas extends Despesas{
    private float tipo;
    private boolean status;//pago true ou nao pago false

    public Contas(int mes, int ano, float valor, Date dataVenc, float tipo, boolean status) {
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.dataVenc = dataVenc;
        this.tipo = tipo;
        this.status = status;
    }
    
    public float getTipo() {
        return tipo;
    }

    public void setTipo(float tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
