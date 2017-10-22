/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;
/**
 *
 * @author kelwin
 * @author felipe
 */
public abstract class Moradores {

    protected String nome;
    protected String contato;
    protected String cpf;
    protected float saldoDevedor;
    protected float valorFixo;
    
     /**
     * Constrói objeto Moradores, inicializando informações sobre um novo morador inserido.
     */
    
 /**
     *
     * @param nome Nome do morador
     * @param contato Numero de telefone do morador
     * @param cpf CPF do morador
     * @param saldoDevedor Valor devido pelo morador, sejam contas ou do aluguel
     * @param valorFixo 
     */
    public Moradores(String nome, String contato, String cpf, float saldoDevedor, float valorFixo) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.saldoDevedor = saldoDevedor;
        this.valorFixo = valorFixo;
    }
    
    

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

    public float getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
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
    public float totalPagar(float valorFixo){
        float contas = 0;
        return valorFixo+contas;
    
    }

}
