
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;





public class CrearPregunta extends javax.swing.JFrame {

    public CrearPregunta() {
        initComponents();
       this.setLocationRelativeTo(null);
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        descripcion = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cajaCodigo = new javax.swing.JComboBox<>();
        verdadero = new javax.swing.JRadioButton();
        falso = new javax.swing.JRadioButton();
        botonGuardarPregunta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Respuesta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 130, -1));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 298, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        getContentPane().add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 340, 230));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Titulo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 100, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Codigo Clase");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 130, -1));

        getContentPane().add(cajaCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 210, 30));

        verdadero.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        verdadero.setText("Verdadero");
        getContentPane().add(verdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, -1, -1));

        falso.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        falso.setText("Falso");
        getContentPane().add(falso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        botonGuardarPregunta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonGuardarPregunta.setText("Guardar");
        botonGuardarPregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarPreguntaMouseClicked(evt);
            }
        });
        getContentPane().add(botonGuardarPregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 580, 110, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-fondo-registro-antiguo_24637-351.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 390));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/textura-fondo-registro-antiguo_24637-351.jpg"))); // NOI18N
        jLabel7.setText("Guardar");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 630, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarPreguntaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarPreguntaMouseClicked
        // TODO add your handling code here:
        Examenes examen;
        Preguntas preguntas;
        String titulos=titulo.getText();
        String descripciones=descripcion.getText();
       int codigo=(int)cajaCodigo.getSelectedItem();
        boolean respuesta;
        
        if(verdadero.isSelected()){
            respuesta=true;
            preguntas=new Preguntas(descripciones,respuesta);
            questions.add(preguntas);
            examen=new Examenes(codigo);
            examen.setPreguntas(questions);
            
            Dba db = new Dba("./basededatos.mdb");
        db.conectar();
        try {      

            db.query.execute("INSERT INTO preguntas"
                    + " (pregunta,respuesta)"
                    + " VALUES ('" + preguntas  + "', '" + respuesta + "')");
            
            JOptionPane.showMessageDialog(this, "Agregado Exitosamente");
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
            
            
        }
        else if (falso.isSelected()){
            respuesta=false;
            preguntas=new Preguntas(descripciones,respuesta);
            questions.add(preguntas);
            examen=new Examenes(codigo);
            examen.setPreguntas(questions);
            
        }
        
        
        
        
    }//GEN-LAST:event_botonGuardarPreguntaMouseClicked

    
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
            java.util.logging.Logger.getLogger(CrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearPregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearPregunta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardarPregunta;
    private javax.swing.JComboBox<String> cajaCodigo;
    private java.awt.TextArea descripcion;
    private javax.swing.JRadioButton falso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField titulo;
    private javax.swing.JRadioButton verdadero;
    // End of variables declaration//GEN-END:variables

  ArrayList<Preguntas>questions=new ArrayList();
}
