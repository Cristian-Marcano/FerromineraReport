package com.mycompany.view;

/**
 *
 * @author Cristian
 */
public class ReportForm extends javax.swing.JPanel {

    /**
     * Creates new form ReportForm
     */
    public ReportForm() {
        initComponents();
        for(int i = 5; i <= 25; i ++) 
            selectNew.addItem("Novedad " + i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFormContent = new javax.swing.JPanel();
        inputTitle = new javax.swing.JTextField();
        scrollTextArea = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();
        btnPublish = new javax.swing.JButton();
        panelFormType = new javax.swing.JPanel();
        labelHours = new javax.swing.JLabel();
        separatorHours = new javax.swing.JSeparator();
        selectHours = new javax.swing.JComboBox<>();
        labelNew = new javax.swing.JLabel();
        separatorNew = new javax.swing.JSeparator();
        selectNew = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(869, 720));

        panelFormContent.setBackground(new java.awt.Color(255, 255, 255));

        inputTitle.setBackground(new java.awt.Color(255, 255, 255));
        inputTitle.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        inputTitle.setForeground(new java.awt.Color(50, 50, 50));
        inputTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTitle.setText("Titulo");
        inputTitle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(236, 80, 80)));

        contentText.setBackground(new java.awt.Color(255, 255, 255));
        contentText.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        contentText.setForeground(new java.awt.Color(30, 30, 30));
        contentText.setLineWrap(true);
        contentText.setWrapStyleWord(true);
        contentText.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(180, 180, 180)));
        scrollTextArea.setViewportView(contentText);

        btnPublish.setBackground(new java.awt.Color(65, 75, 178));
        btnPublish.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPublish.setForeground(new java.awt.Color(255, 255, 255));
        btnPublish.setText("Publicar");
        btnPublish.setMaximumSize(new java.awt.Dimension(135, 39));
        btnPublish.setPreferredSize(new java.awt.Dimension(124, 45));

        javax.swing.GroupLayout panelFormContentLayout = new javax.swing.GroupLayout(panelFormContent);
        panelFormContent.setLayout(panelFormContentLayout);
        panelFormContentLayout.setHorizontalGroup(
            panelFormContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormContentLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panelFormContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollTextArea)
                    .addComponent(inputTitle))
                .addGap(76, 76, 76))
            .addGroup(panelFormContentLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnPublish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(225, 225, 225))
        );
        panelFormContentLayout.setVerticalGroup(
            panelFormContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormContentLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(inputTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(scrollTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(btnPublish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        panelFormType.setBackground(new java.awt.Color(230, 230, 230));
        panelFormType.setPreferredSize(new java.awt.Dimension(271, 720));

        labelHours.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelHours.setForeground(new java.awt.Color(65, 75, 178));
        labelHours.setText("Horario:");

        separatorHours.setForeground(new java.awt.Color(65, 75, 178));

        selectHours.setBackground(new java.awt.Color(255, 255, 255));
        selectHours.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        selectHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diurno", "Nocturno" }));

        labelNew.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        labelNew.setForeground(new java.awt.Color(65, 75, 178));
        labelNew.setText("Novedad:");

        separatorNew.setForeground(new java.awt.Color(65, 75, 178));

        selectNew.setBackground(new java.awt.Color(255, 255, 255));
        selectNew.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        selectNew.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Novedad 1", "Novedad 2", "Novedad 3", "Novedad 4" }));

        javax.swing.GroupLayout panelFormTypeLayout = new javax.swing.GroupLayout(panelFormType);
        panelFormType.setLayout(panelFormTypeLayout);
        panelFormTypeLayout.setHorizontalGroup(
            panelFormTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormTypeLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelFormTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormTypeLayout.createSequentialGroup()
                        .addComponent(labelNew)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormTypeLayout.createSequentialGroup()
                        .addGroup(panelFormTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(selectNew, javax.swing.GroupLayout.Alignment.LEADING, 0, 211, Short.MAX_VALUE)
                            .addComponent(separatorNew, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectHours, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFormTypeLayout.createSequentialGroup()
                                .addComponent(labelHours)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(separatorHours, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30))))
        );
        panelFormTypeLayout.setVerticalGroup(
            panelFormTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormTypeLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(labelHours)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorHours, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(labelNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorNew, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFormContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFormType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelFormType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublish;
    private javax.swing.JTextArea contentText;
    private javax.swing.JTextField inputTitle;
    private javax.swing.JLabel labelHours;
    private javax.swing.JLabel labelNew;
    private javax.swing.JPanel panelFormContent;
    private javax.swing.JPanel panelFormType;
    private javax.swing.JScrollPane scrollTextArea;
    private javax.swing.JComboBox<String> selectHours;
    private javax.swing.JComboBox<String> selectNew;
    private javax.swing.JSeparator separatorHours;
    private javax.swing.JSeparator separatorNew;
    // End of variables declaration//GEN-END:variables
}
