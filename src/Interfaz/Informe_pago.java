
package Interfaz;
import Control.Pagos_db;
import javax.swing.ImageIcon;

public class Informe_pago extends javax.swing.JFrame {
    Pagos_db pagos_db=new Pagos_db();
  
    public Informe_pago() {
        initComponents();
        setLocationRelativeTo(null);
       listP.setModel(pagos_db.buscarInformacion());
       txt_total.setText("$"+pagos_db.buscarPago());
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_informe = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_moneda = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_basura = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_agregar = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_lupa = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_recursos = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        btn_volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listP = new javax.swing.JList<>();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Menú principal.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Menú principal 2.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 5, -1, -1));

        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        btn_minimizar.setBorder(null);
        btn_minimizar.setContentAreaFilled(false);
        btn_minimizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar 2.png"))); // NOI18N
        btn_minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 10, 28, 29));

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        btn_cerrar.setBorder(null);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar 2.png"))); // NOI18N
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 10, 28, 28));

        btn_informe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Informe.png"))); // NOI18N
        btn_informe.setBorder(null);
        btn_informe.setContentAreaFilled(false);
        btn_informe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Informe 2.png"))); // NOI18N
        btn_informe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_informe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_informeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_informe, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 680, 80, 80));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 710, 262, 30));

        btn_moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Moneda.png"))); // NOI18N
        btn_moneda.setBorder(null);
        btn_moneda.setContentAreaFilled(false);
        btn_moneda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Moneda 2.png"))); // NOI18N
        btn_moneda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monedaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 80, 80));
        jPanel1.add(filler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 99, 60));

        btn_basura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Basura.png"))); // NOI18N
        btn_basura.setBorder(null);
        btn_basura.setContentAreaFilled(false);
        btn_basura.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Basura 2.png"))); // NOI18N
        btn_basura.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_basura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_basuraActionPerformed(evt);
            }
        });
        jPanel1.add(btn_basura, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 680, 80, 80));
        jPanel1.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 99, 60));

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Agregar.png"))); // NOI18N
        btn_agregar.setBorder(null);
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Agregar 2.png"))); // NOI18N
        btn_agregar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 680, 80, 80));
        jPanel1.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 99, 60));

        btn_lupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Lupa.png"))); // NOI18N
        btn_lupa.setBorder(null);
        btn_lupa.setContentAreaFilled(false);
        btn_lupa.setPreferredSize(new java.awt.Dimension(80, 80));
        btn_lupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Lupa 2.png"))); // NOI18N
        btn_lupa.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_lupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lupaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_lupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 680, 80, 80));
        jPanel1.add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 260, 30));

        btn_recursos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Recursos.png"))); // NOI18N
        btn_recursos.setBorder(null);
        btn_recursos.setContentAreaFilled(false);
        btn_recursos.setEnabled(false);
        btn_recursos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Recursos 2.png"))); // NOI18N
        jPanel1.add(btn_recursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 685, 80, 80));

        txt_total.setBackground(new java.awt.Color(196, 196, 196));
        txt_total.setFont(new java.awt.Font("SF UI  Text", 0, 38)); // NOI18N
        txt_total.setForeground(new java.awt.Color(0, 0, 0));
        txt_total.setText("$$$$$$$$$$$$$");
        txt_total.setBorder(null);
        txt_total.setDragEnabled(true);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel1.add(txt_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(825, 360, 330, 40));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver blanco.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.setContentAreaFilled(false);
        btn_volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver 2.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 540, 221, 70));

        listP.setFont(new java.awt.Font("SF UI  Text", 0, 36)); // NOI18N
        listP.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Personas" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listP);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 460, 260));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.  Recursos.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

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

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lupaActionPerformed
        new Consultar_arrendatario("buscar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_lupaActionPerformed

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        new Informe_habitacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_informeActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        new Pagina_registro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_basuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basuraActionPerformed
        new Consultar_arrendatario("eliminar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_basuraActionPerformed

    private void btn_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monedaActionPerformed
        new Consultar_arrendatario("pagar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_monedaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Informe_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informe_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_basura;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_informe;
    private javax.swing.JButton btn_lupa;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_moneda;
    private javax.swing.JButton btn_recursos;
    private javax.swing.JButton btn_volver;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listP;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
