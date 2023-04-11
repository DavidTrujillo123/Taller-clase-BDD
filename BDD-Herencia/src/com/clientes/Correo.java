/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientes;

/**
 *
 * @author davor
 */
public class Correo {
    
    private String direccion;

    public Correo(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return this.direccion;
    }
    
    
}
