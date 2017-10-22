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
 * @author kelwin
 * @see Moradores
 */
public class Permanente extends Moradores {
    private  Date dataEntrada;
    private  String rg;
    
     /**
     * Constrói objeto de um morador permanente, inicializando informações 
     * sobre um novo morador permanente inserido.
     */
    
 /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param dataEntrada Data da entrada do morador permanente na casa
     * @param valorFixo
     * @param rg RG do morador permanente
     * @param saldoDevedor 
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