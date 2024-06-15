/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.cursos;

import com.mycompany.login.LoginMultiUso;

/**
 *
 * @author hector
 */
public class principalCurso extends javax.swing.JFrame {

    /**
     * Creates new form principalCurso
     */
    public principalCurso() {
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

        crearCursojButton = new javax.swing.JButton();
        asignarCursojButton = new javax.swing.JButton();
        consultarCursojButton = new javax.swing.JButton();
        estudiantesAsigjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crearCursojButton.setText("Crear Curso");
        crearCursojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCursojButtonActionPerformed(evt);
            }
        });

        asignarCursojButton.setText("Asignar Curso");
        asignarCursojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursojButtonActionPerformed(evt);
            }
        });

        consultarCursojButton.setText("Consultar Cursos");
        consultarCursojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCursojButtonActionPerformed(evt);
            }
        });

        estudiantesAsigjButton.setText("Estudiantes - Cursos");
        estudiantesAsigjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estudiantesAsigjButtonActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estudiantesAsigjButton)
                    .addComponent(consultarCursojButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearCursojButton)
                        .addGap(57, 57, 57)
                        .addComponent(asignarCursojButton)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearCursojButton)
                    .addComponent(asignarCursojButton))
                .addGap(34, 34, 34)
                .addComponent(consultarCursojButton)
                .addGap(26, 26, 26)
                .addComponent(estudiantesAsigjButton)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCursojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCursojButtonActionPerformed
        // TODO add your handling code here:
        CrearCurso crear = new CrearCurso();
        crear.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearCursojButtonActionPerformed

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        LoginMultiUso log = new LoginMultiUso();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void asignarCursojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursojButtonActionPerformed
        // TODO add your handling code here:
        AsignarCurso a = new AsignarCurso();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_asignarCursojButtonActionPerformed

    private void consultarCursojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCursojButtonActionPerformed
        // TODO add your handling code here:
        ConsultaCursos c = new ConsultaCursos();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_consultarCursojButtonActionPerformed

    private void estudiantesAsigjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estudiantesAsigjButtonActionPerformed
        // TODO add your handling code here:
        EstudiantesAsgACursos e = new EstudiantesAsgACursos();
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_estudiantesAsigjButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignarCursojButton;
    private javax.swing.JButton consultarCursojButton;
    private javax.swing.JButton crearCursojButton;
    private javax.swing.JButton estudiantesAsigjButton;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}