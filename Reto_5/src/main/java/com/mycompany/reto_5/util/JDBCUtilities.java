
package com.mycompany.reto_5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    
    private static final String UBICACION_BD = "C:/Users/ANDERSON ADVANCE/Desktop/Reto 5/ProyectosConstruccion.db";
    
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_BD;
        return DriverManager.getConnection(url);
    } 
}
