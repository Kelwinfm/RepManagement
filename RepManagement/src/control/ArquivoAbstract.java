/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import model.Contas;

/**
 *
 * @author kelwi
 */
public abstract class ArquivoAbstract implements Arquivos{
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
