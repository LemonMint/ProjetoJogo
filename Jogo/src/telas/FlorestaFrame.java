/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import br.jogo.listeners.FlorestaListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Marcos
 */
public class FlorestaFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form florestaFrame
     */
    public FlorestaFrame(PrincipalFrame principal) {
        initComponents();
        setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        FlorestaListener listener = new FlorestaListener(this, principal);
        btAproximar.addActionListener(listener);
        btAproximar.setActionCommand("aproximar");
        btSeguir.addActionListener(listener);
        btSeguir.setActionCommand("seguir");
    }

    public void Sair() {
        PrincipalFrame.telaFloresta = null;
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btAproximar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btSeguir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 768));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/jogo/imagens/floresta.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setText("    \"Em passos lentos e desajeitados seguiu ele o caminho a sua frente. Percebendo então");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel3.setText("algo que não fazia ideia do que era. Marrom, bem alto e acima pingos verdes em formatos");

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel4.setText("que não lembrava de nada, foi descobrindo o mundo ao seu redor, logo se deparou com");

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel5.setText("estranhos.\"");

        btAproximar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btAproximar.setText("\"Se aproximar e verificar do que se trata.\"");

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel6.setText("\"O que devo fazer agora?\"");

        btSeguir.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btSeguir.setText("\"Seguir o caminho a frente.\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAproximar)
                        .addGap(18, 18, 18)
                        .addComponent(btSeguir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAproximar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSeguir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAproximar;
    private javax.swing.JButton btSeguir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
