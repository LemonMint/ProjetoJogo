/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.PortaoFrame;

/**
 *
 * @author Lemon
 */
public class PortaoListener implements ActionListener{
    
    PortaoFrame frame;

    public PortaoListener(PortaoFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "retornar":
                
                break;
            case "passar":
                break;
            
        }
    }
    
}
