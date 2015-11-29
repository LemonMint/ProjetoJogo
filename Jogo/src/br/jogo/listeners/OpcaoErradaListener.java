/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.OpcaoErradaFrame;

/**
 *
 * @author Lemon
 */
public class OpcaoErradaListener implements ActionListener {

    OpcaoErradaFrame frame;

    public OpcaoErradaListener(OpcaoErradaFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if("retornar".equals(ae.getActionCommand())){
            
        }
        if("passar".equals(ae.getActionCommand())){
            
        }
    }

}
