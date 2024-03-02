/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera.modelo;

/**
 *
 * @author 1214k
 */
public class DIESEL {
    private float diesel = 10000;
    private float dieselPrecio = 31.32f;
    
    public float venta(float cantidad){
        float total = this.dieselPrecio * cantidad;
                
        return total;
    }

    public float getDiesel() {
        return diesel;
    }

    public void setDiesel(float diesel) {
        this.diesel = diesel;
    }

    public float getDieselPrecio() {
        return dieselPrecio;
    }

    public void setDieselPrecio(float dieselPrecio) {
        this.dieselPrecio = dieselPrecio;
    }
    
}
