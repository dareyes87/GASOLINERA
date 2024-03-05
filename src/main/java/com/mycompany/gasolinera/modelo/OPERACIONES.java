/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gasolinera.modelo;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 1214k
 */
public class OPERACIONES {

    SUPER sup = new SUPER();
    DIESEL dis = new DIESEL();
    REGULAR reg = new REGULAR();
    
    RegistroVentas ventas = new RegistroVentas();
    List<RegistroVentas> listaVentas;
    
    public OPERACIONES() {
        listaVentas = new ArrayList<>();
    }
    
    public float Venta(String gasolina, float cantidad){
        
        float total = 0.0f;
        
        if(gasolina.equals("SUPER")){
            total = sup.venta(cantidad);
            registroVentas(gasolina, total);
        } 
        if(gasolina.equals("DIESEL")){
            total = dis.venta(cantidad);
            registroVentas(gasolina, total);
        } 
        if (gasolina.equals("REGULAR")){
            total = reg.venta(cantidad);
            registroVentas(gasolina, total);
        }
        
        return total;
    }
    
    public int statusGas(String gasolina){
        
        int restante = 0;
        
        if(gasolina == "SUPER"){
            restante = sup.Super * 100 / 1000;
        } 
        if(gasolina == "DIESEL"){
            restante = dis.diesel * 100 / 1000;
        } 
        if (gasolina == "REGULAR"){
            restante = reg.regular * 100 / 1000;
        }
        
        return restante;
    }
    
    public void listaVentas(JTable tablemodel) {
        DefaultTableModel model = (DefaultTableModel) tablemodel.getModel();
        model.addRow(new Object[]{ventas.getTipoGasolina(), "Q"+ventas.getTotal(), ventas.getFecha()});
        
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        
        for (int columnIndex = 0; columnIndex < model.getColumnCount(); columnIndex++) {
        tablemodel.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
    }
    }
    
    private void registroVentas(String gasolina, float total){
        ventas.setTipoGasolina(gasolina);
        ventas.setTotal(total);
        ventas.setFecha(LocalDateTime.now());
        
        listaVentas.add(ventas);
    }
    
}
