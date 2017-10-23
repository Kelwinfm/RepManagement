/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.ContasDAO;
import view.MenuPrincipal;

/**
 *
 * @author kelwin
 */
public class RepManagement {


    public static void main(String[] args) {
        //MenuPrincipal addMenu = new MenuPrincipal();
           // addMenu.setVisible(true);
        ContasDAO conta = new ContasDAO(10,2017,(float) 80.67, "23/10/2017","Agua",true);
        conta.Save();
        System.out.println("Salvo");
    }
    
}
