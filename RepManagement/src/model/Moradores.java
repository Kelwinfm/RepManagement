/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author kelwin
 */
public abstract class Moradores {

    protected String nome;
    protected String contato;
    protected String cpf;
    protected float saldoDevedor;
    protected float valorFixo;
 /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor
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
    public float totalPagar(float valorFixo){
        float contas = 0;
        return valorFixo+contas;
    
    }

}
