/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera.modelo;

/**
 *
 * @author 1214k
 */
public class REGULAR {
    public int regular = 1000;
    private float regularPrecio = 33.32f;
    
    public float venta(float cantidad){
        float total = this.regularPrecio * cantidad;
        this.regular = (int) (regular - total);     
        return total;
    }

    public float getRegular() {
        return regular;
    }

    public void setRegular(int regular) {
        this.regular = regular;
    }

    public float getRegularPrecio() {
        return regularPrecio;
    }

    public void setRegularPrecio(float regularPrecio) {
        this.regularPrecio = regularPrecio;
    }
    
    
}
