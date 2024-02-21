package fatec.poo.view;

import fatec.poo.control.Conexao;
import fatec.poo.control.DaoHospede;
import fatec.poo.model.Hospede;

import javax.swing.JOptionPane;
/**
 *
 * @author Adriana, Danielle e Franciele
 */
public class GuiCadastroHospede extends javax.swing.JFrame {

    /**
     * Creates new form GuiCadastroHospede
     */
    public GuiCadastroHospede() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCPF = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblTaxaDesconto = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtTaxaDesconto = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Hóspede");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblCPF.setText("CPF");

        lblNome.setText("Nome");

        lblEndereco.setText("Endereço");

        lblTelefone.setText("Telefone");

        lblTaxaDesconto.setText("Taxa de desconto (%)");

        txtNome.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtTaxaDesconto.setEnabled(false);

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

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefone)
                                    .addComponent(lblTaxaDesconto)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome)
                                        .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblEndereco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTaxaDesconto)
                    .addComponent(txtTaxaDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultar)
                    .addComponent(btnInserir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conexao = new Conexao("system","oracle"); //usuario e senha
        conexao.setDriver("oracle.jdbc.driver.OracleDriver");
        conexao.setConnectionString("jdbc:oracle:thin:@127.0.0.1:1521:xe");
                                               //CASA: 127.0.0.1
                                              //FATEC: 192.168.56.1
        daoHospede = new DaoHospede(conexao.conectar());
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        conexao.fecharConexao();
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    // Obtenha o CPF do campo de texto
    hospede=null;
    
    String cpf = txtCPF.getText();

    // Valide o CPF utilizando o método validarCPF da classe Hospede
    boolean cpfValido = Hospede.validarCPF(cpf);

    if (cpfValido) {
        //hospede = null;
        
        hospede = daoHospede.consultar(cpf);

        if (hospede == null) { // não encontrou o objeto na BD
            txtCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtTaxaDesconto.setEnabled(true);
            txtNome.requestFocus();

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(true);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } else { // encontrou o objeto na BD
            txtNome.setText(hospede.getNome());
            txtEndereco.setText(hospede.getEndereco());
            txtTelefone.setText(hospede.getTelefone());
            txtTaxaDesconto.setText(String.valueOf(hospede.getTaxaDesconto())); //valueOf para transformar o valor em string
           
            txtCPF.setEnabled(false);
            txtNome.setEnabled(true);
            txtEndereco.setEnabled(true);
            txtTelefone.setEnabled(true);
            txtTaxaDesconto.setEnabled(true);
            txtNome.requestFocus();

            btnConsultar.setEnabled(false);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        }
    } else {
        // CPF inválido, exiba uma mensagem de advertência
        JOptionPane.showMessageDialog(null, "CPF inválido! Digite um CPF válido.");
        txtCPF.setText(null);
        txtCPF.requestFocus();
    } 
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        hospede = new Hospede(txtCPF.getText(), txtNome.getText());
        hospede.setEndereco(txtEndereco.getText()); //dado inserido para formar hospede
        hospede.setTelefone(txtTelefone.getText()); //dado inserido para formar hospede
        hospede.setTaxaDesconto(Double.parseDouble(txtTaxaDesconto.getText())); //dado inserido para formar hospede
        daoHospede.inserir(hospede);
         
        txtCPF.setText("");
        txtNome.setText("");   
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtTaxaDesconto.setText("");
        btnInserir.setEnabled(false);
        txtCPF.setEnabled(true);
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);
        txtCPF.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);   
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Alteração?")== 0){    //Sim
            hospede = new Hospede(txtCPF.getText(), txtNome.getText());
            hospede.setEndereco(txtEndereco.getText()); //dado inserido para formar hospede
            hospede.setTelefone(txtTelefone.getText()); //dado inserido para formar hospede
            hospede.setTaxaDesconto(Double.parseDouble(txtTaxaDesconto.getText())); //dado inserido para formar hospede
            System.out.println(txtTaxaDesconto.getText());
            daoHospede.alterar(hospede);
        }
        
        txtCPF.setText("");
        txtNome.setText("");
        txtEndereco.setText("");
        txtTelefone.setText("");
        txtTaxaDesconto.setText("");
        txtCPF.setEnabled(true); 
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtTaxaDesconto.setEnabled(false);        
        txtCPF.requestFocus();
        
        btnConsultar.setEnabled(true);
        btnInserir.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);     
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão?") == 0){
            daoHospede.excluir(hospede); 
            
            txtCPF.setText("");
            txtNome.setText("");
            txtEndereco.setText("");
            txtTelefone.setText("");
            txtTaxaDesconto.setText("");
            txtCPF.setEnabled(true); 
            txtNome.setEnabled(false);
            txtEndereco.setEnabled(false);
            txtTelefone.setEnabled(false);
            txtTaxaDesconto.setEnabled(false);        
            txtCPF.requestFocus();
            
            btnConsultar.setEnabled(true);
            btnInserir.setEnabled(false);
            btnAlterar.setEnabled(false);
            btnExcluir.setEnabled(false);
        } 
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTaxaDesconto;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTaxaDesconto;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
    private DaoHospede daoHospede=null;
    private Hospede hospede=null;
    private Conexao conexao=null;
}

