/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.CadeadoFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class CadeadoListener implements ActionListener{

    CadeadoFrame frame;
    PrincipalFrame principal;
    
    public CadeadoListener(CadeadoFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        switch(ae.getActionCommand()){
            case "errada1":
                frame.Sair();
                principal.CriarOpcaoErradaFrame();
                break;
            case "errada2":
                frame.Sair();
                principal.CriarOpcaoErradaFrame();
                break;
            case "errada3":
                frame.Sair();
                principal.CriarOpcaoErradaFrame();
                break;
            case "certa":
                frame.Sair();
                principal.CriarOpcaoCorretaFrame();
                break;
        }
    }
    
    
}
