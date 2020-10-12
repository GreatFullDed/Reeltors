/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reeltorsproject;

import forms.MainFrame;
import models.Hiber;

/**
 *
 * @author WSR
 */
public class ReeltorsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hiber.Start();
        MainFrame mf = new MainFrame();
        mf.setVisible(true); // Включение главного окна
    }
    
}
