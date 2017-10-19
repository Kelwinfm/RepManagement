/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kelwi
 */
public class Casa {
    private int qtdMoradores;
    private int vagas;
    ArrayList<Permanente> allMoradores;
    ArrayList<Contas> allContas;

    public Casa(int qtdMoradores, int vagas) {
        this.allMoradores = new ArrayList<>();
        this.allContas = new ArrayList<>();
        this.qtdMoradores = qtdMoradores;
        this.vagas = vagas;
    }

    public int getQtdMoradores() {
        return qtdMoradores;
    }

    public void setQtdMoradores(int qtdMoradores) {
        this.qtdMoradores = qtdMoradores;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }
    
    
}
