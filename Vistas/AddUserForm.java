package Vistas;

import Comtrolador.CbSucursal;
import Comtrolador.TipoDocumentoEnum;
import Modelo.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;

public class AddUserForm extends javax.swing.JDialog {

    ComboBoxModel modeloEnumTipoDocumento;
    Conexion conexion = new Conexion();
    Connection connection;
    Statement st;
    ResultSet rs;
    ArrayList mListaSucursales;
    CbSucursal cbSucursales;

    public AddUserForm(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        modeloEnumTipoDocumento = new DefaultComboBoxModel(TipoDocumentoEnum.values());
        System.out.println(modeloEnumTipoDocumento);
        initComponents();
        cbSucursales = new CbSucursal();
        mListaSucursales = new ArrayList();
        llenarComboboxSucursales();
        this.setLocationRelativeTo(parent);

    }

    public String llenarComboboxSucursales() {
        mListaSucursales = cbSucursales.getListaSucursales();
        Iterator iterator = mListaSucursales.iterator();
        while (iterator.hasNext()) {
            Sucursal sucursal = (Sucursal) iterator.next();
            cbSucursal.addItem(sucursal);
        }
        String nombreSucursal = cbSucursal.getSelectedItem().toString();
        String query = "SELECT idSucursal FROM sucursal WHERE nombreSucursal = '" + nombreSucursal + "':";
        return query;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbTipoDocumento = new javax.swing.JComboBox<>();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btbCancel = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbSucursal = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/newUser.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/logo.png"))); // NOI18N

        jLabel3.setText("Nombres");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("Apellidos");

        jLabel5.setText("Tipo Documento");

        cbTipoDocumento.setModel(modeloEnumTipoDocumento);
        cbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoDocumentoActionPerformed(evt);
            }
        });

        jLabel6.setText("Documento");

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        jLabel7.setText("correo");

        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/confirmIcon.png"))); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btbCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assest/cancelIcon.png"))); // NOI18N
        btbCancel.setText("Cancelar");
        btbCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbCancelActionPerformed(evt);
            }
        });

        jLabel8.setText("sucursales");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 154, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnConfirm)
                        .addGap(113, 113, 113)
                        .addComponent(btbCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(txtApellidos)
                            .addComponent(cbTipoDocumento, 0, 212, Short.MAX_VALUE)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmail)
                            .addComponent(cbSucursal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(86, 86, 86))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(cbSucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btbCancel))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        String nombre = txtNombre.getText();
        String apellidos = txtApellidos.getText();
        // | C.C. | C.E. | Libreta militar | Pasaporte | Otro |
        String tipoDocumento = cbTipoDocumento.getSelectedItem().toString();
        String documento = txtDocumento.getText();
        String email = txtEmail.getText();
        String queryNombreSucursal = llenarComboboxSucursales();
        System.out.println(queryNombreSucursal);
        //Validar que alguno de los campos no este vacío
        if (nombre.isEmpty() || apellidos.isEmpty() || documento.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Faltan campos por diligenciar", "Nuevo empleado", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                connection = conexion.getConnection();
                st = connection.createStatement();
                rs = st.executeQuery(queryNombreSucursal);
                while (rs.next()) {
                    int idSucursal = rs.getInt("idSucursal");
                    String queryCrearEmpleado = "INSERT INTO empleado(`nombreEmp`, `apellidos`,`tipoDocumento`,`documento`, `correo`, `FK_idSucursal`) VALUES('" + nombre + "','" + apellidos + "','" + tipoDocumento + "','" + documento + "','" + email + "'," + idSucursal + ")";
                    System.out.println(queryCrearEmpleado);
                    try {
                        connection = conexion.getConnection();
                        st = connection.createStatement();
                        st.executeUpdate(queryCrearEmpleado);
                        JOptionPane.showMessageDialog(this, "Registro exitoso", "Nuevo empleado",
                                JOptionPane.INFORMATION_MESSAGE);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "No se pudo crear el empleado", "Nuevo empleado",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        this.dispose();
    
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btbCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbCancelActionPerformed

        //Capturamos los valores de los campos txtfield y de la lista desplegable
        String nombre = txtNombre.getText();
        String apellido = txtApellidos.getText();
        //Combobox = cbDocumentType[0] = "C.C.", cbDocumentType[1] = "C.E."
        int indexTipoDocumento = cbTipoDocumento.getSelectedIndex();
        String tipoDocumento = (String) cbTipoDocumento.getSelectedItem();
        String documento = txtDocumento.getText();
        String correo = txtEmail.getText();

        //Validar si algunos de los campos no fue diligenciando (Sólo los campos txtfield)
        if (nombre.isEmpty() || apellido.isEmpty() || documento.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos requeridos sin diligenciar", "Formulario registro", JOptionPane.WARNING_MESSAGE);
        } else {
            //Validamos si estamos capturando los valores correctamente
            JOptionPane.showMessageDialog(this, "Registro éxitoso");
            //Cerrar ventana del JDialog
            this.dispose();
            System.out.println("Nombre: " + nombre + " " + apellido + ", documento: "
                    + indexTipoDocumento + " " + tipoDocumento + " " + documento
                    + ", correo: " + correo);
        }

    }//GEN-LAST:event_btbCancelActionPerformed

    private void cbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoDocumentoActionPerformed

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
            java.util.logging.Logger.getLogger(AddUserForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUserForm.class
.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            AddUserForm dialog = new AddUserForm(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btbCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<Sucursal> cbSucursal;
    private javax.swing.JComboBox<String> cbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
