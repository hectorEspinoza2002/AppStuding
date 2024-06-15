/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.profesor.sesion;

import com.mycompany.login.Login;
import com.mycompany.login.clases.Alumno;
import com.mycompany.login.clases.Curso;
import com.mycompany.login.clases.Profesor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hector
 */
public class ListadoAlumAsig extends javax.swing.JFrame {

    /**
     * Creates new form ListadoAlumAsig
     */
    public ListadoAlumAsig() {
        initComponents();

        /*for (Curso c : Login.cursos) {

            if (Login.profesorLogeado.nombre.equals(c.profAsig)) {
                cursosjComboBox.addItem(c.cursoNom);
            }

        }*/
        
        ArrayList<Alumno> nuevoAlum = new ArrayList<>();
        for (Alumno a : Login.alumnos) {

            if (Login.profesorLogeado.nombre.equals(a.carne)) {
                nuevoAlum.add(a);
            }

        }

        DefaultTableModel d = new DefaultTableModel(new String[]{"Carne", "Nombre", "Apellido", "Nota Final"},
                nuevoAlum.size());

        jTable1.setModel(d);

        int row = 0;

        for (Alumno c : nuevoAlum) {
            jTable1.setValueAt(c.carne, row, 0);
            jTable1.setValueAt(c.nombre, row, 1);
            jTable1.setValueAt(c.apellido, row, 2);
            //jTable1.setValueAt(cursoSelec.cursoNom, row, 3);
            jTable1.setValueAt(c.nota, row, 3);
            
            row++;

        }       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        notajMenu = new javax.swing.JMenu();

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

        jMenu1.setText("Regresar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        notajMenu.setText("Nota Final");
        notajMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notajMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(notajMenu);

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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        PProfesor p = new PProfesor();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void notajMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notajMenuMouseClicked
        // TODO add your handling code here:
        EditarNotaFinal e = new EditarNotaFinal(jTable1.getSelectedRow());
        e.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_notajMenuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu notajMenu;
    // End of variables declaration//GEN-END:variables
}
