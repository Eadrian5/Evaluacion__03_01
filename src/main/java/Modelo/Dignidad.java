/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Modelo;

/**
 *
 * @author Adrian
 */
public class Dignidad {

    private String Nombrepersona;
    private String Duracion;
    private String Añodelapersona;
    private int Numpersonas;

    public Dignidad(String Nombrepersona, String Duracion, String Añodelapersona, int Numpersonas) {
        this.Nombrepersona = Nombrepersona;
        this.Duracion = Duracion;
        this.Añodelapersona = Añodelapersona;
        this.Numpersonas = Numpersonas;
    }

    public Dignidad(Integer valueOf, String arg, String arg0, Integer valueOf0, Double valueOf1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombrepersona() {
        return Nombrepersona;
    }

    public void setNombrepersona(String Nombrepersona) {
        this.Nombrepersona = Nombrepersona;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public String getAñodelapersona() {
        return Añodelapersona;
    }

    public void setAñodelapersona(String Añodelapersona) {
        this.Añodelapersona = Añodelapersona;
    }

    public int getNumpersonas() {
        return Numpersonas;
    }

    public void setNumpersonas(int Numpersonas) {
        this.Numpersonas = Numpersonas;
    }
    
    @Override
    public String toString() {
        return "Dignidad{" + " Nombrepersona=" + Nombrepersona + " ,Duracion=" + Duracion + ", Añodelapersona=" + Añodelapersona
                 + ", Numpersonas=" + Numpersonas
                +  '}';
    }
}
