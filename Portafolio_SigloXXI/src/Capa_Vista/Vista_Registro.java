/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Vista;

import Capa_Conexion.Conexion;
import javax.swing.JOptionPane;
import Capa_Modelo.Encoder;
import java.util.ArrayList;
import Capa_Controlador.ControladorLLenadoComboBox;
import Capa_Modelo.Tipo_Usuario;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
/**
 *
 * @author tomas
 */
public class Vista_Registro extends javax.swing.JFrame {
    
    ControladorLLenadoComboBox controlador = new ControladorLLenadoComboBox();;
    ArrayList ListaTipoUsuario;
    Conexion cn = new Conexion();
    Connection cc = cn.conexion;
    /**
     * Creates new form Vista_Registro
     */
    public Vista_Registro() {
        initComponents();
        LlenarCMBTipoUsuario();
        this.setTitle("Registrar Personal");
    }

    public int existeUsuario(String username){
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT COUNT(id_usuario) FROM usuario WHERE UPPER(username) = UPPER(?)";
        try{
            ps = cc.prepareStatement(sql);
            ps.setString(1, username);
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

    public void LlenarCMBTipoUsuario(){
        try {
            cmbTipoUsuario.removeAllItems();
            ListaTipoUsuario = controlador.getListaTipoUsuarios();
            Iterator iter = ListaTipoUsuario.iterator();
            while (iter.hasNext()){
                Tipo_Usuario tipoUsuario = (Tipo_Usuario) iter.next();
                cmbTipoUsuario.addItem(tipoUsuario.toString());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Hubo un error","Aviso",JOptionPane.WARNING_MESSAGE);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cmbTipoUsuario = new javax.swing.JComboBox<>();
        txtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Correo");

        jLabel4.setText("Contraseña");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("Registrar Personal");

        btnRegistro.setText("Registrar");
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        jLabel6.setText("Área");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add_user.png"))); // NOI18N

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(cmbTipoUsuario, 0, 150, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addComponent(btnAtras)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked

    }//GEN-LAST:event_btnRegistroMouseClicked

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();
        if((c <'a' || c > 'z') && (c < 'A' || c > 'Z' ) && (c < ' ' || c > ' ')) evt.consume();
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        char c = evt.getKeyChar();
        if((c <'a' || c > 'z') && (c < 'A' || c > 'Z' ) && (c < ' ' || c > ' ')) evt.consume();
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        String nombre, apellido, correo, contrasena;
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        correo = txtCorreo.getText();
        contrasena = txtPass.getText();
        int existe = existeUsuario(correo);
        
        if ((nombre.equals("")) || apellido.equals("") || correo.equals("") || contrasena.equals("")){
            JOptionPane.showMessageDialog(this, "Debe llenar todos los campos","Precaución", JOptionPane.WARNING_MESSAGE);
        }
        else{
            int i = JOptionPane.showConfirmDialog(this,"¿Está seguro de que desea agregar este Usuario?","Mensajes", JOptionPane.ERROR_MESSAGE);
            if (i == 0){
                if (existe == 0){
                    try {
                        int tipoUser = cmbTipoUsuario.getSelectedIndex()+1;

                        Capa_Modelo.Encoder CR = new Encoder();

                        String encript = CR.ecnode(contrasena);

                        CallableStatement insert = cc.prepareCall("{call insertarUsuario(?,?,?,?,?)}");
                        insert.setString(1, nombre);
                        insert.setString(2, apellido);
                        insert.setString(3, correo);
                        insert.setString(4, encript); 
                        insert.setInt(5, tipoUser);
                        insert.execute();

                        JOptionPane.showMessageDialog(this,"¡Usuario agregado exitosamente!","Mensajes", JOptionPane.INFORMATION_MESSAGE);
                        txtNombre.setText("");
                        txtApellido.setText("");
                        txtCorreo.setText("");
                        txtPass.setText("");
                        cmbTipoUsuario.setSelectedIndex(0);
                    } 
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Problemas de conexión con la Base de Datos","Mensajes", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "El usuario ya existe","Mensajes", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnRegistroActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        Vista_Mantenedor_Personal visMan = new Vista_Mantenedor_Personal();
        visMan.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cmbTipoUsuario;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
