/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package janela;

public class Cadastrar extends javax.swing.JFrame {

    public Cadastrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        btncancelar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtsobrenome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnsalvar.setText("Salvar");

        jLabel3.setText("Telefone");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel4.setText("E-mail");

        jLabel5.setText("CPF");

        jLabel6.setText("Nome Completo");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario.png"))); // NOI18N
        jLabel7.setText("Registre-se");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncancelar)
                        .addGap(145, 145, 145)
                        .addComponent(btnsalvar))))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(6, 6, 6)
                .addComponent(txtsobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addGap(6, 6, 6)
                .addComponent(txtcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancelar)
                    .addComponent(btnsalvar))
                .addGap(33, 33, 33))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcpf;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtsobrenome;
    private javax.swing.JTextField txttelefone;
    // End of variables declaration//GEN-END:variables

    private static class Salvar {

        public Salvar() {
        }
    }
}
