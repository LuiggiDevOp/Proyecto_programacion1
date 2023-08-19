
package proyectofinal;

/*import java.lang.System.Logger;
import java.lang.System.Logger.Level;*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Empleado extends javax.swing.JFrame {

    private Connection connection;
    private Statement statement;
    
    ConexionMYSQL con = new ConexionMYSQL();
    java.sql.Connection cn = ConexionMYSQL.conectar();
    public Empleado() {
        initComponents();
        mostrarDatos();
                try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:33065/pruebaproyecto", "root", "");
        statement = connection.createStatement();
    } catch (SQLException ex) {
            // Manejo de errores al establecer la conexión o crear el statement

    }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        campoTelefono = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        campoIDempresa = new javax.swing.JTextField();
        campoID = new javax.swing.JTextField();
        campoCargo = new javax.swing.JTextField();
        campoSalario = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleado = new javax.swing.JTable();
        campoApellido = new javax.swing.JTextField();
        campoFIngreso = new javax.swing.JTextField();
        campoCodDepto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion 360");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/WhatsApp Image 2023-08-18 at 9.11.36 PM.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(87, 87, 87))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jButton4.setBackground(new java.awt.Color(153, 153, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Ventas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 255));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clientes");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 102, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Empleados");

        jButton8.setText("Cerrar sesion");
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
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(31, 31, 31)
                .addComponent(jButton4)
                .addGap(35, 35, 35)
                .addComponent(jButton5)
                .addGap(34, 34, 34)
                .addComponent(jButton7)
                .addGap(37, 37, 37)
                .addComponent(jButton8)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        campoTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefono"));
        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        campoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));

        campoIDempresa.setBorder(javax.swing.BorderFactory.createTitledBorder("ID de empresa"));

        campoID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID"));
        campoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIDActionPerformed(evt);
            }
        });

        campoCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));

        campoSalario.setText(" ");
        campoSalario.setBorder(javax.swing.BorderFactory.createTitledBorder("Salario"));
        campoSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalarioActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(0, 204, 204));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar Empleado");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnActualizar.setBackground(new java.awt.Color(0, 102, 102));
        btnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tablaEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Empleado", "Nombre", "Apellido", "Telefono", "Salario", "Fecha de Ingreso", "Cargo", "ID empresa", "Codigo departamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEmpleado);

        campoApellido.setText(" ");
        campoApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("Apellido"));

        campoFIngreso.setText(" ");
        campoFIngreso.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha de ingreso"));

        campoCodDepto.setText(" ");
        campoCodDepto.setBorder(javax.swing.BorderFactory.createTitledBorder("Codigo de departamento"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombre)
                            .addComponent(campoSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(campoIDempresa))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCodDepto, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                            .addComponent(campoFIngreso)
                            .addComponent(campoApellido))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addComponent(btnLimpiar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(145, 145, 145)
                .addComponent(btnEliminar)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoIDempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoCodDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(btnAgregar)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campoFIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(btnLimpiar)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar)
                            .addComponent(btnEliminar)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void campoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Prod5();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Comp5();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Proveedor5();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Vents5();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Clit5();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void campoSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSalarioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

Eliminarcampo();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try{
           
             PreparedStatement ps = cn.prepareStatement("UPDATE empleado SET " +
        "IdEmp='" + campoID.getText() + "', " +
        "NombreEmp='" + campoNombre.getText() + "', " +
        "ApellidoEmp='" + campoApellido.getText() + "', " +
        "Telefono='" + campoTelefono.getText() + "', " +
        "Salario='" + campoSalario.getText() + "', " +
        "Fecha_Ing='" + campoFIngreso.getText() + "', " +
        "Cargo='" + campoCargo.getText() + "', " +  
        "Id_Empresa='" + campoIDempresa.getText() + "', " +
        "Cod_Dep1='" + campoCodDepto.getText() + "' " +
        "WHERE IdEmp='" + campoID.getText() + "'"
            );
            int indice= ps.executeUpdate();

            if (indice > 0){
                JOptionPane.showMessageDialog(rootPane,"Datos Actualizados Correctamente");
                mostrarDatos();
                limpiarcampos();

            }else{
                JOptionPane.showMessageDialog(rootPane,"Selccione una fila");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Error al actualizar datos " + ex);

        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
limpiarcampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
Agregarcampo();        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        login alo= new login();
        alo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadoMouseClicked
       
        
        btnAgregar.setEnabled(false);
        btnActualizar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        btnEliminar.setEnabled(true);
        int fila= this.tablaEmpleado.getSelectedRow();
        this.campoID.setText(this.tablaEmpleado.getValueAt(fila, 0).toString());
        this.campoNombre.setText(this.tablaEmpleado.getValueAt(fila, 1).toString());
        this.campoApellido.setText(this.tablaEmpleado.getValueAt(fila, 2).toString());
        this.campoTelefono.setText(this.tablaEmpleado.getValueAt(fila, 3).toString());
        this.campoSalario.setText(this.tablaEmpleado.getValueAt(fila, 4).toString());
        this.campoFIngreso.setText(this.tablaEmpleado.getValueAt(fila, 5).toString());
        this.campoCargo.setText(this.tablaEmpleado.getValueAt(fila, 6).toString());
        this.campoIDempresa.setText(this.tablaEmpleado.getValueAt(fila, 7).toString());
        this.campoCodDepto.setText(this.tablaEmpleado.getValueAt(fila, 8).toString());
        
    }//GEN-LAST:event_tablaEmpleadoMouseClicked
        
     private void Prod5(){
        Almacen prod = new Almacen();
        prod.setVisible(true);
        this.setVisible(false);
    }
          private void Comp5(){
        ComprasCRUD compras = new ComprasCRUD();
        compras.setVisible(true);
        this.setVisible(false);
    }
          private void Proveedor5(){
        Proveedor prov = new Proveedor();
        prov.setVisible(true);
        this.setVisible(false);
    }
          private void Vents5(){
        VentasCRUD vent = new VentasCRUD();
        vent.setVisible(true);
        this.setVisible(false);
    }
          private void Clit5(){
       ClienteCRUD Clt = new ClienteCRUD();
        Clt.setVisible(true);
        this.setVisible(false);
    }
    
 
           private void Empl(){
        Empleado Emp= new Empleado();
        Emp.setVisible(true);
        this.setVisible(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Empleado().setVisible(true);
            }
        });
    }

        
   private void mostrarDatos() {

      DefaultTableModel modelo=new DefaultTableModel();
      modelo.addColumn("ID");
      modelo.addColumn("Nombre  ");
      modelo.addColumn("Apellido");
      modelo.addColumn("Telefono");
      modelo.addColumn("Salario ");
      modelo.addColumn("Fecha de ingreso");
      modelo.addColumn(" Cargo ");
      modelo.addColumn(" ID de empresa ");
      modelo.addColumn(" Codigo de departamento ");
     tablaEmpleado.setModel(modelo);
     String consultasql="select*from empleado";
     String data[]= new String[13];
     
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
         
     }catch (SQLException e){
      
         System.out.println("Datos no encontrados"+ e);
         
     }
    }
   
       private void limpiarcampos() {

        campoID.setText("");
        campoNombre.setText("");
        campoApellido.setText("");
        campoTelefono.setText("");
        campoSalario.setText("");
        campoFIngreso.setText("");
        campoCargo.setText("");
        campoIDempresa.setText("");
        campoCodDepto.setText("");
        campoID.requestFocus();
        btnAgregar.setEnabled(true);

    }
       
           private void Eliminarcampo() {

    if (JOptionPane.showConfirmDialog(rootPane, "Se eliminara el registro, desea continuar?", "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                String Borrar = "DELETE FROM empleado WHERE IdEmp ='" + campoID.getText() + "';";
                PreparedStatement ps;
                ps = (PreparedStatement) cn.prepareStatement(Borrar);
                int respuesta = ps.executeUpdate();
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
                    limpiarcampos();
                    mostrarDatos();
                    campoID.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila a ser borrada.");
                    limpiarcampos();
                    mostrarDatos();
                    campoID.requestFocus();
                }
            } catch (SQLException e) {
                System.err.println("Error al eliminar...." + e);
                JOptionPane.showMessageDialog(null, "Error al eliminar!");
            }

        } else {
            limpiarcampos();
            mostrarDatos();
            btnActualizar.setEnabled(false);
            btnEliminar.setEnabled(false);
            btnAgregar.setEnabled(true);
            campoID.requestFocus();
    
    }
    }
           
               private void Agregarcampo() {
        
        
        String insertarSQL = "INSERT INTO empleado(IdEmp, NombreEmp, ApellidoEmp, Telefono, Salario, Fecha_Ing,Cargo, Id_Empresa, Cod_Dep1) VALUES (?,?,?,?,?,?,?,?,?);";
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cn.prepareStatement(insertarSQL);
            ps.setInt(1, Integer.parseInt(campoID.getText()));
            ps.setString(2, campoNombre.getText());
            ps.setString(3, campoApellido.getText());
            ps.setString(4, campoTelefono.getText());
            ps.setString(5, campoSalario.getText());
            ps.setString(6, campoFIngreso.getText());
            ps.setString(7, campoCargo.getText());
            ps.setString(8, campoIDempresa.getText());
            ps.setString(9, campoCodDepto.getText());
          
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro realizado con exito.");
 
            mostrarDatos();
            limpiarcampos();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + ex);
        }
        
        }

    public class MiClase extends JFrame {
    private JTable tablaEmpleado;
    private JTextField campoID;
    private JTextField campoNombre;
    private JTextField campoApellido;
    private JTextField campoTelefono;
    private JTextField campoSalario;
    private JTextField campoFIngreso;
    private JTextField campoCargo;
    private JTextField campoIDempresa;
    private JTextField campoCodDepto;

    public MiClase() {
        // Código para inicializar los componentes de la interfaz gráfica de usuario

        // Agregar evento MouseListener a la tablaEmpleado
        tablaEmpleado.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                int fila = tablaEmpleado.getSelectedRow();
                if (fila >= 0) {
tablaEmpleado.addMouseListener(new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent e) {
        int fila = tablaEmpleado.getSelectedRow();
        campoID.setText(tablaEmpleado.getValueAt(fila, 0).toString());
        campoNombre.setText(tablaEmpleado.getValueAt(fila, 1).toString());
        campoApellido.setText(tablaEmpleado.getValueAt(fila, 2).toString());
        campoTelefono.setText(tablaEmpleado.getValueAt(fila, 3).toString());
        campoSalario.setText(tablaEmpleado.getValueAt(fila, 4).toString());
        campoFIngreso.setText(tablaEmpleado.getValueAt(fila, 5).toString());
        campoCargo.setText(tablaEmpleado.getValueAt(fila, 6).toString());
        campoIDempresa.setText(tablaEmpleado.getValueAt(fila, 7).toString());
        campoCodDepto.setText(tablaEmpleado.getValueAt(fila, 8).toString());
    }

    // Resto de los métodos del MouseListener no implementados
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
});

                }
            }
        });
    }

    private String getValorCelda(int fila, int columna) {
        Object valor = tablaEmpleado.getValueAt(fila, columna);
        return (valor != null) ? valor.toString() : "";
        
    }
    
}

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JTextField campoCodDepto;
    private javax.swing.JTextField campoFIngreso;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoIDempresa;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoSalario;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEmpleado;
    // End of variables declaration//GEN-END:variables
}
