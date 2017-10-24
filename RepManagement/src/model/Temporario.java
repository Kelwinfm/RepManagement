/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import control.Arquivos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kelwin
 * @see Moradores
 */
public class Temporario extends Moradores implements Arquivos, Serializable{
    private String periodo;
    
     /**
     * Constrói objeto de um morador temporario, inicializando informações 
     * sobre um novo morador temporario inserido.
     */
    
    /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor Valor devido pelo morador das contas ou valorFixo
     * @param valorFixo Valor definido semanalmente pelo Moradores permanentes
     * @param periodoMinimo Periodo de tempo em que o morador temporario ficará na casa
     */
    public Temporario(){
        super();
        periodo = null;
    }
    public Temporario(String nome, String contato, String cpf, String saldoDevedor,String valorFixo, String periodo){
        super(nome, contato, cpf, saldoDevedor, valorFixo);
        setPeriodo(periodo);

    }
    /*public Temporario(String nome, String contato, String cpf, float saldoDevedor,float valorFixo,int periodoMinimo) {
       super(nome, contato, cpf, saldoDevedor, valorFixo);
       this.periodo = periodoMinimo;

    }*/
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    /**
     * 
     * @param valorFixo
     * @return Valor do periodo de estadia * um valor pré definido
     */
    
    @Override 
    public float totalPagar(String valorFixo){
        float contas = 0;
        int valor = Integer.parseInt(valorFixo);
        int tempo = Integer.parseInt(getPeriodo());
        return (tempo*valor)+contas;
        
    }

    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Morador_Temporario_" + this.getNome() + ".Temp";
        return s;
    }

    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Morador_Temporario" + File.separator;
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
                       Logger.getLogger(Temporario.class.getName()).log(Level.SEVERE, null, ex);
                   }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Temporario.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(Temporario.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
           @Override
    public Temporario Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Temporario t = null;

        try {
            t = LoadFile(arquivo);
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
       @Override
    public  ArrayList<Temporario> LoadAll() {
        ArrayList<Temporario> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
}