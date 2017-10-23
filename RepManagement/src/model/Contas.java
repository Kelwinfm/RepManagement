/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import control.Arquivos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Sub classe de Despesas em que mostra o tipo de conta e o status da mesma
 * @author kelwin
 */
public class Contas extends Despesas implements Arquivos, Serializable{
    private String tipo;
    private boolean pago;

    /**
     * Constrói objeto Contas, inicializando informações sobre uma conta nova inserida.
     */
    
    /**
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     * @param tipo Tipo de conta a ser inserida (EX: Agua,luz,internet)
     * @param pago Pode receber True se tiver sido paga ou False se ainda nao foi paga
     */
    
    public Contas(int mes, int ano, float valor, String dataVenc, String tipo, boolean pago) {
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
    
     /**
     * Colocar todos os dados das contas pagas em um unico arquivo com os totais
     */
    public void gerarRelatorio(){
        
    }
    public void consultarRelatorio(){
        
    }

    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Conta_" + this.getTipo() + "_"+ this.getMes()+ "_" + this.getAno()+ ".Conta";
        return s;
    }

    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Contas" + File.separator;
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
                       Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
                   }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(Contas.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    
}
