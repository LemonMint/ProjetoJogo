/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.OpcaoCorretaFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class OpcaoCorretaListener implements ActionListener {

    OpcaoCorretaFrame frame;
    PrincipalFrame principal;

    public OpcaoCorretaListener(OpcaoCorretaFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if ("passar".equals(ae.getActionCommand())) {
            frame.Sair();

        }
    }

}
