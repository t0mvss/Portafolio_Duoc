/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Conexion.Conexion;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tomas
 */
public class Vista_Emitir_Boleta extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection cn = cc.conexion;
    public Vista_Emitir_Boleta() {
        initComponents();
        this.setTitle("Menu Finanzas");
        mostrarTabla();
    }

    public void mostrarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("FECHA");
        modelo.addColumn("PRECIO");
        modelo.addColumn("ID CLIENTE");
        tblPago.setModel(modelo);
        

        String sql = "";
        sql = "select * from venta;";
        String [] dato = new String[4];
        try{
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                dato[0] = rs.getString(1);
                dato[1] = rs.getString(2);
                dato[2] = rs.getString(3);
                dato[3] = rs.getString(4);
                modelo.addRow(dato);
            }
            tblPago.setModel(modelo);
        }
        catch(SQLException e){
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEmitirBoleta = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPago = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEmitirBoleta.setText("EMITIR BOLETA");
        btnEmitirBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirBoletaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblPago.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPago);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(345, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmitirBoleta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir)
                    .addComponent(btnEmitirBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
    public static String fechaActual(){
       Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    };
    private void btnEmitirBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirBoletaActionPerformed
        Document boleta = new Document();
        String path = "boleta.pdf";
        try {
            double Total_IVA = 0;
            int total = 0; 
            int fila = tblPago.getSelectedRow();
            String valor = tblPago.getValueAt(fila, 0).toString();
            total = Integer.parseInt(tblPago.getValueAt(fila, 2).toString());
            Total_IVA = total * 0.19;
            PdfWriter.getInstance(boleta, new FileOutputStream(path));
            
            boleta.open();
            PreparedStatement ps = null;
            ResultSet rs = null;
            String sql = "select p.name ,dv.amount from detalle_venta dv inner join plato p on (dv.product_id = p.id) where sale_id = ?;";
            ps = cn.prepareStatement(sql);
            ps.setString(1, valor);
            rs = ps.executeQuery();
            Phrase nombre_REST = new Phrase("RESTAURANT SIGLO XXI\n\n\n");
            Phrase fecha = new Phrase("Con fecha: " + fechaActual() + "\n\n");
            Phrase IVA = new Phrase("\nIVA: " + Total_IVA + "\n");
            boleta.add(nombre_REST);
            boleta.add(fecha); 
            
            while(rs.next()){
                Phrase producto = new Phrase(rs.getString("p.name") + " x " + rs.getString("dv.amount") + "\n");
                boleta.add(producto);
            }
            Phrase monto_neto = new Phrase("\nMonto Neto: " + (total - Total_IVA));
            Phrase monto = new Phrase("\nMonto Total: " + total);
            boleta.add(monto_neto);
            boleta.add(IVA);
            boleta.add(monto);
            
            
            boleta.close();
        }  catch (DocumentException | FileNotFoundException | SQLException ex) {
            Logger.getLogger(Vista_Emitir_Boleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEmitirBoletaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirBoleta;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPago;
    // End of variables declaration//GEN-END:variables
}
