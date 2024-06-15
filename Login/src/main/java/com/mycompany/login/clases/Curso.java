/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.clases;

import java.util.ArrayList;

/**
 *
 * @author hector
 */
public class Curso {
    
    public String id;
    public String cursoNom;
    public String seccion;
    public String fechaInicio;
    public String fechaFin;
    public String horaInicio;
    public String horaFin;
    public String profAsig;
    public String nota;
    
    public ArrayList<Alumno> alumnos = new ArrayList<>();
    public ArrayList<Curso> cursos = new ArrayList<>();
    public ArrayList<Profesor> profesores = new ArrayList<>();
    
    
}
