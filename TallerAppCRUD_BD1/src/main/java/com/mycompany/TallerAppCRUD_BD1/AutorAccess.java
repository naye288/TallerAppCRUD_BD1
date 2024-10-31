/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.TallerAppCRUD_BD1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ACER
 */
public class AutorAccess {

    // Método para obtener todos los autores utilizando EXEC
    public static ResultSet getAutores() {
        String query = "EXEC GetAutores"; // Llamada al procedimiento almacenado con EXEC
        try {
            Connection connection = SQLConnection.getConnection();
            Statement statement = connection.createStatement();
            return statement.executeQuery(query); // Ejecuta la consulta y obtiene el ResultSet
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

