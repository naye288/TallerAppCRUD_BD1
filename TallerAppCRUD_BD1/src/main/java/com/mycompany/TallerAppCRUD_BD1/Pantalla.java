package com.mycompany.TallerAppCRUD_BD1;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author Usuario
 */

public class Pantalla extends javax.swing.JPanel {

    /**
     * Creates new form p
     */
    public Pantalla() {
        initComponents();
    }
    public static void crearPantalla(Pantalla pantalla) {
        JFrame frame = new JFrame("Aplicación CRUD Autores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(pantalla);
        frame.pack();
        frame.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Name_Autor = new javax.swing.JLabel();
        ID_Autor = new javax.swing.JLabel();
        IdPais = new javax.swing.JTextField();
        NameAutor = new javax.swing.JTextField();
        Pais = new javax.swing.JLabel();
        IdAutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Cumple = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ConVida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PrimeraPublicacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cantPublicaciones = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calificacion = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHelp = new javax.swing.JButton();

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdAutor", "Nombre", "IdPais", "Vivo", "Fecha de Nacimiento", "Primera Publicación", "Cantidad de Publicaciones", "Calificación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setHeaderValue("IdAutor");
            Tabla.getColumnModel().getColumn(1).setHeaderValue("Nombre");
            Tabla.getColumnModel().getColumn(2).setHeaderValue("IdPais");
            Tabla.getColumnModel().getColumn(3).setHeaderValue("Vivo");
            Tabla.getColumnModel().getColumn(4).setHeaderValue("Fecha de Nacimiento");
            Tabla.getColumnModel().getColumn(5).setHeaderValue("Primera Publicación");
            Tabla.getColumnModel().getColumn(6).setHeaderValue("Cantidad de Publicaciones");
            Tabla.getColumnModel().getColumn(7).setHeaderValue("Calificación");
        }

        Name_Autor.setText("Nombre Autor");

        ID_Autor.setText("ID Autor");

        IdPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdPaisActionPerformed(evt);
            }
        });

        NameAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameAutorActionPerformed(evt);
            }
        });

        Pais.setText("País");

        IdAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdAutorActionPerformed(evt);
            }
        });

        jLabel1.setText("Vivo");

        Cumple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CumpleActionPerformed(evt);
            }
        });

        jLabel2.setText("Nacimiento");

        ConVida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConVidaActionPerformed(evt);
            }
        });

        jLabel3.setText("Primera Publicación");

        PrimeraPublicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrimeraPublicacionActionPerformed(evt);
            }
        });

        jLabel4.setText("Total de Publicaciones");

        cantPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantPublicacionesActionPerformed(evt);
            }
        });

        jLabel5.setText("Calificación");

        calificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calificacionActionPerformed(evt);
            }
        });

        btnInsert.setText("Agregar Autor");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnListar.setText("Listar Autor");

        btnDelete.setText("Eliminar Autor");

        btnUpdate.setText("Actualizar Autor");

        btnHelp.setText("Manual Usuario");
        btnHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpActionPerformed(evt);
            }
        });
        
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        
        Tabla.addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
            int selectedRow = Tabla.getSelectedRow(); //Obtiene la fila seleccionada
            if (selectedRow != -1) {
                //Rellena los campos con los datos de la fila seleccionada
                IdAutor.setText(Tabla.getValueAt(selectedRow, 0).toString());
                NameAutor.setText(Tabla.getValueAt(selectedRow, 1).toString());
                IdPais.setText(Tabla.getValueAt(selectedRow, 2).toString());
                ConVida.setText(Tabla.getValueAt(selectedRow, 3).toString());
                Cumple.setText(Tabla.getValueAt(selectedRow, 4).toString());
                PrimeraPublicacion.setText(Tabla.getValueAt(selectedRow, 5).toString());
                cantPublicaciones.setText(Tabla.getValueAt(selectedRow, 6).toString());
                calificacion.setText(Tabla.getValueAt(selectedRow, 7).toString());
            }
        }
    });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cantPublicaciones))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ID_Autor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pais, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IdPais, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Name_Autor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdate)
                        .addGap(15, 15, 15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHelp, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameAutor)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConVida, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cumple, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PrimeraPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnListar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID_Autor)
                    .addComponent(Name_Autor)
                    .addComponent(IdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Cumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pais)
                    .addComponent(IdPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(ConVida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(PrimeraPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cantPublicaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnInsert)
                    .addComponent(btnDelete)
                    .addComponent(btnListar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(btnHelp)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>                        

    private void IdPaisActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void NameAutorActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void IdAutorActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void CumpleActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      

    private void ConVidaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void PrimeraPublicacionActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void cantPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void calificacionActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void btnHelpActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                     
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {
    ResultSet rs = AutorAccess.getAutores(); //Llamada al método que ejecuta el PA 
    DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
    model.setRowCount(0); //Limpia la tabla antes de cargar nuevos datos

    try {
        //Itera a través del ResultSet y llena la tabla
        while (rs != null && rs.next()) {
            Object[] row = {
                rs.getString("idAutor"),              //ID del autor
                rs.getString("nombre"),               //Nombre del autor
                rs.getString("idPais"),               //País del autor
                rs.getString("vivo"),                 //Estado de vida (vivo o no)
                rs.getDate("fechaNacimiento"),        //Fecha de nacimiento
                rs.getDate("primeraPublicacion"),     //Fecha de primera publicación
                rs.getInt("publicaciones"),           //Cantidad de publicaciones
                rs.getDouble("calificacion")          //Calificación
            };
            model.addRow(row); //Agrega la fila al modelo de la tabla
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al cargar los datos de los autores.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    // Variables declaration - do not modify                     
    private javax.swing.JTextField ConVida;
    private javax.swing.JTextField Cumple;
    private javax.swing.JLabel ID_Autor;
    private javax.swing.JTextField IdAutor;
    private javax.swing.JTextField IdPais;
    private javax.swing.JTextField NameAutor;
    private javax.swing.JLabel Name_Autor;
    private javax.swing.JLabel Pais;
    private javax.swing.JTextField PrimeraPublicacion;
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField calificacion;
    private javax.swing.JTextField cantPublicaciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}