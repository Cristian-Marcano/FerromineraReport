package com.mycompany.view;

import com.mycompany.models.Comment;
import com.mycompany.utils.ItemText;
import com.mycompany.models.User;

/**
 *
 * @author Cristian
 */
public class Commentary extends javax.swing.JPanel {

    public ItemText objItemText;
    public Comment comment;
    public User user;
    
    /**
     * Creates new form Commentary
     * @param comment: objeto que almacena los valores que se usaran en esta interfaz
     * @param user: objeto que almacena los datos del usuario que creo este comentario
     */
    public Commentary(Comment comment, User user) {
        initComponents();
        this.comment = comment;
        this.user = user;
        setValues();
        objItemText = new ItemText(this, scroll, text);
        objItemText.textResize();
    }
    
    //* Insertar los datos en la interfaz
    private void setValues() {
        userOwner.setText(user.getUsername() + " comentó");
        text.setText(comment.getContent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userOwner = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(230, 230, 230));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(180, 180, 180)));
        setPreferredSize(new java.awt.Dimension(350, 100));

        userOwner.setFont(new java.awt.Font("Bahnschrift", 0, 15)); // NOI18N
        userOwner.setForeground(new java.awt.Color(40, 40, 40));
        userOwner.setText("{user} comento");

        scroll.setBorder(null);

        text.setBackground(new java.awt.Color(230, 230, 230));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        text.setForeground(new java.awt.Color(40, 40, 40));
        text.setLineWrap(true);
        text.setRows(1);
        text.setText("Texto de prueba para ver si aplica como es debido el algoritmo de la calse ItemText,\nintento nro 2:\nLorem ipsum dolor sit amet, consectetur adipiscing elit. Ut elit tellus, luctus nec ullamcorper mattis, pulvinar dapibus leo.");
        text.setWrapStyleWord(true);
        text.setBorder(null);
        text.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                textComponentResized(evt);
            }
        });
        scroll.setViewportView(text);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userOwner)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userOwner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    //* Reescala el JTextArea
    private void textComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textComponentResized
        // TODO add your handling code here:
        objItemText.textResize();
    }//GEN-LAST:event_textComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel userOwner;
    // End of variables declaration//GEN-END:variables
}
