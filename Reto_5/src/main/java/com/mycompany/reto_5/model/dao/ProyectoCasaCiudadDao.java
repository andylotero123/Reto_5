
package com.mycompany.reto_5.model.dao;

import com.mycompany.reto_5.model.vo.ProyectoCasaCiudadVo;
import com.mycompany.reto_5.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProyectoCasaCiudadDao {
    
    public List<ProyectoCasaCiudadVo> consultarProyectoCasaCiudad() throws SQLException{
        
        ArrayList<ProyectoCasaCiudadVo> listaProyectoCasaCiudad = new ArrayList<ProyectoCasaCiudadVo>();
        Connection conexion = JDBCUtilities.getConnection();
        PreparedStatement statement = null;
        ResultSet result = null;

            String consultaProyectoCasa =   " SELECT P.ID_Proyecto, P.Constructora, P.Numero_Habitaciones, P.Ciudad "
                                            + " FROM Proyecto  AS P "
                                            + " WHERE P.Ciudad IN ('Santa Marta', 'Cartagena', 'Barranquilla') "
                                            + " AND P.Clasificacion = 'Casa Campestre'; ";
            try {
                statement = conexion.prepareStatement(consultaProyectoCasa);
                //statement.setString(1, nombreBnaco);
                result = statement.executeQuery();
                
                while(result.next()){
                    ProyectoCasaCiudadVo proyectoCasa = new ProyectoCasaCiudadVo();

                    proyectoCasa.setIdProyectoPk(result.getInt("ID_Proyecto"));
                    proyectoCasa.setConstructora(result.getString("Constructora"));
                    proyectoCasa.setNumeroHabitaciones(result.getDouble("Numero_Habitaciones"));
                    proyectoCasa.setCiudad(result.getString("Ciudad"));
       
                    listaProyectoCasaCiudad.add(proyectoCasa);
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
            return listaProyectoCasaCiudad;
    }
}
