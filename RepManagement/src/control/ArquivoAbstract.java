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
