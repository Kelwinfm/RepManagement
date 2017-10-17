/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kelwi
 */
public class Temporario extends Moradores{
    private  int periodoMinimo;
    private  float valorFixo;

    /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor
     * @param periodoMinimo
     * @param valorFixo
     */
    public Temporario(String nome, String contato, String cpf, float saldoDevedor,int periodoMinimo, float valorFixo) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.saldoDevedor = saldoDevedor;
        this.periodoMinimo = periodoMinimo;
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

    public int getPeriodoMinimo() {
        return periodoMinimo;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setPeriodoMinimo(int periodoMinimo) {
        this.periodoMinimo = periodoMinimo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }
    
    public float totalPagar(int periodo, float valor){
        return periodo*valor;
    }
}