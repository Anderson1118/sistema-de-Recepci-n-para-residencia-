
package Interfaz;

import Control.Habitaciones_db;
import Modelo.HabitacionM;
import Modelo.Habitacion_Estado;
import java.awt.BasicStroke;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class Pagina_habitaciones extends javax.swing.JFrame {
String habitacion="ninguna", Complemento="ninguno";
String c1,c2,c3,c4;
Habitaciones_db habitaciones_db=new Habitaciones_db();
int id;
    public Pagina_habitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());        
        
    }
    public Pagina_habitaciones(int ID) {
        initComponents();
        setLocationRelativeTo(null);
        this.id=ID;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_informe = new javax.swing.JButton();
        btn_moneda = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_basura = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_agregar = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_lupa = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_recursos = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        btn_finalizar = new javax.swing.JButton();
        Rbig = new javax.swing.JLabel();
        Rstand = new javax.swing.JLabel();
        Rsmall = new javax.swing.JLabel();
        check_nevera = new javax.swing.JRadioButton();
        check_escritorio = new javax.swing.JRadioButton();
        check_lavadora = new javax.swing.JRadioButton();
        check_silla = new javax.swing.JRadioButton();
        check_ninguno = new javax.swing.JRadioButton();
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
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 700, 262, 30));
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
        jPanel1.add(btn_volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 221, 70));

        btn_finalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Finalizar.png"))); // NOI18N
        btn_finalizar.setBorder(null);
        btn_finalizar.setContentAreaFilled(false);
        btn_finalizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Finalizar 2.png"))); // NOI18N
        btn_finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_finalizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 570, 221, 70));

        Rbig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Big room.png"))); // NOI18N
        Rbig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbigMouseClicked(evt);
            }
        });
        jPanel1.add(Rbig, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 184, 184));

        Rstand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Standard room.png"))); // NOI18N
        Rstand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RstandMouseClicked(evt);
            }
        });
        jPanel1.add(Rstand, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 184, 184));

        Rsmall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Small room.png"))); // NOI18N
        Rsmall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RsmallMouseClicked(evt);
            }
        });
        jPanel1.add(Rsmall, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 184, 184));

        check_nevera.setBackground(new java.awt.Color(255, 255, 255));
        check_nevera.setFont(new java.awt.Font("SF UI  Text", 0, 24)); // NOI18N
        check_nevera.setBorder(null);
        check_nevera.setContentAreaFilled(false);
        check_nevera.setFocusPainted(false);
        check_nevera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_neveraMousePressed(evt);
            }
        });
        check_nevera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_neveraActionPerformed(evt);
            }
        });
        jPanel1.add(check_nevera, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 180, 110));

        check_escritorio.setBackground(new java.awt.Color(255, 255, 255));
        check_escritorio.setBorder(null);
        check_escritorio.setContentAreaFilled(false);
        check_escritorio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_escritorio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_escritorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_escritorioMousePressed(evt);
            }
        });
        check_escritorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_escritorioActionPerformed(evt);
            }
        });
        jPanel1.add(check_escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 220, 110));

        check_lavadora.setBackground(new java.awt.Color(255, 255, 255));
        check_lavadora.setBorder(null);
        check_lavadora.setContentAreaFilled(false);
        check_lavadora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_lavadora.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_lavadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_lavadoraMousePressed(evt);
            }
        });
        jPanel1.add(check_lavadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 240, 110));

        check_silla.setBackground(new java.awt.Color(255, 255, 255));
        check_silla.setBorder(null);
        check_silla.setContentAreaFilled(false);
        check_silla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_silla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_silla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_sillaMousePressed(evt);
            }
        });
        jPanel1.add(check_silla, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 440, 170, 110));

        check_ninguno.setBackground(new java.awt.Color(255, 255, 255));
        check_ninguno.setBorder(null);
        check_ninguno.setContentAreaFilled(false);
        check_ninguno.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        check_ninguno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        check_ninguno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                check_ningunoMousePressed(evt);
            }
        });
        jPanel1.add(check_ninguno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 440, 180, 110));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9. Registrar arrendatario 3.png"))); // NOI18N
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

    private void btn_informeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_informeActionPerformed
        new Informe_habitacion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_informeActionPerformed

    private void btn_lupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lupaActionPerformed
        new Consultar_arrendatario("buscar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_lupaActionPerformed

    private void check_ningunoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_ningunoMousePressed
        check_escritorio.setSelected(false);
        check_lavadora.setSelected(false);
        check_nevera.setSelected(false);
        check_silla.setSelected(false);
    }//GEN-LAST:event_check_ningunoMousePressed

    private void check_neveraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_neveraMousePressed
        check_ninguno.setSelected(false);
    }//GEN-LAST:event_check_neveraMousePressed

    private void check_escritorioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_escritorioMousePressed
        check_ninguno.setSelected(false);
    }//GEN-LAST:event_check_escritorioMousePressed

    private void check_lavadoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_lavadoraMousePressed
        check_ninguno.setSelected(false);
    }//GEN-LAST:event_check_lavadoraMousePressed

    private void check_sillaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_sillaMousePressed
        check_ninguno.setSelected(false);
    }//GEN-LAST:event_check_sillaMousePressed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        new Pagina_registro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_volverActionPerformed

    private void btn_recursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recursosActionPerformed
        new Informe_pago().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_recursosActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        
    }//GEN-LAST:event_btn_agregarActionPerformed

    private void btn_basuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_basuraActionPerformed
        new Consultar_arrendatario("eliminar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_basuraActionPerformed

    private void btn_monedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monedaActionPerformed
        new Consultar_arrendatario("pagar").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_monedaActionPerformed

    private void RbigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbigMouseClicked
        habitacion="Grande";
        borde();
        Rbig.setBorder(new LineBorder(Color.black,5));
    }//GEN-LAST:event_RbigMouseClicked

    private void RstandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RstandMouseClicked
        habitacion="Estandar";
        borde();
        Rstand.setBorder(new LineBorder(Color.black,5));
    }//GEN-LAST:event_RstandMouseClicked

    private void RsmallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RsmallMouseClicked
        habitacion="Pequena";
        borde();
        Rsmall.setBorder(new LineBorder(Color.black,5));

    }//GEN-LAST:event_RsmallMouseClicked

    private void btn_finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_finalizarActionPerformed
        HabitacionM habitacionM=new HabitacionM();
        check();
        habitacionM.setTipo(habitacion);
        habitacionM.setComplemento(Complemento);
        habitacionM.setArrendador(id);
        if(habitaciones_db.registrar(habitacionM) && Informe_habitacion()){
            JOptionPane.showMessageDialog(this, "Se guardo la habitacion", "Reservacion", JOptionPane.INFORMATION_MESSAGE);            
        }
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_finalizarActionPerformed

    private void check_neveraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_neveraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_neveraActionPerformed

    private void check_escritorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_escritorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_check_escritorioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public boolean Informe_habitacion() {
        Habitacion_Estado habitacion_Estado=new Habitacion_Estado();
        habitaciones_db.buscarInformacion(habitacion_Estado);
        if(!(habitacion_Estado.getGrande()<4)){
            JOptionPane.showMessageDialog(this, "No hay habitaciones grandes disponibles", "Reservacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        } else
        if(!(habitacion_Estado.getEstandar()<4)){
            JOptionPane.showMessageDialog(this, "No hay habitaciones estandar disponibles", "Reservacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else
        if(!(habitacion_Estado.getPequena()<4)){
            JOptionPane.showMessageDialog(this, "No hay habitaciones pequeñas disponibles", "Reservacion", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }
            
    }
    
    public void borde(){
      Rbig.setBorder(null);
      Rstand.setBorder(null);
      Rsmall.setBorder(null);
    }
    
    public void check(){
        if(check_nevera.isSelected()){
            c1="nevera";
        }else{
            c1="";
        }
        if(check_escritorio.isSelected()){
            c2="escritorio";
        }else{
            c2="";
        }
        if(check_silla.isSelected()){
            c3="silla";
        }else{
            c3="";
        }
        if(check_lavadora.isSelected()){
            c4="lavadora";
        }else{
            c4="";
        }
        if(check_ninguno.isSelected()){
             Complemento="ninguno";
        }else{
            Complemento=c1+","+c2+","+c3+","+c4;
        }
    }
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagina_habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Rbig;
    private javax.swing.JLabel Rsmall;
    private javax.swing.JLabel Rstand;
    private javax.swing.JLabel bg;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_basura;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_finalizar;
    private javax.swing.JButton btn_informe;
    private javax.swing.JButton btn_lupa;
    private javax.swing.JButton btn_minimizar;
    private javax.swing.JButton btn_moneda;
    private javax.swing.JButton btn_recursos;
    private javax.swing.JButton btn_volver;
    private javax.swing.JRadioButton check_escritorio;
    private javax.swing.JRadioButton check_lavadora;
    private javax.swing.JRadioButton check_nevera;
    private javax.swing.JRadioButton check_ninguno;
    private javax.swing.JRadioButton check_silla;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
