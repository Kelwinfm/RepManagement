/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.io.IOException;
import java.util.ArrayList;
import model.Permanente;

/**
 *
 * @author kelwin
 */
public class PermanenteDAO extends Permanente {
    
     
    public ArrayList<Permanente> permanentes = new ArrayList<>();//array list de moradores permanentes
    
        
    public void CarregarPermanente() throws IllegalArgumentException, IOException {
        Permanente permanente = new Permanente();

        for (Permanente p : permanente.LoadAll()) {
            this.permanentes.add(p);
        }
    }

    public Permanente ConsultarPermanente(String rg) {

        for (Permanente permanente : permanentes) {
            if (permanente.getRg().compareToIgnoreCase(rg) == 0) {
                return permanente;
            }
        }
        return null;
    }

    public synchronized boolean RemoverPermanente(String rg) {//garantir a sincronia com a trheads
        Permanente permanente = ConsultarPermanente(rg);
        if (permanente != null) {
            permanente.Remove();
            return true;
        }
        return false;
    }
}