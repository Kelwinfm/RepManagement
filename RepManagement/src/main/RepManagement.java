/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import model.Casa;
import model.Contas;
import model.Permanente;
import model.Casa;
import model.Temporario;
import view.MenuPrincipal;

/**
 *
 * @author kelwin
 */
public class RepManagement {

    public static void main(String[] args) {
        //MenuPrincipal addMenu = new MenuPrincipal();
        // addMenu.setVisible(true);
        Contas conta = new Contas("10","2017","80.67", "23/10/2017","Agua",true);
        conta.Save();
       System.out.println("Conta salva");
        Permanente perm = new Permanente("Risolis","(11)98423473","34326566-52","0", "220.00","01/03/2017","435554645");
        perm.Save();
        System.out.println("Moradores salvos");


        }

    }
