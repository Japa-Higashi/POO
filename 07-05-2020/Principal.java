
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    String operação;
    double num1;
    double num2;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnSoma = new javax.swing.JButton();
        btnSubtração = new javax.swing.JButton();
        btnMultiplicação = new javax.swing.JButton();
        btnDivisão = new javax.swing.JButton();
        btnResultado = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btnNum7 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnCancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");

        lblTitulo.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        lblTitulo.setText("Calculadora");

        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });

        btnSubtração.setText("-");
        btnSubtração.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtraçãoActionPerformed(evt);
            }
        });

        btnMultiplicação.setText("*");
        btnMultiplicação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicaçãoActionPerformed(evt);
            }
        });

        btnDivisão.setText("/");
        btnDivisão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisãoActionPerformed(evt);
            }
        });

        btnResultado.setText("=");
        btnResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadoActionPerformed(evt);
            }
        });

        btnNum7.setText("7");
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum9.setText("9");
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum8.setText("8");
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum4.setText("4");
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setText("5");
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setText("6");
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum2.setText("2");
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum1.setText("1");
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum0.setText("0");
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnNum3.setText("3");
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnCancela.setText("C");
        btnCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnNum0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNum1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnCancela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDivisão, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMultiplicação, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSoma, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                                    .addComponent(btnSubtração, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisão, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicação, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubtração, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        
        num1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        operação = "soma";
        
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnSubtraçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtraçãoActionPerformed
        
        
        num1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        operação = "subtração";
        
    }//GEN-LAST:event_btnSubtraçãoActionPerformed

    private void btnMultiplicaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicaçãoActionPerformed
        
        num1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        operação = "multiplicação";
        
    }//GEN-LAST:event_btnMultiplicaçãoActionPerformed

    private void btnDivisãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisãoActionPerformed
        
        num1 = Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        operação = "divisão";
        
    }//GEN-LAST:event_btnDivisãoActionPerformed

    private void btnResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadoActionPerformed
        
        num2 = Double.parseDouble(txtResultado.getText());
        if(operação == "soma"){
        txtResultado.setText(String.valueOf(num1 + num2));
    }else{
            if(operação == "subtração"){
                txtResultado.setText(String.valueOf(num1 - num2));
            }else{
                if(operação == "multiplicação"){
                    txtResultado.setText(String.valueOf(num1 * num2));
                }else{
                    if(operação == "divisão"){
                        if(num1 == 0 || num2 == 0){
                            txtResultado.setText("Erro!");
                        }else{
                            txtResultado.setText(String.valueOf(num1 / num2));
                        }
                        
                    }
                }
            }
        }
        
    }//GEN-LAST:event_btnResultadoActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"7");
        
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"9");
        
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"8");
        
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"4");
        
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"5");
        
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"6");
        
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"2");
        
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"1");
       
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        
        txtResultado.setText(txtResultado.getText()+"0");
        
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        // TODO add your handling code here:
        txtResultado.setText(txtResultado.getText()+"3");
        
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelaActionPerformed
        // TODO add your handling code here:
        txtResultado.setText("");
    }//GEN-LAST:event_btnCancelaActionPerformed

   
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancela;
    private javax.swing.JButton btnDivisão;
    private javax.swing.JButton btnMultiplicação;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnResultado;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtração;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
