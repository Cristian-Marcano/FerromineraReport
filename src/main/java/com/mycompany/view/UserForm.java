package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import com.mycompany.models.PersonalData;
import com.mycompany.models.User;
import com.mycompany.service.PersonalDataService;
import com.mycompany.service.UserService;
import com.mycompany.utils.ValidateInput;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Cristian
 */
public class UserForm extends javax.swing.JPanel {
    
    private int mode; //* 0: buscar. 1: crear. 2: editar
    public User user;
    public PersonalData data;
    public boolean active = false;

    /**
     * Creates new form UserForm
     * @param mode: es para confirmar si el form se utilizara para crear, buscar o editar usuarios,
     *                en el caso de true se desactiva todo relacionado con password.
     * @param btnActionStr: texto de la Action que realizara el btnAction 
     */
    public UserForm(int mode, String btnActionStr) {
        initComponents();
        this.mode = mode;
        
        if(mode==0) {
            labelPassword.setVisible(false);
            separatorPassword.setVisible(false);
            inputPassword.setVisible(false);
            selectRole.insertItemAt("Cualquiera", mode);
            selectRole.setSelectedIndex(mode);
        }
        
        btnAction.setText(btnActionStr);
        btnAction.setToolTipText(btnActionStr);
    }
    
    public void setUser(User user, PersonalData data) {
        this.user = user;
        this.data = data;
        setValues();
    }
    
    private void setValues() {
        inputUsername.setText(user.getUsername());
        inputName.setText(data.getName());
        inputLastName.setText(data.getLastName());
        inputFicha.setText(data.getFicha());
        inputTlf.setText(data.getTlf());
        if(user.getRole().equals("super-admin")) selectRole.setSelectedIndex(0);
        else if(user.getRole().equals("supervisor")) selectRole.setSelectedIndex(1);
        else selectRole.setSelectedIndex(2);
        inputPassword.setText(user.getPassword());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        form = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        separatorUsername = new javax.swing.JSeparator();
        inputUsername = new javax.swing.JTextField();
        labelName = new javax.swing.JLabel();
        separatorName = new javax.swing.JSeparator();
        inputName = new javax.swing.JTextField();
        labelLastName = new javax.swing.JLabel();
        separatorLastName = new javax.swing.JSeparator();
        inputLastName = new javax.swing.JTextField();
        labelFicha = new javax.swing.JLabel();
        separatorFicha = new javax.swing.JSeparator();
        inputFicha = new javax.swing.JTextField();
        labelTlf = new javax.swing.JLabel();
        separatorTlf = new javax.swing.JSeparator();
        inputTlf = new javax.swing.JTextField();
        labelRole = new javax.swing.JLabel();
        separatorRole = new javax.swing.JSeparator();
        selectRole = new javax.swing.JComboBox<>();
        labelPassword = new javax.swing.JLabel();
        separatorPassword = new javax.swing.JSeparator();
        inputPassword = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setPreferredSize(new java.awt.Dimension(365, 720));

        scroll.setPreferredSize(new java.awt.Dimension(365, 720));

        form.setBackground(new java.awt.Color(230, 230, 230));
        form.setPreferredSize(new java.awt.Dimension(350, 850));

        btnClose.setBackground(new java.awt.Color(180, 180, 180));
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close_logo.png"))); // NOI18N
        btnClose.setToolTipText("Cerrar");
        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(65, 75, 178));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Usuario");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 75, 178)));

        labelUsername.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(65, 75, 178));
        labelUsername.setLabelFor(inputUsername);
        labelUsername.setText("Nombre de Usuario:");

        separatorUsername.setForeground(new java.awt.Color(65, 75, 178));

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(50, 50, 50));
        inputUsername.setName("Nombre de Usuario"); // NOI18N

        labelName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelName.setForeground(new java.awt.Color(65, 75, 178));
        labelName.setLabelFor(inputName);
        labelName.setText("Nombre:");

        separatorName.setForeground(new java.awt.Color(65, 75, 178));

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputName.setForeground(new java.awt.Color(50, 50, 50));
        inputName.setName("Nombre"); // NOI18N

        labelLastName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(65, 75, 178));
        labelLastName.setLabelFor(inputLastName);
        labelLastName.setText("Apellido:");

        separatorLastName.setForeground(new java.awt.Color(65, 75, 178));

        inputLastName.setBackground(new java.awt.Color(255, 255, 255));
        inputLastName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputLastName.setForeground(new java.awt.Color(50, 50, 50));
        inputLastName.setName("Apellido"); // NOI18N

        labelFicha.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelFicha.setForeground(new java.awt.Color(65, 75, 178));
        labelFicha.setLabelFor(inputFicha);
        labelFicha.setText("Ficha:");

        separatorFicha.setForeground(new java.awt.Color(65, 75, 178));

        inputFicha.setBackground(new java.awt.Color(255, 255, 255));
        inputFicha.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputFicha.setForeground(new java.awt.Color(50, 50, 50));
        inputFicha.setName("Ficha"); // NOI18N

        labelTlf.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelTlf.setForeground(new java.awt.Color(65, 75, 178));
        labelTlf.setLabelFor(inputTlf);
        labelTlf.setText("Telefono:");

        separatorTlf.setForeground(new java.awt.Color(65, 75, 178));

        inputTlf.setBackground(new java.awt.Color(255, 255, 255));
        inputTlf.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputTlf.setForeground(new java.awt.Color(50, 50, 50));
        inputTlf.setName("Telefono"); // NOI18N

        labelRole.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelRole.setForeground(new java.awt.Color(65, 75, 178));
        labelRole.setText("Role:");

        separatorRole.setForeground(new java.awt.Color(65, 75, 178));

        selectRole.setBackground(new java.awt.Color(255, 255, 255));
        selectRole.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        selectRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super-admin", "Supervisor", "Analista" }));

        labelPassword.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(65, 75, 178));
        labelPassword.setText("Clave:");

        separatorPassword.setForeground(new java.awt.Color(65, 75, 178));

        inputPassword.setBackground(new java.awt.Color(255, 255, 255));
        inputPassword.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputPassword.setName("Clave"); // NOI18N

        btnAction.setBackground(new java.awt.Color(65, 75, 178));
        btnAction.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAction.setForeground(new java.awt.Color(255, 255, 255));
        btnAction.setText("{Action}");
        btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAction.setPreferredSize(new java.awt.Dimension(123, 45));
        btnAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(labelPassword)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(46, 46, 46))
                            .addComponent(separatorRole, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputTlf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputFicha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorFicha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputUsername)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(139, 139, 139))
                            .addComponent(separatorUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(separatorTlf, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                        .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                                        .addGap(7, 7, 7))
                                    .addComponent(labelTlf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                        .addComponent(labelFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(24, 24, 24)))
                                .addGap(225, 225, 225))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(formLayout.createSequentialGroup()
                                        .addComponent(labelRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGap(229, 229, 229)))
                        .addGap(32, 32, 32))))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(8, 8, 8)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelTlf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelRole)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorRole, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        scroll.setViewportView(form);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //* Eliminar el formulario del panel
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        active = false;
        FerromineraProject.contentP.removeThisComponent(this);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionActionPerformed
        UserService userService = new UserService();
        PersonalDataService pdService = new PersonalDataService();
        
        try {
            String username = inputUsername.getText(), password = inputPassword.getText(), name = inputName.getText(), lastName = inputLastName.getText(),
                    ficha = inputFicha.getText(), tlf = inputTlf.getText(), role = (String) selectRole.getSelectedItem();
            
            if(mode==0) {
                List<String[]> sentencesAndValues = new ArrayList<>();
                
                if((!username.isEmpty()) && (!username.isBlank())) sentencesAndValues.add(new String[]{"user.username LIKE ? ", "%"+username+"%"});
                
                if((!name.isEmpty()) && (!name.isBlank())) sentencesAndValues.add(new String[]{"pd.name LIKE ? ", "%"+name+"%"});
                
                if((!lastName.isEmpty()) && (!lastName.isBlank())) sentencesAndValues.add(new String[]{"pd.last_name LIKE ? ", "%"+lastName+"%"});
                
                if((!ficha.isEmpty()) && (!ficha.isBlank())) sentencesAndValues.add(new String[]{"pd.ficha = ? ", ficha});
                
                if((!tlf.isEmpty()) && (!tlf.isBlank())) sentencesAndValues.add(new String[]{"pd.tlf = ? ", tlf});
                
                if(selectRole.getSelectedIndex() != 0) sentencesAndValues.add(new String[]{"user.role = ? ", role});
                
                ScrollUserContent usersContent = new ScrollUserContent(sentencesAndValues);
                
                FerromineraProject.contentP.setPanel(usersContent);
                FerromineraProject.contentP.showPanel();
                
                usersContent.initUserContent();
                
            } else {
                ValidateInput.isEmptyOrBlank(List.of(inputUsername, inputName, inputLastName, inputFicha, inputTlf, inputPassword));
                
                ValidateInput.isMinimumLength(inputPassword, 8);
                ValidateInput.isMinimumLength(inputTlf, 11);
                
                if(mode==1) {
                    int userId = userService.createUser(username, password, role);
                    
                    PersonalData pd = new PersonalData(0, userId, name, lastName, ficha, tlf);
                    
                    pdService.createPersonalData(pd);
                } else if(JOptionPane.showConfirmDialog(null,"¿Esta seguro de editar este usuario?", "Advertencia",
                                                        JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==0) {
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    
                    userService.updateUser(user);
                    
                    data.setName(name);
                    data.setLastName(lastName);
                    data.setFicha(ficha);
                    data.setTlf(tlf);
                    
                    pdService.updatePersonalData(data);
                } else return;
                
                ScrollUserContent usersContent = new ScrollUserContent();
                
                FerromineraProject.contentP.setPanel(usersContent);
                FerromineraProject.contentP.showPanel();
                
                usersContent.initUserContent();
            }
        } catch(SQLException e) {
            try {
                pdService.applyRollBack();
            } catch (SQLException ex) { }
            System.err.println(e.getMessage());
            if(e.getErrorCode() == 1062) {
                String text = (e.getMessage().contains("username")) ? "un nombre de usuario" : (e.getMessage().contains("ficha")) ? "una ficha" : "un nro. de telefono";
                JOptionPane.showMessageDialog(null,"No puede insertar "+ text +" ya existente","ERROR",JOptionPane.ERROR_MESSAGE);
            } else JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexion con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel form;
    private javax.swing.JTextField inputFicha;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputTlf;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelFicha;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelRole;
    private javax.swing.JLabel labelTlf;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JComboBox<String> selectRole;
    private javax.swing.JSeparator separatorFicha;
    private javax.swing.JSeparator separatorLastName;
    private javax.swing.JSeparator separatorName;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorRole;
    private javax.swing.JSeparator separatorTlf;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
