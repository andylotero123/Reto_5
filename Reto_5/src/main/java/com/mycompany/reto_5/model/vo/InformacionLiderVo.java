
package com.mycompany.reto_5.model.vo;

public class InformacionLiderVo {
    
    private Integer idLiderPk;
    private String nombreLider;
    private String primerApellido;
    private String ciudadResidencia;
    
    public Integer getIdLiderPk() {
        return idLiderPk;
    }

    public void setIdLiderPk(Integer idLiderPk) {
        this.idLiderPk = idLiderPk;
    }

    public String getNombreLider() {
        return nombreLider;
    }

    public void setNombreLider(String nombreLider) {
        this.nombreLider = nombreLider;
    }
    
    public String getPrimerApellido(){
        return primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido){
        this.primerApellido = primerApellido;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }
    
    @Override
    public String toString() {
        return String.format("%3d %-25s %-25s %-20s", idLiderPk, nombreLider, primerApellido, ciudadResidencia);
    }  
}
