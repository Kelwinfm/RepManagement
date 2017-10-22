/*
 * Código de projeto de Programação Orientada a Objetos II
 * Gerenciamento do financeiro de republicas
 * FT-UNICAMP
 *
 */
package model;

import java.util.Date;

/**
 *
 * Sub classe de Despesas em que mostra o tipo de conta e o status da mesma
 * @author kelwin
 */
public class Contas extends Despesas{
    private String tipo;
    private boolean pago;

    /**
     * Constrói objeto Contas, inicializando informações sobre uma conta nova inserida.
     */
    
    /**
     *
     * @param mes
     * @param ano
     * @param valor
     * @param dataVenc
     * @param tipo Tipo de conta a ser inserida (EX: Agua,luz,internet)
     * @param pago Pode receber True se tiver sido paga ou False se ainda nao foi paga
     */
    
    public Contas(int mes, int ano, float valor, Date dataVenc, String tipo, boolean pago) {
        super(mes, ano, valor, dataVenc);
        this.tipo = tipo;
        this.pago = pago;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isPago() {
        return true;
    }

    public void setPago(boolean pago) {
        this.pago = true;
    }
    
     /**
     * Colocar todos os dados das contas pagas em um unico arquivo com os totais
     */
    public void gerarRelatorio(){
        
    }
    public void consultarRelatorio(){
        
    }
}
