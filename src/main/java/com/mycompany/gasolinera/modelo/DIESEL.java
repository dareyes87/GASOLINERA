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
    public int diesel = 1000;
    private float dieselPrecio = 31.32f;
    
    public float venta(float cantidad){
        float total = this.dieselPrecio * cantidad;
        this.diesel = (int) (diesel - total);
                
        return total;
    }

    public float getDiesel() {
        return diesel;
    }

    public void setDiesel(int diesel) {
        this.diesel = diesel;
    }

    public float getDieselPrecio() {
        return dieselPrecio;
    }

    public void setDieselPrecio(float dieselPrecio) {
        this.dieselPrecio = dieselPrecio;
    }
    
}
