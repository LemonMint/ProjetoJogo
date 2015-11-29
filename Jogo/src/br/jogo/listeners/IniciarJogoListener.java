/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.IniciarJogoFrame;

/**
 *
 * @author Lemon
 */
public class IniciarJogoListener implements ActionListener {

    IniciarJogoFrame frame;

    public IniciarJogoListener(IniciarJogoFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {

            case "iniciar":
                
                break;

            case "creditos":
                frame.Creditos();
                break;

            case "sair":
                frame.Sair();
                break;
        }
    }

}