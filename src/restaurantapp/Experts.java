
package restaurantapp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Experts extends javax.swing.JFrame {
         String texto = "";
    public Experts() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Restaurant"); 
        /*This changes the window icon*/
        this.setIconImage(new ImageIcon(getClass().getResource("/Assets/iconRestaurant.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);     
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/Assets/menuRestaurant.jpg"));
        JLabel fondo = new JLabel(); 
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0, uno.getIconWidth(), uno.getIconHeight());
       
    }
    
     public String leerSaludable(){
        
        File archivo = null;
        FileReader fr = null; 
        BufferedReader br = null;
        String result = ""; 
        
        try {
            archivo = new File("src/InformacionRestaurante/" + texto + ".txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr); 
            
            String linea = ""; 
            while((linea = br.readLine()) != null) {
                result += linea + "\n"; 
            }
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            try {
                if(null != fr){
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace(); 
            }
        }
        return result;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Health = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rbHealthy = new javax.swing.JRadioButton();
        rbUnhealthy = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        btnSearch = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        Health.add(rbHealthy);
        rbHealthy.setText("Saludable");

        Health.add(rbUnhealthy);
        rbUnhealthy.setText("No Saludable");

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnBack.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbHealthy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbUnhealthy))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbHealthy)
                    .addComponent(rbUnhealthy))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnBack))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if(!rbHealthy.isSelected() && !rbUnhealthy.isSelected()) {
            JOptionPane.showMessageDialog(null,  "Se necesita al menos una opcion seleccionada!");
        }
        else if(rbHealthy.isSelected()) {
            texto = "menuNoSaludable";
            
        } else if(rbUnhealthy.isSelected()){
            texto = "menuSaludable";
        } 
        
        textArea.setText(leerSaludable());
    }//GEN-LAST:event_btnSearchActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Experts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Health;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbHealthy;
    private javax.swing.JRadioButton rbUnhealthy;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
