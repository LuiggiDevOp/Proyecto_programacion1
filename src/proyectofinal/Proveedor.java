/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;

/*import java.lang.System.Logger;
import java.lang.System.Logger.Level;*/
import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;
import java.sql.ResultSet; 

/**
 *
 * @author Gamers
 */
public class Proveedor extends javax.swing.JFrame {
    
    private Connection connection;
    private Statement statement;
    
    ConexionMYSQL con = new ConexionMYSQL();
    java.sql.Connection cn = con.conectar();
    
    public Proveedor() {
        initComponents();
        mostrarDatos();
        
        try {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:33065/pruebaproyecto", "root", "");
        statement = connection.createStatement();
    } catch (SQLException ex) {
        // Manejo de errores al establecer la conexión o crear el statement
        ex.printStackTrace();
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label4 = new java.awt.Label();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtcodigoproveedor = new java.awt.TextField();
        txtnombreempresa = new java.awt.TextField();
        label2 = new java.awt.Label();
        txttelefono = new java.awt.TextField();
        label3 = new java.awt.Label();
        txtdireccion = new java.awt.TextField();
        jPanel2 = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        label5 = new java.awt.Label();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        button6 = new java.awt.Button();
        jButton8 = new javax.swing.JButton();
        label6 = new java.awt.Label();
        txtrnc = new java.awt.TextField();
        label7 = new java.awt.Label();
        txtcorreo = new java.awt.TextField();
        bntagregarproveedor = new javax.swing.JButton();
        bntactualizar = new javax.swing.JButton();
        bntlimpiarpantalla = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtableproveedores = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcodigoempresa = new javax.swing.JTextField();
        bnteliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        label4.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("System Max Invent");

        jButton5.setText("Cerrar seccion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(8, 8, 8)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proveedores");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setText("Nombre Empresa");

        txtcodigoproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoproveedorActionPerformed(evt);
            }
        });

        label2.setText("Telefono");

        label3.setName(""); // NOI18N
        label3.setText("Direccion");

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        button1.setBackground(new java.awt.Color(153, 153, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Productos");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label5.setBackground(new java.awt.Color(255, 102, 0));
        label5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("          Proveedor");

        button2.setBackground(new java.awt.Color(153, 153, 255));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setLabel("Compras");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(153, 153, 255));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setLabel("Ventas");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(153, 153, 255));
        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setLabel("Clientes");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        button6.setBackground(new java.awt.Color(153, 153, 255));
        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setLabel("Empleados");
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(button2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton8)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        label6.setText("RNC");

        label7.setText("Correo");

        bntagregarproveedor.setBackground(new java.awt.Color(0, 204, 204));
        bntagregarproveedor.setForeground(new java.awt.Color(255, 255, 255));
        bntagregarproveedor.setText("Agregar Proveedor");
        bntagregarproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntagregarproveedorMouseClicked(evt);
            }
        });
        bntagregarproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntagregarproveedorActionPerformed(evt);
            }
        });

        bntactualizar.setBackground(new java.awt.Color(0, 153, 153));
        bntactualizar.setForeground(new java.awt.Color(255, 255, 255));
        bntactualizar.setText("Actualizar");
        bntactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntactualizarActionPerformed(evt);
            }
        });

        bntlimpiarpantalla.setBackground(new java.awt.Color(153, 153, 153));
        bntlimpiarpantalla.setText("Limpiar Campos");
        bntlimpiarpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntlimpiarpantallaActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Proveedores", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        Jtableproveedores.setBackground(new java.awt.Color(204, 204, 204));
        Jtableproveedores.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Jtableproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RNC", "Codigo Proveedor", "Telefono", "Empresa", "Direccion ", "Codigo empresa", "Correo"
            }
        ));
        Jtableproveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtableproveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JtableproveedoresMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Jtableproveedores);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 987, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jLabel2.setText("Codigo Proveedor");

        jLabel3.setText("Codigo Empresa ");

        txtcodigoempresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoempresaActionPerformed(evt);
            }
        });

        bnteliminar.setBackground(new java.awt.Color(255, 51, 51));
        bnteliminar.setForeground(new java.awt.Color(255, 255, 255));
        bnteliminar.setText("Elimiar");
        bnteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnteliminarActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Georgia", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gestion 360");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4)
                .addContainerGap(946, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(227, 227, 227)
                                            .addComponent(jLabel3)
                                            .addGap(97, 97, 97))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtrnc, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                                                    .addComponent(txtcodigoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(59, 59, 59))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(100, 100, 100)
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(txtcodigoempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(txtnombreempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bntagregarproveedor)
                                .addGap(65, 65, 65)
                                .addComponent(bntactualizar)
                                .addGap(50, 50, 50)
                                .addComponent(bnteliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(bntlimpiarpantalla)
                                .addGap(39, 39, 39)))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigoproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtnombreempresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigoempresa))))
                .addGap(38, 38, 38)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntagregarproveedor)
                    .addComponent(bntactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnteliminar)
                    .addComponent(bntlimpiarpantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void bntagregarproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntagregarproveedorActionPerformed
        agregarproveedor();
    }//GEN-LAST:event_bntagregarproveedorActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        Empl();
    }//GEN-LAST:event_button6ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        Clit();
    }//GEN-LAST:event_button4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        Vents1();
    }//GEN-LAST:event_button3ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        Comp();
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        Prod();
    }//GEN-LAST:event_button1ActionPerformed

    private void bntactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntactualizarActionPerformed

        try{
            PreparedStatement ps = cn.prepareStatement("Update proveedor set Id_Proveedor='"+txtcodigoproveedor.getText()+"',Nombre_Empresa='"+txtnombreempresa.getText()+"',RNC='"+txtrnc.getText()+"',Direccion_Empresa='"+txtdireccion.getText()+"',Telefono='"+txttelefono.getText()+"',Correo='"+txtcorreo.getText()+"',Id_Empresa2='"+txtcodigoempresa.getText());
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

        }
      
    }//GEN-LAST:event_bntactualizarActionPerformed

    private void txtcodigoempresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoempresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoempresaActionPerformed

    private void bntlimpiarpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntlimpiarpantallaActionPerformed

        limpiarcampos();
        
    }//GEN-LAST:event_bntlimpiarpantallaActionPerformed

    private void JtableproveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableproveedoresMouseClicked

        bntagregarproveedor.setEnabled(false);
        bntactualizar.setEnabled(true);
        bntlimpiarpantalla.setEnabled(true);
        int fila= this.Jtableproveedores.getSelectedRow();
        this.txtcodigoproveedor.setText(this.Jtableproveedores.getValueAt(fila, 0).toString());
        this.txtnombreempresa.setText(this.Jtableproveedores.getValueAt(fila, 1).toString());
        this.txtrnc.setText(this.Jtableproveedores.getValueAt(fila, 2).toString());
        this.txtdireccion.setText(this.Jtableproveedores.getValueAt(fila, 3).toString());
        this.txttelefono.setText(this.Jtableproveedores.getValueAt(fila, 4).toString());
        this.txtcorreo.setText(this.Jtableproveedores.getValueAt(fila, 5).toString());
        this.txtcodigoempresa.setText(this.Jtableproveedores.getValueAt(fila, 6).toString());
        
    }//GEN-LAST:event_JtableproveedoresMouseClicked

    private void bnteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnteliminarActionPerformed
        
        EliminarProveedor();
        limpiarcampos();
        mostrarDatos();
        bntactualizar.setEnabled(true);
        bnteliminar.setEnabled(true);
        bntagregarproveedor.setEnabled(true);
        txtcodigoempresa.requestFocus();

        
    }//GEN-LAST:event_bnteliminarActionPerformed

    private void bntagregarproveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntagregarproveedorMouseClicked
        
        
    }//GEN-LAST:event_bntagregarproveedorMouseClicked

    private void txtcodigoproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoproveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoproveedorActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
        
        
    }//GEN-LAST:event_formMouseClicked

    private void JtableproveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtableproveedoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JtableproveedoresMouseEntered

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        login alo= new login();
        alo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed
          private void Prod(){
        Almacen prod = new Almacen();
        prod.setVisible(true);
        this.setVisible(false);
    }
          private void Comp(){
        ComprasCRUD compras = new ComprasCRUD();
        compras.setVisible(true);
        this.setVisible(false);
    }
          private void Vents1(){
        VentasCRUD vent = new VentasCRUD();
        vent.setVisible(true);
        this.setVisible(false);
    }
          private void Clit(){
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
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtableproveedores;
    private javax.swing.JButton bntactualizar;
    private javax.swing.JButton bntagregarproveedor;
    private javax.swing.JButton bnteliminar;
    private javax.swing.JButton bntlimpiarpantalla;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button6;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTextField txtcodigoempresa;
    private java.awt.TextField txtcodigoproveedor;
    private java.awt.TextField txtcorreo;
    private java.awt.TextField txtdireccion;
    private java.awt.TextField txtnombreempresa;
    private java.awt.TextField txtrnc;
    private java.awt.TextField txttelefono;
    // End of variables declaration//GEN-END:variables

    
    
   private void mostrarDatos() {

      DefaultTableModel modelo=new DefaultTableModel();
      modelo.addColumn("Id Proveedor");
      modelo.addColumn("Nombre Empresa ");
      modelo.addColumn("RNC");
      modelo.addColumn(" Direccion");
      modelo.addColumn(" Telefono ");
      modelo.addColumn(" Correo ");
      modelo.addColumn(" Codigo Empresa ");
     Jtableproveedores.setModel(modelo);
     String consultasql="select*from proveedor";
     String data[]= new String[10];
     
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
             
             modelo.addRow(data);
             
         }
         
     }catch (SQLException e){
      
         System.out.println("Datos no encontrados"+ e);
         
     }
    }

    private void limpiarcampos() {

        txtrnc.setText("");
        txtdireccion.setText("");
        txtcodigoempresa.setText("");
        txtnombreempresa.setText("");
        txttelefono.setText("");
        txtcorreo.setText("");
        txtcodigoproveedor.setText("");
        txtcodigoempresa.requestFocus();
        txtcodigoempresa.requestFocus();

    }

    private void EliminarProveedor() {

    if (JOptionPane.showConfirmDialog(rootPane, "Se eliminara el registro, desea continuar?", "Eliminar Registro",
                JOptionPane.WARNING_MESSAGE, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                String Borrar = "DELETE FROM proveedor WHERE Id_Proveedor ='" + txtcodigoproveedor.getText() + "'";
                PreparedStatement ps;
                ps = (PreparedStatement) cn.prepareStatement(Borrar);
                int respuesta = ps.executeUpdate();
                if (respuesta > 0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado con exito!");
                    limpiarcampos();
                    mostrarDatos();
                    txtcodigoempresa.requestFocus();
                } else {
                    JOptionPane.showMessageDialog(null, "No ha seleccionado la fila a ser borrada.");
                    limpiarcampos();
                    mostrarDatos();
                    txtcodigoempresa.requestFocus();
                }
            } catch (SQLException e) {
                System.err.println("Error al eliminar...." + e);
                JOptionPane.showMessageDialog(null, "Error al eliminar!");
            }

        } else {
            limpiarcampos();
            mostrarDatos();
            bntactualizar.setEnabled(false);
            bnteliminar.setEnabled(false);
            bntagregarproveedor.setEnabled(true);
            txtcodigoempresa.requestFocus();
    
    }
    }
    private void agregarproveedor() {
        
        
        String insertarSQL = "INSERT INTO proveedor(Id_Proveedor,Nombre_Empresa, RNC,Direccion_Empresa,Telefono,Correo,Id_Empresa2) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = (PreparedStatement) cn.prepareStatement(insertarSQL);
            ps.setInt(1, Integer.parseInt(txtcodigoproveedor.getText()));
            ps.setString(2, txtnombreempresa.getText());
            ps.setInt(3, Integer.parseInt(txtrnc.getText()));
            ps.setString(4, txtdireccion.getText());
            ps.setInt(5, Integer.parseInt(txttelefono.getText()));
            ps.setString(6, txtcorreo.getText());
            ps.setInt(7, Integer.parseInt(txtcodigoempresa.getText()));
          
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Registro realizado con exito.");
            bntactualizar.setEnabled(false);
            bnteliminar.setEnabled(false);
            bntagregarproveedor.setEnabled(true);
            mostrarDatos();
            limpiarcampos();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Error al tratar de insertar los datos: " + ex);
        }
        
        }

}



