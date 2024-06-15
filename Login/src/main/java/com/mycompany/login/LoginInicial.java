package com.mycompany.login;

import com.mycompany.login.alumno.sesion.PAlumno;
import com.mycompany.login.clases.*;
import com.mycompany.login.profesor.sesion.PProfesor;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class LoginInicial extends javax.swing.JFrame {

    public LoginInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usuariojTextField = new javax.swing.JTextField();
        contraseniaField1 = new javax.swing.JPasswordField();
        inicioSesionjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        inicioSesionjButton.setText("Inicio Sesion");
        inicioSesionjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usuariojTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(contraseniaField1))
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(inicioSesionjButton)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(usuariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contraseniaField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(inicioSesionjButton)
                .addGap(63, 63, 63))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioSesionjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionjButtonActionPerformed
        // TODO add your handling code here:

        String usuario = usuariojTextField.getText();
        String contrasenia = contraseniaField1.getText();

        if ("admin".equals(usuario) && "admin".equals(contrasenia)) {
            LoginMultiUso a = new LoginMultiUso();
            a.setVisible(true);
            this.dispose();
        } else {

            boolean encontrado = false;
            for (Profesor p : Login.profesores) {
                if (p.usuario.equals(usuario) && p.contrasenia.equals(contrasenia)) {
                    Login.profesorLogeado = p;
                    PProfesor log = new PProfesor();
                    log.setVisible(true);
                    encontrado = true;
                    this.dispose();
                    break;
                }
            }

            for (Alumno alu : Login.alumnos) {
                if (alu.carne.equals(usuario) && alu.contrasenia.equals(contrasenia)) {
                    PAlumno a = new PAlumno();
                    a.setVisible(true);
                    encontrado = true;
                    this.dispose();
                    break;
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña Incorrecta!");
                }
            }

        }

    }//GEN-LAST:event_inicioSesionjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraseniaField1;
    private javax.swing.JButton inicioSesionjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField usuariojTextField;
    // End of variables declaration//GEN-END:variables
}
