/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.*;
import ec.edu.ups.modelo.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class VentanaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form VentanCliente
     */
    //controlador
    private ControladorCliente cCliente;
    private ControladorVehiculo cVehiculo;
    //ventana 
    private VentanaVehiculo v;

    public VentanaCliente() {
        initComponents();
        v = new VentanaVehiculo();
        cCliente = new ControladorCliente(this, new ClienteDAO());
        cVehiculo = new ControladorVehiculo(this, new VehiculoDAO());
        
    }

    public VentanaVehiculo getV() {
        return v;
    }

    public void setV(VentanaVehiculo v) {
        this.v = v;
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public JButton getBtnIngresarVehiculo() {
        return btnIngresarVehiculo;
    }

    public void setBtnIngresarVehiculo(JButton btnIngresarVehiculo) {
        this.btnIngresarVehiculo = btnIngresarVehiculo;
    }

    public JLabel getLbCedula() {
        return lbCedula;
    }

    public void setLbCedula(JLabel lbCedula) {
        this.lbCedula = lbCedula;
    }

    public JLabel getLbDireccion() {
        return lbDireccion;
    }

    public void setLbDireccion(JLabel lbDireccion) {
        this.lbDireccion = lbDireccion;
    }

    public JLabel getLbNombre() {
        return lbNombre;
    }

    public void setLbNombre(JLabel lbNombre) {
        this.lbNombre = lbNombre;
        
    }

    public JLabel getLbTelefono() {
        return lbTelefono;
    }

    public void setLbTelefono(JLabel lbTelefono) {
        this.lbTelefono = lbTelefono;
    }

    public JPanel getPnlCliente() {
        return pnlCliente;
    }

    public void setPnlCliente(JPanel pnlCliente) {
        this.pnlCliente = pnlCliente;
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCliente = new javax.swing.JPanel();
        lbNombre = new javax.swing.JLabel();
        lbCedula = new javax.swing.JLabel();
        lbDireccion = new javax.swing.JLabel();
        lbTelefono = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnIngresarVehiculo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(51, 0, 51))); // NOI18N

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombre.setText("Nombre:");

        lbCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCedula.setText("Cedula:");

        lbDireccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbDireccion.setText("Dirección:");

        lbTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbTelefono.setText("Teléfono:");

        btnIngresarVehiculo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnIngresarVehiculo.setForeground(new java.awt.Color(0, 0, 102));
        btnIngresarVehiculo.setText("Ingresar Vehículo");
        btnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVehiculoActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerrar.setForeground(new java.awt.Color(0, 0, 102));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre)
                    .addComponent(lbCedula)
                    .addComponent(lbTelefono)
                    .addComponent(lbDireccion)
                    .addComponent(btnIngresarVehiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(94, 94, 94))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCedula))
                .addGap(42, 42, 42)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDireccion))
                .addGap(47, 47, 47)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarVehiculo)
                    .addComponent(btnCerrar))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVehiculoActionPerformed
        // TODO add your handling code here:

        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();

        if ("".equals(cedula) && "".equals(nombre) && "".equals(direccion) && "".equals(telefono)) {
            JOptionPane.showMessageDialog(this, "Llene todas las casillas");
        } else if ("".equals(cedula) || "".equals(nombre) || "".equals(direccion) || "".equals(telefono)) {
            JOptionPane.showMessageDialog(this, "Llene  todas las casillas");
        } else {
            Cliente c = new Cliente(cedula, nombre, direccion, telefono);
            cCliente.registrar(c);

            txtCedula.setText("");
            txtNombre.setText(" ");
            txtDireccion.setText(" ");
            txtTelefono.setText(" ");

            if (v == null) {
                v = new VentanaVehiculo();
            }
            v.setVisible(true);
        }

    }//GEN-LAST:event_btnIngresarVehiculoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JLabel lbCedula;
    private javax.swing.JLabel lbDireccion;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbTelefono;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
