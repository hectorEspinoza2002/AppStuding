/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.profesor.sesion;

import com.mycompany.login.Login;
import com.mycompany.login.clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class EditarNotaFinal extends javax.swing.JFrame {

    private Alumno editarNota;
    public EditarNotaFinal(int pos) {
        initComponents();
        
        editarNota = Login.alumnos.get(pos);
        idjLabel.setText(editarNota.carne);
        apellidojLabel.setText(editarNota.apellido);
        nombrejLabel.setText(editarNota.nombre);
        
        
        notaFjTextField.setText(editarNota.nota);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idjLabel = new javax.swing.JLabel();
        apellidojLabel = new javax.swing.JLabel();
        notaFjTextField = new javax.swing.JTextField();
        guardarjButton = new javax.swing.JButton();
        nombrejLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Id:");

        jLabel3.setText("Nota Final:");

        idjLabel.setText("jLabel4");

        apellidojLabel.setText("jLabel4");

        guardarjButton.setText("Guardar");
        guardarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarjButtonActionPerformed(evt);
            }
        });

        nombrejLabel.setText("jLabel4");

        regresarjMenu.setText("Regresar");
        regresarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(regresarjMenu);

        jMenu2.setText("Guardar");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarjButton)
                    .addComponent(notaFjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombrejLabel)
                        .addGap(18, 18, 18)
                        .addComponent(apellidojLabel))
                    .addComponent(idjLabel))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombrejLabel)
                    .addComponent(apellidojLabel))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idjLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(notaFjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(guardarjButton)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        PProfesor p = new PProfesor();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void guardarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarjButtonActionPerformed
        // TODO add your handling code here:
        
        editarNota.nota = notaFjTextField.getText();
        
        JOptionPane.showMessageDialog(this, "Nota Aguardada");
        
    }//GEN-LAST:event_guardarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidojLabel;
    private javax.swing.JButton guardarjButton;
    private javax.swing.JLabel idjLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel nombrejLabel;
    private javax.swing.JTextField notaFjTextField;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
