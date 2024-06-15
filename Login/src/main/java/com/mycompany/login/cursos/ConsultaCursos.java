/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.cursos;

import com.mycompany.login.Login;
import com.mycompany.login.clases.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hector
 */
public class ConsultaCursos extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaCursos
     */
    public ConsultaCursos() {
        initComponents();
        for (Curso c : Login.cursos) {
            cursosjComboBox.addItem(c.cursoNom);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cursosjComboBox = new javax.swing.JComboBox<>();
        consultarjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        Todos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        consultarjButton.setText("Consultar");
        consultarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarjButtonActionPerformed(evt);
            }
        });

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

        Todos.setText("Todos");
        Todos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodosMouseClicked(evt);
            }
        });
        jMenuBar1.add(Todos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cursosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(consultarjButton)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cursosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultarjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        principalCurso p = new principalCurso();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void consultarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarjButtonActionPerformed
        // TODO add your handling code here:

        String nombreCurso = (String) cursosjComboBox.getSelectedItem();
        Curso cursoSeleccionado = null;

        for (Curso c : Login.cursos) {
            if (c.cursoNom.equals(nombreCurso)) {
                cursoSeleccionado = c;
                break;
            }
        }

        if (cursoSeleccionado != null) {
            DefaultTableModel d = new DefaultTableModel(new String[]{"Codigo", "Nombre", "Seccion", "Fecha In",
                "Fecha Fin", "Hora In", "Hora Fin", "Profesor"}, 1);
            jTable1.setModel(d);

            int row = 0;

            Curso c = cursoSeleccionado;
            jTable1.setValueAt(c.id, row, 0);
            jTable1.setValueAt(c.cursoNom, row, 1);
            jTable1.setValueAt(c.seccion, row, 2);
            jTable1.setValueAt(c.fechaInicio, row, 3);
            jTable1.setValueAt(c.fechaFin, row, 4);
            jTable1.setValueAt(c.horaInicio, row, 5);
            jTable1.setValueAt(c.horaFin, row, 6);
            jTable1.setValueAt(c.profAsig, row, 7);

        }

    }//GEN-LAST:event_consultarjButtonActionPerformed

    private void TodosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodosMouseClicked
        // TODO add your handling code here:
        ConsultarCursosTodos c = new ConsultarCursosTodos();
        c.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_TodosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Todos;
    private javax.swing.JButton consultarjButton;
    private javax.swing.JComboBox<String> cursosjComboBox;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenu regresarjMenu;
    // End of variables declaration//GEN-END:variables
}
