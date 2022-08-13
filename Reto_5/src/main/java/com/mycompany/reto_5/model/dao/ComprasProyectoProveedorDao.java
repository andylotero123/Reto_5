
package com.mycompany.reto_5.model.dao;

import com.mycompany.reto_5.model.vo.ComprasProyectoProveedorVo;
import com.mycompany.reto_5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ComprasProyectoProveedorDao {
    
    public List<ComprasProyectoProveedorVo> consultarProyectosProveedor() throws SQLException{
        
        ArrayList<ComprasProyectoProveedorVo> listaProyectosProveedor = new ArrayList<ComprasProyectoProveedorVo>();
        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;

            String consultaProyectoCasa =   "SELECT C.ID_Compra, Constructora, Banco_Vinculado "
                                            + "FROM Compra AS C "
                                            + "INNER JOIN Proyecto P ON (C.ID_Proyecto = P.ID_Proyecto) "
                                            + "WHERE C.Proveedor = 'Homecenter' AND P.Ciudad = 'Salento'; ";
            try {
                statement = conexion.prepareStatement(consultaProyectoCasa);
                //statement.setString(1, nombreBnaco);
                result = statement.executeQuery();
                
                while(result.next()){
                    ComprasProyectoProveedorVo comprasProveedor = new ComprasProyectoProveedorVo();

                    comprasProveedor.setIdCompraPk(result.getInt("ID_Compra"));
                    comprasProveedor.setNombreConstructora(result.getString("Constructora"));
                    comprasProveedor.setBancoVinculado(result.getString("Banco_Vinculado"));
       
                    listaProyectosProveedor.add(comprasProveedor);
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
            return listaProyectosProveedor;
    }
}
