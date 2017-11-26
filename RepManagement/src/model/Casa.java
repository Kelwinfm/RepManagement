/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
 */
package model;

import control.ArquivoAbstract;

public abstract class Casa extends ArquivoAbstract {

    private String qtdMoradores;
    private String vagasPerm;
    private String vagasTemp;
    private String nome;

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
    private void setQtdMoradores(String qtdMoradores) {
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
    public final void setVagasPerm(String vagasPerm) {
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
    public final void setVagasTemp(String vagasTemp) {
        this.vagasTemp = vagasTemp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
