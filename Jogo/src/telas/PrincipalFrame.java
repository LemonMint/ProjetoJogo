/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import javax.swing.ImageIcon;

/**
 *
 * @author Lemon
 */
public class PrincipalFrame extends javax.swing.JFrame {

    public PrincipalFrame() {
        initComponents();
        jDesktopPane1.setLayout(null);
        CriarIniciarJogoFrame();

    }

    public static ComecoFrame telaComeco = null;
    public static IniciarJogoFrame telaIniciarJogo = null;
    public static DesertoFrame telaDeserto = null;
    public static FlorestaFrame telaFloresta = null;
    public static PortaoFrame telaPortao = null;
    public static OasisFrame telaOasis = null;
    public static MuroFrame telaMuro = null;
    public static Arvore2Frame telaArvore2 = null;
    public static ArvoreFrame telaArvore = null;
    public static CadeadoFrame telaCadeado = null;
    public static CaminhoPedrasFrame telaCaminhoPedras = null;
    public static NeveFrame telaNeve = null;
    public static OpcaoCorretaFrame telaOpcaoCorreta = null;
    public static OpcaoErradaFrame telaOpcaoErrada = null;
    public static PeixeFrame telaPeixe = null;
    public static FinalFrame telaFinalFrame = null;

    public void CriarComecoFrame() {
        if (telaComeco == null) {
            telaComeco = new ComecoFrame(this);
        }
        jDesktopPane1.add(telaComeco);
        telaComeco.setVisible(true);
    }

    public void CriarIniciarJogoFrame() {
        if (telaIniciarJogo == null) {
            telaIniciarJogo = new IniciarJogoFrame(this);
        }
        jDesktopPane1.add(telaIniciarJogo);
        telaIniciarJogo.setVisible(true);
    }

    public void CriarDesertoFrame() {
        if (telaDeserto == null) {
            telaDeserto = new DesertoFrame(this);
        }
        jDesktopPane1.add(telaDeserto);
        telaDeserto.setVisible(true);
    }

    public void CriarFlorestaFrame() {
        if (telaFloresta == null) {
            telaFloresta = new FlorestaFrame(this);

        }
        jDesktopPane1.add(telaFloresta);
        telaFloresta.setVisible(true);
    }

    public void CriarPortaoFrame() {
        if (telaPortao == null) {
            telaPortao = new PortaoFrame(this);

        }
        jDesktopPane1.add(telaPortao);
        telaPortao.setVisible(true);
    }

    public void CriarOasisFrame() {
        if (telaOasis == null) {
            telaOasis = new OasisFrame(this);
        }
        jDesktopPane1.add(telaOasis);
        telaOasis.setVisible(true);
    }

    public void CriarMuroFrame() {
        if (telaMuro == null) {
            telaMuro = new MuroFrame(this);
        }
        jDesktopPane1.add(telaMuro);
        telaMuro.setVisible(true);
    }

    public void CriarArvore2Frame() {
        if (telaArvore2 == null) {
            telaArvore2 = new Arvore2Frame(this);
        }
        jDesktopPane1.add(telaArvore2);
        telaArvore2.setVisible(true);
    }

    public void CriarArvoreFrame() {
        if (telaArvore == null) {
            telaArvore = new ArvoreFrame(this);
        }
        jDesktopPane1.add(telaArvore);
        telaArvore.setVisible(true);
    }

    public void CriarCadeadoFrame() {
        if (telaCadeado == null) {
            telaCadeado = new CadeadoFrame(this);
        }
        jDesktopPane1.add(telaCadeado);
        telaCadeado.setVisible(true);
    }

    public void CriarCaminhoPedras() {
        if (telaCaminhoPedras == null) {
            telaCaminhoPedras = new CaminhoPedrasFrame(this);
        }
        jDesktopPane1.add(telaCaminhoPedras);
        telaCaminhoPedras.setVisible(true);
    }

    public void CriarNeveFrame() {
        if (telaNeve == null) {
            telaNeve = new NeveFrame(this);
        }
        jDesktopPane1.add(telaNeve);
        telaNeve.setVisible(true);
    }

    public void CriarOpcaoCorretaFrame() {
        if (telaOpcaoCorreta == null) {
            telaOpcaoCorreta = new OpcaoCorretaFrame(this);
        }
        jDesktopPane1.add(telaOpcaoCorreta);
        telaOpcaoCorreta.setVisible(true);
    }

    public void CriarOpcaoErradaFrame() {
        if (telaOpcaoErrada == null) {
            telaOpcaoErrada = new OpcaoErradaFrame(this);
        }
        jDesktopPane1.add(telaOpcaoErrada);
        telaOpcaoErrada.setVisible(true);
    }

    public void CriarPeixeFrame() {
        if (telaPeixe == null) {
            telaPeixe = new PeixeFrame(this);
        }
        jDesktopPane1.add(telaPeixe);
        telaPeixe.setVisible(true);
    }
    
    public void CriarFinalFrame(){
        if(telaFinalFrame == null){
            telaFinalFrame = new FinalFrame(this);
        }
        jDesktopPane1.add(telaFinalFrame);
        telaFinalFrame.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setResizable(false);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1025, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
