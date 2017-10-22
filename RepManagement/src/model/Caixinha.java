/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
*/
package model;

import java.util.Date;

/**
 * Esta classe provê acesso aos dados sobre montante e os valores individuais 
 * depositados mensalmente, além dos atributos herdados da super classe
 * @see Despesas
 * @author kelwin
 * @author felipe
 */
public class Caixinha extends Despesas {
    private float montante;
    private float valorIndividual;
    
    /**
     * Constrói objeto Caixinha, inicializando informações sobre uma unica 
     * caixinha da casa.
     */
    
    /**
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     * @param montante Total dos valores depositados mensalmente
     * @param valorIndividual Quantidade de um valor depositado individual e mensalmente 
     */    
    public Caixinha(int mes, int ano, float valor, Date dataVenc, float montante, float valorIndividual) {
       super(mes, ano, valor, dataVenc);
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
    /**
     * Adicionar valor ao montante
     */
    public void creditarValor(){
        
    }
    /**
     * Retirar valor do montante
     */
    public void debitarValor(){
        
    }
     /**
     * Procedimento para geração de um log de inserção e remoção do montante 
     * para controle dos moradores da entrada e saida de dinhheiro.
     */
    public void gerarLog(){
        
    }
}
