
package com.mycompany.reto_5.model.vo;

public class ComprasProyectoProveedorVo {
   
    private Integer idCompraPk;
    private String nombreConstructora;
    private String bancoVinculado;
    
    public Integer getIdCompraPk() {
        return idCompraPk;
    }

    public void setIdCompraPk(Integer idCompraPk) {
        this.idCompraPk = idCompraPk;
    }

    public String getNombreConstructora() {
        return nombreConstructora;
    }

    public void setNombreConstructora(String nombreConstructora) {
        this.nombreConstructora = nombreConstructora;
    }

    public String getBancoVinculado() {
        return bancoVinculado;
    }

    public void setBancoVinculado(String bancoVinculado) {
        this.bancoVinculado = bancoVinculado;
    }
    
    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s", idCompraPk, nombreConstructora, bancoVinculado);
    }
}
