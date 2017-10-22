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
     * Constrói objeto de um morador temporario, inicializando informações 
     * sobre um novo morador temporario inserido.
     */
    
    /**
     *
     * @param nome
     * @param contato
     * @param cpf
     * @param saldoDevedor Valor devido pelo morador das contas ou valorFixo
     * @param valorFixo Valor definido semanalmente pelo Moradores permanentes
     * @param periodoMinimo Periodo de tempo em que o morador temporario ficará na casa
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
    
    /**
     * 
     * @param valorFixo
     * @return Valor do periodo de estadia * um valor pré definido
     */
    
    @Override 
    public float totalPagar(float valorFixo){
        float contas = 0;
        return (getPeriodo()*valorFixo)+contas;
    }
}