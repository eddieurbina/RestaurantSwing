/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantapp;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author Aula E2
 */
public class OpcionRestaurante extends javax.swing.JFrame {

    public OpcionRestaurante() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Restaurant"); 
        /*This changes the window icon*/
        this.setIconImage(new ImageIcon(getClass().getResource("/Assets/iconRestaurant.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);     
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Assets/MainRestaurant.jpg"));
        JLabel fondo = new JLabel(); 
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0, uno.getIconWidth(), uno.getIconHeight());
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAbout = new javax.swing.JButton();
        btnExperts = new javax.swing.JButton();
        btnCalories = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAbout.setText("Acerca de");

        btnExperts.setText("Nuestros expertos");

        btnCalories.setText("Calorias");

        btnExit.setText("Salir");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnExperts)
                .addGap(47, 47, 47)
                .addComponent(btnCalories)
                .addGap(45, 45, 45)
                .addComponent(btnExit)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(441, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbout)
                    .addComponent(btnExperts)
                    .addComponent(btnCalories)
                    .addComponent(btnExit))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcionRestaurante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCalories;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnExperts;
    // End of variables declaration//GEN-END:variables
}
