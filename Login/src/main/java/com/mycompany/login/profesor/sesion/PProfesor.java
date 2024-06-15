/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.profesor.sesion;

import com.mycompany.login.Login;
import com.mycompany.login.LoginInicial;

/**
 *
 * @author hector
 */
public class PProfesor extends javax.swing.JFrame {

    /**
     * Creates new form PProfesor
     */
    public PProfesor() {
        initComponents();
        jLabel1.setText("Bienvenido: "+Login.profesorLogeado.nombre+" "+Login.profesorLogeado.apellido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        AdminstrarjMenu = new javax.swing.JMenu();
        listadoCursosjMenuItem = new javax.swing.JMenuItem();
        jMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        regresarjMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("jLabel1");

        AdminstrarjMenu.setText("Administrar");

        listadoCursosjMenuItem.setText("Listado Cursos");
        listadoCursosjMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoCursosjMenuItemActionPerformed(evt);
            }
        });
        AdminstrarjMenu.add(listadoCursosjMenuItem);

        jMenuItem.setText("Listado Alum Asignados");
        jMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemActionPerformed(evt);
            }
        });
        AdminstrarjMenu.add(jMenuItem);

        jMenuItem2.setText("Perfil");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        AdminstrarjMenu.add(jMenuItem2);

        jMenuBar1.add(AdminstrarjMenu);

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
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        LoginInicial l = new LoginInicial();
        l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void listadoCursosjMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoCursosjMenuItemActionPerformed
        // TODO add your handling code here:
        ListadoCursosProf l = new ListadoCursosProf();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_listadoCursosjMenuItemActionPerformed

    private void jMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemActionPerformed
        // TODO add your handling code here:
        ListadoAlumAsig l = new ListadoAlumAsig();
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        PerfilProfesor p = new PerfilProfesor();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AdminstrarjMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem listadoCursosjMenuItem;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
