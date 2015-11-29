/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.FlorestaFrame;

/**
 *
 * @author Lemon
 */
public class FlorestaListener implements ActionListener{

    FlorestaFrame frame;

    public FlorestaListener(FlorestaFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
       switch(ae.getActionCommand()){
           case "aproximar":
               break;
           case "seguir":
               break;
           
       }
    }
    
}
