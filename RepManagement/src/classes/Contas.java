/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kelwin
 */
public class Contas {
    private float valor;
    private String descricao;
    private String responsavel;

    public Contas(float valor, String descricao, String responsavel) {
        this.valor = valor;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String responsavel) {
        this.descricao = descricao;
    }
    
    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
