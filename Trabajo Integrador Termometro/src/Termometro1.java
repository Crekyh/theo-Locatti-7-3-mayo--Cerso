/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author info5
 */
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Termometro1 extends javax.swing.JFrame {

    /**
     * Creates new form Termometro1
     */
    public Termometro1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        JOptionPane = new javax.swing.JPanel();
        optCelsius = new javax.swing.JRadioButton();
        optFa = new javax.swing.JRadioButton();
        optKelvin = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        cboMedida = new javax.swing.JComboBox<>();
        cmdConvertidor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtTemp = new javax.swing.JTextField();
        resultadopanel = new javax.swing.JPanel();
        lblResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(optCelsius);
        optCelsius.setText("Celsius");

        buttonGroup1.add(optFa);
        optFa.setText("Fahrenheit");

        buttonGroup1.add(optKelvin);
        optKelvin.setText("Kelvin");
        optKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optKelvinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JOptionPaneLayout = new javax.swing.GroupLayout(JOptionPane);
        JOptionPane.setLayout(JOptionPaneLayout);
        JOptionPaneLayout.setHorizontalGroup(
            JOptionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JOptionPaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(JOptionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optKelvin)
                    .addComponent(optFa)
                    .addComponent(optCelsius))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        JOptionPaneLayout.setVerticalGroup(
            JOptionPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JOptionPaneLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(optCelsius)
                .addGap(35, 35, 35)
                .addComponent(optFa)
                .addGap(38, 38, 38)
                .addComponent(optKelvin)
                .addGap(62, 62, 62))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboMedida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(cboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cboMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        cmdConvertidor.setText("Convertir");
        cmdConvertidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdConvertidorActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        txtTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTempActionPerformed(evt);
            }
        });
        txtTemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTempKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        resultadopanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout resultadopanelLayout = new javax.swing.GroupLayout(resultadopanel);
        resultadopanel.setLayout(resultadopanelLayout);
        resultadopanelLayout.setHorizontalGroup(
            resultadopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultadopanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultadopanelLayout.setVerticalGroup(
            resultadopanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, resultadopanelLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel2.setText("Temperatura en:");

        jLabel3.setText("De grado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(resultadopanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdConvertidor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(74, 74, 74)
                .addComponent(JOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultadopanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdConvertidor)
                        .addGap(12, 12, 12))
                    .addComponent(JOptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optKelvinActionPerformed

    private void cmdConvertidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdConvertidorActionPerformed
        String resultado = null;
        double temp = 0;
        Conversora convertir = new Conversora();
        if (txtTemp.getText().length() != 0) {
            temp = Double.parseDouble(txtTemp.getText());

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToKelvin(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToKelvin(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToKelvin(temp));
            }

        } else {
            System.out.println("Debes ingresar una temperatura");
        }
        lblResultado.setText(resultado);
    }//GEN-LAST:event_cmdConvertidorActionPerformed

    private void txtTempKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTempKeyPressed
        // TODO add your handling code here:

        String resultado = null;
        double temp = 0;
        Conversora convertir = new Conversora();
        if (txtTemp.getText().length() != 0) {
            temp = Double.parseDouble(txtTemp.getText());

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToKelvin(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToKelvin(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Fahrenheit")
                    && optFa.isSelected()) {
                resultado = String.valueOf(convertir.FahrenheitToFahrenheit(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Celsius")
                    && optCelsius.isSelected()) {
                resultado = String.valueOf(convertir.CelsiusToCelsius(temp));
            }

            if (cboMedida.getSelectedItem().toString().equals("Kelvin")
                    && optKelvin.isSelected()) {
                resultado = String.valueOf(convertir.KelvinToKelvin(temp));
            }

        } else {
            System.out.println("Debes ingresar una temperatura");
        }
        lblResultado.setText(resultado);

    }//GEN-LAST:event_txtTempKeyPressed

    private void txtTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTempActionPerformed

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
            java.util.logging.Logger.getLogger(Termometro1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Termometro1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Termometro1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Termometro1.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Termometro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JOptionPane;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboMedida;
    private javax.swing.JButton cmdConvertidor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JRadioButton optCelsius;
    private javax.swing.JRadioButton optFa;
    private javax.swing.JRadioButton optKelvin;
    private javax.swing.JPanel resultadopanel;
    private javax.swing.JTextField txtTemp;
    // End of variables declaration//GEN-END:variables
}