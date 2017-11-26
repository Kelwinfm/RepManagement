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
 * Esta classe provê acesso aos dados sobre montante e os valores individuais
 * depositados mensalmente, além dos atributos herdados da super classe
 *
 * @see Despesas
 */
public final class Caixinha extends Despesas implements Arquivos, Serializable {

    private String montante;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Caixinha() {
        super();

    }

    /**
     * Constrói objeto Caixinha, inicializando informações sobre uma unica
     *
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     * @param montante Total dos valores depositados mensalmente
     */
    public Caixinha(String mes, String ano, String valor, String dataVenc, String montante) {
        super(mes, ano, valor, dataVenc);
        setMontante(montante);
    }

    /**
     *
     * @return o montante atual da caixinha
     */
    public String getMontante() {
        return montante;
    }

    /**
     *
     * @param montante instancia ou modifica um montante para a caixinha
     */
    public void setMontante(String montante) {
        this.montante = montante;
    }

    /**
     *
     * @return string de nome ao salvar o arquivo
     */
    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Caixinha_" + "_" + this.getMes() + "_" + this.getAno() + ".Caixinha";
        return s;
    }

    /**
     *
     * @return string com nome ao salvar diretorio
     */
    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Caixinha" + File.separator;
        return s;
    }

    /**
     * salva um objeto em um arquivo
     */
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

    /**
     *
     * @param nome do arquivo a ser puxado
     * @return o arquivo puxado em um objeto na memoria
     */
    @Override
    public Caixinha Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Caixinha t = null;

        try {
            t = LoadFile(arquivo);
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }

    /**
     *
     * @return um array de todos os arquivos de certo tipo
     */
    @Override
    public ArrayList<Caixinha> LoadAll() {
        ArrayList<Caixinha> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
}
