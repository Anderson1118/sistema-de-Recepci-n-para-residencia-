
package Interfaz;

import Control.Arrendador_db;
import Control.Pagos_db;
import Control.Habitaciones_db;

import Modelo.ArrendadorM;
import Modelo.PagosM;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class Datos_arrendador_pago extends javax.swing.JFrame {
    Pagos_db pagos_db=new Pagos_db();
    Arrendador_db arrendador_db=new Arrendador_db();
    Habitaciones_db habitaciones_db=new Habitaciones_db();
    double sumaComplemento=0;
    public Datos_arrendador_pago() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());        
       
    }

        public Datos_arrendador_pago(ArrendadorM arrendadorM) {
        initComponents();
        setLocationRelativeTo(null);
       
            txt_nombre.setText(arrendadorM.getNombre());
            txt_apellido.setText(arrendadorM.getApellido());
            txt_id.setText(arrendadorM.getID()+"");
            txt_celular.setText(arrendadorM.getCelular());
            
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_recursos = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_lupa = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_agregar = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_basura = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_moneda = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_informe = new javax.swing.JButton();
        txt_nombre = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_celular = new javax.swing.JTextField();
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_Confirmar = new javax.swing.JButton();
        check_validar = new javax.swing.JRadioButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 260, 30));

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
        jPanel1.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 690, 99, 60));

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
        jPanel1.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 99, 60));

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
        jPanel1.add(filler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 690, 99, 60));

        btn_moneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Moneda.png"))); // NOI18N
        btn_moneda.setBorder(null);
        btn_moneda.setContentAreaFilled(false);
        btn_moneda.setEnabled(false);
        btn_moneda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Moneda 2.png"))); // NOI18N
        btn_moneda.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_moneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monedaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 680, 80, 80));
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 710, 262, 30));

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

        txt_nombre.setBackground(new java.awt.Color(196, 196, 196));
        txt_nombre.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(81, 81, 81));
        txt_nombre.setBorder(null);
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreMouseClicked(evt);
            }
        });
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
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
        jPanel1.add(txt_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 380, 40));

        txt_apellido.setBackground(new java.awt.Color(196, 196, 196));
        txt_apellido.setFont(new java.awt.Font("SF UI  Text G", 0, 34)); // NOI18N
        txt_apellido.setForeground(new java.awt.Color(81, 81, 81));
        txt_apellido.setBorder(null);
        txt_apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_apellidoMouseClicked(evt);
            }
        });
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
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
        txt_celular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_celularActionPerformed(evt);
            }
        });
        jPanel1.add(txt_celular, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 390, 40));

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

        btn_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver.png"))); // NOI18N
        btn_volver.setBorder(null);
        btn_volver.setContentAreaFilled(false);
        btn_volver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver 2.png"))); // NOI18N
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 221, 70));

        btn_Confirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Confirmar.png"))); // NOI18N
        btn_Confirmar.setBorder(null);
        btn_Confirmar.setContentAreaFilled(false);
        btn_Confirmar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Confirmar 2.png"))); // NOI18N
        btn_Confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Confirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 221, 70));

        check_validar.setBorder(null);
        check_validar.setContentAreaFilled(false);
        check_validar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_validar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_validar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_validarMousePressed(evt);
            }
        });
        jPanel1.add(check_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 463, 270, 50));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12. Datos Arrendador.png"))); // NOI18N
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

    private void btn_lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lupaActionPerformed
        new Consultar_arrendatario("buscar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_lupaActionPerformed

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        new Informe_habitacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_informeActionPerformed

    private void txt_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreMouseClicked

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_idMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idMouseClicked

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_apellidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoMouseClicked

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_celularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_celularMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularMouseClicked

    private void txt_celularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_celularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_celularActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void check_validarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_validarMousePressed

    }//GEN-LAST:event_check_validarMousePressed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recursosActionPerformed
        new Informe_pago().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_recursosActionPerformed

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

    private void btn_ConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmarActionPerformed
        if(check_validar.isSelected()){
            String tipo=pagos_db.buscarhabitacion(Integer.parseInt(txt_id.getText()));
            double pagoG=600000, pagoE=500000, pagoP=300000;
            calcular();
            PagosM pagosM=new PagosM();
            pagosM.setEstado("validado");
            switch (tipo) {
                case "Grande":
                    pagosM.setPago(pagoG);
                    pagosM.setTotal(pagoG+sumaComplemento);
                    break;
                case "Estandar":
                    pagosM.setPago(pagoE);
                    pagosM.setTotal(pagoE+sumaComplemento);
                    break;
                case "Pequena":
                    pagosM.setPago(pagoP);
                    pagosM.setTotal(pagoP+sumaComplemento);
                    break;
                default:
                    break;
            }
            
            pagosM.setArrendador(Integer.parseInt(txt_id.getText())); 
            if(pagos_db.registrar(pagosM)){
                JOptionPane.showMessageDialog(this, "Pago recibido", "Validar", JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pago sin validar", "Validar", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_btn_ConfirmarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public ArrayList<String> cantidad(){
        String complemeto=habitaciones_db.buscarInformacionComplemento(Integer.parseInt(txt_id.getText()));
            String sil[]=complemeto.split(",");
            ArrayList<String> cadena =new ArrayList();
        for (String sil1 : sil) {
            if (!sil1.isEmpty()) {
                cadena.add(sil1);
            }
        }
        return cadena;
    }
    
    public void calcular(){
        ArrayList<String> cantidad2=cantidad();
        if(!cantidad2.get(0).equals("ninguno")){
            for (int i = 0; i < cantidad2.size(); i++) {
                if(cantidad2.get(i).equals("nevera")){
                    sumaComplemento+=50000;
                }else if(cantidad2.get(i).equals("escritorio")){
                    sumaComplemento+=10000;
                }
                else if(cantidad2.get(i).equals("silla")){
                    sumaComplemento+=5000;
                }
                else if(cantidad2.get(i).equals("lavadora")){
                    sumaComplemento+=20000;
                }
            }   
        }
        
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
            java.util.logging.Logger.getLogger(Datos_arrendador_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos_arrendador_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos_arrendador_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos_arrendador_pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos_arrendador_pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_Confirmar;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_basura;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_informe;
    private javax.swing.JButton btn_lupa;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_moneda;
    private javax.swing.JButton btn_recursos;
    private javax.swing.JButton btn_volver;
    private javax.swing.JRadioButton check_validar;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
