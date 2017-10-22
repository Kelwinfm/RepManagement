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
 * @see Moradores
 */
public class Temporario extends Moradores{
    private int periodo;
    /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor
     * @param valorFixo
     * @param periodoMinimo
     */
    public Temporario(String nome, String contato, String cpf, float saldoDevedor,float valorFixo,int periodoMinimo) {
       super(nome, contato, cpf, saldoDevedor, valorFixo);
       this.periodo = periodoMinimo;

    }
    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    @Override 
    public float totalPagar(float valorFixo){
        float contas = 0;
        return (getPeriodo()*valorFixo)+contas;
    }
}