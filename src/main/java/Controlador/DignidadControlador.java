/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Dignidad;
import Servicio.DignidadServicio;
import java.util.List;

/**
 *
 * @author Adrian
 */
public class DignidadControlador {
    
   
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Dignidad crear(String [] args) {
        var dignidad = new Dignidad(Integer.valueOf(args[0]),args[1],args[2],
        Integer.valueOf(args[3]),Double.valueOf(args[4]));
        this.dignidadServicio.crear(dignidad);
        return dignidad;
    }
    
    public List<Dignidad> listar() {
        return this.dignidadServicio.listar();
    }        
}
