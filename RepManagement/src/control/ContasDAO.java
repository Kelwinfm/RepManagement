/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Contas;

/**
 *
 * @author kelwin
 */
public class ContasDAO extends Contas implements Arquivos , Serializable{

    public ContasDAO(int mes, int ano, float valor, String dataVenc, String tipo, boolean pago) {
        super(mes, ano, valor, dataVenc, tipo, pago);
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
    public <T> ArrayList<T> LoadAll() {
        ArrayList<Contas> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return (ArrayList<T>) t;
        }
    }

    @Override
    public Contas Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Contas t = null;

        try {
            t = LoadFile(arquivo);
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }

    @Override
    public void Save() {
               File arquivo = new File(this.ArquivoNome());
        if (!arquivo.exists()) {
            arquivo.getParentFile().mkdirs();
                   try {
                       arquivo.createNewFile();
                   } catch (IOException ex) {
                       Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
                   }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(ContasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }

    @Override
    public void Remove() {
         File arquivo = new File(ArquivoNome());
        if (arquivo.exists()) {
            arquivo.delete();
        }    
    }
    
    protected <T> T LoadFile(File arquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        T t;

        FileInputStream arquivoE = new FileInputStream(arquivo);
        ObjectInputStream entrada = new ObjectInputStream(arquivoE);
        t = (T) entrada.readObject();
        entrada.close();
        arquivoE.close();

        return t;
    }
    
     protected <T> ArrayList<T> LoadAllFiles() throws IOException, FileNotFoundException, ClassNotFoundException, IllegalArgumentException {
        ArrayList<T> objetos = new ArrayList<T>();
        File diretorio = new File(DiretorioNome());
        File[] arquivos = diretorio.listFiles();
        System.out.println(diretorio.getAbsolutePath());
        try {
            for (File f : arquivos) {
                objetos.add((T) LoadFile(f));
            }
        } catch (Exception e) {
            System.out.println("Erro - " + e);
        }

        return objetos;
    }
}
