package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;

/**
 *
 * @author Cristian
 */
public class UserForm extends javax.swing.JPanel {
    
    public boolean active = false;

    /**
     * Creates new form UserForm
     * @param search: es para confirmar si el form se utilizara para crear o buscar usuarios,
     *                en el caso de true se desactiva todo relacionado con password.
     * @param btnActionStr: texto de la Action que realizara el btnAction 
     */
    public UserForm(boolean search, String btnActionStr) {
        initComponents();
        
        if(search) {
            labelPassword.setVisible(false);
            separatorPassword.setVisible(false);
            inputPassword.setVisible(false);
        }
        
        btnAction.setText(btnActionStr);
        btnAction.setToolTipText(btnActionStr);
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
        labelCI = new javax.swing.JLabel();
        separatorCI = new javax.swing.JSeparator();
        inputCI = new javax.swing.JTextField();
        labelFicha = new javax.swing.JLabel();
        separatorFicha = new javax.swing.JSeparator();
        inputFicha = new javax.swing.JTextField();
        labelTlf = new javax.swing.JLabel();
        separatorTlf = new javax.swing.JSeparator();
        inputTlf = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        separatorPassword = new javax.swing.JSeparator();
        inputPassword = new javax.swing.JTextField();
        btnAction = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setPreferredSize(new java.awt.Dimension(365, 720));

        scroll.setPreferredSize(new java.awt.Dimension(365, 720));

        form.setBackground(new java.awt.Color(230, 230, 230));
        form.setPreferredSize(new java.awt.Dimension(350, 780));

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

        labelName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelName.setForeground(new java.awt.Color(65, 75, 178));
        labelName.setLabelFor(inputName);
        labelName.setText("Nombre:");

        separatorName.setForeground(new java.awt.Color(65, 75, 178));

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputName.setForeground(new java.awt.Color(50, 50, 50));

        labelLastName.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(65, 75, 178));
        labelLastName.setLabelFor(inputLastName);
        labelLastName.setText("Apellido");

        separatorLastName.setForeground(new java.awt.Color(65, 75, 178));

        inputLastName.setBackground(new java.awt.Color(255, 255, 255));
        inputLastName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputLastName.setForeground(new java.awt.Color(50, 50, 50));

        labelCI.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelCI.setForeground(new java.awt.Color(65, 75, 178));
        labelCI.setLabelFor(inputCI);
        labelCI.setText("Cedula:");

        separatorCI.setForeground(new java.awt.Color(65, 75, 178));

        inputCI.setBackground(new java.awt.Color(255, 255, 255));
        inputCI.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputCI.setForeground(new java.awt.Color(50, 50, 50));

        labelFicha.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelFicha.setForeground(new java.awt.Color(65, 75, 178));
        labelFicha.setLabelFor(inputFicha);
        labelFicha.setText("Ficha:");

        separatorFicha.setForeground(new java.awt.Color(65, 75, 178));

        inputFicha.setBackground(new java.awt.Color(255, 255, 255));
        inputFicha.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputFicha.setForeground(new java.awt.Color(50, 50, 50));

        labelTlf.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelTlf.setForeground(new java.awt.Color(65, 75, 178));
        labelTlf.setLabelFor(inputTlf);
        labelTlf.setText("Telefono:");

        separatorTlf.setForeground(new java.awt.Color(65, 75, 178));

        inputTlf.setBackground(new java.awt.Color(255, 255, 255));
        inputTlf.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputTlf.setForeground(new java.awt.Color(50, 50, 50));

        labelPassword.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(65, 75, 178));
        labelPassword.setText("Clave:");

        separatorPassword.setForeground(new java.awt.Color(65, 75, 178));

        inputPassword.setBackground(new java.awt.Color(255, 255, 255));
        inputPassword.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(50, 50, 50));

        btnAction.setBackground(new java.awt.Color(65, 75, 178));
        btnAction.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAction.setForeground(new java.awt.Color(255, 255, 255));
        btnAction.setText("{Action}");
        btnAction.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAction.setPreferredSize(new java.awt.Dimension(123, 45));

        javax.swing.GroupLayout formLayout = new javax.swing.GroupLayout(form);
        form.setLayout(formLayout);
        formLayout.setHorizontalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(46, 46, 46))
                    .addComponent(inputPassword)
                    .addComponent(separatorPassword)
                    .addComponent(inputTlf)
                    .addComponent(inputFicha)
                    .addComponent(separatorFicha)
                    .addComponent(inputCI)
                    .addComponent(inputLastName)
                    .addComponent(separatorLastName)
                    .addComponent(inputName)
                    .addComponent(separatorName)
                    .addComponent(inputUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formLayout.createSequentialGroup()
                        .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))
                    .addComponent(separatorUsername)
                    .addComponent(separatorCI)
                    .addComponent(separatorTlf)
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addComponent(labelCI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7))
                            .addComponent(labelTlf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formLayout.createSequentialGroup()
                                .addComponent(labelFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(24, 24, 24)))
                        .addGap(225, 225, 225))
                    .addGroup(formLayout.createSequentialGroup()
                        .addGroup(formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(formLayout.createSequentialGroup()
                                .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))
                        .addGap(229, 229, 229)))
                .addGap(32, 32, 32))
            .addGroup(formLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnAction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109))
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        formLayout.setVerticalGroup(
            formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formLayout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(8, 8, 8)
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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
                .addComponent(labelCI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorCI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        active = false;
        FerromineraProject.contentP.RemoveThisComponent(this);
    }//GEN-LAST:event_btnCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAction;
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel form;
    private javax.swing.JTextField inputCI;
    private javax.swing.JTextField inputFicha;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputTlf;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JLabel labelCI;
    private javax.swing.JLabel labelFicha;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelTlf;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorCI;
    private javax.swing.JSeparator separatorFicha;
    private javax.swing.JSeparator separatorLastName;
    private javax.swing.JSeparator separatorName;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorTlf;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
