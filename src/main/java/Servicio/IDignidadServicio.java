/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Modelo.Dignidad;
import java.util.List;

/**
 *
 * @author Adrian
 */
public interface IDignidadServicio {
    
    public Dignidad crear(Dignidad dignidad);
    public List<Dignidad> listar(); 
}
