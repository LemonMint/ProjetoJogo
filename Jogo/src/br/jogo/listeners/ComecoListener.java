/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.ComecoFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class ComecoListener implements ActionListener {

    ComecoFrame frame;
    PrincipalFrame principal;

    public ComecoListener(ComecoFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "seguir":
                frame.Sair();
                principal.CriarFlorestaFrame();
                break;
            case "muro":
                frame.Sair();
                principal.CriarMuroFrame();
                break;
        }

    }

}
