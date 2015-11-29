/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.FlorestaFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class FlorestaListener implements ActionListener {

    FlorestaFrame frame;
    PrincipalFrame principal;

    public FlorestaListener(FlorestaFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "aproximar":
                principal.CriarArvoreFrame();
                break;
            case "seguir":
                principal.CriarPortaoFrame();
                break;

        }
    }

}
