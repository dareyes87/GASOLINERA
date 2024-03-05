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

    public int statusGas(){
        int status = 0;
        status = this.diesel * 100 / 100;
        return status;
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
