/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kelwin
 */
public class Casa {

    private String qtdMoradores;
    private String vagasPerm;
    private String vagasTemp;

    /*public Casa(int qtdMoradores, int vagasPerm, int vagasTemp, ArrayList<Permanente> allMoradoresPerm, ArrayList<Temporario> allMoradoresTemp, ArrayList<Contas> allContas) {
        this.qtdMoradores = qtdMoradores;
        this.vagasPerm = vagasPerm;
        this.vagasTemp = vagasTemp;
        this.allMoradoresPerm = allMoradoresPerm;
        this.allMoradoresTemp = allMoradoresTemp;
        this.allContas = allContas;
    }*/
    public Casa(){
        qtdMoradores = null;
        vagasPerm = null;
        vagasTemp = null;
    }
    
    public Casa(String qtdMoradores, String vagasPerm, String vagasTemp) {

        setQtdMoradores(qtdMoradores);
        setVagasPerm(vagasPerm);
        setVagasTemp(vagasTemp);

    }

    public String getQtdMoradores() {
        return qtdMoradores;
    }

    public void setQtdMoradores(String qtdMoradores) {
        this.qtdMoradores = qtdMoradores;
    }

    public String getVagasPerm() {
        return vagasPerm;
    }

    public void setVagasPerm(String vagasPerm) {
        this.vagasPerm = vagasPerm;
    }

    public String getVagasTemp() {
        return vagasTemp;
    }

    public void setVagasTemp(String vagasTemp) {
        this.vagasTemp = vagasTemp;
    }

    /**
     * Soma todas as contas do array
     *
     * @return o valor total de todas as contas para relatorio e divisao entre
     * moradores
     */
    public float calcularContas() {
        float total = 0;
        return total;
    }

}
