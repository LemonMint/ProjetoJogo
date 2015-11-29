/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.DesertoFrame;

/**
 *
 * @author Lemon
 */
public class DesertoListener implements ActionListener{

    DesertoFrame frame;

    public DesertoListener(DesertoFrame frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "carregar":
                
                break;
            
        }
        
    }
    
}
