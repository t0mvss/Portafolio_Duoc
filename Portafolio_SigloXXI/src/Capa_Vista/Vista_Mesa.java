/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Capa_Vista;

import Capa_Conexion.Conexion;
import Capa_Controlador.ControladorCmbTipoMesa;
import Capa_Modelo.Tipo_Mesa;
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

/**
 *
 * @author boris
 */
public class Vista_Mesa extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Mesa
     */
    ControladorCmbTipoMesa controlador = new ControladorCmbTipoMesa();
    ArrayList ListaTipoMesa;
    Conexion cn = new Conexion();
    Connection cc = cn.conexion;

    public Vista_Mesa() {
        initComponents();
        mostrarTabla();
        LlenarCMBTipoMesa();
        this.setTitle("Lista de Mesas");    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("TIPO MESA");
        tblMesa.setModel(modelo);

        String sql = "";
        sql = "select m.id_mesa, tm.descripcion from mesa m inner join tipo_mesa tm on m.id_tipo_mesa = tm.id_tipo_mesa order by tm.descripcion asc;";
        String [] dato = new String[2];
        try{
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                modelo.addRow(dato);
            }
            tblMesa.setModel(modelo);
        }
        catch(SQLException e){
        }

    }

    public void LlenarCMBTipoMesa(){
        try {
            cmbTipoMesa.removeAllItems();
            ListaTipoMesa = controlador.getListaTipoMesas();
            Iterator iter = ListaTipoMesa.iterator();
            while (iter.hasNext()){
                Tipo_Mesa tipoMesa = (Tipo_Mesa) iter.next();
                cmbTipoMesa.addItem(tipoMesa.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Hubo un error","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblMesa = new javax.swing.JTable();
        lblTipoMesa = new javax.swing.JLabel();
        cmbTipoMesa = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnModificarMesa = new javax.swing.JButton();
        btnEliminarMesa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "TIPO_MESA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMesa);

        lblTipoMesa.setText("Tipo Mesa");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnModificarMesa.setText("Modificar Mesa");
        btnModificarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMesaActionPerformed(evt);
            }
        });

        btnEliminarMesa.setText("Eliminar Mesa");
        btnEliminarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarMesa))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lblTipoMesa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbTipoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtras)
                            .addComponent(btnAgregar))
                        .addGap(31, 31, 31)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipoMesa)
                            .addComponent(cmbTipoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificarMesa)
                    .addComponent(btnEliminarMesa))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Admin visMenu = new Vista_Admin();
        visMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String tipomesa;
        int idtipomesa = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea agregar esta Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            try {
                tipomesa = cmbTipoMesa.getSelectedItem().toString();
                sql = "select id_tipo_mesa from tipo_mesa Where descripcion = ?;";
                ps = cc.prepareStatement(sql);
                ps.setString(1, tipomesa);
                rs = ps.executeQuery();
                if (rs.next()){
                    idtipomesa = Integer.parseInt(rs.getString("id_tipo_mesa"));
                }
                CallableStatement insert = cc.prepareCall("{call insertarMesa(?)}"); 
                insert.setInt(1, idtipomesa);
                insert.execute();
                JOptionPane.showMessageDialog(this,"¡Mesa agregada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                cmbTipoMesa.setSelectedIndex(0);
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos","Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarMesaActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea eliminar este Tipo de Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblMesa.getSelectedRow();
            String valor = tblMesa.getValueAt(fila, 0).toString();
            try {
                CallableStatement delete = cc.prepareCall("{call eliminarMesa(?)}");
                delete.setString(1, valor);
                delete.execute();
                JOptionPane.showMessageDialog(this,"¡Mesa eliminada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnEliminarMesaActionPerformed

    private void btnModificarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMesaActionPerformed
        String id;
        String tipomesa;
        int idtipo = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        sql = "select id_tipo_mesa from tipo_mesa where descripcion = ?;";
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea modificar esta Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblMesa.getSelectedRow();
            id = tblMesa.getValueAt(fila, 0).toString();
            tipomesa = tblMesa.getValueAt(fila, 1).toString();
            try {
                ps = cc.prepareStatement(sql);
                ps.setString(1, tipomesa);
                rs = ps.executeQuery();
               if (rs.next()){
                    idtipo = Integer.parseInt(rs.getString("id_tipo_mesa"));
                }
                CallableStatement modificar = cc.prepareCall("{call actualizarMesa(?,?)}");
                modificar.setString(1, id);
                modificar.setInt(2, idtipo);
                modificar.execute();
                JOptionPane.showMessageDialog(this,"¡Mesa modificada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnModificarMesaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarMesa;
    private javax.swing.JButton btnModificarMesa;
    private javax.swing.JComboBox<String> cmbTipoMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTipoMesa;
    private javax.swing.JTable tblMesa;
    // End of variables declaration//GEN-END:variables
}
