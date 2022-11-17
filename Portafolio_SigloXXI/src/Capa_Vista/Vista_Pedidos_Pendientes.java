/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Conexion.Conexion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import Capa_Modelo.TextPrompt;

/**
 *
 * @author tomas
 */
public class Vista_Pedidos_Pendientes extends javax.swing.JFrame {

    Conexion cn = new Conexion();
    Connection cc = cn.conexion;
    TableRowSorter trs;
    DefaultTableModel modelo = new DefaultTableModel();
    public Vista_Pedidos_Pendientes() {
        initComponents();
        mostrarTabla();
        TextPrompt placeholder = new TextPrompt("ESTADO", txtFiltro1);
        TextPrompt placeholder1 = new TextPrompt("ID USUARIO", txtFiltro);
    }

    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("PEDIDO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("ID USUARIO");
        modelo.addColumn("ESTADO");
        tblPedidos.setModel(modelo);
        

        String sql = "";
        sql = "SELECT p.name ,pe.amount, pe.client_id, pe.estado_pedido FROM pedido pe INNER JOIN plato p ON (pe.product_id = p.id);";
        String [] dato = new String[4];
        try{
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                modelo.addRow(dato);
            }
            tblPedidos.setModel(modelo);
        }
        catch(SQLException e){
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        btnEnviarPedido = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtFiltro1 = new javax.swing.JTextPane();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblPedidos);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        btnEnviarPedido.setText("Enviar Pedido");
        btnEnviarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarPedidoActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refrescar");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        txtFiltro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltro1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtFiltro1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnEnviarPedido)
                .addGap(18, 18, 18)
                .addComponent(btnRefresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras)
                    .addComponent(btnEnviarPedido)
                    .addComponent(btnRefresh))
                .addGap(23, 23, 23))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Cocina visCo = new Vista_Cocina();
        visCo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        
        txtFiltro.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                
             trs.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(),2));
                
            }
            
        });
        trs = new TableRowSorter(modelo);
        tblPedidos.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void btnEnviarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarPedidoActionPerformed
        int fila = tblPedidos.getSelectedRow();
        String id_usuario = tblPedidos.getValueAt(fila, 2).toString();
        int i = JOptionPane.showConfirmDialog(this,"¿El pedido está listo para ser enviado?","Mensajes", JOptionPane.INFORMATION_MESSAGE);
        if (i == 0){
            
            try {
                CallableStatement modificar = cc.prepareCall("{call actualizarPedidoDetalle1(?)}");
                modificar.setString(1, id_usuario);
                modificar.execute();
                JOptionPane.showMessageDialog(this,"¡Pedido Enviado con Éxito!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos",
                    "Mensajes", JOptionPane.ERROR_MESSAGE);
            }
        }
        mostrarTabla();
    }//GEN-LAST:event_btnEnviarPedidoActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        mostrarTabla();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtFiltro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltro1KeyTyped
       
        txtFiltro1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                
             trs.setRowFilter(RowFilter.regexFilter(txtFiltro1.getText(), 3));
                
            }
            
        });
        trs = new TableRowSorter(modelo);
        tblPedidos.setRowSorter(trs);
    }//GEN-LAST:event_txtFiltro1KeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviarPedido;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblPedidos;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextPane txtFiltro1;
    // End of variables declaration//GEN-END:variables
}
