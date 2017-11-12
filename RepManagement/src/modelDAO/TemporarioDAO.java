/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import java.io.IOException;
import java.util.ArrayList;
import model.Temporario;

/**
 *
 * @author kelwi
 */
public class TemporarioDAO extends Temporario{
     public ArrayList<Temporario> temporarios = new ArrayList<>();//array list de moradores temporarios
    
        
    public void CarregarTemporario() throws IllegalArgumentException, IOException {
        Temporario temporario = new Temporario();

        for (Temporario t : temporario.LoadAll()) {
            this.temporarios.add(t);
        }
    }

    public Temporario ConsultarTemporario(String cpf) {

        for (Temporario temporario : temporarios) {
            if (temporario.getCpf().compareToIgnoreCase(cpf) == 0) {
                return temporario;
            }
        }
        return null;
    }

    public synchronized boolean RemoverTemporario(String rg) {//garantir a sincronia com a trheads
        Temporario temporario = ConsultarTemporario(rg);
        if (temporario != null) {
            temporario.Remove();
            return true;
        }
        return false;
    }
    
}
