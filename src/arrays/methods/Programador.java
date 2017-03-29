/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.methods;

import java.util.Random;

/**
 *
 * @author josef
 */
public class Programador {
    
    public final static String MOBILE = "Desarrollo Movíl";
    public final static String BACK_END = "Desarrollo back-end";
    public final static String FRONT_END = "Desarrollo Front-end";
    public final static String DBA = "Administrador de base de datos";
            
    private String nombre;      //nombre del programador
    private String especialidad;//especialidad del programador

    public Programador(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
  
    /** 
     * @return un puesto de programdor random*/
    public static String getPuestoRandom(){
        String[] p = {MOBILE, BACK_END, FRONT_END, DBA};
        return p[new Random().nextInt(p.length)];
    }

    @Override
    public String toString() {
        return "Programador{" + "nombre=" + nombre + ", especialidad=" + especialidad + '}';
    }
 
    
}
