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
 * @see Moradores
 */
public class Permanente extends Moradores {

    private String dataEntrada;
    private String rg;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Permanente() {
        super();
        rg = null;
        dataEntrada = null;
    }

    /**
     * Constrói objeto de um morador permanente, inicializando informações sobre
     * um novo morador permanente inserido.
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param dataEntrada Data da entrada do morador permanente na casa
     * @param valorFixo
     * @param rg RG do morador permanente
     * @param saldoDevedor
     */
    public Permanente(String nome, String contato, String cpf, String saldoDevedor, String valorFixo, String dataEntrada, String rg) {
        super(nome, contato, cpf, saldoDevedor, valorFixo);
        setRg(rg);
        setDataEntrada(dataEntrada);
    }

    /*public Permanente(String nome, String contato, String cpf, float saldoDevedor,float valorFixo, String dataEntrada,String rg) {
        super(nome, contato, cpf, saldoDevedor, valorFixo);
        this.dataEntrada = dataEntrada;
        this.rg = rg;
    }*/
    /**
     *
     * @return
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     *
     * @param dataEntrada
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     *
     * @return
     */
    public String getRg() {
        return rg;
    }

    /**
     *
     * @param rg
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     *
     * @return string de nome ao salvar o arquivo
     */
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
                Logger.getLogger(Permanente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileOutputStream arquivoS = null;
        try {
            arquivoS = new FileOutputStream(arquivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Permanente.class.getName()).log(Level.SEVERE, null, ex);
        }
        ObjectOutputStream saida = null;
        try {
            saida = new ObjectOutputStream(arquivoS);
            saida.writeObject(this);
            saida.close();
            arquivoS.close();
        } catch (IOException ex) {
            Logger.getLogger(Permanente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param nome do arquivo a ser puxado
     * @return o arquivo puxado em um objeto na memoria
     */
    @Override
    public Permanente Load(String nome) {
        File arquivo = new File(DiretorioNome() + nome);
        Permanente t = null;

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
    public ArrayList<Permanente> LoadAll() {
        ArrayList<Permanente> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
    
    public ArrayList<Permanente> permanentes = new ArrayList<>();//array list de moradores permanentes
    
    public void cadastrarMoradorPerm(Permanente P){
        permanentes.add(P);
        P.Save();        
    }
    
    public void CarregarPermanente() throws IllegalArgumentException, IOException {
        Permanente permanente = new Permanente();

        for (Permanente p : permanente.LoadAll()) {
            this.permanentes.add(p);
        }
    }

    public Permanente ConsultarPermanente(String rg) {

        for (Permanente permanente : permanentes) {
            if (permanente.getRg().compareToIgnoreCase(rg) == 0) {
                return permanente;
            }
        }
        return null;
    }

    public synchronized boolean RemoverPermanente(String rg) {//garantir a sincronia com a trheads
        Permanente permanente = ConsultarPermanente(rg);
        if (permanente != null) {
            permanente.Remove();
            return true;
        }
        return false;
    }
}
