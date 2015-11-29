/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.Arvore2Frame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class Arvore2Listener implements ActionListener {

    Arvore2Frame frame;
    PrincipalFrame principal;

    
    public Arvore2Listener(Arvore2Frame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {

            case "ir":
                principal.CriarPortaoFrame();
                break;

            case "seguir":
                principal.CriarCaminhoPedras();
                break;

        }
    }

}
