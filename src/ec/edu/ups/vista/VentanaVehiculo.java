/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class VentanaVehiculo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVehiculo
     */
    
    //ventana
    
    
    public VentanaVehiculo() {
        initComponents();
    }

    public JButton getBtnIngresarTicket() {
        return btnIngresarTicket;
    }

    public void setBtnIngresarTicket(JButton btnIngresarTicket) {
        this.btnIngresarTicket = btnIngresarTicket;
    }

    public JLabel getLbMarca() {
        return lbMarca;
    }

    public void setLbMarca(JLabel lbMarca) {
        this.lbMarca = lbMarca;
    }

    public JLabel getLbModelo() {
        return lbModelo;
    }

    public void setLbModelo(JLabel lbModelo) {
        this.lbModelo = lbModelo;
    }

    public JLabel getLbPLaca() {
        return lbPLaca;
    }

    public void setLbPLaca(JLabel lbPLaca) {
        this.lbPLaca = lbPLaca;
    }

    public JPanel getPnlVehiculo() {
        return pnlVehiculo;
    }

    public void setPnlVehiculo(JPanel pnlVehiculo) {
        this.pnlVehiculo = pnlVehiculo;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlVehiculo = new javax.swing.JPanel();
        lbPLaca = new javax.swing.JLabel();
        lbMarca = new javax.swing.JLabel();
        lbModelo = new javax.swing.JLabel();
        txtPLaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnIngresarTicket = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VEHICULO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        lbPLaca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbPLaca.setText("Placa:");

        lbMarca.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbMarca.setText("Marca:");

        lbModelo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbModelo.setText("Modelo:");

        btnIngresarTicket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIngresarTicket.setText("IngresarTicket");
        btnIngresarTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarTicketActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlVehiculoLayout = new javax.swing.GroupLayout(pnlVehiculo);
        pnlVehiculo.setLayout(pnlVehiculoLayout);
        pnlVehiculoLayout.setHorizontalGroup(
            pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbModelo)
                    .addComponent(lbMarca)
                    .addComponent(lbPLaca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(txtPLaca)
                    .addComponent(txtModelo))
                .addGap(76, 76, 76))
            .addGroup(pnlVehiculoLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(btnIngresarTicket)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVehiculoLayout.setVerticalGroup(
            pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVehiculoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPLaca)
                    .addComponent(txtPLaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(pnlVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btnIngresarTicket)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(pnlVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarTicketActionPerformed
         
    }//GEN-LAST:event_btnIngresarTicketActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarTicket;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbModelo;
    private javax.swing.JLabel lbPLaca;
    private javax.swing.JPanel pnlVehiculo;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPLaca;
    // End of variables declaration//GEN-END:variables
}
