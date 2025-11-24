package view;

import DAO.ClienteDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;



public class ClienteView extends javax.swing.JInternalFrame {
    Cliente cliente;
    ClienteDAO clienteDAO;
    
    public void ativaCampos(){
        txtNome.setEnabled(true);
        txtEndereco.setEnabled(true);
        txtEmail.setEnabled(true);
        txtCodigo.setEnabled(true);
        txtCpf.setEnabled(true);
        txtCidade.setEnabled(true);
        txtTelefone.setEnabled(true);
        txtEstado.setEnabled(true);
    }

    
    public void desativaCampos(){
        txtNome.setEnabled(false);
        txtEndereco.setEnabled(false);
        txtEmail.setEnabled(false);
        txtCodigo.setEnabled(false);
        txtCpf.setEnabled(false);
        txtEstado.setEnabled(false);
        txtTelefone.setEnabled(false);
        txtCidade.setEnabled(false);
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
    
    
    public ClienteView() {
        clienteDAO = new ClienteDAO();
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
        txtCodigo = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel3.setText("Telefone:");

        jLabel4.setText("Cpf:");

        jLabel5.setText("Email:");

        jLabel6.setText("Endereço:");

        jLabel7.setText("Cidade:");

        jLabel8.setText("Estado:");

        txtCodigo.setEnabled(false);

        txtNome.setEnabled(false);

        txtCpf.setEnabled(false);

        txtTelefone.setEnabled(false);

        txtEmail.setEnabled(false);

        txtEndereco.setEnabled(false);

        txtCidade.setEnabled(false);

        txtEstado.setEnabled(false);

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGravar)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEndereco)
                                .addComponent(txtCidade)
                                .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                            .addComponent(txtTelefone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo)
                            .addComponent(txtEstado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtCpf))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGravar)
                    .addComponent(btnAlterar)
                    .addComponent(btnConsultar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
        if(txtNome.getText().isEmpty() || txtEndereco.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            txtNome.requestFocusInWindow();
        } else if (txtCodigo.getText().isEmpty()) {
            cliente = new Cliente();
            cliente.setNomeCliente(txtNome.getText());
            cliente.setEnderecoCliente(txtEndereco.getText());
            cliente.setEmailCliente(txtEmail.getText());
            cliente.setCpfCliente(txtCpf.getText());
            cliente.setCidadeCliente(txtCidade.getText());
            cliente.setTelefoneCliente(txtTelefone.getText());
            cliente.setEstadoCliente(txtEstado.getText());
            try {
                clienteDAO.salvar(cliente);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Gravado com Sucesso");
            preparaBusca();
            preparaSalvareCancelar();
            desativaCampos();
            limpaCamposCliente();
        }else{
            cliente = new Cliente();
            cliente.setNomeCliente(txtNome.getText());
            cliente.setEnderecoCliente(txtEndereco.getText());
            cliente.setEmailCliente(txtEmail.getText());
            cliente.setCpfCliente(txtCpf.getText());
            cliente.setCidadeCliente(txtCidade.getText());
            cliente.setTelefoneCliente(txtTelefone.getText());
            cliente.setEstadoCliente(txtEstado.getText());
            
            cliente.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));

            try {
                clienteDAO.alterar(cliente);
            } catch (SQLException ex) {
                Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
            }
             preparaSalvareCancelar();
             desativaCampos();
             limpaCamposCliente();
        }
    }//GEN-LAST:event_btnGravarActionPerformed
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cod = JOptionPane.showInputDialog("Digite o Código do Cliente");
        //clienteModel = new ClienteModel();
        try {
            cliente = clienteDAO.consultar(cod);
        } catch (SQLException ex) {
            Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtCodigo.setText(String.valueOf(cliente.getCodigoCliente()));
        txtNome.setText(cliente.getNomeCliente());
        txtCpf.setText(cliente.getCpfCliente());
        txtEndereco.setText(cliente.getEnderecoCliente());
        txtEmail.setText(cliente.getEmailCliente());
        txtEstado.setText(cliente.getEstadoCliente());
        txtTelefone.setText(cliente.getTelefoneCliente());
        txtCidade.setText(cliente.getCidadeCliente());
        preparaBusca();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtCodigo.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Selecione um cliente!");
        }else{
        cliente = new Cliente();
        cliente.setCodigoCliente(Integer.parseInt(txtCodigo.getText()));
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir:" + txtNome.getText());
        if (confirma == 0) {
        try{
        clienteDAO.excluir(cliente);
        }catch (SQLException ex) {
        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaCamposCliente();
        }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
       preparaAlterar();
       ativaCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposCliente();
        preparaNovo();
        ativaCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCamposCliente();
        preparaSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed


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
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    public void limpaCamposCliente() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtCpf.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        txtCidade.setText("");
        txtEstado.setText("");
    }
}
