/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.CadeadoFrame;

/**
 *
 * @author Lemon
 */
public class CadeadoListener implements ActionListener{

    CadeadoFrame frame;

    public CadeadoListener(CadeadoFrame frame) {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "errada1":
                break;
            case "errada2":
                break;
            case "errada3":
                break;
            case "certa":
                break;
        }
    }
    
    
}
