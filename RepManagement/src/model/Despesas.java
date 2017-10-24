/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import control.ArquivoAbstract;
import java.util.Date;

/**
 *
 * Esta classe abstrata de Despesas é a super classe de Contas e Caixinha 
 * @author kelwin
 */
public abstract class Despesas extends ArquivoAbstract{
    
    protected String mes;
    protected String ano;
    protected String valor;
    protected String dataVenc;
    /**
     *
     * @param mes Mes correspondente da despesa inserida e paga
     * @param ano Ano correspondente da despesa inserida e paga
     * @param valor Quanto custou determinada despesa
     * @param dataVenc Data de vencimento da despesa
     */
    public Despesas (){
        mes = null;
        ano = null;
        valor = null;
        dataVenc = null;
    }
    public Despesas (String mes, String ano, String valor, String dataVenc){
        setMes(mes);
        setAno(ano);
        setValor(valor);
        setDataVenc(dataVenc);
    }
    /*public Despesas(int mes, int ano, float valor, String dataVenc) {
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.dataVenc = dataVenc;
    }*/

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    
}
