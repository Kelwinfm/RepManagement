/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import control.ArquivoAbstract;

/**
 *
 * @author kelwin
 * @author felipe
 */
public abstract class Moradores extends ArquivoAbstract {

    protected String nome;
    protected String contato;
    protected String cpf;
    protected String saldoDevedor;
    protected String valorFixo;

    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Moradores() {
        nome = null;
        contato = null;
        cpf = null;
        saldoDevedor = null;
        valorFixo = null;
    }

    /**
     *
     * @param nome Nome do morador
     * @param contato Numero de telefone do morador
     * @param cpf CPF do morador
     * @param saldoDevedor Valor devido pelo morador, sejam contas ou do aluguel
     * @param valorFixo
     */
    public Moradores(String nome, String contato, String cpf, String saldoDevedor, String valorFixo) {
        setNome(nome);
        setContato(contato);
        setCpf(cpf);
        setSaldoDevedor(saldoDevedor);
        setValorFixo(valorFixo);
    }

    /**
     *
     * @return nome do morador
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @return telefone do morador
     */
    public String getContato() {
        return contato;
    }

    /**
     *
     * @param contato
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     *
     * @return cpf do morador
     */
    public String getCpf() {
        return cpf;
    }

    /**
     *
     * @param cpf
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * @return quanto o morador deve para a casa
     */
    public String getSaldoDevedor() {
        return saldoDevedor;
    }

    /**
     *
     * @param saldoDevedor
     */
    public void setSaldoDevedor(String saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    /**
     *
     * @return aluguel ou valor determinado para temporarios
     */
    public String getValorFixo() {
        return valorFixo;
    }

    /**
     *
     * @param valorFixo
     */
    public void setValorFixo(String valorFixo) {
        this.valorFixo = valorFixo;
    }

    /**
     *responsavel por cadastrar um novo morador
     */
    public void cadastrarMorador() {

    }

    /**
     * lista todos os moradores com seus atributos
     */
    public void listarMoradores() {
    }

    /**
     * coloca moradores exlcuidos em moradores antigos
     */
    public void mvAntigosMoradores() {

    }

    /**
     *
     * @param valorFixo
     * @return Valor do aluguel mais as contas do mês
     */
    public float totalPagar(String valorFixo) {
        float contas = 0;
        int valor = Integer.parseInt(valorFixo);
        return valor + contas;

    }

}
