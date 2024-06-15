/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.login;

import com.mycompany.login.clases.*;
import java.util.ArrayList;

/**
 *
 * @author hector
 */
public class Login {

    public static ArrayList<Profesor> profesores = new ArrayList<>();
    public static Profesor profesorLogeado = new Profesor();
    public static ArrayList<Alumno> alumnos = new ArrayList<>();
    public static Alumno alumnoLogeado = new Alumno();
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static Curso cursoslogeados = new Curso();

    public static void main(String[] args) {

        LoginInicial login = new LoginInicial();
        login.setVisible(true);

    }
}
