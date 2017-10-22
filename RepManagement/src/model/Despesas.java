/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import java.util.Date;

/**
 *
 * Esta classe abstrata de Despesas é a super classe de Contas e Caixinha 
 * @author kelwin
 */
public abstract class Despesas {
    
    protected int mes;
    protected int ano;
    protected float valor;
    protected Date dataVenc;
    /**
     *
     * @param mes Mes correspondente da despesa inserida e paga
     * @param ano Ano correspondente da despesa inserida e paga
     * @param valor Quanto custou determinada despesa
     * @param dataVenc Data de vencimento da despesa
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
