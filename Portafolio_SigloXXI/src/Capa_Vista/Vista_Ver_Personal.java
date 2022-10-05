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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boris
 */
public class Vista_Ver_Personal extends javax.swing.JFrame {

    /**
     * Creates new form Vista_Ver_Personal
     */
    Conexion cn = new Conexion();
    Connection cc = cn.conexion;

    public Vista_Ver_Personal() {
        initComponents();
        mostrarTabla();
        this.setTitle("Lista de Personal");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("APELLIDO");
        modelo.addColumn("CORREO");
        modelo.addColumn("ÁREA");
        tblPersonal.setModel(modelo);

        String sql = "";
        sql = "select u.id_usuario as ID, u.nombre as NOMBRE, u.apellido as APELLIDO, u.username as CORREO, tu.descripcion as AREA from usuario u inner join tipo_usuario tu on u.id_tipo_usuario = tu.id_tipo_usuario where u.id_tipo_usuario != 4 order by AREA asc;";
        String [] dato = new String[5];
        try{
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                dato[4] = rs.getString(5);
                modelo.addRow(dato);
            }
            tblPersonal.setModel(modelo);
        }
        catch(SQLException e){
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonal = new javax.swing.JTable();
        btnEliminarUsuario = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnModificarUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "CORREO", "AREA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPersonal);

        btnEliminarUsuario.setText("Eliminar Usuario");
        btnEliminarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuarioActionPerformed(evt);
            }
        });

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnModificarUsuario.setText("Modificar Usuario");
        btnModificarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminarUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarUsuario)
                    .addComponent(btnAtras)
                    .addComponent(btnModificarUsuario))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuarioActionPerformed
       int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea eliminar este Usuario?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblPersonal.getSelectedRow();
            String valor = tblPersonal.getValueAt(fila, 0).toString();
            try {
                CallableStatement delete = cc.prepareCall("{call eliminarUsuario(?)}");
                delete.setString(1, valor);
                delete.execute();
                JOptionPane.showMessageDialog(this,"¡Usuario eliminado exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla(); 
    }//GEN-LAST:event_btnEliminarUsuarioActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Mantenedor_Personal visMan = new Vista_Mantenedor_Personal();
        visMan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnModificarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarUsuarioActionPerformed
        String id;
        String nombre;
        String apellido;
        String correo;
        String area;
        int idtipo = 0;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "";
        sql = "select id_tipo_usuario from tipo_usuario where descripcion = ?;";
        int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea modificar este Usuario?","Mensajes", JOptionPane.ERROR_MESSAGE);
        if (i == 0){
            int fila = tblPersonal.getSelectedRow();
            id = tblPersonal.getValueAt(fila, 0).toString();
            nombre = tblPersonal.getValueAt(fila, 1).toString();
            apellido = tblPersonal.getValueAt(fila, 2).toString();
            correo = tblPersonal.getValueAt(fila, 3).toString();
            area = tblPersonal.getValueAt(fila, 4).toString();
            try {
                ps = cc.prepareStatement(sql);
                ps.setString(1, area);
                rs = ps.executeQuery();
               if (rs.next()){
                    idtipo = Integer.parseInt(rs.getString("id_tipo_usuario"));
                }
                CallableStatement modificar = cc.prepareCall("{call actualizarUsuario(?,?,?,?,?)}");
                modificar.setString(1, id);
                modificar.setString(2, nombre);
                modificar.setString(3, apellido);
                modificar.setString(4, correo);
                modificar.setInt(5, idtipo);
                modificar.execute();
                JOptionPane.showMessageDialog(this,"¡Usuario modificado exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnModificarUsuarioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminarUsuario;
    private javax.swing.JButton btnModificarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPersonal;
    // End of variables declaration//GEN-END:variables
}