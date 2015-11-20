/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.PrincipalFrame;

/**
 *
 * @author Marcos
 */
public class StarFrameListener implements ActionListener {
    PrincipalFrame frame;
    
        public StarFrameListener(PrincipalFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (null != ae.getActionCommand()) {

            switch (ae.getActionCommand()) {

                
            }

        }
    }

}
