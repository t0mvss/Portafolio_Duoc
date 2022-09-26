/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Capa_Vista;

import Capa_Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boris
 */
public class Vista_TipoMesa extends javax.swing.JFrame {

    /**
     * Creates new form Vista_TipoMesa
     */
    Conexion cn = new Conexion();
    Connection cc = cn.conexion;

    public Vista_TipoMesa() {
        initComponents();
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("DESCRIPCIÓN");
        tblTipoMesa.setModel(modelo);

        String sql = "";
        sql = "select * from tipo_mesa";
        String [] dato = new String[2];
        try{
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                modelo.addRow(dato);
            }
            tblTipoMesa.setModel(modelo);
        }
        catch(SQLException e){
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTipoMesa = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnEliminarTipoMesa = new javax.swing.JButton();
        txtTipoMesa = new javax.swing.JTextField();
        btnModificarTipoMesa = new javax.swing.JButton();
        lblDescripcion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tipos de Mesas");

        tblTipoMesa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Descripción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTipoMesa);

        btnAgregar.setText("Agregar Tipo Mesa");
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

        btnEliminarTipoMesa.setText("Eliminar Tipo Mesa");
        btnEliminarTipoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTipoMesaActionPerformed(evt);
            }
        });

        btnModificarTipoMesa.setText("Modificar Tipo Mesa");
        btnModificarTipoMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarTipoMesaActionPerformed(evt);
            }
        });

        lblDescripcion.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarTipoMesa)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarTipoMesa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTipoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDescripcion)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(txtTipoMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarTipoMesa)
                    .addComponent(btnAtras)
                    .addComponent(btnModificarTipoMesa))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




    public int existeTipoMesa(String descripcion){
    
    PreparedStatement ps = null;
    ResultSet rs = null;
    String sql = "SELECT COUNT(id_tipo_mesa) FROM tipo_mesa WHERE UPPER(descripcion) = UPPER(?)";
    try{
        ps = cc.prepareStatement(sql);
        ps.setString(1, descripcion);
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String descripcion;
        int existe;
        descripcion = txtTipoMesa.getText();
        existe = existeTipoMesa(descripcion);

        
        if ((descripcion.equals("")) ){
            JOptionPane.showMessageDialog(this, "Debe completar el campo","Precaución", JOptionPane.WARNING_MESSAGE);
            txtTipoMesa.requestFocus();
        }
        else{
            int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea agregar este Tipo de Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
            if (i == 0){
                if (existe == 0){
                    try {
                        CallableStatement insert = cc.prepareCall("{call insertarTipoMesa(?)}");
                        insert.setString(1, descripcion);
                        insert.execute();
                        JOptionPane.showMessageDialog(this,"¡Tipo de mesa agregada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                            "Mensajes", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "El tipo de mesa ya existe","Mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        txtTipoMesa.setText("");
        mostrarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Menu visMenu = new Vista_Menu();
        visMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnEliminarTipoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTipoMesaActionPerformed
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea eliminar este Tipo de Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblTipoMesa.getSelectedRow();
            String valor = tblTipoMesa.getValueAt(fila, 0).toString();
            try {
                CallableStatement delete = cc.prepareCall("{call eliminarTipoMesa(?)}");
                delete.setString(1, valor);
                delete.execute();
                JOptionPane.showMessageDialog(this,"¡Tipo de mesa eliminada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnEliminarTipoMesaActionPerformed

    private void btnModificarTipoMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarTipoMesaActionPerformed
        String descripcion;
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea modificar este Tipo de Mesa?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblTipoMesa.getSelectedRow();
            String valor = tblTipoMesa.getValueAt(fila, 0).toString();
            descripcion = tblTipoMesa.getValueAt(fila, 1).toString();
            try {
                CallableStatement modificar = cc.prepareCall("{call actualizarTipoMesa(?,?)}");
                modificar.setString(1, valor);
                modificar.setString(2, descripcion);
                modificar.execute();
                JOptionPane.showMessageDialog(this,"¡Tipo de mesa modificada exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnModificarTipoMesaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista_TipoMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista_TipoMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista_TipoMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista_TipoMesa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista_TipoMesa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarTipoMesa;
    private javax.swing.JButton btnModificarTipoMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JTable tblTipoMesa;
    private javax.swing.JTextField txtTipoMesa;
    // End of variables declaration//GEN-END:variables
}
