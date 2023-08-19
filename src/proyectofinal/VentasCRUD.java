
package proyectofinal;

import java.sql.Connection;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import proyectofinal.ClienteCRUD;
import proyectofinal.ComprasCRUD;
import proyectofinal.ConexionMYSQL;
import proyectofinal.Empleado;
import proyectofinal.Proveedor;

    public class VentasCRUD extends JFrame {
    private JTextField campo_IdVentas, campo_Producto, campo_Cantidad, campo_Fecha, campo_Total, campo_IdProducto;
    private JButton btnAgregar, btnActualizar, btnEliminar;
    private Connection connection;
    private Statement statement;
    
    ConexionMYSQL con= new ConexionMYSQL();
    Connection cn=ConexionMYSQL.conectar();
    

    public VentasCRUD() {
        initComponents();
        mostrardatosClientes();
        mostrardatosProductos();
        mostrardatosVentas();
       
      

       //botones
	   btnAgregar = new JButton("Guardar");

        btnAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarVenta();
            }

            private void guardarVenta() {
		String idventas = campo_IdVentas.getText();
                String producto = campo_Producto.getText();
                String cantidad = campo_Cantidad.getText();
                String fecha = campo_Fecha.getText();
                String total = campo_Total.getText();
                String idproducto = campo_IdProducto.getText();

        try {
            statement.executeUpdate("INSERT INTO Ventas (IdVentas, Producto, Cantidad, Fecha, Total, Id_Producto) " +
                "VALUES (" + idventas + ", '" + producto + "', " + cantidad + ", '" + fecha + "', " + total + ", " + idproducto + ")");
            JOptionPane.showMessageDialog(null, "Venta guardada exitosamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar la venta: " + ex.getMessage());
        }
    }
        });
	   btnActualizar = new JButton("Guardar");

        btnActualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                actualizarVenta();
            }

           
    private void actualizarVenta() {
        String idventas = campo_IdVentas.getText();
        String producto = campo_Producto.getText();
        String cantidad = campo_Cantidad.getText();
        String fecha = campo_Fecha.getText();
        String total = campo_Total.getText();
        String idproducto = campo_IdProducto.getText();


        try {
            statement.executeUpdate("UPDATE Ventas SET Producto = '" + producto + "', Cantidad = " + cantidad +
                ", Fecha = '" + fecha + "', Total = " + total + ", Id_Producto = " + idproducto + " WHERE IdVentas = " + idventas);
            JOptionPane.showMessageDialog(null, "Venta actualizada exitosamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la venta: " + ex.getMessage());
        }
    }

        });
	   btnEliminar = new JButton("Guardar");

        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarVenta();
            }

           
    private void eliminarVenta() {
        int idVentas = Integer.parseInt(txtIdVentas.getText());

        try {
            statement.executeUpdate("DELETE FROM Ventas WHERE IdVentas = " + txtIdVentas);
            JOptionPane.showMessageDialog(null, "Venta eliminada exitosamente.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar la venta: " + ex.getMessage());
        }
    }
    
        });
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Eliminar_boton = new javax.swing.JPopupMenu();
        eliminar = new javax.swing.JMenuItem();
        Titulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txtNoProduct = new javax.swing.JTextField();
        txtIDCliente = new javax.swing.JTextField();
        txtNombrecliente = new javax.swing.JTextField();
        txtIdVentas = new javax.swing.JTextField();
        txtNomProducto = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        txtApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaclientes1 = new javax.swing.JTable();
        lblClientes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();
        lblproductos = new javax.swing.JLabel();
        lblVentas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaproductos1 = new javax.swing.JTable();

        Eliminar_boton.setComponentPopupMenu(Eliminar_boton);

        eliminar.setText("ELIMINAR");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        Eliminar_boton.add(eliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion 360");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(46, 46, 46))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Productos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Compras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Proveedores");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 102, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ventas");

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clientes");
        jButton5.setActionCommand("Clientes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(153, 153, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Empleados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Cerrar seccion");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jButton1)
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addGap(38, 38, 38)
                .addComponent(jButton3)
                .addGap(38, 38, 38)
                .addComponent(jButton4)
                .addGap(35, 35, 35)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jButton7)
                .addGap(35, 35, 35)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNoProduct.setEditable(false);
        txtNoProduct.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Producto"));

        txtIDCliente.setEditable(false);
        txtIDCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Cliente"));

        txtNombrecliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del cliente"));
        txtNombrecliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreclienteActionPerformed(evt);
            }
        });

        txtIdVentas.setBorder(javax.swing.BorderFactory.createTitledBorder("ID Venta"));
        txtIdVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdVentasActionPerformed(evt);
            }
        });

        txtNomProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Producto"));

        txtFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });

        txtStock.setBorder(javax.swing.BorderFactory.createTitledBorder("Stock"));
        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        txtTotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        Registrar.setBackground(new java.awt.Color(0, 204, 204));
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Agregar Ventas");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        actualizar.setBackground(new java.awt.Color(0, 153, 153));
        actualizar.setForeground(new java.awt.Color(255, 255, 255));
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(204, 204, 204));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        tablaclientes1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaclientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaclientes1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaclientes1);

        lblClientes.setText("Clientes registrados");

        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaVentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaVentas);

        lblproductos.setText("Productos registrados");

        lblVentas.setText("Registro de Ventas");

        tablaproductos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaproductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaproductos1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaproductos1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Limpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblproductos)
                    .addComponent(lblClientes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(lblVentas))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClientes)
                            .addComponent(lblVentas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblproductos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNoProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIDCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtNomProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizar)
                            .addComponent(Limpiar)
                            .addComponent(Registrar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreclienteActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Prod3();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Comp3();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Proveedor2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Clit1();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Emp3();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtIdVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdVentasActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
       calculototal();
        try{
           PreparedStatement ps=cn.prepareStatement("INSERT INTO ventas(IdVentas, Producto, Cantidad,Fecha,Total,Id_Producto, Nombre_cliente,Apellido_Cliente )VALUES(?,?,?,?,?,?,?,?)");
           ps.setString(1,txtIdVentas.getText());
           ps.setString(2,txtNomProducto.getText());
           ps.setString(3,txtCantidad.getText());
           ps.setString(4,txtFecha.getText());
           ps.setString(5,txtTotal.getText());
           ps.setString(6, txtNoProduct.getText());
           ps.setString(7, txtNombrecliente.getText()); 
           ps.setString(8, txtApellido.getText());
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "Datos guardados.");
           mostrardatosVentas();
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR"+ e);
        }
      
    }//GEN-LAST:event_RegistrarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        limpiardatos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void tablaclientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaclientes1MouseClicked
        int fila= this.tablaclientes1.getSelectedRow();
        this.txtIDCliente.setText(this.tablaclientes1.getValueAt(fila, 0).toString());
        this.txtNombrecliente.setText(this.tablaclientes1.getValueAt(fila, 1).toString());
        this.txtApellido.setText(this.tablaclientes1.getValueAt(fila,2).toString());
    }//GEN-LAST:event_tablaclientes1MouseClicked

    private void tablaproductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaproductos1MouseClicked
        int fila= this.tablaproductos1.getSelectedRow();
        this.txtNoProduct.setText(this.tablaproductos1.getValueAt(fila,0).toString());
        this.txtNomProducto.setText(this.tablaproductos1.getValueAt(fila, 1).toString());
        this.txtStock.setText(this.tablaproductos1.getValueAt(fila, 2).toString());
        this.txtPrecio.setText(this.tablaproductos1.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_tablaproductos1MouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
         char num= evt.getKeyChar();
        if((num<'0'|| num>'9')&&(num<','|| num>'.')){
            JOptionPane.showMessageDialog(null, "Solo puede ingresar números para ejecutar la operación");
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
       
    }//GEN-LAST:event_txtTotalActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        
        try {
           PreparedStatement ps=cn.prepareStatement("UPDATE ventas SET " +
        "IdVentas='" + txtIdVentas.getText() + "', " +
        "Producto='" + txtNomProducto.getText() + "', " +
        "Cantidad='" + txtCantidad.getText() + "', " +
        "Fecha='" + txtFecha.getText() + "', " +
        "Total='" + txtTotal.getText() + "', " +
        "Id_Producto='" + txtNoProduct.getText() + "', " +
        "Nombre_cliente='" + txtNombrecliente.getText() + "', " +
        "Apellido_Cliente='" + txtApellido.getText() + "' " +  // No debe haber una coma después de la última columna
        "WHERE IdVentas='" + txtIdVentas.getText() + "'"
    );
            int indice=ps.executeUpdate();
            if(indice>0){
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS");
                mostrardatosVentas();
                limpiardatos();
            } else {
                JOptionPane.showMessageDialog(null,"NO SELECCIONO FILA");
            }
    }                                            
catch(SQLException e){
                    System.out.println("ERROR AL ACTUALIZAR"+e);
                    }
    }//GEN-LAST:event_actualizarActionPerformed

    private void tablaVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaVentasMouseClicked
         int fila= this.tablaVentas.getSelectedRow();
        this.txtIdVentas.setText(this.tablaVentas.getValueAt(fila,0).toString());
        this.txtNomProducto.setText(this.tablaVentas.getValueAt(fila,1).toString());
        this.txtCantidad.setText(this.tablaVentas.getValueAt(fila,2).toString());
        this.txtFecha.setText(this.tablaVentas.getValueAt(fila,3).toString());
        this.txtTotal.setText(this.tablaVentas.getValueAt(fila,4).toString());
        this.txtNoProduct.setText(this.tablaVentas.getValueAt(fila,5).toString());
        this.txtNombrecliente.setText(this.tablaVentas.getValueAt(fila,6).toString());
        this.txtApellido.setText(this.tablaVentas.getValueAt(fila,7).toString());
        
        
    }//GEN-LAST:event_tablaVentasMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        login alo= new login();
        alo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
         if(JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE ELIMINAR EL REGISTRO?","SALIR", JOptionPane.YES_NO_CANCEL_OPTION)==0){
         try{
             PreparedStatement ps=cn.prepareStatement("DELETE FROM Ventas where IdVentas='"+txtIdVentas.getText()+"'");
             int indice=ps.executeUpdate();
             if(indice>0){
                 mostrardatosVentas();
             } else{
                 System.out.println("no ha seleccionado fila");
             }
         
         } catch(SQLException e){
             System.out.println("ERROR AL ELIMINAR DATO"+e);
         }
     
    }             
    }//GEN-LAST:event_eliminarActionPerformed

     private void Prod3(){
        ProjectF prod = new ProjectF();
        this.setVisible(false);
    }
          private void Comp3(){
        ComprasCRUD compras = new ComprasCRUD();
        compras.setVisible(true);
        this.setVisible(false);
    }
          private void Proveedor2(){
        Proveedor prov = new Proveedor();
        prov.setVisible(true);
        this.setVisible(false);
    }
         
          private void Clit1(){
       ClienteCRUD Clt = new ClienteCRUD();
        Clt.setVisible(true);
        this.setVisible(false);
    }
    
         
           private void Emp3(){
        Empleado Emp= new Empleado();
        Emp.setVisible(true);
        this.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
   
           
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentasCRUD().setVisible(true);
            }
        });
    }

       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu Eliminar_boton;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Registrar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton actualizar;
    private javax.swing.JMenuItem eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblClientes;
    private javax.swing.JLabel lblVentas;
    private javax.swing.JLabel lblproductos;
    private javax.swing.JTable tablaVentas;
    private javax.swing.JTable tablaclientes1;
    private javax.swing.JTable tablaproductos1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDCliente;
    private javax.swing.JTextField txtIdVentas;
    private javax.swing.JTextField txtNoProduct;
    private javax.swing.JTextField txtNomProducto;
    private javax.swing.JTextField txtNombrecliente;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables

     public VentasCRUD(Connection connection) {
        this.cn = connection;
    }
     
    private void mostrardatosClientes(){
       DefaultTableModel modeloclientes= new DefaultTableModel();
       modeloclientes.addColumn("id");
       modeloclientes.addColumn("Nombre");
       modeloclientes.addColumn("Apellido");
       tablaclientes1.setModel(modeloclientes);
       String consultacliente= "SELECT IdCliente, Nombre, Apellido from cliente";
       String[] data= new String[3];
       Statement st;
       try{
         st=cn.createStatement();
           ResultSet rs=st.executeQuery(consultacliente);
           while(rs.next()){
               data[0]=rs.getString(1);
               data[1]=rs.getString(2);
               data[2]=rs.getString(3); 
               modeloclientes.addRow(data);
       }
           
       }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR DATOS"+e);
       }
    }
       
       private void mostrardatosProductos(){
           DefaultTableModel modeloproductos= new DefaultTableModel();
           modeloproductos.addColumn("Id producto");
           modeloproductos.addColumn("Nombre");
           modeloproductos.addColumn("Stock");
           modeloproductos.addColumn("Precio");
           tablaproductos1.setModel(modeloproductos);
           String consultaproductos="SELECT Id_Producto, Nombre, Stock, Precio from Productos";
           String[]data=new String[4];
           Statement st;
           try{
               st=cn.createStatement();
               ResultSet rs=st.executeQuery(consultaproductos);
               while(rs.next()){
                   data[0]=rs.getString(1);
                   data[1]=rs.getString(2);
                   data[2]=rs.getString(3);
                   data[3]=rs.getString(4);
                   modeloproductos.addRow(data);
                   
               }
                         
           } catch(SQLException e){
               JOptionPane.showMessageDialog(null, "ERROR DE CONEXION"+e);
           }
           
       }
       
       private void mostrardatosVentas(){
           DefaultTableModel modeloventas = new DefaultTableModel();
           modeloventas.addColumn("Venta");
           modeloventas.addColumn("Producto");
           modeloventas.addColumn("Cantidad");
           modeloventas.addColumn("Fecha");
           modeloventas.addColumn("Total");
           modeloventas.addColumn("Id producto");
           modeloventas.addColumn("Cliente");
           modeloventas.addColumn("Apellido");
           tablaVentas.setModel(modeloventas);
           String consultaventas="SELECT IdVentas, Producto, Cantidad, Fecha, Total,Id_Producto, Nombre_cliente, Apellido_Cliente from ventas";
           String [] data= new String[8];
           Statement st;
       try {
           st=cn.createStatement();
           ResultSet rs=st.executeQuery(consultaventas);
           while(rs.next()){
               data[0]=rs.getString(1);
               data[1]=rs.getString(2);
               data[2]=rs.getString(3);
               data[3]=rs.getString(4);
               data[4]=rs.getString(5);
               data[5]=rs.getString(6);
               data[6]=rs.getString(7);
               data[7]=rs.getString(8);
               modeloventas.addRow(data); 
           }   
       }catch (SQLException e){
                   System.out.println("ERROR al mostrar datos"+e);
                   }
       
    }
       
       private void calculototal(){
          Metodos met = new Metodos();
          double totalapagar=met.multiplicar(Double.parseDouble(txtPrecio.getText()), Double.parseDouble(txtCantidad.getText()));
          txtTotal.setText(totalapagar+"");
       }
       private void limpiardatos(){
           txtNoProduct.setText("");
           txtIDCliente.setText("");
           txtIdVentas.setText("");
           txtNomProducto.setText("");
           txtFecha.setText("");
           txtCantidad.setText("");
           txtPrecio.setText("");
           txtStock.setText("");
           txtTotal.setText("");
           txtNombrecliente.setText("");
           txtApellido.setText("");
       }

    private static class ProjectF {

        public ProjectF() {
        }
    }


       }
    
    
