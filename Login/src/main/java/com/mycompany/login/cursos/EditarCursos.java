/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.login.cursos;

import com.mycompany.login.Login;
import com.mycompany.login.clases.Curso;
import com.mycompany.login.clases.Profesor;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class EditarCursos extends javax.swing.JFrame {

    /**
     * Creates new form EditarCursos
     */
    private Curso editarCursos;
    public EditarCursos(int posicion) {
        initComponents();
        
        for(Profesor c : Login.profesores ){
            uProfjComboBox.addItem(c.usuario);
        }
        
        editarCursos = Login.cursos.get(posicion);
        nombrejTextField.setText(editarCursos.cursoNom);
        seccjTextField.setText(editarCursos.seccion);
        fIniciojTextField.setText(editarCursos.fechaInicio);
        fFinjTextField.setText(editarCursos.fechaFin);
        hIniciojTextField.setText(editarCursos.horaInicio);
        hFinjTextField.setText(editarCursos.horaFin);
        uProfjComboBox.setSelectedItem(editarCursos.profAsig);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombrejTextField = new javax.swing.JTextField();
        seccjTextField = new javax.swing.JTextField();
        fIniciojTextField = new javax.swing.JTextField();
        fFinjTextField = new javax.swing.JTextField();
        hIniciojTextField = new javax.swing.JTextField();
        hFinjTextField = new javax.swing.JTextField();
        uProfjComboBox = new javax.swing.JComboBox<>();
        actualizarjButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        regresarjMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Seccion:");

        jLabel3.setText("F Inicio:");

        jLabel4.setText("F Fin:");

        jLabel5.setText("H Inicio:");

        jLabel6.setText("H Fin:");

        jLabel7.setText("U Prof:");

        actualizarjButton.setText("Actualizar");
        actualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarjButtonActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombrejTextField)
                    .addComponent(seccjTextField)
                    .addComponent(fIniciojTextField)
                    .addComponent(fFinjTextField)
                    .addComponent(hIniciojTextField)
                    .addComponent(hFinjTextField)
                    .addComponent(uProfjComboBox, 0, 120, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(actualizarjButton)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombrejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(seccjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fIniciojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizarjButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fFinjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hIniciojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hFinjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(uProfjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarjMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarjMenuMouseClicked
        // TODO add your handling code here:
        
        principalCurso p = new principalCurso();
        p.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_regresarjMenuMouseClicked

    private void actualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarjButtonActionPerformed
        // TODO add your handling code here:
        
        editarCursos.cursoNom = nombrejTextField.getText();
        editarCursos.seccion = seccjTextField.getText();
        editarCursos.fechaInicio = fIniciojTextField.getText();
        editarCursos.fechaFin = fFinjTextField.getText();
        editarCursos.horaInicio = hIniciojTextField.getText();
        editarCursos.horaFin = hFinjTextField.getText();
        editarCursos.profAsig = (String) uProfjComboBox.getSelectedItem();
        
        JOptionPane.showMessageDialog(this, "Curso Modificado");
    }//GEN-LAST:event_actualizarjButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarjButton;
    private javax.swing.JTextField fFinjTextField;
    private javax.swing.JTextField fIniciojTextField;
    private javax.swing.JTextField hFinjTextField;
    private javax.swing.JTextField hIniciojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField nombrejTextField;
    private javax.swing.JMenu regresarjMenu;
    private javax.swing.JTextField seccjTextField;
    private javax.swing.JComboBox<String> uProfjComboBox;
    // End of variables declaration//GEN-END:variables
}
