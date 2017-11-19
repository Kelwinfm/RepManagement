/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Contas;
import model.Permanente;
import model.Temporario;

/**
 *
 * @author kelwi
 */
public class Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public Relatorio() {
        initComponents();
        jtfMes.enableInputMethods(false);
    }
    public String quebraLinha = System.getProperty("line.separator");
    public ArrayList<Permanente> permanente = new ArrayList<>();
    public ArrayList<Temporario> temporario = new ArrayList<>();
    public ArrayList<Contas> contas = new ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbcEscolha = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTexto = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtfMes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jbcEscolha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Moradores Permanentes", "Moradores Temporarios", "Contas" }));
        jbcEscolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcEscolhaActionPerformed(evt);
            }
        });

        jtTexto.setColumns(20);
        jtTexto.setRows(5);
        jScrollPane1.setViewportView(jtTexto);

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Digite o mês");

        jtfMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbcEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtfMes, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jButton1)
                        .addGap(0, 305, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcEscolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcEscolhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcEscolhaActionPerformed
        // TODO add your handling code here:
        if (this.jbcEscolha.getSelectedItem().equals("Moradores Permanentes")) {
            jtfMes.enableInputMethods(false);
        }
        if (this.jbcEscolha.getSelectedItem().equals("Moradores Temporarios")) {
            jtfMes.enableInputMethods(false);
        }
        if (this.jbcEscolha.getSelectedItem().equals("Contas")) {
            jtfMes.enableInputMethods(true);
        }
    }//GEN-LAST:event_jbcEscolhaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String imprimir = "";
        int print = 0;

        if (this.jbcEscolha.getSelectedItem().equals("Moradores Permanentes")) {
                Permanente permanente = new Permanente();
                Permanente mostra = new Permanente();
                
                for (Permanente p : permanente.LoadAll()) {
                this.permanente.add(p);
                mostra = p;
                imprimir = (mostra.getNome() + "\t" + mostra.getContato() + "\t" + mostra.getCpf() + "\t\t" + mostra.getRg()+ "\t" + mostra.getSaldoDevedor() + "\t" + mostra.getValorFixo()+ "\t" + mostra.getDataEntrada() + quebraLinha + imprimir);
                
                 }
                print = 1;
        }
        if (this.jbcEscolha.getSelectedItem().equals("Moradores Temporarios")) {
            Temporario temporario = new Temporario();
            Temporario mostra = new Temporario();

            for (Temporario t : temporario.LoadAll()) {
                this.temporario.add(t);
                mostra = t;
                imprimir = (mostra.getNome() + "\t" + mostra.getContato() + "\t" + mostra.getCpf() + "\t\t" + mostra.getSaldoDevedor() + "\t" + mostra.getValorFixo() + quebraLinha + imprimir);
            }

            print = 2;
        }
        if (this.jbcEscolha.getSelectedItem().equals("Contas")) {

            Contas contas = new Contas();
            Contas mostra = new Contas();

            for (Contas c : contas.LoadAll()) {
                this.contas.add(c);
                mostra = c;
                if(jtfMes.getText().equalsIgnoreCase(mostra.getMes()) ){
                imprimir = (mostra.getTipo() + "\t" + mostra.getValor() + "\t" + mostra.getDataVenc()+ "\t\t" + mostra.isPago() + quebraLinha + imprimir);
                }
            }
            print = 3;

        }

        switch (print) {
            case 1:
            imprimir = ("Nome" + "\t" + "Contato" + "\t\t" + "CPF" + "\t\t" + "RG" + "\t" + "Saldo devedor" +"\t" + "Valor fixo" +"\t" + "Data de entrada" + quebraLinha + quebraLinha + imprimir);

            jtTexto.setText(imprimir);

            break;
            case 2:
            imprimir = ("Nome" + "\t" + "Contato" + "\t\t" + "CPF" + "\t\t" + "Saldo devedor" +"\t" + "Valor fixo" + quebraLinha + quebraLinha + imprimir);
            jtTexto.setText(imprimir);

            break;
            case 3:
            imprimir = ("Tipo" + "\t" + "Valor" + "\t" + "Data de vencimento" + "\t" + "Pago" + quebraLinha + quebraLinha + imprimir);

            jtTexto.setText(imprimir);
            break;

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtfMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfMesActionPerformed

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
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jbcEscolha;
    private javax.swing.JTextArea jtTexto;
    private javax.swing.JTextField jtfMes;
    // End of variables declaration//GEN-END:variables
}
