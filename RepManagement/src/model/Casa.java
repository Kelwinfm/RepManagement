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
    /**
     * Cria um objeto vazio passando null para todos parametros
     */
    public Casa() {
        qtdMoradores = null;
        vagasPerm = null;
        vagasTemp = null;
    }

    /**
     *
     * @param qtdMoradores quantiadde de moradores atuais morando na casa
     * @param vagasPerm vagas disponiveis permanentes na casa
     * @param vagasTemp vagas disponiveis temporarias na casa
     */
    public Casa(String qtdMoradores, String vagasPerm, String vagasTemp) {

        setQtdMoradores(qtdMoradores);
        setVagasPerm(vagasPerm);
        setVagasTemp(vagasTemp);

    }

    /**
     *
     * @return a quantidade de moradores
     */
    public String getQtdMoradores() {
        return qtdMoradores;
    }

    /**
     *
     * @param qtdMoradores
     */
    public void setQtdMoradores(String qtdMoradores) {
        this.qtdMoradores = qtdMoradores;
    }

    /**
     *
     * @return quantas vagas permanentes existem
     */
    public String getVagasPerm() {
        return vagasPerm;
    }

    /**
     *
     * @param vagasPerm
     */
    public void setVagasPerm(String vagasPerm) {
        this.vagasPerm = vagasPerm;
    }

    /**
     *
     * @return quantas vagas temporarias existem
     */
    public String getVagasTemp() {
        return vagasTemp;
    }

    /**
     *
     * @param vagasTemp
     */
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
