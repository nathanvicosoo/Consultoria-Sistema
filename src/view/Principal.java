package view;

import javax.swing.JFrame;
import model.Usuario;


public class Principal extends javax.swing.JFrame {

    
    public Principal(Usuario usuario) {
        initComponents();
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        if (usuario.getTipo().equals("cliente")){
        mniCliente.setVisible(false);
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mniCliente = new javax.swing.JMenuItem();
        mniFuncionario = new javax.swing.JMenuItem();
        mniServico = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenu();
        mniSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArquivo.setText("Arquivo");

        mniCliente.setText("Cliente");
        mniCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClienteActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniCliente);

        mniFuncionario.setText("Funcionário");
        mniFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFuncionarioActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniFuncionario);

        mniServico.setText("Serviços");
        mniServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniServicoActionPerformed(evt);
            }
        });
        mnuArquivo.add(mniServico);

        jMenuBar1.add(mnuArquivo);

        mnuSair.setText("Sair");

        mniSair.setText("Sair");
        mniSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSairActionPerformed(evt);
            }
        });
        mnuSair.add(mniSair);

        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFuncionarioActionPerformed
        FuncionarioView funcionario = new FuncionarioView();
        pnl_principal.removeAll();
        pnl_principal.add(funcionario);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mniFuncionarioActionPerformed

    private void mniClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClienteActionPerformed
        ClienteView cliente = new ClienteView();
        pnl_principal.removeAll();
        pnl_principal.add(cliente);
        pnl_principal.updateUI();
    }//GEN-LAST:event_mniClienteActionPerformed

    private void mniSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_mniSairActionPerformed

    private void mniServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniServicoActionPerformed
       ServicoView servico = new ServicoView();
       pnl_principal.removeAll();
       pnl_principal.add(servico);
       pnl_principal.updateUI();
    }//GEN-LAST:event_mniServicoActionPerformed

    
     //* @param args the command line arg
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniCliente;
    private javax.swing.JMenuItem mniFuncionario;
    private javax.swing.JMenuItem mniSair;
    private javax.swing.JMenuItem mniServico;
    private javax.swing.JMenu mnuArquivo;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JPanel pnl_principal;
    // End of variables declaration//GEN-END:variables
}
