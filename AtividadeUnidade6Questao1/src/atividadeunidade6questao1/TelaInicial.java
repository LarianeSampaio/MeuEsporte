/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeunidade6questao1;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
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

        jLabel1 = new javax.swing.JLabel();
        jrOpcao1 = new javax.swing.JRadioButton();
        jrOpcao2 = new javax.swing.JRadioButton();
        jbClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RadioButtons");

        jLabel1.setText("Você está na aula de programação:");

        jrOpcao1.setText("Java Swing");
        jrOpcao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOpcao1ActionPerformed(evt);
            }
        });

        jrOpcao2.setText("Outra linguagem");

        jbClick.setText("Click");
        jbClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jrOpcao1)
                        .addGap(104, 104, 104)
                        .addComponent(jrOpcao2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jbClick, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOpcao1)
                    .addComponent(jrOpcao2))
                .addGap(18, 18, 18)
                .addComponent(jbClick)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrOpcao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOpcao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrOpcao1ActionPerformed

    private void jbClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClickActionPerformed
         if ( jrOpcao1.isSelected() )
        {
            JOptionPane.showMessageDialog(null,"Java Swing");
            jrOpcao1.setSelected( false );

        }
       
            else if( jrOpcao2.isSelected())
            {

                JOptionPane.showMessageDialog(null,"Outra linguagem...Tem certeza?");
                jrOpcao2.setSelected( false );
            }
        
        else 
            JOptionPane.showMessageDialog(null,"Você não selecionou nada");
    }//GEN-LAST:event_jbClickActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        AplicaNimbusLookAndFeel.pegaNimbus();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbClick;
    private javax.swing.JRadioButton jrOpcao1;
    private javax.swing.JRadioButton jrOpcao2;
    // End of variables declaration//GEN-END:variables
}
