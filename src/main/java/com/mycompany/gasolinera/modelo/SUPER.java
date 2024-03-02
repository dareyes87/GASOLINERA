/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera.modelo;

/**
 *
 * @author 1214k
 */
public class SUPER {
    private float Super = 10000;
    private float superPrecio = 34.32f;
    
    public float venta(float cantidad){
        float total = this.superPrecio * cantidad;
                
        return total;
    }

    public float getSuper() {
        return Super;
    }

    public void setSuper(float Super) {
        this.Super = Super;
    }

    public float getSuperPrecio() {
        return superPrecio;
    }

    public void setSuperPrecio(float superPrecio) {
        this.superPrecio = superPrecio;
    }
    
    
}
