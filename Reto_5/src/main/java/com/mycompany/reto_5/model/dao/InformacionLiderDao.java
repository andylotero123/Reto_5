
package com.mycompany.reto_5.model.dao;

import com.mycompany.reto_5.model.vo.InformacionLiderVo;
import com.mycompany.reto_5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InformacionLiderDao {
    
     public List<InformacionLiderVo> consultarInformacionLider() throws SQLException{
        
        ArrayList<InformacionLiderVo> listaInformacionLider = new ArrayList<InformacionLiderVo>();
        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;

            String consultaLider =  "SELECT L.ID_Lider, L.Nombre, L.Primer_Apellido, L.Ciudad_Residencia"
                                    + " FROM Lider As L"
                                    + " ORDER BY L.Ciudad_Residencia ASC; ";
            try {
                statement = conexion.prepareStatement(consultaLider);
                //statement.setString(1, nombreBnaco);
                result = statement.executeQuery();
                
                while(result.next()){
                    InformacionLiderVo informacionLider = new InformacionLiderVo();

                    informacionLider.setIdLiderPk(result.getInt("ID_Lider"));
                    informacionLider.setNombreLider(result.getString("Nombre"));
                    informacionLider.setPrimerApellido(result.getString("Primer_Apellido"));
                    informacionLider.setCiudadResidencia(result.getString("Ciudad_residencia"));
       
                    listaInformacionLider.add(informacionLider);
            }   
        } 
        finally {
            if (result != null) {
                result.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (conexion != null) {
                conexion.close();
            }                
        }
        return listaInformacionLider;
    }
}
