/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import javafx.scene.paint.Color;


/**
 *
 * @author josef 
 * clase Auto basica (POJO)
 */
public class Auto {
     
    private String marca;//campos
    private int modelo;
    private String tipo;
    private String color;
    private ColorAuto colorAuto;
    private Color colorJ;
//    public static final String COLOR_VERDE = "VERDE";
//    public static final String COLOR_ROSA_BEBE = "ROSA BEBE";
//    public static final String COLOR_HIPPIE = "HIPPI :)";

    /**Constuctor vacío*/
    public Auto() {
//        El constructor es lo primero que se manda a llamar al 
//        generar la instancia
            System.out.println("Auto vacio");
            
            //valores por default
            this.modelo = 2000;
            this.marca = "NISSAN";
            this.color = "VERDE";
            this.tipo = "carga";
    }

    public Auto(String marca, String color) {
        this.marca = marca;
        this.color = color;
        System.out.println("Auto con marca y color");
    }

    public Auto(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.println("Auto con marca y modelo");
    }
    
    public Auto(String marca, Color color){
        this.marca = marca;
        this.colorJ = color;
    }
    
    public Color getColorJ(){
        return colorJ;
    }
    
    public Auto(String marca, ColorAuto colorAuto){
        this.marca = marca;
        this.colorAuto = colorAuto;
    }

    public String colorAutoD(){
        return this.colorAuto.getColorDefault();
    }
    /**Obtiene la marca*/
    public String getMarca() {
        return this.marca;
    }

    /**Asegina la marca*/
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**Obtiene la modelo*/
    public int getModelo() {
        return modelo;
    }

    /**Asegina el modelo*/
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**Obtiene el tipo*/
    public String getTipo() {
        return tipo;
    }
    /**Asegina el tipo*/
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**Obtiene el color*/
    public String getColor() {
        return color;
    }

    /**Asegina el color*/
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
