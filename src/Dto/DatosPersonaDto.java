
package Dto;

import java.io.Serializable;


public class DatosPersonaDto implements Serializable{

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    //atributos
    public void setEstado(String estado) {
        this.estado = estado;
    }
    private String nombre;
    private int nit;
    private double total;
    private String estado;

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    private int orden;
    
    
    
}
