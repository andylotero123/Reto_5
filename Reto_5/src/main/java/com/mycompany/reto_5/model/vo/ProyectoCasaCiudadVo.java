
package com.mycompany.reto_5.model.vo;


public class ProyectoCasaCiudadVo {
    
    private Integer idProyectoPk;
    private String constructora;
    private Double numeroHabitaciones;
    private String ciudad;
    
    public Integer getIdProyectoPk() {
        return idProyectoPk;
    }

    public void setIdProyectoPk(Integer idProyectoPk) {
        this.idProyectoPk = idProyectoPk;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Double getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Double numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    @Override
    public String toString() {
        return String.format("%3d %-25s %,15.1f %-25s", idProyectoPk, constructora, numeroHabitaciones, ciudad);
    }
}
