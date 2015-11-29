/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.NeveFrame;

/**
 *
 * @author Lemon
 */
public class NeveListener implements ActionListener {

    NeveFrame frame;

    public NeveListener(NeveFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("ir".equals(ae.getActionCommand())) {
            
        }

    }

}
