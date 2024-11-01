/*
Sebastián Andrés Muñoz Morera 2023090681
Nayely Francini Chavarría Guevara 2021093564
Felipe Javier Murillo Chaves 2023083005
*/

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
