/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Modelo;

import java.sql.Connection;
import Capa_Conexion.Conexion;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Reportes {

    Conexion cn = new Conexion();
    Connection cc = cn.conexion;
    Statement instrucion;

    public Reportes() {
        try {
            //Creamos un enlace hacia la base de datos
            cn.getConexion();
            instrucion = cc.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

//METODO PARA EXPORTAR A PDF UN REPORTE   
/*
    public void resportesPDF(String ruta, String archi) {
        try {
            String rutaInforme = ruta;
            JasperPrint informe = JasperFillManager.fillReport(rutaInforme, null, cc);
            JasperExportManager.exportReportToPdfFile(informe, archi);

            JasperViewer ventanavisor = new JasperViewer(informe, false);
            ventanavisor.setTitle("INFORME");
            ventanavisor.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR AL EXPORTAR DOCUMENTO");
        }
    }

   */
}
