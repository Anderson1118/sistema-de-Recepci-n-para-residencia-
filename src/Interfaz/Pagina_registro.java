
package Interfaz;

import Modelo.ArrendadorM;
import Control.Arrendador_db;
import Control.tipoCampo;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pagina_registro extends javax.swing.JFrame {
Arrendador_db arrendador_db=new Arrendador_db();
   
    public Pagina_registro() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_estado_laboral = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        txt_cargo = new javax.swing.JTextField();
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
        btn_volver = new javax.swing.JButton();
        btn_siguiente = new javax.swing.JButton();
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

        txt_nombre.setBackground(new java.awt.Color(196, 196, 196));
        txt_nombre.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(81, 81, 81));
        txt_nombre.setBorder(null);
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreMouseClicked(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 218, 380, 40));

        txt_id.setBackground(new java.awt.Color(196, 196, 196));
        txt_id.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_id.setForeground(new java.awt.Color(81, 81, 81));
        txt_id.setBorder(null);
        txt_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_idMouseClicked(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        txt_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_idKeyTyped(evt);
            }
        });
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 380, 40));

        txt_estado_laboral.setBackground(new java.awt.Color(196, 196, 196));
        txt_estado_laboral.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_estado_laboral.setForeground(new java.awt.Color(81, 81, 81));
        txt_estado_laboral.setBorder(null);
        txt_estado_laboral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_estado_laboralMouseClicked(evt);
            }
        });
        jPanel1.add(txt_estado_laboral, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 380, 40));

        txt_apellido.setBackground(new java.awt.Color(196, 196, 196));
        txt_apellido.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(81, 81, 81));
        txt_apellido.setBorder(null);
        txt_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoMouseClicked(evt);
            }
        });
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 218, 470, 40));

        txt_celular.setBackground(new java.awt.Color(196, 196, 196));
        txt_celular.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_celular.setForeground(new java.awt.Color(81, 81, 81));
        txt_celular.setBorder(null);
        txt_celular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_celularMouseClicked(evt);
            }
        });
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 390, 40));

        txt_cargo.setBackground(new java.awt.Color(196, 196, 196));
        txt_cargo.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_cargo.setForeground(new java.awt.Color(81, 81, 81));
        txt_cargo.setBorder(null);
        txt_cargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cargoMouseClicked(evt);
            }
        });
        jPanel1.add(txt_cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 430, 380, 40));

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
        btn_agregar.setEnabled(false);
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
        btn_recursos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Recursos 2.png"))); // NOI18N
        btn_recursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recursosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_recursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 685, 80, 80));

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.setContentAreaFilled(false);
        btn_volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver 2.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 540, 221, 70));

        btn_siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Siguiente.png"))); // NOI18N
        btn_siguiente.setBorder(null);
        btn_siguiente.setContentAreaFilled(false);
        btn_siguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Siguiente 2.png"))); // NOI18N
        btn_siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 221, 70));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8. Registrar arrendatario.png"))); // NOI18N
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

    private void txt_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreMouseClicked

    private void txt_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idMouseClicked

    private void txt_estado_laboralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_estado_laboralMouseClicked

    }//GEN-LAST:event_txt_estado_laboralMouseClicked

    private void txt_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoMouseClicked

    private void txt_celularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_celularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularMouseClicked

    private void txt_cargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cargoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cargoMouseClicked

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        new Informe_habitacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_informeActionPerformed

    private void btn_lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lupaActionPerformed
        new Consultar_arrendatario("buscar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_lupaActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recursosActionPerformed
        new Informe_pago().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_recursosActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_basuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basuraActionPerformed
        new Consultar_arrendatario("eliminar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_basuraActionPerformed

    private void btn_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monedaActionPerformed
        new Consultar_arrendatario("pagar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_monedaActionPerformed

    private void btn_siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siguienteActionPerformed

        ArrendadorM arrendadorM=new ArrendadorM();
        arrendadorM.setID(Integer.parseInt(txt_id.getText()));
        arrendadorM.setNombre(txt_nombre.getText());
        arrendadorM.setApellido(txt_apellido.getText());
        arrendadorM.setCelular(txt_celular.getText());
        arrendadorM.setCargo(txt_cargo.getText());
        arrendadorM.setEstado_laboral(txt_estado_laboral.getText());
        if(arrendador_db.registrar(arrendadorM)){
            JOptionPane.showMessageDialog(this, "Se guardo el arrendador", "Reservacion", JOptionPane.INFORMATION_MESSAGE);
            new Pagina_habitaciones(Integer.parseInt(txt_id.getText())).setVisible(true);
            this.dispose();
        }
        
        
    }//GEN-LAST:event_btn_siguienteActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idKeyTyped
        tipoCampo tCampo=new tipoCampo();
        tCampo.soloNumeros(evt);
    }//GEN-LAST:event_txt_idKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_registro().setVisible(true);
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
    private javax.swing.JButton btn_siguiente;
    private javax.swing.JButton btn_volver;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cargo;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_estado_laboral;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
