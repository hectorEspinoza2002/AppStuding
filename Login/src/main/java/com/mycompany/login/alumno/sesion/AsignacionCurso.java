/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.alumno.sesion;

import com.mycompany.login.Login;
import com.mycompany.login.clases.*;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class AsignacionCurso extends javax.swing.JFrame {

    /**
     * Creates new form AsignacionCurso
     */
    public AsignacionCurso() {
        initComponents();
        nombrejLabel.setText("Bienvenido: " + Login.alumnoLogeado.nombre + " " + Login.alumnoLogeado.apellido);

        for (Curso c : Login.cursos) {
            cursosjComboBox.addItem(c.cursoNom);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombrejLabel = new javax.swing.JLabel();
        cursosjComboBox = new javax.swing.JComboBox<>();
        asignarjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombrejLabel.setText("jLabel1");

        asignarjButton.setText("Asignar");
        asignarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarjButtonActionPerformed(evt);
            }
        });

        regresarjMenu.setText("Regresar");
        regresarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(regresarjMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(asignarjButton)
                .addGap(63, 63, 63))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nombrejLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(cursosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nombrejLabel)
                .addGap(3, 3, 3)
                .addComponent(asignarjButton)
                .addGap(50, 50, 50)
                .addComponent(cursosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        PAlumno p = new PAlumno();
        p.setVisible(true);
        this.dispose();                                                   

    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void asignarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarjButtonActionPerformed
        // TODO add your handling code here:

        String nombreCurso = cursosjComboBox.getSelectedItem().toString();

        Alumno alumnoSeleccionado = Login.alumnoLogeado;
        Curso cursoSeleccionado = null;

        for (Curso c : Login.cursos) {
            if (c.cursoNom.equals(nombreCurso)) {
                cursoSeleccionado = c;
                break;
            }
        }

        if (cursoSeleccionado != null && alumnoSeleccionado != null) {
            cursoSeleccionado.alumnos.add(alumnoSeleccionado);
            JOptionPane.showMessageDialog(this, "Alumno Asignado!");
        }


    }//GEN-LAST:event_asignarjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignarjButton;
    private javax.swing.JComboBox<String> cursosjComboBox;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel nombrejLabel;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
