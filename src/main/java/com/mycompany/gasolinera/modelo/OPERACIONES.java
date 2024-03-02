/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera.modelo;

/**
 *
 * @author 1214k
 */
public class OPERACIONES {
    public float Venta(String gasolina, float cantidad){
        
        float total = 0.0f;
        
        if(gasolina == "SUPER"){
            SUPER sup = new SUPER();
            total = sup.venta(cantidad);
            System.out.println(total);
        } 
        if(gasolina == "DIESEL"){
            DIESEL dis = new DIESEL();
            total = dis.venta(cantidad);
            
        } 
        if (gasolina == "REGULAR"){
            REGULAR reg = new REGULAR();
            total = reg.venta(cantidad);
        }
        
        return total;
    }
}
