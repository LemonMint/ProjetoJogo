/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jogo.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import telas.CaminhoPedrasFrame;
import telas.PrincipalFrame;

/**
 *
 * @author Lemon
 */
public class CaminhoPedrasListener implements ActionListener{

    CaminhoPedrasFrame frame;
    PrincipalFrame principal;

    public CaminhoPedrasListener(CaminhoPedrasFrame frame, PrincipalFrame principal) {
        this.frame = frame;
        this.principal = principal;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if("continuar".equals(ae.getActionCommand())){
            principal.CriarPeixeFrame();
            
        }
    }
    
    
    
}
