/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author famil
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
    public Ingresar() {
        JOptionPane.showMessageDialog(this, "El usuario es Admin y la contraseña 123");
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaRegistrarse = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelcarrera = new javax.swing.JLabel();
        contraRegistro = new javax.swing.JTextField();
        cajaTipoUsuario = new javax.swing.JComboBox<>();
        carrera = new javax.swing.JTextField();
        nombreRegistro = new javax.swing.JTextField();
        ID = new javax.swing.JTextField();
        botonGuardarRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        usuarioRegistro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        confirmContraRegistro1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contrasena = new javax.swing.JPasswordField();
        mostrarcontra = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrar = new javax.swing.JButton();

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setText("Numero de Cuenta/ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 60));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("Tipo de Usuario");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("Usuario");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("Contraseña");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, -1));

        labelcarrera.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelcarrera.setText("Carrera");
        labelcarrera.setEnabled(false);
        jPanel3.add(labelcarrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));
        jPanel3.add(contraRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 200, 40));

        cajaTipoUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cajaTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maestro", "Alumno" }));
        jPanel3.add(cajaTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 200, 40));

        carrera.setEnabled(false);
        carrera.setOpaque(false);
        jPanel3.add(carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 200, 40));
        jPanel3.add(nombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 200, 40));
        jPanel3.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 200, 40));

        botonGuardarRegistro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonGuardarRegistro.setText("Guardar");
        botonGuardarRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarRegistroMouseClicked(evt);
            }
        });
        jPanel3.add(botonGuardarRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 160, 60));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel10.setText("Registrarse");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("Nombre");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 120, 50));
        jPanel3.add(usuarioRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 200, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("Confirmar Contraseña");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));
        jPanel3.add(confirmContraRegistro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 200, 40));

        javax.swing.GroupLayout ventanaRegistrarseLayout = new javax.swing.GroupLayout(ventanaRegistrarse.getContentPane());
        ventanaRegistrarse.getContentPane().setLayout(ventanaRegistrarseLayout);
        ventanaRegistrarseLayout.setHorizontalGroup(
            ventanaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistrarseLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ventanaRegistrarseLayout.setVerticalGroup(
            ventanaRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaRegistrarseLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(214, 69, 65));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Ingresar");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user.png"))); // NOI18N
        jLabel2.setText("Usuario");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock.png"))); // NOI18N
        jLabel3.setText("Contraseña");

        mostrarcontra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        mostrarcontra.setText(" Mostrar Contraseña");
        mostrarcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarcontraActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eye.png"))); // NOI18N

        botonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonRegistrar.setText("Registrarse");
        botonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegistrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(contrasena))
                        .addGap(0, 190, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(botonRegistrar)
                        .addGap(132, 132, 132))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(242, 242, 242))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarcontra)
                        .addGap(219, 219, 219))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrarcontra))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarcontraActionPerformed
        // TODO add your handling code here:
        if(mostrarcontra.isSelected())
        {
            contrasena.setEchoChar((char)0);
        }
        else
        {
            contrasena.setEchoChar('*');
        }
        
    }//GEN-LAST:event_mostrarcontraActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        String username  = usuario.getText().trim();
        String password = String.valueOf(contrasena.getPassword()).trim();
        
        for (Usuarios user : users) {
               if(user.getUsuario().equals(username )&& user.getContrasena().equals(password)){
                   if(user.getTipo().equals("Maestro")){
                       
                   }
                   else if(user.getTipo().equals("Alumno")){
                       
                   }
               } 
        }
        if(username.equals(""))
        {
         JOptionPane.showMessageDialog(null,"Ingrese su Usuario");
        }
        else if(password.equals(""))
        {
           JOptionPane.showMessageDialog(null,"Ingrese su Contraseña"); 
        }
   
        else if(username.equals("Admin") && password.equals("123"))
        {
        Admin adminsito=new Admin();
        adminsito.setVisible(true);
          
        }
        else
        {
         JOptionPane.showMessageDialog(null,"Usuario o Contraseña incorrectos"); 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegistrarMouseClicked
        // TODO add your handling code here:
         MostrarVentanaRegistrar();
    }//GEN-LAST:event_botonRegistrarMouseClicked

    private void botonGuardarRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarRegistroMouseClicked
        // TODO add your handling code here:
        Admin admin=new Admin();
        Usuarios nuevoUsuario;
        String contra;
        if(contraRegistro.getText().equals(carrera.getText())){
            contra=carrera.getText();
            nuevoUsuario=new Usuarios((String)cajaTipoUsuario.getSelectedItem(),ID.getText(),contra);
            users.add(nuevoUsuario);
        Dba db = new Dba("./basededatos.mdb");
        db.conectar();
        try {      
            String nombre=nombreRegistro.getText();
            int id=Integer.parseInt(ID.getText());
             String tipo = (String)cajaTipoUsuario.getSelectedItem();
           String usuario=usuarioRegistro.getText();
            db.query.execute("INSERT INTO usuarios"
                    + " (tipo,usuario,contraseña)"
                    + " VALUES ('" +  tipo + "', '" + usuario + "', '" + contra + "')");
            if(tipo.equals("Maestro")){
                db.query.execute("INSERT INTO maestros"
                    + " (nombre,id)"
                    + " VALUES ('" + nombre  + "', '" + id +"')");
                DefaultComboBoxModel caja = (DefaultComboBoxModel)admin.getCajaIDMaestro().getModel();
                caja.addElement(id);
                
            }
            else if(tipo.equals("Alumno")){
                labelcarrera.setOpaque(false);
                labelcarrera.setEnabled(true);             
                carrera.setOpaque(false);
                carrera.setEnabled(true);
                String carre=carrera.getText();
                db.query.execute("INSERT INTO alumnos"
                    + " (nombre,cuenta,carrera)"
                    + " VALUES ('" + nombre  + "', '" + id + "', '" + carre + "')");
            }
            
            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        
        }else{
            JOptionPane.showMessageDialog(this, "Las contraseñas no son iguales" );
            carrera.setText("");
        }
        
       
    }//GEN-LAST:event_botonGuardarRegistroMouseClicked

    private void MostrarVentanaRegistrar(){
        ventanaRegistrarse.setModal(true);
         ventanaRegistrarse.pack();
       ventanaRegistrarse.setLocationRelativeTo(this);
        ventanaRegistrarse.setVisible(true);
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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JButton botonGuardarRegistro;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JComboBox<String> cajaTipoUsuario;
    private javax.swing.JTextField carrera;
    private javax.swing.JTextField confirmContraRegistro1;
    private javax.swing.JTextField contraRegistro;
    private javax.swing.JPasswordField contrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelcarrera;
    private javax.swing.JCheckBox mostrarcontra;
    private javax.swing.JTextField nombreRegistro;
    private javax.swing.JTextField usuario;
    private javax.swing.JTextField usuarioRegistro;
    private javax.swing.JDialog ventanaRegistrarse;
    // End of variables declaration//GEN-END:variables
ArrayList<Usuarios>users=new ArrayList();

}
