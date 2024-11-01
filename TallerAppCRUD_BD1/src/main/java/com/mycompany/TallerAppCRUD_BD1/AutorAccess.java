/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.TallerAppCRUD_BD1;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class AutorAccess {
    
    //Método para insertar autores
    //recibe todos los datos de la tabla
    public static int insertAutor(String name, String pais, String convida, Date cumple, Date publi, int cantP, int cali){
        int generatedId = 0;
        try (Connection connection = SQLConnection.getConnection()) {
            String insertSql = "{CALL InsertarAutor(?, ?, ?, ?, ?, ?, ?, ?)}";
            CallableStatement statement = connection.prepareCall(insertSql);

            // Establecer los valores de los parámetros de entrada
            statement.setString(1, name); 
            statement.setString(2, pais); 
            statement.setString(3, convida);  
            statement.setDate(4, cumple);  
            statement.setDate(5, publi);  
            statement.setInt(6, cantP); 
            statement.setInt(7, cali); 

            // Registrar el parámetro de salida para obtener el ID generado
            statement.registerOutParameter(8, java.sql.Types.INTEGER);

            // Ejecutar el procedimiento almacenado
            statement.execute();

            // Obtener el ID generado desde el parámetro de salida
            generatedId = statement.getInt(8);
            connection.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return generatedId;
    }

    //Método para obtener todos los autores 
    public static ResultSet getAutores() {
        String query = "EXEC GetAutores"; //Llamada al procedimiento almacenado 
        try {
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();
            return statement.executeQuery(query); //Ejecuta la consulta y obtiene el ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean deleteAutores(int id) {
        try (Connection connection = SQLConnection.getConnection()){
            String sql = "Exec deleteAutores ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            
            // Establecer los valores de los parámetros de entrada
            statement.setInt(1, id);
 
            // Ejecutar el procedimiento almacenado
            statement.execute();
            connection.close();
            return true; //se logra la eliminacion
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; //eliminacion fallida
    }
}

