/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luizh
 */
public class Conta extends javax.swing.JFrame {
    double couvert = 0;
    double totalPagar = 0;
    String botaosim ; 
    double quantidadePessoas = 0;
    /**
     * Creates new form Conta
     */
    public Conta() {
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

        JPL_InformacaoConsumo = new javax.swing.JPanel();
        LBL_ConsumoTotal = new javax.swing.JLabel();
        jTXT_ConsumoTotal = new javax.swing.JTextField();
        LBL_CouvertPessoa = new javax.swing.JLabel();
        jTXT_CouvertPessoa = new javax.swing.JTextField();
        LBL_TaxaServico = new javax.swing.JLabel();
        LBL_numPessoas = new javax.swing.JLabel();
        RDBNT_Sim = new javax.swing.JRadioButton();
        RDBNT_Nao = new javax.swing.JRadioButton();
        jTXT_numPessoas = new javax.swing.JTextField();
        JPL_ValorPagar = new javax.swing.JPanel();
        LBL_CustoTotal = new javax.swing.JLabel();
        jTXT_CustoTotal = new javax.swing.JTextField();
        LBL_CustoPessoa = new javax.swing.JLabel();
        jTXT_CustoPessoa = new javax.swing.JTextField();
        BNT_Calcular = new javax.swing.JButton();
        BNT_Limpar = new javax.swing.JButton();
        BNT_Fechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPL_InformacaoConsumo.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações de Consumo"));

        LBL_ConsumoTotal.setText("Consumo Total (R$)");

        jTXT_ConsumoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXT_ConsumoTotalActionPerformed(evt);
            }
        });

        LBL_CouvertPessoa.setText("Couvert Por Pessoa (R$)");

        jTXT_CouvertPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXT_CouvertPessoaActionPerformed(evt);
            }
        });

        LBL_TaxaServico.setText("Possui Taxa De Serviço (10%)");

        LBL_numPessoas.setText("Dividir Em Quantas Pessoas");

        RDBNT_Sim.setText("Sim");
        RDBNT_Sim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBNT_SimActionPerformed(evt);
            }
        });

        RDBNT_Nao.setSelected(true);
        RDBNT_Nao.setText("Não");
        RDBNT_Nao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RDBNT_NaoActionPerformed(evt);
            }
        });

        jTXT_numPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXT_numPessoasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPL_InformacaoConsumoLayout = new javax.swing.GroupLayout(JPL_InformacaoConsumo);
        JPL_InformacaoConsumo.setLayout(JPL_InformacaoConsumoLayout);
        JPL_InformacaoConsumoLayout.setHorizontalGroup(
            JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_InformacaoConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPL_InformacaoConsumoLayout.createSequentialGroup()
                        .addComponent(LBL_TaxaServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RDBNT_Sim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RDBNT_Nao)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPL_InformacaoConsumoLayout.createSequentialGroup()
                        .addComponent(LBL_numPessoas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTXT_numPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(JPL_InformacaoConsumoLayout.createSequentialGroup()
                        .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBL_ConsumoTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTXT_ConsumoTotal))
                        .addGap(30, 30, 30)
                        .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTXT_CouvertPessoa)
                            .addComponent(LBL_CouvertPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(141, 141, 141))))
        );
        JPL_InformacaoConsumoLayout.setVerticalGroup(
            JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_InformacaoConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_ConsumoTotal)
                    .addComponent(LBL_CouvertPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTXT_ConsumoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTXT_CouvertPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_TaxaServico)
                    .addComponent(RDBNT_Sim)
                    .addComponent(RDBNT_Nao))
                .addGap(18, 18, 18)
                .addGroup(JPL_InformacaoConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_numPessoas)
                    .addComponent(jTXT_numPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPL_ValorPagar.setBorder(javax.swing.BorderFactory.createTitledBorder("Custo Total"));

        LBL_CustoTotal.setText("Custo Total (R$)");

        jTXT_CustoTotal.setEditable(false);
        jTXT_CustoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXT_CustoTotalActionPerformed(evt);
            }
        });

        LBL_CustoPessoa.setText("Custo Total Por Pessoa (R$)");

        jTXT_CustoPessoa.setEditable(false);
        jTXT_CustoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXT_CustoPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPL_ValorPagarLayout = new javax.swing.GroupLayout(JPL_ValorPagar);
        JPL_ValorPagar.setLayout(JPL_ValorPagarLayout);
        JPL_ValorPagarLayout.setHorizontalGroup(
            JPL_ValorPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_ValorPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_ValorPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPL_ValorPagarLayout.createSequentialGroup()
                        .addComponent(LBL_CustoTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTXT_CustoTotal))
                    .addGroup(JPL_ValorPagarLayout.createSequentialGroup()
                        .addComponent(LBL_CustoPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTXT_CustoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        JPL_ValorPagarLayout.setVerticalGroup(
            JPL_ValorPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPL_ValorPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPL_ValorPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_CustoTotal)
                    .addComponent(jTXT_CustoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPL_ValorPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBL_CustoPessoa)
                    .addComponent(jTXT_CustoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BNT_Calcular.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Calcular.setText("Calcular");
        BNT_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_CalcularActionPerformed(evt);
            }
        });

        BNT_Limpar.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Limpar.setText("Limpar");
        BNT_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_LimparActionPerformed(evt);
            }
        });

        BNT_Fechar.setBackground(new java.awt.Color(153, 153, 153));
        BNT_Fechar.setText("Fechar");
        BNT_Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNT_FecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JPL_ValorPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BNT_Calcular, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNT_Limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BNT_Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPL_InformacaoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPL_InformacaoConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPL_ValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BNT_Limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BNT_Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BNT_Fechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTXT_ConsumoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXT_ConsumoTotalActionPerformed

    }//GEN-LAST:event_jTXT_ConsumoTotalActionPerformed

    private void jTXT_CouvertPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXT_CouvertPessoaActionPerformed

    }//GEN-LAST:event_jTXT_CouvertPessoaActionPerformed

    private void RDBNT_SimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBNT_SimActionPerformed
        botaosim = "Sim";
    }//GEN-LAST:event_RDBNT_SimActionPerformed

    private void RDBNT_NaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RDBNT_NaoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_RDBNT_NaoActionPerformed

    private void jTXT_numPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXT_numPessoasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTXT_numPessoasActionPerformed

    private void jTXT_CustoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXT_CustoTotalActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTXT_CustoTotalActionPerformed

    private void jTXT_CustoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXT_CustoPessoaActionPerformed

    }//GEN-LAST:event_jTXT_CustoPessoaActionPerformed

    private void BNT_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_CalcularActionPerformed
        // TODO add your handling code here:
        if(botaosim == "Sim"){
            quantidadePessoas = Double.parseDouble(jTXT_numPessoas.getText());
            totalPagar = Double.parseDouble(jTXT_ConsumoTotal.getText());
            couvert = Double.parseDouble(jTXT_CouvertPessoa.getText());
            jTXT_CustoTotal.setText(String.valueOf(((quantidadePessoas * couvert) + totalPagar)*1.1));
            jTXT_CustoPessoa.setText(String.valueOf(((((quantidadePessoas * couvert) + totalPagar)*1.1)/quantidadePessoas)));
        }else{
            quantidadePessoas = Double.parseDouble(jTXT_numPessoas.getText());
            totalPagar = Double.parseDouble(jTXT_ConsumoTotal.getText());
            couvert = Double.parseDouble(jTXT_CouvertPessoa.getText());
            jTXT_CustoTotal.setText(String.valueOf((quantidadePessoas * couvert) + totalPagar));
            jTXT_CustoPessoa.setText(String.valueOf((((quantidadePessoas * couvert) + totalPagar)/quantidadePessoas)));
        }
    }//GEN-LAST:event_BNT_CalcularActionPerformed

    private void BNT_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_LimparActionPerformed
        // TODO add your handling code here:
        totalPagar = 0;
        couvert = 0;
        quantidadePessoas = 0;
        jTXT_ConsumoTotal.setText("");
        jTXT_CustoTotal.setText("");
        jTXT_CustoPessoa.setText("");
        jTXT_CouvertPessoa.setText("");
        jTXT_numPessoas.setText("");

    }//GEN-LAST:event_BNT_LimparActionPerformed

    private void BNT_FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNT_FecharActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_BNT_FecharActionPerformed

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
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BNT_Calcular;
    private javax.swing.JButton BNT_Fechar;
    private javax.swing.JButton BNT_Limpar;
    private javax.swing.JPanel JPL_InformacaoConsumo;
    private javax.swing.JPanel JPL_ValorPagar;
    private javax.swing.JLabel LBL_ConsumoTotal;
    private javax.swing.JLabel LBL_CouvertPessoa;
    private javax.swing.JLabel LBL_CustoPessoa;
    private javax.swing.JLabel LBL_CustoTotal;
    private javax.swing.JLabel LBL_TaxaServico;
    private javax.swing.JLabel LBL_numPessoas;
    private javax.swing.JRadioButton RDBNT_Nao;
    private javax.swing.JRadioButton RDBNT_Sim;
    private javax.swing.JTextField jTXT_ConsumoTotal;
    private javax.swing.JTextField jTXT_CouvertPessoa;
    private javax.swing.JTextField jTXT_CustoPessoa;
    private javax.swing.JTextField jTXT_CustoTotal;
    private javax.swing.JTextField jTXT_numPessoas;
    // End of variables declaration//GEN-END:variables
}
