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
    private int periodo;
    /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor
     * @param periodoMinimo
     * @param valorFixo
     */
    public Temporario(String nome, String contato, String cpf, float saldoDevedor,float valorFixo,int periodoMinimo) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.saldoDevedor = saldoDevedor;
        this.valorFixo = valorFixo;
        this.periodo = periodoMinimo;

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

    public int getPeriodo() {
        return periodo;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }
    @Override
    public float totalPagar(float valorFixo){
        float contas = 0;
        return (getPeriodo()*valorFixo)+contas;
    }
}