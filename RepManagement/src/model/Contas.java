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
 * Sub classe de Despesas em que mostra o tipo de conta e o status da mesma
 *
 * @author kelwin
 */
public class Contas extends Despesas implements Arquivos, Serializable {

    private String tipo;
    private boolean pago;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Contas() {
        super();
        tipo = null;
        pago = true;
    }

    /**
     * Constrói objeto Contas, inicializando informações sobre uma conta nova
     * inserida.
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     * @param tipo Tipo de conta a ser inserida (EX: Agua,luz,internet)
     * @param pago Pode receber True se tiver sido paga ou False se ainda nao
     * foi paga
     */
    public Contas(String mes, String ano, String valor, String dataVenc, String tipo, boolean pago) {
        super(mes, ano, valor, dataVenc);
        setTipo(tipo);
        setPago(true);
    }

    /*public Contas(int mes, int ano, float valor, String dataVenc, String tipo, boolean pago) {
        super(mes, ano, valor, dataVenc);
        this.tipo = tipo;
        this.pago = pago;
    }*/
    /**
     *
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return
     */
    public boolean isPago() {
        return true;
    }

    /**
     *
     * @param pago
     */
    public void setPago(boolean pago) {
        this.pago = true;
    }

    /**
     * Colocar todos os dados das contas pagas em um unico arquivo com os totais
     */
    public void gerarRelatorio() {

    }

    /**
     *
     */
    public void consultarRelatorio() {

    }

    /**
     *
     * @return string de nome ao salvar o arquivo
     */
    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Conta_" + this.getTipo() + "_" + this.getMes() + "_" + this.getAno() + ".Conta";
        return s;
    }

    /**
     *
     * @return string com nome ao salvar diretorio
     */
    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Contas" + File.separator;
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

    /**
     *
     * @param nome do arquivo a ser puxado
     * @return o arquivo puxado em um objeto na memoria
     */
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

    /**
     *
     * @return um array de todos os arquivos de certo tipo
     */
    @Override
    public ArrayList<Contas> LoadAll() {
        ArrayList<Contas> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
    
     public ArrayList<Contas> contass = new ArrayList<>();//array list de contas
     
        public void inserirConta(Contas C){
        contass.add(C);
        C.Save();        
    }
        
    public void CarregarContas() throws IllegalArgumentException, IOException {
        Contas contas = new Contas();

        for (Contas c : contas.LoadAll()) {
            this.contass.add(c);
        }
    }

    public Contas ConsultarContas(String tipo, String mes, String ano) {

        for (Contas contas : contass) {
            if (contas.getTipo().compareToIgnoreCase(tipo) == 0 && 
                contas.getMes().compareToIgnoreCase(mes) == 0 &&
                contas.getAno().compareToIgnoreCase(ano) == 0){
                return contas;
            }
        }
        return null;
    }

    public synchronized boolean RemoverContas(String tipo, String mes, String ano) {//garantir a sincronia com a trheads
        Contas contas = ConsultarContas(tipo, mes, ano);
        if (contas != null) {
            contas.Remove();
            return true;
        }
        return false;
    }
}
