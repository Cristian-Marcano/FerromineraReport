package com.mycompany.view;

import com.mycompany.utils.ItemText;

/**
 *
 * @author Cristian
 */
public class Report extends javax.swing.JPanel {
    
    public ItemText objItemText;
    
    /**
     * Creates new form report
     */
    public Report() {
        initComponents();
        objItemText = new ItemText(this, scroll, text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        publisher = new javax.swing.JLabel();
        editor = new javax.swing.JLabel();
        datetimePanel = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        footer = new javax.swing.JPanel();
        separatorFooter = new javax.swing.JSeparator();
        check = new javax.swing.JCheckBox();
        comments = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(128, 128, 128)));
        setMinimumSize(new java.awt.Dimension(250, 303));

        publisher.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        publisher.setForeground(new java.awt.Color(30, 30, 30));
        publisher.setText("{user} publico");

        editor.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        editor.setForeground(new java.awt.Color(30, 30, 30));
        editor.setText("{admin} edito");

        datetimePanel.setBackground(new java.awt.Color(236, 80, 80));

        date.setBackground(new java.awt.Color(236, 80, 80));
        date.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("{day} de {nameMonth} del {year}");

        javax.swing.GroupLayout datetimePanelLayout = new javax.swing.GroupLayout(datetimePanel);
        datetimePanel.setLayout(datetimePanelLayout);
        datetimePanelLayout.setHorizontalGroup(
            datetimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datetimePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        datetimePanelLayout.setVerticalGroup(
            datetimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        tittle.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        tittle.setForeground(new java.awt.Color(30, 30, 30));
        tittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tittle.setText("Titulo");
        tittle.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 75, 178)));

        scroll.setBorder(null);

        text.setEditable(false);
        text.setBackground(new java.awt.Color(230, 230, 230));
        text.setColumns(20);
        text.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        text.setForeground(new java.awt.Color(30, 30, 30));
        text.setLineWrap(true);
        text.setRows(1);
        text.setText("JFrame: Ventana principal de la aplicación.\nJPanel (contentPanel): Contiene tanto el botón sticky como el JScrollPane.\nJButton (stickyButton): Este botón se coloca inicialmente en la parte superior.\nJScrollPane: Contiene el panel desplazable con varios botones.\nAdjustmentListener: Se utiliza para detectar el desplazamiento del scrollbar. Cada vez que se desplaza, se actualiza la posición del botón sticky.");
        text.setWrapStyleWord(true);
        text.setAutoscrolls(false);
        text.setBorder(null);
        text.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                textComponentResized(evt);
            }
        });
        scroll.setViewportView(text);

        footer.setBackground(new java.awt.Color(230, 230, 230));
        footer.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(128, 128, 128)));
        footer.setPreferredSize(new java.awt.Dimension(466, 40));

        separatorFooter.setForeground(new java.awt.Color(128, 128, 128));
        separatorFooter.setOrientation(javax.swing.SwingConstants.VERTICAL);

        check.setBackground(new java.awt.Color(230, 230, 230));
        check.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        check.setForeground(new java.awt.Color(30, 30, 30));
        check.setText("Checado");
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        comments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comments.setForeground(new java.awt.Color(30, 30, 30));
        comments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comment_logo.png"))); // NOI18N
        comments.setText("Comentar");
        comments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        comments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comments.setIconTextGap(10);

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(150, 150, 150)
                .addComponent(separatorFooter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(126, 126, 126))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorFooter)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(comments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(publisher)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datetimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scroll)
                    .addComponent(tittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(publisher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editor)
                    .addComponent(datetimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(tittle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll)
                .addGap(18, 18, 18)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textComponentResized
        // TODO add your handling code here:
        objItemText.textResize();
    }//GEN-LAST:event_textComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel comments;
    private javax.swing.JLabel date;
    private javax.swing.JPanel datetimePanel;
    private javax.swing.JLabel editor;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel publisher;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorFooter;
    private javax.swing.JTextArea text;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
