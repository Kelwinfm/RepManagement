/*
* Código de projeto de Programação Orientada a Objetos II
* Gerenciamento do financeiro de republicas
* FT-UNICAMP
*
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Caixinha;

public class AlterarCaixinha extends javax.swing.JFrame {

    /**
     * Creates new form AlterarCaixinha
     */
    public AlterarCaixinha() {
        initComponents();
    }
    public ArrayList<Caixinha> caixa = new ArrayList<>();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBInserir = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtValorInsert = new javax.swing.JFormattedTextField();
        jtValorRemove = new javax.swing.JFormattedTextField();
        jTTotal = new javax.swing.JFormattedTextField();
        jBRemover = new javax.swing.JButton();
        jLMontante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Valor para Inserção:");

        jLabel2.setText("Valor para Remoção:");

        jBInserir.setText("Inserir");
        jBInserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBInserirMouseClicked(evt);
            }
        });

        jBCancelar.setText("Cancelar");
        jBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Caixinha");

        try {
            jtValorInsert.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtValorInsert.setToolTipText("");

        try {
            jtValorRemove.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTTotal.setEditable(false);
        jTTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        jTTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTTotal.setText("0");
        jTTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        jBRemover.setText("Remover");
        jBRemover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBRemoverMouseClicked(evt);
            }
        });

        jLMontante.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLMontante.setText("Montante Atual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtValorInsert)
                        .addComponent(jtValorRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(jBInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBRemover))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelar)
                    .addComponent(jTTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLMontante)
                        .addGap(64, 64, 64))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jLMontante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jtValorInsert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInserir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtValorRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRemover)
                    .addComponent(jBCancelar))
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarActionPerformed
        AlterarCaixinha.this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jBCancelarActionPerformed

    private void jBInserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBInserirMouseClicked
        Caixinha caixa = new Caixinha();

        if ("   .  ".equals(jtValorInsert.getText())) {
            JOptionPane.showMessageDialog(null, "Insira um valor");
        } else {

            float valorInsert = Float.parseFloat(jtValorInsert.getText());
            caixa.setValor(Float.toString(valorInsert));
            float montante = Float.parseFloat(jTTotal.getText());

            montante += valorInsert;
            caixa.setMontante(Float.toString(montante));
            caixa.Save();

            for (Caixinha c : caixa.LoadAll()) {
                this.caixa.add(c);
                caixa = c;
            }

            jTTotal.setText(caixa.getMontante());
        }

        jtValorInsert.setText("");
    }//GEN-LAST:event_jBInserirMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Caixinha caixa = new Caixinha();
        for (Caixinha c : caixa.LoadAll()) {
            this.caixa.add(c);
            caixa = c;
        }
        jTTotal.setText(caixa.getMontante());

    }//GEN-LAST:event_formWindowOpened

    private void jBRemoverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBRemoverMouseClicked

        // TODO add your handling code here:
        Caixinha caixa = new Caixinha();

        if ("   .  ".equals(jtValorRemove.getText())) {
            JOptionPane.showMessageDialog(null, "Insira um valor");
        } else {

            float valorRemove = Float.parseFloat(jtValorRemove.getText());
            caixa.setValor(Float.toString(valorRemove));
            float montante = Float.parseFloat(jTTotal.getText());

            montante -= valorRemove;
            caixa.setMontante(Float.toString(montante));
            caixa.Save();

            for (Caixinha c : caixa.LoadAll()) {
                this.caixa.add(c);
                caixa = c;
            }

            jTTotal.setText(caixa.getMontante());
        }
        jtValorRemove.setText("");
    }//GEN-LAST:event_jBRemoverMouseClicked

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
            java.util.logging.Logger.getLogger(AlterarCaixinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarCaixinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarCaixinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarCaixinha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AlterarCaixinha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBRemover;
    private javax.swing.JLabel jLMontante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JFormattedTextField jTTotal;
    private javax.swing.JFormattedTextField jtValorInsert;
    private javax.swing.JFormattedTextField jtValorRemove;
    // End of variables declaration//GEN-END:variables
}
