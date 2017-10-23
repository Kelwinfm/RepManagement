/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
*/
package model;

import control.ArquivoAbstract;
import control.Arquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Esta classe provê acesso aos dados sobre montante e os valores individuais 
 * depositados mensalmente, além dos atributos herdados da super classe
 * @see Despesas
 * @author kelwin
 * @author felipe
 */
public class Caixinha extends Despesas implements Arquivos, Serializable {
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
    public Caixinha(int mes, int ano, float valor, String dataVenc, float montante, float valorIndividual) {
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

    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Caixinha_" + "_"+ this.getMes()+ "_" + this.getAno()+ ".Caixinha";
        return s;
    }

    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Caixinha" + File.separator;
        return s; 
    }
    @Override
    public void Save() {
               File arquivo = new File(this.ArquivoNome());
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
                   try {
                       arquivo.createNewFile();
                   } catch (IOException ex) {
                       Logger.getLogger(Caixinha.class.getName()).log(Level.SEVERE, null, ex);
                   }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Caixinha.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(Caixinha.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
}
