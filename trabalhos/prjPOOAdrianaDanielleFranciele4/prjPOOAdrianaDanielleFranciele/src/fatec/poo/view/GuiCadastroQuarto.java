package fatec.poo.view;
import fatec.poo.control.Conexao;
import fatec.poo.control.DaoQuarto;
import fatec.poo.model.Quarto;

import javax.swing.JOptionPane;
/**
 *
 * @author Adriana, Danielle e Franciele
 */
public class GuiCadastroQuarto extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroQuarto
     */
    public GuiCadastroQuarto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblNQuarto = new javax.swing.JLabel();
        lblValorDiaria = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdbSolteiro = new javax.swing.JRadioButton();
        rdbCasal = new javax.swing.JRadioButton();
        txtNQuarto = new javax.swing.JTextField();
        txtValorDiaria = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Quarto");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblNQuarto.setText("N° Quarto");

        lblValorDiaria.setText("Valor Diária");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo"));
        jPanel1.setEnabled(false);

        buttonGroup1.add(rdbSolteiro);
        rdbSolteiro.setSelected(true);
        rdbSolteiro.setText("Solteiro");
        rdbSolteiro.setEnabled(false);

        buttonGroup1.add(rdbCasal);
        rdbCasal.setText("Casal");
        rdbCasal.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rdbSolteiro)
                .addGap(18, 18, 18)
                .addComponent(rdbCasal)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbCasal)
                    .addComponent(rdbSolteiro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtValorDiaria.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setEnabled(false);
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/rem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblValorDiaria)
                                .addComponent(lblNQuarto))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNQuarto)
                                .addComponent(txtValorDiaria)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNQuarto)
                    .addComponent(txtNQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValorDiaria)
                    .addComponent(txtValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system","oracle"); //usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe");
                                               //CASA: 127.0.0.1
                                              //FATEC: 192.168.56.1
        daoQuarto = new DaoQuarto(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       quarto = null;
       if(txtNQuarto.getText().matches("[0-9]*")){
       quarto = daoQuarto.consultar(Integer.parseInt(txtNQuarto.getText()));
       
       
       if (quarto == null){//não encontrou o objeto na BD
           txtNQuarto.setEnabled(false);
           txtValorDiaria.setEnabled(true);
           jPanel1.setEnabled(true);
           rdbSolteiro.setEnabled(true);
           rdbCasal.setEnabled(true);
           txtValorDiaria.requestFocus();
           
           btnConsultar.setEnabled(false);
           btnInserir.setEnabled(true);
           btnAlterar.setEnabled(false);
           btnExcluir.setEnabled(false);
       }
       else{ //encontrou o objeto na BD
          txtNQuarto.setText(Integer.toString(quarto.getNumero())); //acrescentei o Integer para transformar para string.
          txtValorDiaria.setText(String.valueOf(quarto.getValorDiaria())); //acrescei o método String.valueOf para converter o tipo.
          if(quarto.getTipo().compareTo("Solteiro") == 0){
                rdbSolteiro.setSelected(rootPaneCheckingEnabled);
            }else{
                rdbCasal.setSelected(rootPaneCheckingEnabled);
           }
          
          txtNQuarto.setEnabled(false); 
          txtValorDiaria.setEnabled(true);
          txtValorDiaria.requestFocus();
          jPanel1.setEnabled(true);
          rdbSolteiro.setEnabled(true);
          rdbCasal.setEnabled(true);
          btnConsultar.setEnabled(false);
          btnInserir.setEnabled(false);
          btnAlterar.setEnabled(true);
          btnExcluir.setEnabled(true);
       }  
    }
       else{
           JOptionPane.showMessageDialog(null, "Número de Quarto inválido. Digite um valor numérico inteiro.");
          txtNQuarto.setText(null);
          txtNQuarto.requestFocus();
       }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String tipoQuarto;
        if(rdbSolteiro.isSelected() == true){ //if para verificar qual o tipo de quarto foi selecionado.
            tipoQuarto = "Solteiro";
        }else {
            tipoQuarto = "Casal";
        }
        quarto = new Quarto(Integer.parseInt(txtNQuarto.getText()), tipoQuarto, Double.parseDouble(txtValorDiaria.getText()));
        daoQuarto.inserir(quarto);
         
        txtNQuarto.setText("");
        txtValorDiaria.setText(""); 
        jPanel1.setEnabled(false);
        
        btnInserir.setEnabled(false);
        txtNQuarto.setEnabled(true);
        txtValorDiaria.setEnabled(false);
        txtNQuarto.requestFocus();
        rdbSolteiro.setEnabled(false);
        rdbSolteiro.setSelected(true);
        rdbCasal.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false); 
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){    //Sim   
        //Inseri a parte a abaixo para atualização dos dados.
        String tipoQuarto;
        if(rdbSolteiro.isSelected() == true){ //if para verificar qual o tipo de quarto.
            tipoQuarto = "Solteiro";
        }else {
            tipoQuarto = "Casal";
        }
        quarto = new Quarto(Integer.parseInt(txtNQuarto.getText()), tipoQuarto, Double.parseDouble(txtValorDiaria.getText()));
           daoQuarto.alterar(quarto);
        }         
        txtNQuarto.setText("");
        txtValorDiaria.setText("");
        txtNQuarto.setEnabled(true); 
        txtValorDiaria.setEnabled(false);
        jPanel1.setEnabled(false);
        txtNQuarto.requestFocus();
        rdbSolteiro.setEnabled(false);
        rdbSolteiro.setSelected(true);
        rdbCasal.setEnabled(false);
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);    
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoQuarto.excluir(quarto); 
            
            txtNQuarto.setText("");
            txtValorDiaria.setText("");
            txtNQuarto.setEnabled(true); 
            txtValorDiaria.setEnabled(false);
            jPanel1.setEnabled(false);
            rdbSolteiro.setEnabled(false);
            rdbSolteiro.setSelected(true);
            rdbCasal.setEnabled(false);
            txtNQuarto.requestFocus();
            
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNQuarto;
    private javax.swing.JLabel lblValorDiaria;
    private javax.swing.JRadioButton rdbCasal;
    private javax.swing.JRadioButton rdbSolteiro;
    private javax.swing.JTextField txtNQuarto;
    private javax.swing.JTextField txtValorDiaria;
    // End of variables declaration//GEN-END:variables
    private DaoQuarto daoQuarto=null;
    private Quarto quarto=null;
    private Conexao conexao=null;
}
