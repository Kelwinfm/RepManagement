/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Date;

/**
 *
 * @author kelwi
 */
public class Permanente extends Moradores {
    private  Date dataEntrada;
    private  String rg;

    public Permanente(String nome, String contato, String cpf, float saldoDevedor,float valorFixo, Date dataEntrada,String rg) {
        this.nome = nome;
        this.contato = contato;
        this.cpf = cpf;
        this.saldoDevedor = saldoDevedor;
        this.valorFixo = valorFixo;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
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

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    @Override
    public float totalPagar( float aluguel){
        float contas = 0;
        return aluguel+contas;
    }
}
