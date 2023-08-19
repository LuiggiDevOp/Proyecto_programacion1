/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gamers
 */
public class ComprasCRUD extends JFrame {
    
    private Connection connection;
    private Statement statement;
    
    ConexionMYSQL con = new ConexionMYSQL();
    java.sql.Connection cn = con.conectar();

    public ComprasCRUD() {
      initComponents();
      mostrarDatos();
        
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:33065/pruebaproyecto", "root", "");
        statement = connection.createStatement();
    } catch (SQLException ex) {
        // Manejo de errores al establecer la conexión o crear el statement
        ex.printStackTrace();
    }
        
    };
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdCompra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPrecioUnitario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        bntagregarcompra = new javax.swing.JButton();
        bntlimpiarcampos = new javax.swing.JButton();
        bnteliminar = new javax.swing.JButton();
        txtidcliente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacompras = new javax.swing.JTable();
        fecha = new javax.swing.JFormattedTextField();
        bntactualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestion 360");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2023-08-18 at 9.11.36 PM.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
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
        jButton2.setText("Proveedores");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(153, 153, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ventas");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Clientes");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Empleados");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Compras");

        jButton5.setText("Cerrar seccion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(28, 28, 28)
                .addComponent(jButton4)
                .addGap(30, 30, 30)
                .addComponent(jButton6)
                .addGap(26, 26, 26)
                .addComponent(jButton5)
                .addGap(46, 46, 46))
        );

        jLabel2.setText("ID Producto");

        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        jLabel4.setText("ID de Compras");

        txtIdCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCompraActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre de Producto");

        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("Stock");

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Cliente");

        jLabel8.setText("Cantidad");

        jLabel9.setText("Precio Unitario");

        jLabel10.setText("Total");

        bntagregarcompra.setBackground(new java.awt.Color(51, 255, 204));
        bntagregarcompra.setForeground(new java.awt.Color(255, 255, 255));
        bntagregarcompra.setText("Agregar Compra");
        bntagregarcompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntagregarcompraActionPerformed(evt);
            }
        });

        bntlimpiarcampos.setBackground(new java.awt.Color(153, 153, 153));
        bntlimpiarcampos.setText("Limpiar Campos");
        bntlimpiarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntlimpiarcamposActionPerformed(evt);
            }
        });

        bnteliminar.setBackground(new java.awt.Color(255, 0, 0));
        bnteliminar.setForeground(new java.awt.Color(255, 255, 255));
        bnteliminar.setText("Eliminar");
        bnteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnteliminarActionPerformed(evt);
            }
        });

        txtidcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidclienteActionPerformed(evt);
            }
        });

        jLabel11.setText("Fecha");

        tablacompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "ID Compras", "ID Cliente", "ID Producto", "Producto", "Cantidad", "Stock", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablacompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablacomprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablacompras);

        bntactualizar.setBackground(new java.awt.Color(0, 153, 153));
        bntactualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntactualizar.setText("Actualizar");
        bntactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8)))
                                    .addComponent(jLabel11))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                        .addComponent(bntagregarcompra))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(bntlimpiarcampos)))
                                .addGap(31, 31, 31))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(210, 210, 210)
                                        .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(423, 423, 423)
                .addComponent(bntactualizar)
                .addGap(142, 142, 142)
                .addComponent(bnteliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(bntagregarcompra)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtIdCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtidcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bntlimpiarcampos)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bntactualizar)
                            .addComponent(bnteliminar))))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtIdCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdCompraActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Prod2();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Proveedor1();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Vents2();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Clit1();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Emp2();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bnteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnteliminarActionPerformed
       
       eliminarcompra(); 
    }//GEN-LAST:event_bnteliminarActionPerformed

    private void bntagregarcompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntagregarcompraActionPerformed
        
        agregarproveedor();
        mostrarDatos();

    }//GEN-LAST:event_bntagregarcompraActionPerformed

    private void txtidclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidclienteActionPerformed

    private void tablacomprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablacomprasMouseClicked

        bntagregarcompra.setEnabled(true);
        bntlimpiarcampos.setEnabled(true);
        bnteliminar.setEnabled(true);
        int fila = this.tablacompras.getSelectedRow();
        this.txtIdCompra.setText(this.tablacompras.getValueAt(fila, 0).toString());
        this.fecha.setText(this.tablacompras.getValueAt(fila, 1).toString());
        this.txtTotal.setText(this.tablacompras.getValueAt(fila, 2).toString());
        this.txtidcliente.setText(this.tablacompras.getValueAt(fila, 3).toString());
        this.txtIdProducto.setText(this.tablacompras.getValueAt(fila, 4).toString());
        this.txtNombreProducto.setText(this.tablacompras.getValueAt(fila, 5).toString());
        this.txtPrecioUnitario.setText(this.tablacompras.getValueAt(fila, 6).toString());
        this.txtCantidad.setText(this.tablacompras.getValueAt(fila, 7).toString());
        this.txtStock.setText(this.tablacompras.getValueAt(fila, 8).toString());
        
    }//GEN-LAST:event_tablacomprasMouseClicked

    private void bntlimpiarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntlimpiarcamposActionPerformed
       limpiarpantalla();
    }//GEN-LAST:event_bntlimpiarcamposActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        login alo= new login();
        alo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void bntactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntactualizarActionPerformed

        actualizarcompra();
    }//GEN-LAST:event_bntactualizarActionPerformed
        
    //LLamada de las diferentes ventanas del programa.
    private void Prod2(){
        Almacen prod = new Almacen();
        prod.setVisible(true);
        this.setVisible(false);
    }
          private void Proveedor1(){
        Proveedor prov = new Proveedor();
        prov.setVisible(true);
        this.setVisible(false);
    }
          private void Vents2(){
        VentasCRUD vent = new VentasCRUD();
        vent.setVisible(true);
        this.setVisible(false);
    }
          private void Clit1(){
       ClienteCRUD Clt = new ClienteCRUD();
        Clt.setVisible(true);
        this.setVisible(false);
    }
    
           private void Emp2(){
        Empleado Emp= new Empleado();
        Emp.setVisible(true);
        this.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    
           //Metodo Main del sistema.
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ComprasCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntactualizar;
    private javax.swing.JButton bntagregarcompra;
    private javax.swing.JButton bnteliminar;
    private javax.swing.JButton bntlimpiarcampos;
    private javax.swing.JFormattedTextField fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablacompras;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtIdCompra;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioUnitario;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtidcliente;
    // End of variables declaration//GEN-END:variables

    
    ///Metodos
    
private void mostrarDatos() {

      DefaultTableModel modelo=new DefaultTableModel();
      modelo.addColumn("IdCompras");
       modelo.addColumn(" Fecha");
      modelo.addColumn(" Total");
      modelo.addColumn("Id_Cliente");
      modelo.addColumn(" Id_Producto");
      modelo.addColumn(" Nombre_Producto ");
      modelo.addColumn(" Precio_Unitario ");
      modelo.addColumn(" Cantidad");      
      modelo.addColumn(" Stock");
     tablacompras.setModel(modelo);
     String consultasql="select*from compras";
     String data[]= new String[9];
     
     Statement st;  
   
      try{
         
         st = cn.createStatement();
         ResultSet rs = st.executeQuery(consultasql);
         while(rs.next()){
             data[0]=rs.getString(1);
             data[1]=rs.getString(2);
             data[2]=rs.getString(3);
             data[3]=rs.getString(4);
             data[4]=rs.getString(5);
             data[5]=rs.getString(6);
             data[6]=rs.getString(7);
             data[7]=rs.getString(8);
             data[8]=rs.getString(9);
             
             modelo.addRow(data);
             
         }
         tablacompras.setModel(modelo);
     }catch (SQLException e){
      
         System.out.println("Datos no encontrados"+ e);
         
     }
    }
    
    
    private void limpiarpantalla() {

        txtIdProducto.setText("");
        txtTotal.setText("");
        txtIdCompra.setText("");
        txtNombreProducto.setText("");
        fecha.setText("");
        txtCantidad.setText("");
        txtPrecioUnitario.setText("");
        txtIdProducto.requestFocus(); 
        txtidcliente.setText("");
        txtStock.setText("");
    };

    private void agregarproveedor() {

         String insertarSQL = "INSERT INTO compras(IdCompras,Fecha,Id_Producto, Nombre_Producto,Cantidad,Stock,Id_Cliente,Precio_Unitario, Total) VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cn.prepareStatement(insertarSQL);
            ps.setInt(1, Integer.parseInt(txtIdCompra.getText()));
            ps.setString(2, fecha.getText());
            ps.setInt(3, Integer.parseInt(txtIdProducto.getText()));
            ps.setString(4, txtNombreProducto.getText());
            ps.setInt(5, Integer.parseInt(txtCantidad.getText()));
            ps.setInt(6, Integer.parseInt(txtStock.getText()));
            ps.setInt(7, Integer.parseInt(txtidcliente.getText()));
            ps.setInt(8, Integer.parseInt(txtPrecioUnitario.getText()));
            ps.setInt(9, Integer.parseInt(txtTotal.getText()));
            
          
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro realizado con exito.");
            mostrarDatos();
            limpiarpantalla();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + ex);
        }
        
    };

    private void eliminarcompra() {
        
          if (JOptionPane.showConfirmDialog(rootPane, "Se eliminara el registro, desea continuar?", "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                String Borrar = "DELETE FROM compras WHERE IdCompras   ='" + txtIdCompra.getText() + "'";
                PreparedStatement ps;
                ps = (PreparedStatement) cn.prepareStatement(Borrar);
                int respuesta = ps.executeUpdate();
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
                    limpiarpantalla();
                    mostrarDatos();
                    txtIdProducto.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila a ser borrada.");
                    limpiarpantalla();
                    mostrarDatos();
                    txtIdProducto.requestFocus();
                }
            } catch (SQLException e) {
                System.err.println("Error al eliminar...." + e);
                JOptionPane.showMessageDialog(null, "Error al eliminar!");
            }

        } else {
            limpiarpantalla();
            mostrarDatos();
            bntagregarcompra.setEnabled(true);
            bntlimpiarcampos.setEnabled(true);
            bnteliminar.setEnabled(true);
            txtIdProducto.requestFocus();
    
    }
    }

    private void actualizarcompra() {


        try{
            PreparedStatement ps = cn.prepareStatement("UPDATE compras SET " +
        "IdCompras='" + txtIdCompra.getText() + "', " +
        "Fecha='" + fecha.getText() + "', " +
        "Total'=" + txtTotal.getText() + "', " +
        "Id_Cliente='" + txtidcliente.getText() + "', " +
        "Id_Producto='" + txtIdProducto.getText() + "', " +
        "Nombre_Producto='" + txtNombreProducto.getText() + "', " +
        "Precio_Unitario='" + txtPrecioUnitario.getText() + "', " +
        "Cantidad='" + txtCantidad.getText() + "', " +
        "Stock='" + txtStock.getText() + "' " +  // No debe haber una coma después de la última columna
        "WHERE IdCompras='" + txtIdCompra.getText() + "'"
            );
            int indice= ps.executeUpdate();

            if (indice > 0){
                JOptionPane.showMessageDialog(rootPane,"Datos Actualizados Correctamente");
                mostrarDatos();
                limpiarpantalla();

            }else{
                JOptionPane.showMessageDialog(rootPane,"Selccione una fila");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error al actualizar datos " + ex);

        }

    }


};
