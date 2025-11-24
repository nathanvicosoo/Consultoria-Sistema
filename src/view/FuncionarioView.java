package view;

import DAO.FuncionarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;

public class FuncionarioView extends javax.swing.JInternalFrame {
    Funcionario funcionario;
    FuncionarioDAO funcionarioDAO;
    
    public void ativaCampos(){
        txtNomeFunc.setEnabled(true);
        txtEnderecoFunc.setEnabled(true);
        txtEmailFunc.setEnabled(true);
        txtCodigoFunc.setEnabled(true);
        txtCpfFunc.setEnabled(true);
        txtCargoFunc.setEnabled(true);
        txtStatusFunc.setEnabled(true);
        txtTelefoneFunc.setEnabled(true);
    }

    
    public void desativaCampos(){
        txtNomeFunc.setEnabled(false);
        txtEnderecoFunc.setEnabled(false);
        txtEmailFunc.setEnabled(false);
        txtCodigoFunc.setEnabled(false);
        txtCpfFunc.setEnabled(false);
        txtCargoFunc.setEnabled(false);
        txtStatusFunc.setEnabled(false);
        txtTelefoneFunc.setEnabled(false);
    }

    
    public void preparaNovo(){
       btnNovo.setEnabled(false);
       btnGravar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnAlterar.setEnabled(false);
       btnConsultar.setEnabled(false);
    }
    
    public void preparaSalvareCancelar(){
       btnNovo.setEnabled(true);
       btnGravar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnConsultar.setEnabled(true);
       btnAlterar.setEnabled(false);
       btnCancelar.setEnabled(false);
    }
    
    
    public void preparaBusca(){
       btnNovo.setEnabled(true);
       btnCancelar.setEnabled(true); //Excluir
       btnAlterar.setEnabled(true);
       btnGravar.setEnabled(false);
       btnCancelar.setEnabled(false);
       btnConsultar.setEnabled(true);
    }
    
    public void preparaAlterar(){
       btnNovo.setEnabled(false);
       btnCancelar.setEnabled(false); //Excluir
       btnAlterar.setEnabled(false);
       btnGravar.setEnabled(true);
       btnCancelar.setEnabled(true);
       btnConsultar.setEnabled(false);
    }
    
    public void preparaExcluir(){
        btnCancelar.setEnabled(false);
        btnAlterar.setEnabled(false);
        btnNovo.setEnabled(true);
        btnGravar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnConsultar.setEnabled(true);
        
    }
    
    public FuncionarioView() {
        funcionarioDAO = new FuncionarioDAO();
        initComponents();
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnGravar = new javax.swing.JButton();
        txtCodigoFunc = new javax.swing.JTextField();
        txtNomeFunc = new javax.swing.JTextField();
        txtCpfFunc = new javax.swing.JTextField();
        txtCargoFunc = new javax.swing.JTextField();
        txtTelefoneFunc = new javax.swing.JTextField();
        txtEmailFunc = new javax.swing.JTextField();
        txtEnderecoFunc = new javax.swing.JTextField();
        txtStatusFunc = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Cpf:");

        jLabel4.setText("Cargo:");

        jLabel5.setText("Telefone:");

        jLabel6.setText("Email:");

        jLabel7.setText("Endereço:");

        jLabel8.setText("Status:");

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        txtCodigoFunc.setEnabled(false);

        txtNomeFunc.setEnabled(false);

        txtCpfFunc.setEnabled(false);

        txtCargoFunc.setEnabled(false);

        txtTelefoneFunc.setEnabled(false);

        txtEmailFunc.setEnabled(false);

        txtEnderecoFunc.setEnabled(false);

        txtStatusFunc.setEnabled(false);

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGravar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(22, 22, 22)
                            .addComponent(txtCodigoFunc))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNomeFunc)
                                .addComponent(txtCpfFunc)
                                .addComponent(txtCargoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnderecoFunc)
                            .addComponent(txtStatusFunc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailFunc)
                            .addComponent(txtTelefoneFunc))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCpfFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCargoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTelefoneFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEmailFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEnderecoFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtStatusFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnConsultar)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if (txtNomeFunc.getText().isEmpty() || txtEnderecoFunc.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            txtNomeFunc.requestFocusInWindow();
            return;
        } else  {
            funcionario = new Funcionario();
            funcionario.setNomeFuncionario(txtNomeFunc.getText());
            funcionario.setCpfFuncionario(txtCpfFunc.getText());
            funcionario.setCargoFuncionario(txtCargoFunc.getText());
            funcionario.setTelefoneFuncionario(txtTelefoneFunc.getText());
            funcionario.setEmailFuncionario(txtEmailFunc.getText());
            funcionario.setEnderecoFuncionario(txtEnderecoFunc.getText());
            funcionario.setStatusFuncionario(txtStatusFunc.getText());
        
        if (txtCodigoFunc.getText().isEmpty()) {
            try {
                funcionarioDAO.salvar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");

        } else { 
            funcionario.setCodigoFuncionario(Integer.parseInt(txtCodigoFunc.getText()));

            try {
                funcionarioDAO.alterar(funcionario);
            } catch (SQLException ex) {
                Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso!");
        }

        limpaCamposFuncionario();
        preparaSalvareCancelar();
        desativaCampos();
        }
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
       if(txtCodigoFunc.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Selecione um Funcionario!");
        }else{
        funcionario = new Funcionario();
        funcionario.setCodigoFuncionario(Integer.parseInt(txtCodigoFunc.getText()));
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir:" + txtNomeFunc.getText());
        if (confirma == 0) {
        try{
        funcionarioDAO.excluir(funcionario);
        }catch (SQLException ex) {
        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaCamposFuncionario();
        preparaExcluir();
        }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ativaCampos();
        preparaAlterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposFuncionario();
        ativaCampos();
        preparaNovo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCamposFuncionario();
        desativaCampos();
        preparaSalvareCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cod = JOptionPane.showInputDialog("Digite o Código do Funcionário:");

        try {
            funcionario = funcionarioDAO.consultar(cod);
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (funcionario == null) {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado!");
            return;
        }

        txtCodigoFunc.setText(String.valueOf(funcionario.getCodigoFuncionario()));
        txtNomeFunc.setText(funcionario.getNomeFuncionario());
        txtCpfFunc.setText(funcionario.getCpfFuncionario());
        txtEnderecoFunc.setText(funcionario.getEnderecoFuncionario());
        txtEmailFunc.setText(funcionario.getEmailFuncionario());
        txtCargoFunc.setText(funcionario.getCargoFuncionario());
        txtTelefoneFunc.setText(funcionario.getTelefoneFuncionario());
        txtStatusFunc.setText(funcionario.getStatusFuncionario());

        preparaBusca();
    }//GEN-LAST:event_btnConsultarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnGravar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCargoFunc;
    private javax.swing.JTextField txtCodigoFunc;
    private javax.swing.JTextField txtCpfFunc;
    private javax.swing.JTextField txtEmailFunc;
    private javax.swing.JTextField txtEnderecoFunc;
    private javax.swing.JTextField txtNomeFunc;
    private javax.swing.JTextField txtStatusFunc;
    private javax.swing.JTextField txtTelefoneFunc;
    // End of variables declaration//GEN-END:variables

    private void limpaCamposFuncionario() {
        txtCodigoFunc.setText("");
        txtNomeFunc.setText("");
        txtCpfFunc.setText("");
        txtTelefoneFunc.setText("");
        txtEmailFunc.setText("");
        txtEnderecoFunc.setText("");
        txtCargoFunc.setText("");
        txtStatusFunc.setText("");
    }
    
}

