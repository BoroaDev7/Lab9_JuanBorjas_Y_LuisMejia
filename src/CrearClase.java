
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author famil
 */
public class CrearClase extends javax.swing.JFrame {

    /**
     * Creates new form CrearClase
     */
    public CrearClase() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        IDExamen1 = new javax.swing.JTextField();
        nombreClase = new javax.swing.JTextField();
        cajaIDMaestro = new javax.swing.JComboBox<>();
        IDExamen2 = new javax.swing.JTextField();
        idClase = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonGuardarClase = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Clase");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Maestro");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID Examen 1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 26));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Examen 2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 26));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 26));
        getContentPane().add(IDExamen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 150, 40));
        getContentPane().add(nombreClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 40));

        getContentPane().add(cajaIDMaestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 150, 30));
        getContentPane().add(IDExamen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 150, 40));
        getContentPane().add(idClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 150, 40));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Agregar Clase");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, -1, -1));

        botonGuardarClase.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonGuardarClase.setText("Guardar");
        botonGuardarClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarClaseMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarClase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-fondo-registro-antiguo_24637-351.jpg"))); // NOI18N
        jLabel1.setText("Agregar Clase");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarClaseMouseClicked
        // TODO add your handling code here:
        Clases clase;
        String nombreclase=nombreClase.getText();
        int idClases=Integer.valueOf(idClase.getText());
        int idMaestro=Integer.valueOf((String)cajaIDMaestro.getSelectedItem());
        int idExamen1=Integer.valueOf(IDExamen1.getText());
        int idExamen2=Integer.valueOf(IDExamen2.getText());
        
        Dba db = new Dba("./basededatos.mdb");
        db.conectar();
        try {      

            db.query.execute("INSERT INTO clases"
                    + " (nombre,id,id_maestro,id_examen_1,id_examen_2)"
                    + " VALUES ('" + nombreclase  + "', '" + idClases + "', '" + idMaestro + "', '" + idExamen1+ "', '" + idExamen2 + "')");
            
            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
        
    }//GEN-LAST:event_botonGuardarClaseMouseClicked

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
            java.util.logging.Logger.getLogger(CrearClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearClase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearClase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IDExamen1;
    private javax.swing.JTextField IDExamen2;
    private javax.swing.JButton botonGuardarClase;
    private javax.swing.JComboBox<String> cajaIDMaestro;
    private javax.swing.JTextField idClase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nombreClase;
    // End of variables declaration//GEN-END:variables
}
