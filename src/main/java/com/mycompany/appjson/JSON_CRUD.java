/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.appjson;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Developer
 */
public class JSON_CRUD extends javax.swing.JFrame {
    DefaultTableModel modelTablaPersonas;
    String listPersonas;
    /**
     * Creates new form JSON_CRUD
     */
    public JSON_CRUD() {
        initComponents();
        this.modelTablaPersonas = new DefaultTableModel();
        this.modelTablaPersonas.addColumn("Nombre");
        this.modelTablaPersonas.addColumn("Telefono");

        this.tablePersonas.setModel(this.modelTablaPersonas);
        PersonasJSON getJSON = new PersonasJSON();
        System.out.println(getJSON.leerJSON());

     //  this.modelTablaPersonas.addRow()
    }

   public boolean addTablePersonas(){
        String []txtForm = new String[2];
        txtForm[0]=this.txtNombre.getText();
        txtForm[1]=this.txtTelefono.getText();
        //&&
        if(txtForm[0].length()>0 || txtForm[1].length()>0){
            this.modelTablaPersonas.addRow(txtForm);
            return true;
        }else{
            return false;
        }
   }

    public void clearForm(){
       this.txtNombre.setText("");
       this.txtTelefono.setText("");
       this.txtNombre.requestFocus();
    }

public boolean deleteTablePersonas(){
     int posicion = this.tablePersonas.getSelectedRow();
     if(posicion>=0){
        this.modelTablaPersonas.removeRow(posicion);
        return true;
     }else{
        return false;
     }
}

public boolean updateTablePersonas(){
     int posicion = this.tablePersonas.getSelectedRow();
     if(posicion>=0){
        String []txtForm = new String[2];
        txtForm[0]=this.txtNombre.getText();
        txtForm[1]=this.txtTelefono.getText();

        if(txtForm[0].length()>0 || txtForm[1].length()>0){
            this.modelTablaPersonas.setValueAt(txtForm[0], posicion, 0);
            this.modelTablaPersonas.setValueAt(txtForm[1], posicion, 1);
            return true;
        }else{
            return false;
        }
     }else{
        return false;
     }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePersonas = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre:");

        jLabel2.setText("Telefono: ");

        tablePersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablePersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePersonasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablePersonas);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(33, 33, 33)
                        .addComponent(btnModificar)
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminar)
                        .addGap(153, 153, 153)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        System.out.println(this.addTablePersonas()? "Registro agregado con exito!":"Registro no pudo ser agregado!");
        this.clearForm();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
       int res = JOptionPane.showOptionDialog(new JFrame(), "Esta seguro que desea actualizar el registro seleccionado?", 
                    "Confirmacion de actualizacion",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Si", "No" }, JOptionPane.YES_OPTION);

        System.out.println((res==JOptionPane.YES_OPTION && this.updateTablePersonas())? "Registro actualizado con exito!":"Registro no pudo ser actualizado!");

        this.clearForm();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
       int res = JOptionPane.showOptionDialog(new JFrame(), "Esta seguro que desea eliminar el registro seleccionado?", 
                    "Confirmacion de eliminacion",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    new Object[] { "Si", "No" }, JOptionPane.YES_OPTION);

        System.out.println((res==JOptionPane.YES_OPTION && this.deleteTablePersonas())? "Registro eliminado con exito!":"Registro no pudo ser eliminado!");

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tablePersonasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePersonasMouseClicked
        // TODO add your handling code here:
         int posicion = this.tablePersonas.getSelectedRow();
         if(posicion>=0){
            this.txtNombre.setText(this.modelTablaPersonas.getValueAt(posicion, 0).toString());
            this.txtTelefono.setText(this.modelTablaPersonas.getValueAt(posicion, 1).toString());
           }
    }//GEN-LAST:event_tablePersonasMouseClicked

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
            java.util.logging.Logger.getLogger(JSON_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSON_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSON_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSON_CRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSON_CRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePersonas;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
