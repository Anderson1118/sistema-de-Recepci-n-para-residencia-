
package Interfaz;

import Control.Habitaciones_db;
import Modelo.Habitacion_Estado;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Informe_habitacion extends javax.swing.JFrame {
    Habitaciones_db habitaciones_db=new Habitaciones_db();
    
    
    public Informe_habitacion() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());        
        
        Habitacion_Estado habitacion_Estado=new Habitacion_Estado();
        habitaciones_db.buscarInformacion(habitacion_Estado);
        System.out.println(habitacion_Estado.getEstandar());
        JLabel gd[]={roombig1, roombig2, roombig3, roombig4};
        JLabel et[]={roomstandar1, roomstandar2, roomstandar3, roomstandar4};
        JLabel pq[]={roomsmall1, roomsmall2, roomsmall3, roomsmall4};
        
        for(int i=0; i<habitacion_Estado.getGrande(); i++){
            gd[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/OCUPADO.png")));
        }
        for(int i=0; i<habitacion_Estado.getEstandar(); i++){
            et[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/OCUPADO.png")));
        }
        for(int i=0; i<habitacion_Estado.getPequena(); i++){
            pq[i].setIcon(new ImageIcon(getClass().getResource("/Imagenes/OCUPADO.png")));
        }
        habitaciones_db.buscarInformacionPago(habitacion_Estado);
        JLabel gd2[]={lbEstadoGrande, lbEstadoGrande2, lbEstadoGrande3, lbEstadoGrande4};
        JLabel et2[]={lbEstadoEstandar, lbEstadoEstandar2, lbEstadoEstandar3, lbEstadoEstandar4};
        JLabel pq2[]={lbEstadoPequena, lbEstadoPequena2, lbEstadoPequena3, lbEstadoPequena4};
        int cn=1;
        for(int i=0; i<habitacion_Estado.getGrande(); i++){
            gd2[i].setText("Pieza "+cn+++"G: Pago");
        }
        cn=0;
        for(int i=0; i<habitacion_Estado.getEstandar(); i++){
            et2[i].setText("Pieza "+cn+++"E: Pago");
        }
        cn=0;
        for(int i=0; i<habitacion_Estado.getPequena(); i++){
            pq2[i].setText("Pieza "+cn+++"P: Pago");
        }
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_informe = new javax.swing.JButton();
        btn_moneda = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_basura = new javax.swing.JButton();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jButton3 = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_lupa = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btn_recursos = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        btn_minimizar = new javax.swing.JButton();
        roombig1 = new javax.swing.JLabel();
        roombig2 = new javax.swing.JLabel();
        roombig3 = new javax.swing.JLabel();
        roombig4 = new javax.swing.JLabel();
        roomstandar1 = new javax.swing.JLabel();
        roomstandar2 = new javax.swing.JLabel();
        roomstandar3 = new javax.swing.JLabel();
        roomstandar4 = new javax.swing.JLabel();
        roomsmall1 = new javax.swing.JLabel();
        roomsmall2 = new javax.swing.JLabel();
        roomsmall3 = new javax.swing.JLabel();
        roomsmall4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbEstadoGrande3 = new javax.swing.JLabel();
        lbEstadoGrande = new javax.swing.JLabel();
        lbEstadoGrande4 = new javax.swing.JLabel();
        lbEstadoEstandar = new javax.swing.JLabel();
        lbEstadoEstandar2 = new javax.swing.JLabel();
        lbEstadoEstandar3 = new javax.swing.JLabel();
        lbEstadoPequena = new javax.swing.JLabel();
        lbEstadoEstandar4 = new javax.swing.JLabel();
        lbEstadoPequena2 = new javax.swing.JLabel();
        lbEstadoPequena3 = new javax.swing.JLabel();
        lbEstadoPequena4 = new javax.swing.JLabel();
        lbEstadoGrande2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_informe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Informe.png"))); // NOI18N
        btn_informe.setBorder(null);
        btn_informe.setContentAreaFilled(false);
        btn_informe.setEnabled(false);
        btn_informe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Informe 2.png"))); // NOI18N
        btn_informe.setVerticalAlignment(javax.swing.SwingConstants.TOP);
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
        jPanel1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 710, 262, 30));

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
        jPanel1.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 690, 99, 60));

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
        btn_recursos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón Recursos 2.png"))); // NOI18N
        btn_recursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recursosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_recursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 685, 80, 80));

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

        roombig1.setBackground(new java.awt.Color(0, 0, 0));
        roombig1.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roombig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roombig1.setText("1G");
        roombig1.setToolTipText("");
        roombig1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roombig1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roombig1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 97, 120));

        roombig2.setBackground(new java.awt.Color(0, 0, 0));
        roombig2.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roombig2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roombig2.setText("2G");
        roombig2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roombig2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roombig2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 97, 120));

        roombig3.setBackground(new java.awt.Color(0, 0, 0));
        roombig3.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roombig3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roombig3.setText("3G");
        roombig3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roombig3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roombig3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 97, 120));

        roombig4.setBackground(new java.awt.Color(0, 0, 0));
        roombig4.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roombig4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roombig4.setText("4G");
        roombig4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roombig4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roombig4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 97, 120));

        roomstandar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomstandar1.setText("1E");
        roomstandar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomstandar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomstandar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 97, 120));

        roomstandar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomstandar2.setText("2E");
        roomstandar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomstandar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomstandar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 170, 97, 120));

        roomstandar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomstandar3.setText("3E");
        roomstandar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomstandar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomstandar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 97, 120));

        roomstandar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomstandar4.setText("4E");
        roomstandar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomstandar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomstandar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 310, 97, 120));

        roomsmall1.setBackground(new java.awt.Color(0, 0, 0));
        roomsmall1.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roomsmall1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomsmall1.setText("1P");
        roomsmall1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomsmall1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomsmall1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, 97, 120));

        roomsmall2.setBackground(new java.awt.Color(0, 0, 0));
        roomsmall2.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roomsmall2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomsmall2.setText("2P");
        roomsmall2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomsmall2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomsmall2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 170, 97, 120));

        roomsmall3.setBackground(new java.awt.Color(0, 0, 0));
        roomsmall3.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roomsmall3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomsmall3.setText("3P");
        roomsmall3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomsmall3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomsmall3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 300, 97, 120));

        roomsmall4.setBackground(new java.awt.Color(0, 0, 0));
        roomsmall4.setFont(new java.awt.Font("SF UI  Text", 0, 14)); // NOI18N
        roomsmall4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DISPONIBLE.png"))); // NOI18N
        roomsmall4.setText("4P");
        roomsmall4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        roomsmall4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(roomsmall4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 300, 97, 120));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botón volver 2.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 595, 221, 70));

        lbEstadoGrande3.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoGrande3.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoGrande3.setText("Pieza 3G: Pendiente");
        jPanel1.add(lbEstadoGrande3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, -1, -1));

        lbEstadoGrande.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoGrande.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoGrande.setText("Pieza 1G: Pendiente");
        jPanel1.add(lbEstadoGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, -1, -1));

        lbEstadoGrande4.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoGrande4.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoGrande4.setText("Pieza 4G: Pendiente");
        jPanel1.add(lbEstadoGrande4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        lbEstadoEstandar.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoEstandar.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoEstandar.setText("Pieza 1E: Pendiente");
        jPanel1.add(lbEstadoEstandar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        lbEstadoEstandar2.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoEstandar2.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoEstandar2.setText("Pieza 2E: Pendiente");
        jPanel1.add(lbEstadoEstandar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, -1, -1));

        lbEstadoEstandar3.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoEstandar3.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoEstandar3.setText("Pieza 3E: Pendiente");
        jPanel1.add(lbEstadoEstandar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        lbEstadoPequena.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoPequena.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoPequena.setText("Pieza 1P: Pendiente");
        jPanel1.add(lbEstadoPequena, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 500, -1, -1));

        lbEstadoEstandar4.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoEstandar4.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoEstandar4.setText("Pieza 4E: Pendiente");
        jPanel1.add(lbEstadoEstandar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        lbEstadoPequena2.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoPequena2.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoPequena2.setText("Pieza 2P: Pendiente");
        jPanel1.add(lbEstadoPequena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 500, -1, -1));

        lbEstadoPequena3.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoPequena3.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoPequena3.setText("Pieza 3P: Pendiente");
        jPanel1.add(lbEstadoPequena3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 570, -1, -1));

        lbEstadoPequena4.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoPequena4.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoPequena4.setText("Pieza 4P: Pendiente");
        jPanel1.add(lbEstadoPequena4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 570, -1, -1));

        lbEstadoGrande2.setBackground(new java.awt.Color(0, 0, 0));
        lbEstadoGrande2.setFont(new java.awt.Font("SF UI  Text", 0, 16)); // NOI18N
        lbEstadoGrande2.setText("Pieza 2G: Pendiente");
        jPanel1.add(lbEstadoGrande2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5. Informe.png"))); // NOI18N
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

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btn_minimizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Menu_principal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Informe_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informe_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informe_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informe_habitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informe_habitacion().setVisible(true);
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
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbEstadoEstandar;
    private javax.swing.JLabel lbEstadoEstandar2;
    private javax.swing.JLabel lbEstadoEstandar3;
    private javax.swing.JLabel lbEstadoEstandar4;
    private javax.swing.JLabel lbEstadoGrande;
    private javax.swing.JLabel lbEstadoGrande2;
    private javax.swing.JLabel lbEstadoGrande3;
    private javax.swing.JLabel lbEstadoGrande4;
    private javax.swing.JLabel lbEstadoPequena;
    private javax.swing.JLabel lbEstadoPequena2;
    private javax.swing.JLabel lbEstadoPequena3;
    private javax.swing.JLabel lbEstadoPequena4;
    private javax.swing.JLabel roombig1;
    private javax.swing.JLabel roombig2;
    private javax.swing.JLabel roombig3;
    private javax.swing.JLabel roombig4;
    private javax.swing.JLabel roomsmall1;
    private javax.swing.JLabel roomsmall2;
    private javax.swing.JLabel roomsmall3;
    private javax.swing.JLabel roomsmall4;
    private javax.swing.JLabel roomstandar1;
    private javax.swing.JLabel roomstandar2;
    private javax.swing.JLabel roomstandar3;
    private javax.swing.JLabel roomstandar4;
    // End of variables declaration//GEN-END:variables
}
