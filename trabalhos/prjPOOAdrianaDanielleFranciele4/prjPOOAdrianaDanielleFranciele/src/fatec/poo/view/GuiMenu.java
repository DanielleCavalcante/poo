/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.view;

/**
 *
 * @author Adriana, Danielle e Franciele
 */
public class GuiMenu extends javax.swing.JFrame {

    /**
     * Creates new form GuiMenu
     */
    public GuiMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarMenu = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemQuarto = new javax.swing.JMenuItem();
        jMenuItemRecepcionista = new javax.swing.JMenuItem();
        jMenuItemHospede = new javax.swing.JMenuItem();
        jMenuItemServicoQuarto = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jMenuItemReservarLiberar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hotel POO");

        jMenuCadastro.setText("Cadastro");

        jMenuItemQuarto.setText("Quarto");
        jMenuItemQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemQuarto);

        jMenuItemRecepcionista.setText("Recepcionista");
        jMenuItemRecepcionista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecepcionistaActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemRecepcionista);

        jMenuItemHospede.setText("Hospede");
        jMenuItemHospede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHospedeActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemHospede);

        jMenuItemServicoQuarto.setText("Serviço de Quarto");
        jMenuItemServicoQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicoQuartoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemServicoQuarto);

        jMenuBarMenu.add(jMenuCadastro);

        jMenuRegistro.setText("Registro");

        jMenuItemReservarLiberar.setText("Reservar/Liberar");
        jMenuItemReservarLiberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReservarLiberarActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jMenuItemReservarLiberar);

        jMenuBarMenu.add(jMenuRegistro);

        setJMenuBar(jMenuBarMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemQuartoActionPerformed
        //Quando clicar no item Quarto, será apresentada a tela de Cadastro de Quarto
        GuiCadastroQuarto objQuarto;
        objQuarto = new GuiCadastroQuarto();
        objQuarto.setVisible(true);
    }//GEN-LAST:event_jMenuItemQuartoActionPerformed

    private void jMenuItemRecepcionistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecepcionistaActionPerformed
        //Quando clicar no item Recepcionista, será apresentada a tela de Cadastro de Recepcionista
        GuiCadastroRecepcionista objRecepcionista;
        objRecepcionista = new GuiCadastroRecepcionista();
        objRecepcionista.setVisible(true);
    }//GEN-LAST:event_jMenuItemRecepcionistaActionPerformed

    private void jMenuItemHospedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHospedeActionPerformed
        // Quando clicar no item Hospede, será apresentada a tela de Cadastro de Hospede
        GuiCadastroHospede objHospede;
        objHospede = new GuiCadastroHospede();
        objHospede.setVisible(true);
    }//GEN-LAST:event_jMenuItemHospedeActionPerformed

    private void jMenuItemServicoQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicoQuartoActionPerformed
        //Quando clicar em Serviço de Quarto, será apresentada a tela de Serviços
        GuiServicoQuarto objServico;
        objServico = new GuiServicoQuarto();
        objServico.setVisible(true);
    }//GEN-LAST:event_jMenuItemServicoQuartoActionPerformed

    private void jMenuItemReservarLiberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReservarLiberarActionPerformed
        GuiRegistro objRegistro;
        objRegistro = new GuiRegistro();
        objRegistro.setVisible(true);
    }//GEN-LAST:event_jMenuItemReservarLiberarActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBarMenu;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenuItem jMenuItemHospede;
    private javax.swing.JMenuItem jMenuItemQuarto;
    private javax.swing.JMenuItem jMenuItemRecepcionista;
    private javax.swing.JMenuItem jMenuItemReservarLiberar;
    private javax.swing.JMenuItem jMenuItemServicoQuarto;
    private javax.swing.JMenu jMenuRegistro;
    // End of variables declaration//GEN-END:variables
}
