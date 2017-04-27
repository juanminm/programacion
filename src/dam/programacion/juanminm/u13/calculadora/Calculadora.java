package dam.programacion.juanminm.u13.calculadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juam Miguel Navarro Martínez
 */
public class Calculadora extends javax.swing.JFrame {

    private float mem1;
    private char operatorSymbol;
    private boolean isStoredValue = false;
    private boolean isResultValue = false;

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        num1Key = new javax.swing.JButton();
        num2Key = new javax.swing.JButton();
        num3Key = new javax.swing.JButton();
        plusKey = new javax.swing.JButton();
        num4Key = new javax.swing.JButton();
        num5Key = new javax.swing.JButton();
        num6Key = new javax.swing.JButton();
        minusKey = new javax.swing.JButton();
        num7Key = new javax.swing.JButton();
        num8Key = new javax.swing.JButton();
        num9Key = new javax.swing.JButton();
        productKey = new javax.swing.JButton();
        num0Key = new javax.swing.JButton();
        clearKey = new javax.swing.JButton();
        decimaDotlKey = new javax.swing.JButton();
        divisionKey = new javax.swing.JButton();
        convertSignKey = new javax.swing.JButton();
        equalKey = new javax.swing.JButton();
        screenOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        num1Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num1Key.setText("1");
        num1Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1KeyActionPerformed(evt);
            }
        });

        num2Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num2Key.setText("2");
        num2Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2KeyActionPerformed(evt);
            }
        });

        num3Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num3Key.setText("3");
        num3Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3KeyActionPerformed(evt);
            }
        });

        plusKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        plusKey.setText("+");
        plusKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusKeyActionPerformed(evt);
            }
        });

        num4Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num4Key.setText("4");
        num4Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4KeyActionPerformed(evt);
            }
        });

        num5Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num5Key.setText("5");
        num5Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5KeyActionPerformed(evt);
            }
        });

        num6Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num6Key.setText("6");
        num6Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6KeyActionPerformed(evt);
            }
        });

        minusKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        minusKey.setText("-");
        minusKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusKeyActionPerformed(evt);
            }
        });

        num7Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num7Key.setText("7");
        num7Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7KeyActionPerformed(evt);
            }
        });

        num8Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num8Key.setText("8");
        num8Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8KeyActionPerformed(evt);
            }
        });

        num9Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num9Key.setText("9");
        num9Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9KeyActionPerformed(evt);
            }
        });

        productKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        productKey.setText("x");
        productKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productKeyActionPerformed(evt);
            }
        });

        num0Key.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        num0Key.setText("0");
        num0Key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0KeyActionPerformed(evt);
            }
        });

        clearKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        clearKey.setText("C");
        clearKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearKeyActionPerformed(evt);
            }
        });

        decimaDotlKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        decimaDotlKey.setText(".");
        decimaDotlKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimaDotlKeyActionPerformed(evt);
            }
        });

        divisionKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        divisionKey.setText("/");
        divisionKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionKeyActionPerformed(evt);
            }
        });

        convertSignKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        convertSignKey.setText("+/-");
        convertSignKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertSignKeyActionPerformed(evt);
            }
        });

        equalKey.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        equalKey.setText("=");
        equalKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalKeyActionPerformed(evt);
            }
        });

        screenOutput.setEditable(false);
        screenOutput.setBackground(new java.awt.Color(255, 255, 255));
        screenOutput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        screenOutput.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        screenOutput.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(screenOutput)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num1Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num2Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num3Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(plusKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num4Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num5Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num6Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minusKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(num7Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num8Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(num9Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(productKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(convertSignKey, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(num0Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(clearKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(decimaDotlKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(divisionKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(equalKey, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(screenOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num1Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num2Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num4Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num5Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num7Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num9Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num8Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num0Key, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimaDotlKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divisionKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(convertSignKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalKey, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1KeyActionPerformed
        appendToScreen("1");
    }//GEN-LAST:event_num1KeyActionPerformed

    private void num2KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2KeyActionPerformed
        appendToScreen("2");
    }//GEN-LAST:event_num2KeyActionPerformed

    private void num3KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3KeyActionPerformed
        appendToScreen("3");
    }//GEN-LAST:event_num3KeyActionPerformed

    private void num4KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4KeyActionPerformed
        appendToScreen("4");
    }//GEN-LAST:event_num4KeyActionPerformed

    private void num5KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5KeyActionPerformed
        appendToScreen("5");
    }//GEN-LAST:event_num5KeyActionPerformed

    private void num6KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6KeyActionPerformed
        appendToScreen("6");
    }//GEN-LAST:event_num6KeyActionPerformed

    private void num7KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7KeyActionPerformed
        appendToScreen("7");
    }//GEN-LAST:event_num7KeyActionPerformed

    private void num8KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8KeyActionPerformed
        appendToScreen("8");
    }//GEN-LAST:event_num8KeyActionPerformed

    private void num9KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9KeyActionPerformed
        appendToScreen("9");
    }//GEN-LAST:event_num9KeyActionPerformed

    private void num0KeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0KeyActionPerformed
        appendToScreen("0");
    }//GEN-LAST:event_num0KeyActionPerformed

    private void decimaDotlKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimaDotlKeyActionPerformed
        if (!screenOutput.getText().matches("\\d+\\.\\d+")) {
            appendToScreen(".");
        }
    }//GEN-LAST:event_decimaDotlKeyActionPerformed

    private void clearKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearKeyActionPerformed
        screenOutput.setText("0");
    }//GEN-LAST:event_clearKeyActionPerformed

    private void plusKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusKeyActionPerformed
        setOperatorSymbol('+');
    }//GEN-LAST:event_plusKeyActionPerformed

    private void minusKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusKeyActionPerformed
        setOperatorSymbol('-');
    }//GEN-LAST:event_minusKeyActionPerformed

    private void productKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productKeyActionPerformed
        setOperatorSymbol('x');
    }//GEN-LAST:event_productKeyActionPerformed

    private void divisionKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionKeyActionPerformed
        setOperatorSymbol('/');
    }//GEN-LAST:event_divisionKeyActionPerformed

    private void convertSignKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_convertSignKeyActionPerformed
        if (isStoredValue) {
            screenOutput.setText("-0");
            isStoredValue = false;
        } else {
            if (screenOutput.getText().matches("\\d+(?:\\.\\d*)?")) {
                screenOutput.setText("-" + screenOutput.getText());
            } else {
                screenOutput.setText(screenOutput.getText().substring(1));
            }
        }
    }//GEN-LAST:event_convertSignKeyActionPerformed

    private void equalKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalKeyActionPerformed
        if (isStoredValue) {
            screenOutput.setText(getResult(0));
        } else {
            screenOutput.setText(getResult(Float.parseFloat(
                    screenOutput.getText())));
        }
    }//GEN-LAST:event_equalKeyActionPerformed

    private void appendToScreen(String str) {
        String screenOut = screenOutput.getText();
        String result = "";

        if (screenOut.equals("ERR") || screenOut.equals("0")
                || screenOut.equals("-0") || isStoredValue || isResultValue) {
            if (screenOut.startsWith("-") && !isStoredValue) {
                result += "-";
            }

            if (str.equals(".")) {
                result += "0.";
            } else {
                result += str;
            }

        } else {
            result += screenOut + str;
        }

        screenOutput.setText(result);
        isResultValue = false;
        isStoredValue = false;
    }

    private void setOperatorSymbol(char c) {
        operatorSymbol = c;

        if (!isStoredValue) {
            mem1 = Float.parseFloat(screenOutput.getText());
            isStoredValue = true;
        }
    }

    private String getResult(float mem2) {
        try {
            float res = mem1;
            switch (operatorSymbol) {
                case '+':
                    res += mem2;
                    break;
                case '-':
                    res -= mem2;
                    break;
                case 'x':
                    res *= mem2;
                    break;
                case '/':
                    res /= mem2;
            }

            screenOutput.setText(Float.toString(res));
            isResultValue = true;

            return String.valueOf(res);
        } catch (ArithmeticException e) {
            return "ERR";
        }
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearKey;
    private javax.swing.JButton convertSignKey;
    private javax.swing.JButton decimaDotlKey;
    private javax.swing.JButton divisionKey;
    private javax.swing.JButton equalKey;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minusKey;
    private javax.swing.JButton num0Key;
    private javax.swing.JButton num1Key;
    private javax.swing.JButton num2Key;
    private javax.swing.JButton num3Key;
    private javax.swing.JButton num4Key;
    private javax.swing.JButton num5Key;
    private javax.swing.JButton num6Key;
    private javax.swing.JButton num7Key;
    private javax.swing.JButton num8Key;
    private javax.swing.JButton num9Key;
    private javax.swing.JButton plusKey;
    private javax.swing.JButton productKey;
    private javax.swing.JTextField screenOutput;
    // End of variables declaration//GEN-END:variables
}
