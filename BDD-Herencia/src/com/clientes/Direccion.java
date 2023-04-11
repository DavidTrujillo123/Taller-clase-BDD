/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.clientes;

/**
 *
 * @author davor
 */
public class Direccion {
    
    private String pais;
    private String ciudad;
    private String callePrincipal;
    private String calleSecundaria;
    private String codPostal;
    private String num;

    public Direccion(String pais, String ciudad, String callePrincipal, String calleSecundaria, String codPostal, String num) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
        this.codPostal = codPostal;
        this.num = num;
    }

    @Override
    public String toString() {
        return "País: "+pais+" Ciudad: "+ciudad+" Número: "+num;
    }
    
    
    
    
    
    
}
