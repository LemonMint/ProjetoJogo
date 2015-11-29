/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.DesertoFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class DesertoListener implements ActionListener {

    DesertoFrame frame;
    PrincipalFrame principal;

    public DesertoListener(DesertoFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "carregar":
                principal.CriarNeveFrame();
                frame.Sair();
                break;

        }

    }

}
