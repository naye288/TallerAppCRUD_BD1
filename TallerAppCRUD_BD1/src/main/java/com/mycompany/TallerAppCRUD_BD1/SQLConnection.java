package com.mycompany.TallerAppCRUD_BD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {

    // Cadena de conexión completa
    private static final String connectionString = 
        "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;"
        + "database=LIBRERIA;"
        + "user=sa;"
        + "password=La contraseña de ustedes;"
        + "encrypt=true;"
        + "trustServerCertificate=true;"
        + "loginTimeout=30;";


    //Método para obtener la conexión
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(connectionString);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
