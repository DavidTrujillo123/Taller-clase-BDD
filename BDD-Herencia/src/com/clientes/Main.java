package com.clientes;

import java.util.Date;

public class Main {
    
    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Aaalan", "Sandoval", true, new Date(2001, 8, 27));
        Direccion d1, d2, d3;
        Correo c1,c2,c3;
        
        
        d1 = new Direccion("Ecuador", "Ibarra", "Av. El Retorno", "Calle Quilago", "100113", "5 - 16");
        d2 = new Direccion("Ecuador", "Ibarra", "Av. El Retorno", "Calle Quilago", "100113", "5 - 16");
        d3 = new Direccion("Ecuador", "Ibarra", "Av. El Retorno", "Calle Quilago", "100113", "5 - 16");
        
        cl1.AgregarDireccion(d1);
        cl1.AgregarDireccion(d2);
        cl1.AgregarDireccion(d3);
        
        c1 = new Correo("veecheverrias@utn.edu.ec");
        c2 = new Correo("veecheverrias@utn.edu.ec");
        c3 = new Correo("veecheverrias@utn.edu.ec");
        
        cl1.AgregarCorreo(c1);
        cl1.AgregarCorreo(c2);
        cl1.AgregarCorreo(c3);
        
        System.out.println(cl1.toString());
    }
          
            
}
