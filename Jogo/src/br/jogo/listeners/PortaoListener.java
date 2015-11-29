/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.PortaoFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class PortaoListener implements ActionListener {

    PortaoFrame frame;
    PrincipalFrame principal;

    public PortaoListener(PortaoFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "retornar":
                frame.Sair();
                principal.CriarFlorestaFrame();
                break;
            case "passar":
                frame.Sair();
                principal.CriarCadeadoFrame();
                break;

        }
    }

}
