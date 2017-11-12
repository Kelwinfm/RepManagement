/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.io.IOException;
import java.util.ArrayList;
import model.Contas;

/**
 *
 * @author kelwi
 */
public class ContasDAO extends Contas{
    public ArrayList<Contas> contass = new ArrayList<>();//array list de contas
    
        
    public void CarregarContas() throws IllegalArgumentException, IOException {
        Contas contas = new Contas();

        for (Contas c : contas.LoadAll()) {
            this.contass.add(c);
        }
    }

    public Contas ConsultarContas(String tipo, String mes, String ano) {

        for (Contas contas : contass) {
            if (contas.getTipo().compareToIgnoreCase(tipo) == 0 && 
                contas.getMes().compareToIgnoreCase(mes) == 0 &&
                contas.getAno().compareToIgnoreCase(ano) == 0){
                return contas;
            }
        }
        return null;
    }

    public synchronized boolean RemoverContas(String tipo, String mes, String ano) {//garantir a sincronia com a trheads
        Contas contas = ConsultarContas(tipo, mes, ano);
        if (contas != null) {
            contas.Remove();
            return true;
        }
        return false;
    }
}
