/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.alumno.sesion;

import com.mycompany.login.*;
import com.mycompany.login.alumno.sesion.*;

/**
 *
 * @author hector
 */
public class PAlumno extends javax.swing.JFrame {

    /**
     * Creates new form PAlumno
     */
    public PAlumno() {
        initComponents();
        nombrejLabel.setText("Bienvenido: "+Login.alumnoLogeado.nombre+" "+Login.alumnoLogeado.apellido);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombbrejLabel = new javax.swing.JLabel();
        apellidojLabel = new javax.swing.JLabel();
        nombrejLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        masjMenu = new javax.swing.JMenu();
        asignaCjMenuItem = new javax.swing.JMenuItem();
        consCurjMenuItem = new javax.swing.JMenuItem();
        regresarjMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombrejLabel.setText("Nombre");

        masjMenu.setText("+");

        asignaCjMenuItem.setText("Asignar Curso");
        asignaCjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaCjMenuItemActionPerformed(evt);
            }
        });
        masjMenu.add(asignaCjMenuItem);

        consCurjMenuItem.setText("Consultar Cursos");
        consCurjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consCurjMenuItemActionPerformed(evt);
            }
        });
        masjMenu.add(consCurjMenuItem);

        jMenuBar1.add(masjMenu);

        regresarjMenu.setText("Regresar");
        regresarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(regresarjMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(nombbrejLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombrejLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(apellidojLabel)))
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(apellidojLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombbrejLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nombrejLabel)
                        .addGap(0, 160, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        LoginInicial l = new LoginInicial();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void asignaCjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaCjMenuItemActionPerformed
        // TODO add your handling code here:
        AsignacionCurso a = new AsignacionCurso();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_asignaCjMenuItemActionPerformed

    private void consCurjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consCurjMenuItemActionPerformed
        // TODO add your handling code here:
        ConsultaCursosAl c = new ConsultaCursosAl();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consCurjMenuItemActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apellidojLabel;
    private javax.swing.JMenuItem asignaCjMenuItem;
    private javax.swing.JMenuItem consCurjMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu masjMenu;
    private javax.swing.JLabel nombbrejLabel;
    private javax.swing.JLabel nombrejLabel;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
