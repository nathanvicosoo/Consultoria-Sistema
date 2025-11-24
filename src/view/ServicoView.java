
package view;

import DAO.ServicoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Servico;

public class ServicoView extends javax.swing.JInternalFrame {
    Servico servico;
    ServicoDAO servicoDAO;
    
    public void ativaCampos(){
        txtCodigoServ.setEnabled(true);
        txtTipoServico.setEnabled(true);
        txtDescricao.setEnabled(true);
        txtValor.setEnabled(true);
        txtStatusServico.setEnabled(true);
    }

    
    public void desativaCampos(){
        txtCodigoServ.setEnabled(false);
        txtTipoServico.setEnabled(false);
        txtDescricao.setEnabled(false);
        txtValor.setEnabled(false);
        txtStatusServico.setEnabled(false);
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
    
    public ServicoView() {
        servicoDAO = new ServicoDAO();
        initComponents();
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCodigoServ = new javax.swing.JTextField();
        txtTipoServico = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtStatusServico = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        btnGravar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);

        jLabel1.setText("Código:");

        jLabel2.setText(" Serviço:");

        jLabel3.setText("Valor:");

        jLabel4.setText("Descrição:");

        jLabel5.setText("Status:");

        txtCodigoServ.setEnabled(false);
        txtCodigoServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoServActionPerformed(evt);
            }
        });

        txtTipoServico.setEnabled(false);

        txtValor.setEnabled(false);

        txtStatusServico.setEnabled(false);

        txtDescricao.setEnabled(false);
        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        btnGravar.setText("Gravar");
        btnGravar.setEnabled(false);
        btnGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGravarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodigoServ, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGravar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValor)
                            .addComponent(txtStatusServico)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStatusServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnGravar)
                    .addComponent(btnConsultar)
                    .addComponent(btnCancelar)
                    .addComponent(btnNovo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoServActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoServActionPerformed

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescricaoActionPerformed

    private void btnGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGravarActionPerformed
     if (txtTipoServico.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios!");
            txtDescricao.requestFocusInWindow();
            return;
        }

        servico = new Servico();

        servico.setTipoServico(txtTipoServico.getText());
        servico.setDescricaoServico(txtDescricao.getText());
        servico.setValorServico(txtValor.getText());
        servico.setStatusServico(txtStatusServico.getText());

        // SALVAR NOVO
        if (txtCodigoServ.getText().isEmpty()) {
            try {
                servicoDAO.salvar(servico);
            } catch (SQLException ex) {
                Logger.getLogger(ServicoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
        } 
        // ALTERAR EXISTENTE
        else {
            servico.setCodigoServico(Integer.parseInt(txtCodigoServ.getText()));

            try {
                servicoDAO.alterar(servico);
            } catch (SQLException ex) {
                Logger.getLogger(ServicoView.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        }

        limpaCamposServico();
        preparaSalvareCancelar();
        desativaCampos();
    }//GEN-LAST:event_btnGravarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(txtCodigoServ.getText().isEmpty()){
        JOptionPane.showMessageDialog(null, "Selecione um Serviço!");
        }else{
        servico = new Servico();
        servico.setCodigoServico(Integer.parseInt(txtCodigoServ.getText()));
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja Excluir:" + txtTipoServico.getText());
        if (confirma == 0) {
        try{
        servicoDAO.excluir(servico);
        }catch (SQLException ex) {
        Logger.getLogger(ClienteView.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpaCamposServico();
        //preparaExcluir();
        }
       }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ativaCampos();
        preparaAlterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        String cod = JOptionPane.showInputDialog("Digite o código do Serviço:");

        if (cod == null || cod.trim().equals("")) return;

        try {
            servico = servicoDAO.Consultar(cod);
        } catch (SQLException ex) {
            Logger.getLogger(ServicoView.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (servico == null) {
            JOptionPane.showMessageDialog(null, "Serviço não encontrado!");
            return;
        }

        txtCodigoServ.setText(String.valueOf(servico.getCodigoServico()));
        txtTipoServico.setText(servico.getTipoServico());
        txtDescricao.setText(servico.getDescricaoServico());
        txtValor.setText(String.valueOf(servico.getValorServico()));
        txtStatusServico.setText(String.valueOf(servico.getStatusServico()));

        preparaBusca();
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCamposServico();
        desativaCampos();
        preparaSalvareCancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        limpaCamposServico();
        ativaCampos();
        preparaNovo();
    }//GEN-LAST:event_btnNovoActionPerformed


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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCodigoServ;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtStatusServico;
    private javax.swing.JTextField txtTipoServico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
    
    private void limpaCamposServico() {
        txtCodigoServ.setText("");
        txtTipoServico.setText("");
        txtDescricao.setText("");
        txtValor.setText("");
        txtStatusServico.setText("");
    }
   
}
