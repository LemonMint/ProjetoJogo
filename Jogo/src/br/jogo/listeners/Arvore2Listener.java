/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.Arvore2Frame;

/**
 *
 * @author Lemon
 */
public class Arvore2Listener implements ActionListener{
    
    Arvore2Frame frame;

    public Arvore2Listener(Arvore2Frame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            
            case "ir":
                break;
                
            case "seguir":
                break;
                
        }
    }
    
}
