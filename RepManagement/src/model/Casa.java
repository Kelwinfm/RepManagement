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
    private int vagasPerm;
    private int vagasTemp;
    ArrayList<Permanente> allMoradoresPerm;
    ArrayList<Temporario>  allMoradoresTemp;
    ArrayList<Contas> allContas;

    public Casa(int qtdMoradores, int vagasPerm, int vagasTemp, ArrayList<Permanente> allMoradoresPerm, ArrayList<Temporario> allMoradoresTemp, ArrayList<Contas> allContas, ArrayList<Object> allMoradores) {
        this.qtdMoradores = qtdMoradores;
        this.vagasPerm = vagasPerm;
        this.vagasTemp = vagasTemp;
        this.allMoradoresPerm = allMoradoresPerm;
        this.allMoradoresTemp = allMoradoresTemp;
        this.allContas = allContas;
    }

    public int getQtdMoradores() {
        return qtdMoradores;
    }

    public void setQtdMoradores(int qtdMoradores) {
        this.qtdMoradores = qtdMoradores;
    }

    public int getVagasPerm() {
        return vagasPerm;
    }

    public void setVagasPerm(int vagasPerm) {
        this.vagasPerm = vagasPerm;
    }

    public int getVagasTemp() {
        return vagasTemp;
    }

    public void setVagasTemp(int vagasTemp) {
        this.vagasTemp = vagasTemp;
    }

    public ArrayList<Permanente> getAllMoradoresPerm() {
        return allMoradoresPerm;
    }

    public void setAllMoradoresPerm(ArrayList<Permanente> allMoradoresPerm) {
        this.allMoradoresPerm = allMoradoresPerm;
    }

    public ArrayList<Temporario> getAllMoradoresTemp() {
        return allMoradoresTemp;
    }

    public void setAllMoradoresTemp(ArrayList<Temporario> allMoradoresTemp) {
        this.allMoradoresTemp = allMoradoresTemp;
    }

    public ArrayList<Contas> getAllContas() {
        return allContas;
    }

    public void setAllContas(ArrayList<Contas> allContas) {
        this.allContas = allContas;
    }
    

    
}
