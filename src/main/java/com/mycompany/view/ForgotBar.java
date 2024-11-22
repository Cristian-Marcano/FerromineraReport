package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import com.mycompany.models.PersonalData;
import com.mycompany.models.User;
import com.mycompany.service.PersonalDataService;
import com.mycompany.service.UserService;
import com.mycompany.utils.ValidateInput;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class ForgotBar extends javax.swing.JPanel {

    /**
     * Creates new form ForgotBar
     */
    public ForgotBar() {
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

        labelName = new javax.swing.JLabel();
        separatorName = new javax.swing.JSeparator();
        inputName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        separatorLastName = new javax.swing.JSeparator();
        inputLastName = new javax.swing.JTextField();
        labelFicha = new javax.swing.JLabel();
        separatorFicha = new javax.swing.JSeparator();
        inputFicha = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        separatorUsername = new javax.swing.JSeparator();
        inputUsername = new javax.swing.JTextField();
        btnForgot = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 34, 34));

        labelName.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setLabelFor(inputName);
        labelName.setText("Nombre:");

        separatorName.setForeground(new java.awt.Color(255, 255, 255));

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputName.setForeground(new java.awt.Color(50, 50, 50));
        inputName.setName("Nombre"); // NOI18N

        labelLastName.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(255, 255, 255));
        labelLastName.setLabelFor(inputLastName);
        labelLastName.setText("Apellido:");
        labelLastName.setName(""); // NOI18N

        separatorLastName.setForeground(new java.awt.Color(255, 255, 255));

        inputLastName.setBackground(new java.awt.Color(255, 255, 255));
        inputLastName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputLastName.setForeground(new java.awt.Color(50, 50, 50));
        inputLastName.setName("Apellido"); // NOI18N

        labelFicha.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelFicha.setForeground(new java.awt.Color(255, 255, 255));
        labelFicha.setLabelFor(inputFicha);
        labelFicha.setText("Ficha:");

        separatorFicha.setForeground(new java.awt.Color(255, 255, 255));

        inputFicha.setBackground(new java.awt.Color(255, 255, 255));
        inputFicha.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputFicha.setForeground(new java.awt.Color(50, 50, 50));
        inputFicha.setName("Ficha"); // NOI18N

        labelUsername.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setLabelFor(inputUsername);
        labelUsername.setText("Nombre de Usuario:");

        separatorUsername.setForeground(new java.awt.Color(255, 255, 255));

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(50, 50, 50));
        inputUsername.setName("Nombre de usuario"); // NOI18N

        btnForgot.setBackground(new java.awt.Color(65, 75, 178));
        btnForgot.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnForgot.setForeground(new java.awt.Color(255, 255, 255));
        btnForgot.setText("Ingresar");
        btnForgot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnForgot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnForgotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(299, 299, 299))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(192, 192, 192))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(276, 276, 276))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(278, 278, 278))
                    .addComponent(separatorName)
                    .addComponent(inputName)
                    .addComponent(separatorLastName)
                    .addComponent(inputLastName)
                    .addComponent(separatorUsername)
                    .addComponent(inputUsername)
                    .addComponent(separatorFicha)
                    .addComponent(inputFicha))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnForgot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(btnForgot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //* Valida los input si se estan usando y verifica en la DB si se encuentra el usuario
    private void btnForgotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnForgotActionPerformed
        try {
            ValidateInput.isEmptyOrBlank(List.of(inputName, inputLastName, inputFicha, inputUsername));
            
            String name = inputName.getText(), lastName = inputLastName.getText(),
                    ficha = inputFicha.getText(), username = inputUsername.getText();
            
            UserService userService = new UserService();
            User user = userService.getUser(username);
            
            if(user == null) throw new Exception("Datos invalidos");
            
            PersonalDataService dataService = new PersonalDataService();
            PersonalData data = dataService.getPersonalData(user.getId());
            
            if(user.getUsername().equals(username) && data.getName().equals(name) && data.getLastName().equals(lastName) && data.getFicha().equals(ficha)) {
                
                FerromineraProject.user = user;
                
                if(user.getRole().equals("super-admin")) FerromineraProject.board.setPanel(new MenuAdminBar());
                else FerromineraProject.board.setPanel(new MenuBar());
                
                ScrollReportContent reportsContent = new ScrollReportContent();
        
                FerromineraProject.contentP.setPanel(reportsContent);
                
                FerromineraProject.contentP.showPanel();
                FerromineraProject.board.showPanel();
        
                reportsContent.initReportContent();
                
            } else throw new Exception("Datos invalidos");
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexion con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnForgotActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnForgot;
    private javax.swing.JTextField inputFicha;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelFicha;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JSeparator separatorFicha;
    private javax.swing.JSeparator separatorLastName;
    private javax.swing.JSeparator separatorName;
    private javax.swing.JSeparator separatorUsername;
    // End of variables declaration//GEN-END:variables
}
