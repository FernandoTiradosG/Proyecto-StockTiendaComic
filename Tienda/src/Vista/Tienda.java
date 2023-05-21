package Vista;

import Controlador.Controlador;
import bbdd.Conexion;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Tienda extends javax.swing.JFrame {
    
    private static DefaultTableModel modeloTabla;
    
    public Tienda() {
        initComponents();
        
        String[] comics = {"ID", "Nombre", "Heroe", "Autores", "Editorial", "Precio", "Cantidad"};
        modeloTabla = new DefaultTableModel(null, comics);
        TablaPrincipal.setModel(modeloTabla);
        new Controlador().cargarStock(modeloTabla);
        setVisible(true);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAñadir = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        textID = new javax.swing.JTextField();
        textHeroe = new javax.swing.JTextField();
        textAutores = new javax.swing.JTextField();
        textEditorial = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textDisponibles = new javax.swing.JTextField();
        BotonVender = new javax.swing.JButton();
        BotonPedir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPrincipal = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ModNombre = new javax.swing.JButton();
        ModHeroe = new javax.swing.JButton();
        ModAutores = new javax.swing.JButton();
        ModEditorial = new javax.swing.JButton();
        ModPrecio = new javax.swing.JButton();
        btnGuradarDatos = new javax.swing.JButton();
        ElecionBuscar = new javax.swing.JComboBox<>();
        btnCatalogo = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAñadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/nuevas-caracteristicas.png"))); // NOI18N
        btnAñadir.setBorderPainted(false);
        btnAñadir.setContentAreaFilled(false);
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.setFocusPainted(false);
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/VentasPedidos.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 10, 10, 490));

        textID.setEditable(false);
        jPanel1.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 290, -1));

        textHeroe.setEditable(false);
        jPanel1.add(textHeroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 290, -1));

        textAutores.setEditable(false);
        jPanel1.add(textAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 290, -1));

        textEditorial.setEditable(false);
        jPanel1.add(textEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 290, -1));

        textPrecio.setEditable(false);
        jPanel1.add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 290, -1));

        textDisponibles.setEditable(false);
        jPanel1.add(textDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 224, -1));

        BotonVender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Vender.png"))); // NOI18N
        BotonVender.setBorder(null);
        BotonVender.setBorderPainted(false);
        BotonVender.setContentAreaFilled(false);
        BotonVender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonVender.setFocusPainted(false);
        BotonVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonVenderActionPerformed(evt);
            }
        });
        jPanel1.add(BotonVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 140, -1));

        BotonPedir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Pedir.png"))); // NOI18N
        BotonPedir.setBorder(null);
        BotonPedir.setBorderPainted(false);
        BotonPedir.setContentAreaFilled(false);
        BotonPedir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPedirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 380, 140, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 67, 22));

        btnBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btnBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 230, -1));

        textNombre.setEditable(false);
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 290, -1));

        TablaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Heroe", "Editorial", "Precio", "Disponibles"
            }
        ));
        TablaPrincipal.setShowGrid(false);
        TablaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPrincipal);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 31, 492, 250));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 78, 22));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Heroe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 60, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Autores");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 60, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Editorial");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 60, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 60, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Disponibles");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 72, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jLabel8.setText("Stock");
        jLabel8.setToolTipText("");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel9.setText("Datos del Comic");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, -1));

        ModNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/selecionar.png"))); // NOI18N
        ModNombre.setBorder(null);
        ModNombre.setBorderPainted(false);
        ModNombre.setContentAreaFilled(false);
        ModNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModNombreActionPerformed(evt);
            }
        });
        jPanel1.add(ModNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 100, 33, -1));

        ModHeroe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/selecionar.png"))); // NOI18N
        ModHeroe.setToolTipText("");
        ModHeroe.setBorder(null);
        ModHeroe.setBorderPainted(false);
        ModHeroe.setContentAreaFilled(false);
        ModHeroe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModHeroe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModHeroeActionPerformed(evt);
            }
        });
        jPanel1.add(ModHeroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 130, 33, -1));

        ModAutores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/selecionar.png"))); // NOI18N
        ModAutores.setToolTipText("");
        ModAutores.setBorder(null);
        ModAutores.setBorderPainted(false);
        ModAutores.setContentAreaFilled(false);
        ModAutores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModAutoresActionPerformed(evt);
            }
        });
        jPanel1.add(ModAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 160, 33, -1));

        ModEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/selecionar.png"))); // NOI18N
        ModEditorial.setToolTipText("");
        ModEditorial.setBorder(null);
        ModEditorial.setBorderPainted(false);
        ModEditorial.setContentAreaFilled(false);
        ModEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModEditorialActionPerformed(evt);
            }
        });
        jPanel1.add(ModEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 190, 33, -1));

        ModPrecio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/selecionar.png"))); // NOI18N
        ModPrecio.setToolTipText("");
        ModPrecio.setBorder(null);
        ModPrecio.setBorderPainted(false);
        ModPrecio.setContentAreaFilled(false);
        ModPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(ModPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 220, 33, -1));

        btnGuradarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/actualizar.png"))); // NOI18N
        btnGuradarDatos.setBorder(null);
        btnGuradarDatos.setBorderPainted(false);
        btnGuradarDatos.setContentAreaFilled(false);
        btnGuradarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuradarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuradarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, -1, -1));

        ElecionBuscar.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ElecionBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Heroe", "Autores", "Editorial", "Precio" }));
        jPanel1.add(ElecionBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, -1, -1));

        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/catalogo.png"))); // NOI18N
        btnCatalogo.setBorderPainted(false);
        btnCatalogo.setContentAreaFilled(false);
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/lupa.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/26761.jpg"))); // NOI18N
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.setDoubleBuffered(true);
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 1000, 520));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        Catalogo catalogo = new Catalogo();
        catalogo.setVisible(true);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnGuradarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuradarDatosActionPerformed
        new Controlador().modificar(textID, textHeroe, textAutores, textEditorial, textNombre, textPrecio);
        new Controlador().cargarStock(modeloTabla);
        textNombre.setEditable(false);
        textHeroe.setEditable(false);
        textAutores.setEditable(false);
        textEditorial.setEditable(false);
        textPrecio.setEditable(false);
    }//GEN-LAST:event_btnGuradarDatosActionPerformed

    private void ModPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModPrecioActionPerformed

        if(textPrecio.isEditable()){
            textPrecio.setEditable(false);
        }else{
            textPrecio.setEditable(true);
        }
    }//GEN-LAST:event_ModPrecioActionPerformed

    private void ModEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModEditorialActionPerformed

        if(textEditorial.isEditable()){
            textEditorial.setEditable(false);
        }else{
            textEditorial.setEditable(true);
        }

    }//GEN-LAST:event_ModEditorialActionPerformed

    private void ModAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModAutoresActionPerformed

        if(textAutores.isEditable()){
            textAutores.setEditable(false);
        }else{
            textAutores.setEditable(true);
        }
    }//GEN-LAST:event_ModAutoresActionPerformed

    private void ModHeroeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModHeroeActionPerformed

        if(textHeroe.isEditable()){
            textHeroe.setEditable(false);
        }else{
            textHeroe.setEditable(true);
        }

    }//GEN-LAST:event_ModHeroeActionPerformed

    private void ModNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModNombreActionPerformed

        if(textNombre.isEditable()){
            textNombre.setEditable(false);
        }else{
            textNombre.setEditable(true);
        }

    }//GEN-LAST:event_ModNombreActionPerformed

    private void TablaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaPrincipalMouseClicked

        if(evt.getClickCount() == 1 ){

            JTable receptor = (JTable)evt.getSource();

            textID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            textNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            textHeroe.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            textAutores.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            textEditorial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            textPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            textDisponibles.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),6).toString());

        }
    }//GEN-LAST:event_TablaPrincipalMouseClicked

    private void btnBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnBuscarKeyReleased
        limpiar();
        new Controlador().buscar(btnBuscar.getText(), modeloTabla, ElecionBuscar);
        String vacio = btnBuscar.getText();
        if(vacio.equals("")){
            new Controlador().cargarStock(modeloTabla);
        }
    }//GEN-LAST:event_btnBuscarKeyReleased

    private void BotonPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedirActionPerformed
        String texto = textDisponibles.getText();
        int valor = Integer.parseInt(texto);

        new Controlador().pedir(textID, textNombre, textPrecio);
        new Controlador().cargarStock(modeloTabla);
        valor += 1;

        textDisponibles.setText(String.valueOf(valor));

    }//GEN-LAST:event_BotonPedirActionPerformed

    private void BotonVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonVenderActionPerformed
        // TODO add your handling code here:
        String texto = textDisponibles.getText();
        int valor = Integer.parseInt(texto);
        if(valor > 0){
            new Controlador().vender(textID, textNombre, textPrecio);
            new Controlador().cargarStock(modeloTabla);
            valor -= 1;

            textDisponibles.setText(String.valueOf(valor));
        }else{
            SinExistencias ventana2 = new SinExistencias();
            ventana2.setVisible(true);
        }
    }//GEN-LAST:event_BotonVenderActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Ventas_pedidos pag = new Ventas_pedidos();
        pag.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        AñadirC nuevo = new AñadirC();
        nuevo.setVisible(true);
    }//GEN-LAST:event_btnAñadirActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tienda().setVisible(true);
            }
        });
    }
    
    public void limpiar(){
        while(modeloTabla.getRowCount()>0){
            modeloTabla.removeRow(0);
        }
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPedir;
    private javax.swing.JButton BotonVender;
    private javax.swing.JComboBox<String> ElecionBuscar;
    private javax.swing.JButton ModAutores;
    private javax.swing.JButton ModEditorial;
    private javax.swing.JButton ModHeroe;
    private javax.swing.JButton ModNombre;
    private javax.swing.JButton ModPrecio;
    private javax.swing.JTable TablaPrincipal;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JTextField btnBuscar;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnGuradarDatos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField textAutores;
    private javax.swing.JTextField textDisponibles;
    private javax.swing.JTextField textEditorial;
    private javax.swing.JTextField textHeroe;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNombre;
    private javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
