/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login;

import com.mycompany.login.alumno.principalAlumno;
import com.mycompany.login.cursos.principalCurso;
import com.mycompany.login.profesor.PrincipalProfesor;

/**
 *
 * @author hector
 */
public class LoginMultiUso extends javax.swing.JFrame {

    /**
     * Creates new form Administrador
     */
    public LoginMultiUso() {
        initComponents();
        jLabel1.setText("Bienvenido: "+ Login.profesorLogeado.nombre+" "+Login.profesorLogeado.apellido);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        administrarjMenu = new javax.swing.JMenu();
        inicialProfesoresjMenuItem = new javax.swing.JMenuItem();
        inicialAlumnosjMenuItem = new javax.swing.JMenuItem();
        inicialCursosjMenuItem = new javax.swing.JMenuItem();
        regresarjMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hèctor Espinoza");

        administrarjMenu.setText("Administrar");

        inicialProfesoresjMenuItem.setText("Admin Profesores");
        inicialProfesoresjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicialProfesoresjMenuItemActionPerformed(evt);
            }
        });
        administrarjMenu.add(inicialProfesoresjMenuItem);

        inicialAlumnosjMenuItem.setText("Admin Alumnos");
        inicialAlumnosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicialAlumnosjMenuItemActionPerformed(evt);
            }
        });
        administrarjMenu.add(inicialAlumnosjMenuItem);

        inicialCursosjMenuItem.setText("Admin Cursos");
        inicialCursosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicialCursosjMenuItemActionPerformed(evt);
            }
        });
        administrarjMenu.add(inicialCursosjMenuItem);

        jMenuBar1.add(administrarjMenu);

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
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        LoginInicial log = new LoginInicial();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void inicialProfesoresjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicialProfesoresjMenuItemActionPerformed
        // TODO add your handling code here:
        PrincipalProfesor pro = new PrincipalProfesor();
        pro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicialProfesoresjMenuItemActionPerformed

    private void inicialAlumnosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicialAlumnosjMenuItemActionPerformed
        // TODO add your handling code here:
        principalAlumno alu = new principalAlumno();
        alu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicialAlumnosjMenuItemActionPerformed

    private void inicialCursosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicialCursosjMenuItemActionPerformed
        // TODO add your handling code here:
        principalCurso prin = new principalCurso();
        prin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_inicialCursosjMenuItemActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administrarjMenu;
    private javax.swing.JMenuItem inicialAlumnosjMenuItem;
    private javax.swing.JMenuItem inicialCursosjMenuItem;
    private javax.swing.JMenuItem inicialProfesoresjMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
