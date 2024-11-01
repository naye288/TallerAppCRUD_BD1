package com.mycompany.TallerAppCRUD_BD1;

import javax.swing.JOptionPane;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla pantalla = new Pantalla();
        pantalla.setVisible(true);
        JOptionPane.showMessageDialog(null, "Antes de empezar dirijase al manual de usuario.");
        SQLConnection.getConnection();
    }

}
