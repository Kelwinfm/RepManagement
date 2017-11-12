/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kelwin
 */
public class Casa {

    private String qtdMoradores;
    private String vagasPerm;
    private String vagasTemp;

    /*public Casa(int qtdMoradores, int vagasPerm, int vagasTemp, ArrayList<Permanente> allMoradoresPerm, ArrayList<Temporario> allMoradoresTemp, ArrayList<Contas> allContas) {
        this.qtdMoradores = qtdMoradores;
        this.vagasPerm = vagasPerm;
        this.vagasTemp = vagasTemp;
        this.allMoradoresPerm = allMoradoresPerm;
        this.allMoradoresTemp = allMoradoresTemp;
        this.allContas = allContas;
    }*/
    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Casa() {
        qtdMoradores = null;
        vagasPerm = null;
        vagasTemp = null;
    }

    /**
     *
     * @param qtdMoradores quantiadde de moradores atuais morando na casa
     * @param vagasPerm vagas disponiveis permanentes na casa
     * @param vagasTemp vagas disponiveis temporarias na casa
     */
    public Casa(String qtdMoradores, String vagasPerm, String vagasTemp) {

        setQtdMoradores(qtdMoradores);
        setVagasPerm(vagasPerm);
        setVagasTemp(vagasTemp);

    }

    /**
     *
     * @return a quantidade de moradores
     */
    public String getQtdMoradores() {
        return qtdMoradores;
    }

    /**
     *
     * @param qtdMoradores
     */
    public void setQtdMoradores(String qtdMoradores) {
        this.qtdMoradores = qtdMoradores;
    }

    /**
     *
     * @return quantas vagas permanentes existem
     */
    public String getVagasPerm() {
        return vagasPerm;
    }

    /**
     *
     * @param vagasPerm
     */
    public void setVagasPerm(String vagasPerm) {
        this.vagasPerm = vagasPerm;
    }

    /**
     *
     * @return quantas vagas temporarias existem
     */
    public String getVagasTemp() {
        return vagasTemp;
    }

    /**
     *
     * @param vagasTemp
     */
    public void setVagasTemp(String vagasTemp) {
        this.vagasTemp = vagasTemp;
    }

    /**
     * Soma todas as contas do array
     *
     * @return o valor total de todas as contas para relatorio e divisao entre
     * moradores
     */
    public float calcularContas() {
        float total = 0;
        return total;
    }

}

   @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Morador_Permanente_" + this.getNome() + ".Perm";
        return s;
    }

    /**
     *
     * @return string com nome ao salvar diretorio
     */
    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Morador_Permanente" + File.separator;
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
                Logger.getLogger(Casa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Casa.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(Casa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param nome do arquivo a ser puxado
     * @return o arquivo puxado em um objeto na memoria
     */
    @Override
    public Casa Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Casa t = null;

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
    public ArrayList<Casa> LoadAll() {
        ArrayList<Casa> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
}