/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author Franco
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
    
    
    }
public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);
            
            }
     }
public void abrirarchivo2(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);
            
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

        jPanel1 = new javax.swing.JPanel();
        btnSimulador = new javax.swing.JButton();
        btnTeorico = new javax.swing.JButton();
        btnNosotros = new javax.swing.JButton();
        btnCargas = new javax.swing.JButton();
        btnDistancia = new javax.swing.JButton();
        btnFuerza = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSimulador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/CHARGE CALCULATORR.jpg"))); // NOI18N
        btnSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimuladorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimulador, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, 330, 90));

        btnTeorico.setFont(new java.awt.Font("Tahoma", 0, 1)); // NOI18N
        btnTeorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/Material Teorico.png"))); // NOI18N
        btnTeorico.setText("jButton5");
        btnTeorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeoricoActionPerformed(evt);
            }
        });
        jPanel1.add(btnTeorico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 190, 60));

        btnNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/ABOUT US.jpg"))); // NOI18N
        btnNosotros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNosotrosActionPerformed(evt);
            }
        });
        jPanel1.add(btnNosotros, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 190, 60));

        btnCargas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/CHARGE CALCULATOR.jpg"))); // NOI18N
        btnCargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargasActionPerformed(evt);
            }
        });
        jPanel1.add(btnCargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 340, 100));

        btnDistancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/DISTANCE CALCULATOR.jpg"))); // NOI18N
        btnDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDistanciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 260, 330, 90));

        btnFuerza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/FORCE CALCULATOR.jpg"))); // NOI18N
        btnFuerza.setBorder(null);
        btnFuerza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuerzaActionPerformed(evt);
            }
        });
        jPanel1.add(btnFuerza, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 320, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondo/Inicio.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFuerzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuerzaActionPerformed
     FuerzaJFrame x = new FuerzaJFrame();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFuerzaActionPerformed

    private void btnCargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargasActionPerformed
    CoulombJFrame c = new CoulombJFrame();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCargasActionPerformed

    private void btnDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDistanciaActionPerformed
        DistanciaJFrame d = new DistanciaJFrame();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDistanciaActionPerformed

    private void btnSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimuladorActionPerformed
      VentanaPrincipal r = new VentanaPrincipal();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSimuladorActionPerformed

    private void btnTeoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeoricoActionPerformed
    abrirarchivo("src/Archivos/Teorico.pdf");
        abrirarchivo("Teorico.pdf");
    }//GEN-LAST:event_btnTeoricoActionPerformed

    private void btnNosotrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNosotrosActionPerformed
    abrirarchivo("src/Archivos/Sobre Nosotros.pdf");
        abrirarchivo("Sobre Nosotros.pdf");
    }//GEN-LAST:event_btnNosotrosActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargas;
    private javax.swing.JButton btnDistancia;
    private javax.swing.JButton btnFuerza;
    private javax.swing.JButton btnNosotros;
    private javax.swing.JButton btnSimulador;
    private javax.swing.JButton btnTeorico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}