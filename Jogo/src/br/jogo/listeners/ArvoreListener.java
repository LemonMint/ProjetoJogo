/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.ArvoreFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class ArvoreListener implements ActionListener {

    ArvoreFrame frame;
    PrincipalFrame principal;

    public ArvoreListener(ArvoreFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "correr":
                frame.Sair();
                principal.CriarPortaoFrame();
                break;
            case "conversar":
                frame.Sair();
                principal.CriarArvore2Frame();
                break;

        }
    }

}
