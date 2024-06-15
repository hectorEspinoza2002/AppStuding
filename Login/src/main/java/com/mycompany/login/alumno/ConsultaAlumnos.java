/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.alumno;

import com.mycompany.login.Login;
import com.mycompany.login.clases.Alumno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hector
 */
public class ConsultaAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaAlumnos
     */
    public ConsultaAlumnos() {
        initComponents();
        DefaultTableModel d = new DefaultTableModel(new String[]{"Carnè", "Nombre", "Apellido"}, Login.alumnos.size());
        jTable1.setModel(d);
        
        int row = 0;
        
        for(Alumno l: Login.alumnos){
            jTable1.setValueAt(l.carne, row, 0);
            jTable1.setValueAt(l.nombre, row, 1);
            jTable1.setValueAt(l.apellido, row, 2);
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
        modificarjMenu = new javax.swing.JMenu();

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

        modificarjMenu.setText("Modificar");
        modificarjMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarjMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(modificarjMenu);

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
        
        principalAlumno p = new principalAlumno();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void modificarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarjMenuMouseClicked
        // TODO add your handling code here:
        EditarAlumno e = new EditarAlumno(jTable1.getSelectedRow());
        e.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_modificarjMenuMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu modificarjMenu;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
