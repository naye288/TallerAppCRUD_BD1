package com.mycompany.TallerAppCRUD_BD1;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        Pantalla.crearPantalla(pantalla);
        SQLConnection.getConnection();
    }

}
