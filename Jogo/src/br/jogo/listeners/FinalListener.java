/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import telas.FinalFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Marcos
 */
public class FinalListener {

    FinalFrame frame;
    PrincipalFrame principal;

    public FinalListener(FinalFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }

    public void actionPerformed(ActionEvent ae) {
        switch (ae.getActionCommand()) {
            case "carregar":
                principal.CriarNeveFrame();
                frame.Sair();
                break;

        }
    }
}
