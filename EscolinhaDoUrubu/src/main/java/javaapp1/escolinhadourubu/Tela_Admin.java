/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapp1.escolinhadourubu;
import javaapp1.domain.Cliente;
import javaapp1.dao.IAdminDAO;
import javaapp1.dao.AdminListDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javaapp1.escolinhadourubu.EscolinhaDoUrubu;
import javaapp1.escolinhadourubu.TelaPrincipal;

/**
 *
 * @author tarci
 */
public class Tela_Admin extends javax.swing.JFrame {
    public DefaultTableModel modelo= new DefaultTableModel();
    public IAdminDAO adminDAO= new AdminListDAO();
    
    /**
     * Creates new form NewJFrame
     */
    public Tela_Admin() {
        initComponents();
        initComponents2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtQuadra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHorarios = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        botaoAplicar = new javax.swing.JButton();
        botaoLucro = new javax.swing.JButton();
        labelPreco = new javax.swing.JLabel();
        tFieldPreco = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Nome da quadra:");

        txtQuadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuadraActionPerformed(evt);
            }
        });

        jLabel2.setText("Horários:");

        txtHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorariosActionPerformed(evt);
            }
        });

        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        botaoAplicar.setText("Aplicar");
        botaoAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAplicarActionPerformed(evt);
            }
        });

        botaoLucro.setText("Lucro");
        botaoLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLucroActionPerformed(evt);
            }
        });

        labelPreco.setText("Preço: ");

        tFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFieldPrecoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botaoLimpar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoAtualizar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoRemover)
                                .addGap(18, 18, 18)
                                .addComponent(botaoSalvar)
                                .addGap(18, 18, 18)
                                .addComponent(botaoAplicar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(109, 109, 109)
                                        .addComponent(botaoLucro)))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(botaoLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuadra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHorarios))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPreco)
                    .addComponent(tFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoSalvar)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoRemover)
                    .addComponent(botaoAtualizar)
                    .addComponent(botaoAplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jMenu1.setText("Opções");

        jMenuItem1.setText("Buscar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void limparCampos(){
       txtQuadra.setText("");
       txtHorarios.setText("");

    }
   
        private Boolean isCamposValidos(String... campos) {
        for (String campo : campos) {
            if (campo == null || campo.isEmpty()) {
                return false;
            }
        }
        return true;
    }
        
    private void txtQuadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuadraActionPerformed
        //TODO add your handling code here:
    }//GEN-LAST:event_txtQuadraActionPerformed

    private void txtHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorariosActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
       limparCampos();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        String quadra = txtQuadra.getText();
        String horario = txtHorarios.getText();
        Double preco= Double.valueOf(tFieldPreco.getText());
        
        if(!isCamposValidos(quadra, horario, preco.toString())){
            JOptionPane.showMessageDialog(this, "Existem campos não preenchidos!");
            return;
        }
        
        Cliente clienteNew = new Cliente(quadra, horario, preco);
        this.adminDAO.salvar(clienteNew);
        modelo.addRow(new Object []{clienteNew.getQuadra(), clienteNew.getHorario(), clienteNew.getPreco()});
        modelo.fireTableDataChanged();
        
        JOptionPane.showMessageDialog(null, "Valores salvos com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
        limparCampos();
          
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed
        int linha= jTable1.getSelectedRow();
        
        if(linha>=0){
            int result = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir estes valores?", "CUIDADO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
            if(result== JOptionPane.YES_OPTION){
                Cliente valores= new Cliente(jTable1.getValueAt(linha, 0).toString(), jTable1.getValueAt(linha, 1).toString(), Double.valueOf(jTable1.getValueAt(linha, 2).toString()));
                this.adminDAO.excluir(valores);
                modelo.removeRow(linha);
                
                JOptionPane.showMessageDialog(null, "Valores excluídos com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
            }else{
                JOptionPane.showMessageDialog(null, "Nenhum valor selecionado.", "ERRO",JOptionPane.INFORMATION_MESSAGE);                
            }
        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        int linha= jTable1.getSelectedRow();
        
        if(linha>=0){
            String quadra= txtQuadra.getText();
            String horarios= txtHorarios.getText();
            Double preco= Double.valueOf(tFieldPreco.getText());
            
            if(!isCamposValidos(quadra, horarios, preco.toString())){
                JOptionPane.showMessageDialog(this, "Faltam preencher campos obrigatórios");
                return;
            }
            
            Cliente clienteNew= new Cliente(quadra, horarios, preco);
            this.adminDAO.atualizar(jTable1.getValueAt(linha, 0).toString(), jTable1.getValueAt(linha, 1).toString(),Double.valueOf(jTable1.getValueAt(linha, 2).toString()), clienteNew);
            
            modelo.removeRow(linha);
            modelo.addRow(new Object[]{clienteNew.getQuadra(), clienteNew.getHorario()});
            modelo.fireTableDataChanged();
            
            JOptionPane.showMessageDialog(null, "Valores atualizados com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            limparCampos();
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum valor selecionado.", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_botaoAtualizarActionPerformed

    private void botaoAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAplicarActionPerformed
        TelaPrincipal mainWindow= new TelaPrincipal();
        
        int result = JOptionPane.showConfirmDialog(this,"Deseja realmente aplicar as alterações? Depois de aplicadas essa janela fechará!", "CUIDADO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            if(this.modelo.getValueAt(0, 0).toString() == null){
                JOptionPane.showMessageDialog(this, "Nada para adicionar!");
                return;
            }
            
            JOptionPane.showMessageDialog(null, "Itens adicionados com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
            for(int i=0; i<this.adminDAO.size(); i++){
                mainWindow.comboBoxQuadra.addItem(this.modelo.getValueAt(i, 0).toString());
                mainWindow.comboBoxHorario.addItem(this.modelo.getValueAt(i, 1).toString());
                TelaPrincipal.preços.put(this.modelo.getValueAt(i,0).toString(), Double.valueOf(this.modelo.getValueAt(i, 2).toString()));
                this.dispose();
                mainWindow.setVisible(true);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Voltando a janela do admin...", "Negado",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_botaoAplicarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tela_Busca window= new Tela_Busca();
        window.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void botaoLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLucroActionPerformed
        TelaPrincipal teste= new TelaPrincipal();
        Double lucro= teste.lucroTotal();
        
        JOptionPane.showMessageDialog(this, "O lucro total foi de: R$"+lucro);
    }//GEN-LAST:event_botaoLucroActionPerformed

    private void tFieldPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFieldPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFieldPrecoActionPerformed

    
    private void initComponents2(){
           modelo.addColumn("Quadra");
           modelo.addColumn("Horários");
           modelo.addColumn("Preço");
           
           jTable1.setModel(modelo);
    }

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
            java.util.logging.Logger.getLogger(Tela_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAplicar;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoLucro;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelPreco;
    private javax.swing.JTextField tFieldPreco;
    private javax.swing.JTextField txtHorarios;
    private javax.swing.JTextField txtQuadra;
    // End of variables declaration//GEN-END:variables
}
