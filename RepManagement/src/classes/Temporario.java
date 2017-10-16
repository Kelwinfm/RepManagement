/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author kelwi
 */
public class Temporario extends Moradores{
    private int periodoMinimo;
    private float valorFixo;
    
    public float totalPagar(int periodo, float valor){
        return periodo*valor;
    }
}