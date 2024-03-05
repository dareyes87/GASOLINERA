package com.mycompany.gasolinera;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.mycompany.gasolinera.vista.Gasolinera_Servicio;

/**
 *
 * @author 1214k
 */
public class Gasolinera {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        FlatMaterialDeepOceanIJTheme.setup(); //TEMA DE LA GASOLINERA
        Gasolinera_Servicio ventana = new Gasolinera_Servicio();
        ventana.setVisible(true); 
    }
}
