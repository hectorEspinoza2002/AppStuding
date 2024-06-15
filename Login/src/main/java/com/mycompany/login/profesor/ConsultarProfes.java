/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.profesor;

import com.mycompany.login.Login;
import com.mycompany.login.clases.Alumno;
import com.mycompany.login.clases.Profesor;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hector
 */
public class ConsultarProfes extends javax.swing.JFrame {

    /**
     * Creates new form ConsultarProfes
     */
    public ConsultarProfes() {
        initComponents();
        DefaultTableModel d = new DefaultTableModel(new String[]{"Usuario","Nombre", "Apellido"}, Login.profesores.size());
        jTable1.setModel(d);
        
        int row = 0;
        
        for(Profesor l: Login.profesores){
            jTable1.setValueAt(l.usuario, row, 0);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        PrincipalProfesor p = new PrincipalProfesor();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void modificarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarjMenuMouseClicked
        // TODO add your handling code here:
        EditarProfes e = new EditarProfes(jTable1.getSelectedRow());
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_modificarjMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu modificarjMenu;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
