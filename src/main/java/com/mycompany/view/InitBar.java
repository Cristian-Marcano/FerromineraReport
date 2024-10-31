package com.mycompany.view;

import java.awt.Color;

/**
 *
 * @author Cristian
 */
public class InitBar extends javax.swing.JPanel {

    /**
     * Creates new form InitBar
     */
    public InitBar() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
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
        init = new javax.swing.JPanel();
        inputPassword = new javax.swing.JPasswordField();
        separatorPassword = new javax.swing.JSeparator();
        labelPassword = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        separatorUsername = new javax.swing.JSeparator();
        labelUsername = new javax.swing.JLabel();
        inputTlf = new javax.swing.JTextField();
        separatorTlf = new javax.swing.JSeparator();
        labelTlf = new javax.swing.JLabel();
        inputFicha = new javax.swing.JTextField();
        separatorFicha = new javax.swing.JSeparator();
        labelFicha = new javax.swing.JLabel();
        inputCI = new javax.swing.JTextField();
        separatorCI = new javax.swing.JSeparator();
        labelCI = new javax.swing.JLabel();
        inputLastName = new javax.swing.JTextField();
        separetorLastName = new javax.swing.JSeparator();
        labelLastName = new javax.swing.JLabel();
        inputName = new javax.swing.JTextField();
        separatorName = new javax.swing.JSeparator();
        tittle = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        btnInit = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 34, 34));
        setPreferredSize(new java.awt.Dimension(405, 720));

        scroll.setBorder(null);
        scroll.setPreferredSize(new java.awt.Dimension(405, 720));

        init.setBackground(new java.awt.Color(247, 34, 34));
        init.setPreferredSize(new java.awt.Dimension(386, 770));
        init.setRequestFocusEnabled(false);

        inputPassword.setBackground(new java.awt.Color(255, 255, 255));
        inputPassword.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputPassword.setForeground(new java.awt.Color(50, 50, 50));

        separatorPassword.setForeground(new java.awt.Color(255, 255, 255));

        labelPassword.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setLabelFor(inputPassword);
        labelPassword.setText("Clave:");

        inputUsername.setBackground(new java.awt.Color(255, 255, 255));
        inputUsername.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputUsername.setForeground(new java.awt.Color(50, 50, 50));

        separatorUsername.setForeground(new java.awt.Color(255, 255, 255));

        labelUsername.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(255, 255, 255));
        labelUsername.setLabelFor(inputUsername);
        labelUsername.setText("Nombre de Usuario:");

        inputTlf.setBackground(new java.awt.Color(255, 255, 255));
        inputTlf.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputTlf.setForeground(new java.awt.Color(50, 50, 50));

        separatorTlf.setForeground(new java.awt.Color(255, 255, 255));

        labelTlf.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelTlf.setForeground(new java.awt.Color(255, 255, 255));
        labelTlf.setLabelFor(inputTlf);
        labelTlf.setText("Telefono:");

        inputFicha.setBackground(new java.awt.Color(255, 255, 255));
        inputFicha.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputFicha.setForeground(new java.awt.Color(50, 50, 50));

        separatorFicha.setForeground(new java.awt.Color(255, 255, 255));

        labelFicha.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelFicha.setForeground(new java.awt.Color(255, 255, 255));
        labelFicha.setLabelFor(inputFicha);
        labelFicha.setText("Ficha:");

        inputCI.setBackground(new java.awt.Color(255, 255, 255));
        inputCI.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputCI.setForeground(new java.awt.Color(50, 50, 50));

        separatorCI.setForeground(new java.awt.Color(255, 255, 255));

        labelCI.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelCI.setForeground(new java.awt.Color(255, 255, 255));
        labelCI.setLabelFor(inputCI);
        labelCI.setText("Cedula:");

        inputLastName.setBackground(new java.awt.Color(255, 255, 255));
        inputLastName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputLastName.setForeground(new java.awt.Color(50, 50, 50));

        separetorLastName.setForeground(new java.awt.Color(255, 255, 255));

        labelLastName.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(255, 255, 255));
        labelLastName.setLabelFor(inputLastName);
        labelLastName.setText("Apellido:");

        inputName.setBackground(new java.awt.Color(255, 255, 255));
        inputName.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        inputName.setForeground(new java.awt.Color(50, 50, 50));

        separatorName.setForeground(new java.awt.Color(255, 255, 255));

        tittle.setFont(new java.awt.Font("Bahnschrift", 1, 40)); // NOI18N
        tittle.setForeground(new java.awt.Color(255, 255, 255));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Bienvenido ");

        labelName.setFont(new java.awt.Font("Bahnschrift", 1, 16)); // NOI18N
        labelName.setForeground(new java.awt.Color(255, 255, 255));
        labelName.setLabelFor(inputName);
        labelName.setText("Nombre:");

        btnInit.setBackground(new java.awt.Color(65, 75, 178));
        btnInit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnInit.setForeground(new java.awt.Color(255, 255, 255));
        btnInit.setText("Cargar");
        btnInit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout initLayout = new javax.swing.GroupLayout(init);
        init.setLayout(initLayout);
        initLayout.setHorizontalGroup(
            initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputPassword)
                    .addComponent(separatorPassword)
                    .addComponent(inputUsername)
                    .addComponent(inputTlf)
                    .addComponent(separatorTlf)
                    .addComponent(inputFicha)
                    .addComponent(inputCI)
                    .addComponent(separatorCI)
                    .addComponent(inputLastName)
                    .addComponent(separetorLastName)
                    .addComponent(tittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(188, 188, 188))
                    .addComponent(separatorName)
                    .addComponent(inputName)
                    .addComponent(separatorFicha)
                    .addComponent(separatorUsername)
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelFicha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(301, 301, 301))
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(192, 192, 192))
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelTlf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(273, 273, 273))
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(276, 276, 276))
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(299, 299, 299))
                    .addGroup(initLayout.createSequentialGroup()
                        .addComponent(labelCI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(28, 28, 28))
            .addGroup(initLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(btnInit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        initLayout.setVerticalGroup(
            initLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(initLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLastName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separetorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorCI, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelTlf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorTlf, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputTlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnInit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scroll.setViewportView(init);

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

    //* Funcion que se acciona cuando el btnInit es presionado
    //* Valida los input se estan usando y integra los datos a la DB
    private void btnInitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInit;
    private javax.swing.JPanel init;
    private javax.swing.JTextField inputCI;
    private javax.swing.JTextField inputFicha;
    private javax.swing.JTextField inputLastName;
    private javax.swing.JTextField inputName;
    private javax.swing.JPasswordField inputPassword;
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
    private javax.swing.JSeparator separatorName;
    private javax.swing.JSeparator separatorPassword;
    private javax.swing.JSeparator separatorTlf;
    private javax.swing.JSeparator separatorUsername;
    private javax.swing.JSeparator separetorLastName;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
