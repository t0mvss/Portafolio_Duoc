/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;
import Capa_Modelo.Producto_Proveedor;
import Capa_Conexion.Conexion;
import Capa_Controlador.ControladorCmbProveedores;
import Capa_Modelo.Proveedor;
import com.sun.media.sound.ModelOscillator;
import java.awt.ComponentOrientation;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.activation.*;
import javax.mail.*;
import javax.mail.internet.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author tomas
 */
public class Vista_Comprar_Insumos extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Proveedor
     */
    ControladorCmbProveedores controlador = new ControladorCmbProveedores();
    ArrayList ListaProveedores;
    Conexion cn = new Conexion();
    Connection cc = cn.conexion;

    public Vista_Comprar_Insumos() {
        initComponents();
        LlenarCMBProveedores();
        mostrarTablaSolicitud();
        setTitle("Comprar Insumos");
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosProveedor = new javax.swing.JTable();
        cmbProveedores = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        txtCantidad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSolicitud = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRealizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblProductosProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductosProveedor);

        cmbProveedores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Cantidad");

        btnAgregar.setBackground(new java.awt.Color(51, 204, 0));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        tblSolicitud.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblSolicitud);

        jLabel2.setText("Proveedor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("SOLICITUD DE COMPRA");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRealizar.setText("Realizar");
        btnRealizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(204, 0, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnRealizar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52)
                                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel3)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel1)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnRealizar)
                    .addComponent(btnCancelar))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void transfer_to_email(String Correo, String Orden){
        String correoEnvia = "admrestxxi@gmail.com";
        String contrasena = "evrhgjuvbgoxcdeo";

        Properties objetoPEC = new Properties();

        objetoPEC.put("mail.smtp.host","smtp.gmail.com");
        objetoPEC.setProperty("mail.smtp.starttls.enable", "true");
        objetoPEC.put("mail.smtp.port","587");
        objetoPEC.setProperty("mail.smtp.port", "587");
        objetoPEC.put("mail.smtp.user", correoEnvia);
        objetoPEC.setProperty("mail.smtp.auth", "true");

        Session sesion = Session.getDefaultInstance(objetoPEC, new javax.mail.Authenticator(){
            protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(
                correoEnvia, contrasena);
            }
        });

        MimeMessage mail = new MimeMessage(sesion);

        try{
            mail.setFrom(new InternetAddress(correoEnvia));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(Correo));
            mail.setSubject("Solicitud de Compra");
            mail.setText(Orden);

            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(correoEnvia, contrasena);
            transporte.send(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();

            JOptionPane.showMessageDialog(null, "Solicitud enviada correctamente");

        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error de envio de orden...\n" + ex);
        }

    }

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Admin visAdm = new Vista_Admin();
        visAdm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int idproveedor = 0;
        String proveedor;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        try{
            proveedor = cmbProveedores.getSelectedItem().toString();
            sql = "select id_proveedor from proveedor Where nombre_proveedor = ?;";
            ps = cc.prepareStatement(sql);
            ps.setString(1, proveedor);
            rs = ps.executeQuery();
            if (rs.next()){
                idproveedor = Integer.parseInt(rs.getString("id_proveedor"));
            }
        }
        catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos","Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        mostrarTabla(idproveedor);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String cantidad;
        int capentero;
        cantidad = txtCantidad.getText();
        int fila = tblProductosProveedor.getSelectedRow();
        String valor = tblProductosProveedor.getValueAt(fila, 0).toString();
        String precio = tblProductosProveedor.getValueAt(fila, 2).toString();
        int idprov = 0;
        String prov;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        if ((cantidad.equals(""))){
            JOptionPane.showMessageDialog(this, "Debe ingresar una cantidad","Precaución", JOptionPane.WARNING_MESSAGE);
        }
        else{
            int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea agregar este Producto a la solicitud?","Mensajes", JOptionPane.ERROR_MESSAGE);
            if (i == 0){
                try {
                    prov = cmbProveedores.getSelectedItem().toString();
                    sql = "select id_proveedor from proveedor Where nombre_proveedor = ?;";
                    ps = cc.prepareStatement(sql);
                    ps.setString(1, prov);
                    rs = ps.executeQuery();
                    if (rs.next()){
                        idprov = Integer.parseInt(rs.getString("id_proveedor"));
                    }
                    capentero =Integer.parseInt(cantidad);
                    CallableStatement insert = cc.prepareCall("{call insertarProductoSolicitud(?,?,?,?)}");
                    insert.setString(1, valor);
                    insert.setInt(2, idprov);
                    insert.setInt(3, capentero);
                    insert.setString(4, precio);
                    insert.execute();
                    JOptionPane.showMessageDialog(this,"¡Producto agregado exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                    txtCantidad.setText("");
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                        "Mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        mostrarTablaSolicitud();                
        cmbProveedores.disable();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public int idCompra(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT id_compra_insumos FROM comprar_insumos WHERE fecha = curdate() and estado = 'En proceso';";
        try{
            ps = cc.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }
        catch (SQLException ex){
            return 1;
        }
    }

    private void btnRealizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarActionPerformed
        int totalint = 0;
        int idcompra = idCompra();
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        String producto = "";
        String cantidad = "";
        String total = "";
        String prov = "";
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea realizar esta Solicitud de Compra?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            try {
                sql = "select SUM(total), p.email_proveedor from compra_detalle cde inner join comprar_insumos ci on cde.id_comprar_insumos = ci.id_compra_insumos inner join proveedor p on ci.id_proveedor = p.id_proveedor Where id_comprar_insumos = ?;";
                ps = cc.prepareStatement(sql);
                ps.setInt(1, idcompra);
                rs = ps.executeQuery();
                if (rs.next()){
                    totalint = Integer.parseInt(rs.getString("SUM(total)"));
                    prov = rs.getString("p.email_proveedor");
                }
                sql = "select pp.descripcion, cde.cantidad, (pp.precio_unitario)*(cde.cantidad) as 'precio por producto' from compra_detalle cde inner join producto_proveedor pp on pp.id_producto = cde.id_producto where cde.id_comprar_insumos = ? order by pp.id_producto asc;";
                ps = cc.prepareStatement(sql);
                ps.setInt(1, idcompra);
                rs = ps.executeQuery();
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
                producto = "Fecha de emisión: "+dtf.format(LocalDateTime.now())+"\n\n";
                while (rs.next()){
                    producto += rs.getString("pp.descripcion") + " " + rs.getString("cde.cantidad") + " " + rs.getString("precio por producto") + "\n";
                }
                producto += "\nTotal a pagar      $" + totalint + "CLP";
                CallableStatement modificar = cc.prepareCall("{call actualizarCompra()}");
                modificar.execute();
                JOptionPane.showMessageDialog(this,"¡Solicitud realizada exitosamente! \n TOTAL: $"+totalint+"\n Se enviará un mail al proveedor con la orden de compra","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                transfer_to_email(prov, producto);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTablaSolicitud();
        cmbProveedores.enable();
    }//GEN-LAST:event_btnRealizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea cancelar la Compra?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            try {
                CallableStatement delete = cc.prepareCall("{call cancelarCompra()}");
                delete.execute();
                JOptionPane.showMessageDialog(this,"¡Compra cancelada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTablaSolicitud();
        cmbProveedores.enable();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblSolicitud.getSelectedRow();
        String valor = tblSolicitud.getValueAt(fila, 2).toString();
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea eliminar este Producto de la solicitud?","Mensajes", JOptionPane.ERROR_MESSAGE);
            if (i == 0){
                try {
                    CallableStatement eliminar = cc.prepareCall("{call eliminarProductoDeSolicitud(?)}");
                    eliminar.setString(1, valor);
                    eliminar.execute();
                    JOptionPane.showMessageDialog(this,"¡Producto eliminado exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                    txtCantidad.setText("");
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                        "Mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        mostrarTablaSolicitud();
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrarTabla(int idprov){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID PRODUCTO");
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("PRECIO");
        tblProductosProveedor.setModel(modelo);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        String [] dato = new String[3];
        try{
            sql = "SELECT pp.id_producto, pp.descripcion, pp.precio_unitario FROM producto_proveedor pp WHERE pp.id_proveedor = ?;";
            ps = cc.prepareStatement(sql);
            ps.setInt(1, idprov);
            rs = ps.executeQuery();
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                modelo.addRow(dato);
            }
            tblProductosProveedor.setModel(modelo);
        }
        catch(SQLException e){
        }

    }
    public void mostrarTablaSolicitud(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID SOLICITUD");
        modelo.addColumn("ID DETALLE");
        modelo.addColumn("ID PRODUCTO");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
        modelo.addColumn("ESTADO");
        tblSolicitud.setModel(modelo);
        String sql = "";
        sql = "select cde.id_comprar_insumos, cde.id_compra_detalle, pp.id_producto, pp.descripcion, cde.cantidad, (pp.precio_unitario)*(cde.cantidad), ci.estado from comprar_insumos ci inner join compra_detalle cde on ci.id_compra_insumos = cde.id_comprar_insumos inner join producto_proveedor pp on pp.id_producto = cde.id_producto where ci.estado = 'En proceso' order by pp.id_producto asc;";
        String [] dato = new String[7];
        try{
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                dato[5] = rs.getString(6);
                dato[6] = rs.getString(7);
                modelo.addRow(dato);
            }
            tblSolicitud.setModel(modelo);
        }
        catch(SQLException e){
        }

    }

    public void LlenarCMBProveedores(){
        try {
            cmbProveedores.removeAllItems();
            ListaProveedores = controlador.getListaProveedores();
            Iterator iter = ListaProveedores.iterator();
            while (iter.hasNext()){
                Proveedor prov = (Proveedor) iter.next();
                cmbProveedores.addItem(prov.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Hubo un error","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRealizar;
    private javax.swing.JComboBox<String> cmbProveedores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductosProveedor;
    private javax.swing.JTable tblSolicitud;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}