/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import control.ArquivoAbstract;

/**
 *
 * Esta classe abstrata de Despesas é a super classe de Contas e Caixinha
 *
 */
public abstract class Despesas extends ArquivoAbstract {

    protected String mes;
    protected String ano;
    protected String valor;
    protected String dataVenc;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Despesas() {
        mes = null;
        ano = null;
        valor = null;
        dataVenc = null;
    }

    /**
     *
     * @param mes Mes correspondente da despesa inserida e paga
     * @param ano Ano correspondente da despesa inserida e paga
     * @param valor Quanto custou determinada despesa
     * @param dataVenc Data de vencimento da despesa
     */
    public Despesas(String mes, String ano, String valor, String dataVenc) {
        setMes(mes);
        setAno(ano);
        setValor(valor);
        setDataVenc(dataVenc);
    }

    /**
     *
     * @return mes da despesa
     */
    public String getMes() {
        return mes;
    }

    /**
     *
     * @param mes
     */
    public final void setMes(String mes) {
        this.mes = mes;
    }

    /**
     *
     * @return ano da despesa
     */
    public String getAno() {
        return ano;
    }

    /**
     *
     * @param ano
     */
    public final void setAno(String ano) {
        this.ano = ano;
    }

    /**
     *
     * @return valor da despesa
     */
    public String getValor() {
        return valor;
    }

    /**
     *
     * @param valor
     */
    public final void setValor(String valor) {
        this.valor = valor;
    }

    /**
     *
     * @return data de vencimento da despesa
     */
    public String getDataVenc() {
        return dataVenc;
    }

    /**
     *
     * @param dataVenc
     */
    public final void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

}
