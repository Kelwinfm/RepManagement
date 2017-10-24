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
public abstract class Moradores extends ArquivoAbstract{

    protected String nome;
    protected String contato;
    protected String cpf;
    protected String saldoDevedor;
    protected String valorFixo;
        
 /**
     *
     * @param nome Nome do morador
     * @param contato Numero de telefone do morador
     * @param cpf CPF do morador
     * @param saldoDevedor Valor devido pelo morador, sejam contas ou do aluguel
     * @param valorFixo 
     */
    
    public Moradores(){
        nome = null;
        contato = null;
        cpf = null;
        saldoDevedor = null;
        valorFixo = null;
    }
    public Moradores(String nome, String contato, String cpf, String saldoDevedor, String valorFixo){
        setNome(nome);
        setContato(contato);
        setCpf(cpf);
        setSaldoDevedor(saldoDevedor);
        setValorFixo(valorFixo);
    }
    /*public Moradores(String nome, String contato, String cpf, float saldoDevedor, float valorFixo) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.saldoDevedor = saldoDevedor;
        this.valorFixo = valorFixo;
    }*/
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(String saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public String getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(String valorFixo) {
        this.valorFixo = valorFixo;
    }
    
    public void cadastrarMorador(){
        
    }
    public void listarMoradores(){
        //lista todos os moradores com seus atributos
    }
    public void mvAntigosMoradores(){
        
    }
    
  /**
   * 
   * @param valorFixo
   * @return Valor do aluguel mais as contas do mês
   */
    public float totalPagar(String valorFixo){
        float contas = 0;
        int valor = Integer.parseInt(valorFixo);
        return valor+contas;
    
    }

}
