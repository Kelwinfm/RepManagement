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
 * @see Moradores
 */
public class Temporario extends Moradores implements Arquivos, Serializable {

    private String periodo;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Temporario() {
        super();
        periodo = null;
    }

    /**
     * Constrói objeto de um morador temporario, inicializando informações sobre
     * um novo morador temporario inserido.
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor Valor devido pelo morador das contas ou valorFixo
     * @param valorFixo Valor definido semanalmente pelo Moradores permanentes
     * @param periodo Periodo de tempo em que o morador temporario ficará na
     * casa
     */
    public Temporario(String nome, String contato, String cpf, String saldoDevedor, String valorFixo, String periodo) {
        super(nome, contato, cpf, saldoDevedor, valorFixo);
        setPeriodo(periodo);

    }

    /**
     *
     * @return o periodo que a pessoa pretende ficar na casa
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     *
     * @param periodo
     */
    public final void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     *
     * @param valorFixo
     * @return Valor do periodo de estadia * um valor pré definido
     */
    @Override
    public float totalPagar(String valorFixo) {
        float contas = 0;
        int valor = Integer.parseInt(valorFixo);
        int tempo = Integer.parseInt(getPeriodo());
        return (tempo * valor) + contas;

    }

    /**
     *
     * @return string de nome ao salvar o arquivo
     */
    @Override
    public String ArquivoNome() {
        String s = DiretorioNome() + "Morador_Temporario_" + this.getNome() + ".Temp";
        return s;
    }

    /**
     *
     * @return string com nome ao salvar diretorio
     */
    @Override
    public String DiretorioNome() {
        String s = "Arquivos" + File.separator + "Morador_Temporario" + File.separator;
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

    /**
     *
     * @param nome do arquivo a ser puxado
     * @return o arquivo puxado em um objeto na memoria
     */
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

    /**
     *
     * @return um array de todos os arquivos de certo tipo
     */
    @Override
    public ArrayList<Temporario> LoadAll() {
        ArrayList<Temporario> t = null;

        try {
            t = LoadAllFiles();
        } catch (ClassNotFoundException ex) {
            throw ex;
        } finally {
            return t;
        }
    }
    public ArrayList<Temporario> temporarios = new ArrayList<>();//array list de moradores temporarios

    public void cadastrarMoradorTemp(Temporario T) {
        temporarios.add(T);
        T.Save();
    }

    public void CarregarTemporario() throws IllegalArgumentException, IOException {
        Temporario temporario = new Temporario();

        for (Temporario t : temporario.LoadAll()) {
            this.temporarios.add(t);
        }
    }

    public Temporario ConsultarTemporario(String cpf) {

        for (Temporario temporario : temporarios) {
            if (temporario.getCpf().compareToIgnoreCase(cpf) == 0) {
                return temporario;
            }
        }
        return null;
    }

    public synchronized boolean RemoverTemporario(String rg) {//garantir a sincronia com a trheads
        Temporario temporario = ConsultarTemporario(rg);
        if (temporario != null) {
            temporario.Remove();
            return true;
        }
        return false;
    }
}
