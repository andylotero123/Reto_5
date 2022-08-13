
package com.mycompany.reto_5.controller;

import com.mycompany.reto_5.model.dao.ComprasProyectoProveedorDao;
import com.mycompany.reto_5.model.dao.InformacionLiderDao;
import com.mycompany.reto_5.model.dao.ProyectoCasaCiudadDao;
import com.mycompany.reto_5.model.vo.ComprasProyectoProveedorVo;
import com.mycompany.reto_5.model.vo.InformacionLiderVo;
import com.mycompany.reto_5.model.vo.ProyectoCasaCiudadVo;
import java.sql.SQLException;
import java.util.List;

public class ReportesController {
    
    InformacionLiderDao informacionLiderDao;
    ProyectoCasaCiudadDao proyectoCasaCiudadDao;
    ComprasProyectoProveedorDao comprasProyectoProveedorDao;
    
    public ReportesController(){
        this.informacionLiderDao = new InformacionLiderDao();
        this.proyectoCasaCiudadDao = new ProyectoCasaCiudadDao();
        this.comprasProyectoProveedorDao = new ComprasProyectoProveedorDao();
    }
    
    //metodo para consultar informacion del lider
    public List<InformacionLiderVo> listarInformacionLider() throws SQLException{
        
        return this.informacionLiderDao.consultarInformacionLider();
    }
    
    //Metodo para consultar Proyectos casa Ciudad
    public List<ProyectoCasaCiudadVo> listarProyectosCiudad() throws  SQLException{
        
        return this.proyectoCasaCiudadDao.consultarProyectoCasaCiudad();
    }
    
    //Metodo para consultar Compras Proyectos de Provedor
    public  List<ComprasProyectoProveedorVo> listarProyectosProveedor() throws SQLException{
        
        return this.comprasProyectoProveedorDao.consultarProyectosProveedor();
    }
}
