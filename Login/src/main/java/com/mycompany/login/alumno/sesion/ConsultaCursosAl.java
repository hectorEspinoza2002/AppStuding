/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.alumno.sesion;

import com.mycompany.login.Login;
import com.mycompany.login.clases.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hector
 */
public class ConsultaCursosAl extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCursos
     */
    public ConsultaCursosAl() {
        initComponents();
        
        ArrayList<Curso> nuevoCurso = new ArrayList<>();

        for (Curso c : Login.cursos) {

            if (Login.alumnoLogeado.nombre.equals(c.alumnos)) {
                nuevoCurso.add(c);
            }

        }

        DefaultTableModel d = new DefaultTableModel(new String[]{"Codigo", "Nombre", "Seccion", "Fecha In",
            "Fecha Fin", "Hora In", "Hora Fin", "Profesor"}, nuevoCurso.size());

        jTable1.setModel(d);

        int row = 0;

        for (Curso c : nuevoCurso) {
            jTable1.setValueAt(c.id, row, 0);
            jTable1.setValueAt(c.cursoNom, row, 1);
            jTable1.setValueAt(c.seccion, row, 2);
            jTable1.setValueAt(c.fechaInicio, row, 3);
            jTable1.setValueAt(c.fechaFin, row, 4);
            jTable1.setValueAt(c.horaInicio, row, 5);
            jTable1.setValueAt(c.horaFin, row, 6);
            jTable1.setValueAt(c.profAsig, row, 7);

            row++;

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        desasignarjMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        regresarjMenu.setText("Regresar");
        regresarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(regresarjMenu);

        desasignarjMenu.setText("Desasignar");
        desasignarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desasignarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(desasignarjMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        PAlumno p = new PAlumno();
        p.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void desasignarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desasignarjMenuMouseClicked
        // TODO add your handling code here:
        Login.cursos.remove(jTable1.getSelectedRow());
        JOptionPane.showMessageDialog(this, "Curso Desasignado!");
        PAlumno p = new PAlumno();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_desasignarjMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu desasignarjMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
