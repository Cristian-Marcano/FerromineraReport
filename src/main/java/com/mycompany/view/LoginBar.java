package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import com.mycompany.models.User;
import com.mycompany.service.UserService;
import com.mycompany.utils.ValidateInput;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class LoginBar extends javax.swing.JPanel {

    /**
     * Creates new form LoginBar
     */
    public LoginBar() {
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

        tittle = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        separatorUsername = new javax.swing.JSeparator();
        inputUsername = new javax.swing.JTextField();
        separatorPassword = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        inputPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        forgotPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 34, 34));
        setMinimumSize(new java.awt.Dimension(405, 720));
        setPreferredSize(new java.awt.Dimension(405, 720));

        tittle.setBackground(new java.awt.Color(255, 255, 255));
        tittle.setFont(new java.awt.Font("Bahnschrift", 1, 40)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Iniciar Sesión");

        labelUsername.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setText("Nombre de Usuario:");

        separatorUsername.setForeground(new java.awt.Color(255, 255, 255));

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(50, 50, 50));
        inputUsername.setName("Nombre de Usuario"); // NOI18N

        separatorPassword.setForeground(new java.awt.Color(255, 255, 255));

        labelPassword.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Clave:");

        inputPassword.setBackground(new java.awt.Color(255, 255, 255));
        inputPassword.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(50, 50, 50));
        inputPassword.setName("Clave"); // NOI18N

        btnLogin.setBackground(new java.awt.Color(65, 75, 178));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Inicio");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.setPreferredSize(new java.awt.Dimension(94, 57));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        forgotPassword.setFont(new java.awt.Font("Bahnschrift", 1, 15)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(12, 127, 220));
        forgotPassword.setText("¿Olvido la Contreseña? ");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(forgotPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(179, 179, 179))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(107, 107, 107))
                            .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(188, 188, 188))
                    .addComponent(tittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(separatorUsername)
                    .addComponent(separatorPassword)
                    .addComponent(inputUsername)
                    .addComponent(inputPassword))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tittle)
                .addGap(73, 73, 73)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forgotPassword)
                .addGap(70, 70, 70)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //* Valida si usuario esta usando los inputs y si el usuario se encuentra en la DB
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            ValidateInput.isEmptyOrBlank(List.of(inputUsername, inputPassword));
            
            UserService userService = new UserService();
            User user = userService.getUser(inputUsername.getText());
            
            if(user == null) throw new Exception("Datos invalidos");
            
            if(user.getUsername().equals(inputUsername.getText()) && user.getPassword().equals(new String(inputPassword.getPassword()))){
                
                FerromineraProject.user = user;
                
                if(user.getRole().equals("super-admin")) FerromineraProject.board.setPanel(new MenuAdminBar());
                else FerromineraProject.board.setPanel(new MenuBar());
                
                FerromineraProject.contentP.setPanel(new ScrollReportContent());
                FerromineraProject.contentP.showPanel();
                
                FerromineraProject.board.showPanel();
                
                ScrollReportContent.initReportContent(10, 0);
                
            } else throw new Exception("Datos invalidos");
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexion con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    //* Se dirige a la interfaz de que se le olvido la contraseña
    private void forgotPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseClicked
        FerromineraProject.board.setPanel(new ForgotBar());
        FerromineraProject.board.showPanel();
    }//GEN-LAST:event_forgotPasswordMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
