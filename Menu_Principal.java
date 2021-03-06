/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quienquieresermillonariofinal;

import quienquieresermillonariofinal.GENERAL.BibliotecaDePreguntas;
import quienquieresermillonariofinal.ADMINISTRADORES.Administrador;

/**
 *
 * @author USER
 */
public class Menu_Principal extends javax.swing.JFrame {

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        btnParticipante = new javax.swing.JButton();
        btnPresentador = new javax.swing.JButton();
        btnAdministrador = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Bienvenidos");

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnParticipante.setText("Participante");
        btnParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParticipanteActionPerformed(evt);
            }
        });

        btnPresentador.setText("Presentador");
        btnPresentador.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnPresentador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentadorActionPerformed(evt);
            }
        });

        btnAdministrador.setText("Administrador");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel1.setText("¿QUIÉN QUIERE SER MILLONARIO?");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/quienquieresermillonariofinal/3782167660_76822c9800_o.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnParticipante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPresentador)
                        .addGap(37, 37, 37)
                        .addComponent(btnAdministrador)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnParticipante)
                    .addComponent(btnPresentador)
                    .addComponent(btnAdministrador))
                .addGap(47, 47, 47)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPresentadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentadorActionPerformed
                
        //Cuando se presione el botón "Presentador" se ejecutará lo siguiente:
        
        
        
        System.out.println("<<<------- Panel Presentador ------->>>");
        
        BibliotecaDePreguntas Pregleida1 = new BibliotecaDePreguntas(); /* Se crea un Objeto de la clase BibliotecaDePreguntas (Donde están los metodos que leen las preguntas de los archivos txt) 
                                                                           para la pregunta #1 y se invoca al momento en que se presiona el boton "Presentador", es decir, mostraría lo que contiene el archivo de txt de la pregunta #1.*/ 
        Pregleida1.LeerPregunta1("Pregunta #1.txt");    //Se invoca el método y busca el archivo .txt que coincida con el nombre de "Pregunta #1.txt".        
        
        BibliotecaDePreguntas Pregleida2 = new BibliotecaDePreguntas();   //Lo mismo es para los demás métodos de las siguientes preguntas.
        Pregleida2.LeerPregunta2("Pregunta #2.txt");
        
        BibliotecaDePreguntas Pregleida3 = new BibliotecaDePreguntas();
        Pregleida3.LeerPregunta3("Pregunta #3.txt");
        
        BibliotecaDePreguntas Pregleida4 = new BibliotecaDePreguntas();
        Pregleida4.LeerPregunta4("Pregunta #4.txt");
        
        BibliotecaDePreguntas Pregleida5 = new BibliotecaDePreguntas();
        Pregleida5.LeerPregunta5("Pregunta #5.txt");
        
        BibliotecaDePreguntas Pregleida6 = new BibliotecaDePreguntas();
        Pregleida6.LeerPregunta6("Pregunta #6.txt");
        
        BibliotecaDePreguntas Pregleida7 = new BibliotecaDePreguntas();
        Pregleida7.LeerPregunta7("Pregunta #7.txt");
        
        BibliotecaDePreguntas Pregleida8 = new BibliotecaDePreguntas();
        Pregleida8.LeerPregunta8("Pregunta #8.txt");
        
        BibliotecaDePreguntas Pregleida9 = new BibliotecaDePreguntas();
        Pregleida9.LeerPregunta9("Pregunta #9.txt");
        
        BibliotecaDePreguntas Pregleida10 = new BibliotecaDePreguntas();
        Pregleida10.LeerPregunta10("Pregunta #10.txt");
        
        BibliotecaDePreguntas Pregleida11 = new BibliotecaDePreguntas();
        Pregleida11.LeerPregunta11("Pregunta #11.txt");
        
        BibliotecaDePreguntas Pregleida12 = new BibliotecaDePreguntas();
        Pregleida12.LeerPregunta12("Pregunta #12.txt");
        
        BibliotecaDePreguntas Pregleida13 = new BibliotecaDePreguntas();
        Pregleida13.LeerPregunta13("Pregunta #13.txt");
        
        BibliotecaDePreguntas Pregleida14 = new BibliotecaDePreguntas();
        Pregleida14.LeerPregunta14("Pregunta #14.txt");
        
        BibliotecaDePreguntas Pregleida15 = new BibliotecaDePreguntas();
        Pregleida15.LeerPregunta15("Pregunta #15.txt");
        
        
        
    }//GEN-LAST:event_btnPresentadorActionPerformed

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
        
        Administrador abrirAdmin =  new Administrador();
        abrirAdmin.setVisible(true);                        /*Al presionar el botón "Administrador" abrirá la ventana de Administrador
                                                              y cerrará la ventana actual, osea el menú principal.*/
        this.setVisible(false);
        
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParticipanteActionPerformed
        
        Participante abrirPartici =  new Participante();    
        abrirPartici.setVisible(true);                      /*Al presionar el botón "Participante" abrirá la ventana de Participante
                                                              y cerrará la ventana actual, osea el menú principal.*/
        this.setVisible(false);
        
    }//GEN-LAST:event_btnParticipanteActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      
        System.exit(0);         //Al presionar el botón salir cerrará la aplicación
        
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnParticipante;
    private javax.swing.JButton btnPresentador;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
