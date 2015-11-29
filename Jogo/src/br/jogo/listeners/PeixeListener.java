/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.PeixeFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class PeixeListener implements ActionListener {

    PeixeFrame frame;
    PrincipalFrame principal;

    public PeixeListener(PeixeFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("pegar".equals(ae.getActionCommand())) {
            frame.Sair();
            principal.CriarOasisFrame();

        }
    }

}
