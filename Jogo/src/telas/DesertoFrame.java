/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import br.jogo.listeners.DesertoListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Lemon
 */
public class DesertoFrame extends javax.swing.JInternalFrame {

    DesertoListener listener = new DesertoListener(this);
    
    /**
     * Creates new form DesertoFrame
     */
    public DesertoFrame() {
        initComponents();
        setBorder(null);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        btCarregar.addActionListener(listener);
        btCarregar.setActionCommand("carregar");
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
        jLabel6 = new javax.swing.JLabel();
        btCarregar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1024, 768));
        setVisible(true);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/jogo/imagens/Deserto com urso.jpg"))); // NOI18N
        jLabel1.setText("Imagem");
        jLabel1.setPreferredSize(new java.awt.Dimension(900, 400));

        jLabel2.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel2.setText("    \"Continuando minha jornada, logo percebo uma sensação desconfortável, meus pés ardem,");

        jLabel3.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel3.setText("desejo não ficar aqui por muito tempo. Logo a frente, vejo um amontado branco e macio,");

        jLabel4.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel4.setText("me aproximo e ele se move, dou um pulo assustado e ouço ele dizer:\"");

        jLabel5.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel5.setText("     \"Ei você ai, eu estou sedento, não aguento mais este local, meus pés estão queimando,");

        jLabel6.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        jLabel6.setText("meu pelo não serve para este tipo de lugar, me ajude a buscar um lugar mais frio.\"");

        btCarregar.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        btCarregar.setText("\"Carregar a bola macia para outro lugar\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btCarregar)
                        .addComponent(jLabel5)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCarregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
