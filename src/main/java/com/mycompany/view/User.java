package com.mycompany.view;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class User extends javax.swing.JPanel {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelUsername = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelCI = new javax.swing.JLabel();
        labelTlf = new javax.swing.JLabel();
        labelFicha = new javax.swing.JLabel();
        btnUserEdit = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(128, 128, 128)));
        setMaximumSize(new java.awt.Dimension(450, 220));

        labelUsername.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(30, 30, 30));
        labelUsername.setText("Nombre de Usuario: {username}");

        labelName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelName.setForeground(new java.awt.Color(30, 30, 30));
        labelName.setText("Nombre: {name}");

        labelLastName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(30, 30, 30));
        labelLastName.setText("Apellido: {lastName}");

        labelCI.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelCI.setForeground(new java.awt.Color(30, 30, 30));
        labelCI.setText("Cedula: {CI}");

        labelTlf.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelTlf.setForeground(new java.awt.Color(30, 30, 30));
        labelTlf.setText("Telefono: {Tlf}");

        labelFicha.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelFicha.setForeground(new java.awt.Color(30, 30, 30));
        labelFicha.setText("Ficha: {ficha}");

        btnUserEdit.setBackground(new java.awt.Color(180, 180, 180));
        btnUserEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_logo.png"))); // NOI18N
        btnUserEdit.setToolTipText("Editar Usuario");
        btnUserEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserEditActionPerformed(evt);
            }
        });

        btnUserDelete.setBackground(new java.awt.Color(180, 180, 180));
        btnUserDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_logo.png"))); // NOI18N
        btnUserDelete.setToolTipText("Eliminar Usuario");
        btnUserDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTlf)
                            .addComponent(labelCI)
                            .addComponent(labelName)
                            .addComponent(labelUsername)
                            .addComponent(labelLastName))
                        .addContainerGap(132, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFicha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUserDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUserEdit)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelCI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelTlf)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUserEdit)
                            .addComponent(labelFicha)))
                    .addComponent(btnUserDelete))
                .addContainerGap(7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserEditActionPerformed
        // TODO add your handling code here:
        
        Component comp = this.getParent();
        while((!(comp instanceof JFrame)) && (!(comp instanceof ScrollUserContent)) && comp != null) {
            comp = comp.getParent(); 
        }
        
        if(comp instanceof ScrollUserContent) {
            ScrollUserContent userContentPane = (ScrollUserContent) comp;
            userContentPane.activeEditUserForm();
        }
    }//GEN-LAST:event_btnUserEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserEdit;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelFicha;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelTlf;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables
}
