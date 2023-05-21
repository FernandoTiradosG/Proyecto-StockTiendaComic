/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Controlador;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FerTG
 */
public class Catalogo extends javax.swing.JFrame {

    private static DefaultTableModel modeloTabla;
    /**
     * Creates new form Catalogo
     */
    public Catalogo() {
        initComponents();
        
        String[] comics = {"ID", "Nombre", "Heroe", "Autores", "Editorial", "Precio"};
        modeloTabla = new DefaultTableModel(null, comics);
        jTable1.setModel(modeloTabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        textNombre = new javax.swing.JTextField();
        textHeroe = new javax.swing.JTextField();
        textAutores = new javax.swing.JTextField();
        textEditorial = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        textDisponibles = new javax.swing.JTextField();
        BotonPedir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/catalogar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel1.setText("ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 67, 22));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 78, 22));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel3.setText("Heroe");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel4.setText("Autores");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 60, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel5.setText("Editorial");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 60, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("¿Cuantos quieres?");
        jLabel7.setToolTipText("");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        textID.setEditable(false);
        jPanel1.add(textID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        textNombre.setEditable(false);
        jPanel1.add(textNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, -1));

        textHeroe.setEditable(false);
        jPanel1.add(textHeroe, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, -1));

        textAutores.setEditable(false);
        jPanel1.add(textAutores, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 190, -1));

        textEditorial.setEditable(false);
        jPanel1.add(textEditorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 190, -1));

        textPrecio.setEditable(false);
        jPanel1.add(textPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 190, -1));
        jPanel1.add(textDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 89, -1));

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
        jPanel1.add(BotonPedir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/4904551.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 970, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        while(modeloTabla.getRowCount()>0){
//            modeloTabla.removeRow(0);
//        }
        
        new Controlador().leerInforme(jTable1);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BotonPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPedirActionPerformed
       new Controlador().crear(textNombre, textHeroe, textAutores, textEditorial, textPrecio, textDisponibles);
        
        int mas = 0;
        String texto = textDisponibles.getText();
        int valor = Integer.parseInt(texto);
        while(mas < valor){
            new Controlador().pedirAñadir(textNombre, textPrecio);
            mas += 1;
        }

    }//GEN-LAST:event_BotonPedirActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(evt.getClickCount() == 1 ){

            JTable receptor = (JTable)evt.getSource();

            textID.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),0).toString());
            textNombre.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),1).toString());
            textHeroe.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),2).toString());
            textAutores.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),3).toString());
            textEditorial.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),4).toString());
            textPrecio.setText(receptor.getModel().getValueAt(receptor.getSelectedRow(),5).toString());
            
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonPedir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textAutores;
    private javax.swing.JTextField textDisponibles;
    private javax.swing.JTextField textEditorial;
    private javax.swing.JTextField textHeroe;
    private static javax.swing.JTextField textID;
    private static javax.swing.JTextField textNombre;
    private static javax.swing.JTextField textPrecio;
    // End of variables declaration//GEN-END:variables
}
