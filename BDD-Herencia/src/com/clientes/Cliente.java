/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientes;

import java.util.Date;

/**
 *
 * @author davor
 */
public class Cliente {
        
    private String nombre;
    private String apellido;
    private boolean genero;
    private Date fechaDeNacimiento;
    
    public Correo[] correos;
    private Direccion[] direcciones;

    public Cliente(String nombre, String apellido, boolean genero, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.correos = new Correo[3];
        this.direcciones = new Direccion[3];
    }
    
    public Correo AgregarCorreo(Correo c){
        for (int i = 0; i < 3; i++) {
            if(correos[i] == null){
                correos[i] = c;
                return c;
            }    
        }
        return null;
    }

    public Direccion AgregarDireccion(Direccion d){
        for (int i = 0; i < 3; i++) {
            if(direcciones[i] == null){
                direcciones[i] = d;
                return d;
            }    
        }
        return null;
    }

    
    @Override
    public String toString() {
        String s;
        s = "Nombre: "+this.nombre+
                " Apellido: "+this.apellido+ 
                " Genero: "+(this.genero==true?"Masculino":"Femenino")+
                " Fecha Nacimineto: "+fechaDeNacimiento.toString()+
                " \nCorreos:\n";
        for (Correo correo : correos) {
            s += correo.toString()+"\n";
        }
        s += "Direcciones\n";
        for (Direccion direccion : direcciones) {
            s += direccion.toString()+"\n";
        }
        return s;
    }
    
    
    
}
