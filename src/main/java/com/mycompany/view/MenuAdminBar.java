package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import java.awt.Color;

/**
 *
 * @author Cristian
 */
public class MenuAdminBar extends javax.swing.JPanel {

    public Color normal = new Color(236,80,80), hover = new Color(223,50,50);
    
    /**
     * Creates new form MenuBar
     */
    public MenuAdminBar() {
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

        title = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnPublish = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setBackground(new java.awt.Color(247, 34, 34));
        setMinimumSize(new java.awt.Dimension(0, 680));
        setPreferredSize(new java.awt.Dimension(405, 720));

        title.setFont(new java.awt.Font("Bahnschrift", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Menu");
        title.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));

        btnHome.setBackground(new java.awt.Color(236, 80, 80));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_logo.png"))); // NOI18N
        btnHome.setText("Inicio");
        btnHome.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setIconTextGap(15);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(236, 80, 80));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search_logo.png"))); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSearch.setIconTextGap(15);
        btnSearch.setPreferredSize(new java.awt.Dimension(75, 34));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnPublish.setBackground(new java.awt.Color(236, 80, 80));
        btnPublish.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPublish.setForeground(new java.awt.Color(255, 255, 255));
        btnPublish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/publish_logo.png"))); // NOI18N
        btnPublish.setText("Publicar Reporte");
        btnPublish.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnPublish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPublish.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPublish.setIconTextGap(15);
        btnPublish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPublishMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPublishMouseExited(evt);
            }
        });
        btnPublish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishActionPerformed(evt);
            }
        });

        btnUsers.setBackground(new java.awt.Color(236, 80, 80));
        btnUsers.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnUsers.setForeground(new java.awt.Color(255, 255, 255));
        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/users_logo.png"))); // NOI18N
        btnUsers.setText("Usuarios");
        btnUsers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsers.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsers.setIconTextGap(15);
        btnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsersMouseExited(evt);
            }
        });
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(236, 80, 80));
        btnLogOut.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnLogOut.setForeground(new java.awt.Color(255, 255, 255));
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout_logo.png"))); // NOI18N
        btnLogOut.setText("Cerrar Sesión");
        btnLogOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        btnLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogOut.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogOut.setIconTextGap(15);
        btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogOutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogOutMouseExited(evt);
            }
        });
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPublish, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
            .addComponent(btnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(title)
                .addGap(50, 50, 50)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPublish, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    //* Se dirige a la interfaz que muestra la lista de contenidos publicados (HOME)
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        ScrollReportContent reportsContent = new ScrollReportContent();
        
        FerromineraProject.contentP.setPanel(reportsContent);
        FerromineraProject.contentP.showPanel();
        
        reportsContent.initReportContent();
    }//GEN-LAST:event_btnHomeActionPerformed

    //* Se dirige a la interfaz visual de filtros de busqueda
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        FerromineraProject.contentP.setPanel(new ReportFilter());
        FerromineraProject.contentP.showPanel();
    }//GEN-LAST:event_btnSearchActionPerformed
    
    //* Se dirige a la interfaz visual de crear reportes
    private void btnPublishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishActionPerformed
        FerromineraProject.contentP.setPanel(new ReportForm());
        FerromineraProject.contentP.showPanel();
    }//GEN-LAST:event_btnPublishActionPerformed

    //* Se dirige a la interfaz visual que muestra cada uno de los usuarios
    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed
        ScrollUserContent usersContent = new ScrollUserContent();
        
        FerromineraProject.contentP.setPanel(usersContent);
        FerromineraProject.contentP.showPanel();
        
        usersContent.initUserContent();
    }//GEN-LAST:event_btnUsersActionPerformed

    //* Cerrar Sesion y dirigirse al Login
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        FerromineraProject.user = null;
        
        FerromineraProject.board.setPanel(new LoginBar());
        FerromineraProject.contentP.setPanel(new Logo());
        
        FerromineraProject.board.showPanel();
        FerromineraProject.contentP.showPanel();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        btnHome.setBackground(hover);
        btnHome.revalidate();
        btnHome.repaint();
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        btnHome.setBackground(normal);
        btnHome.revalidate();
        btnHome.repaint();
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        btnSearch.setBackground(hover);
        btnSearch.revalidate();
        btnSearch.repaint();
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        btnSearch.setBackground(normal);
        btnSearch.revalidate();
        btnSearch.repaint();
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnPublishMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublishMouseEntered
        btnPublish.setBackground(hover);
        btnPublish.revalidate();
        btnPublish.repaint();
    }//GEN-LAST:event_btnPublishMouseEntered

    private void btnPublishMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPublishMouseExited
        btnPublish.setBackground(normal);
        btnPublish.revalidate();
        btnPublish.repaint();
    }//GEN-LAST:event_btnPublishMouseExited

    private void btnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseEntered
        btnUsers.setBackground(hover);
        btnUsers.revalidate();
        btnUsers.repaint();
    }//GEN-LAST:event_btnUsersMouseEntered

    private void btnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsersMouseExited
        btnUsers.setBackground(normal);
        btnUsers.revalidate();
        btnUsers.repaint();
    }//GEN-LAST:event_btnUsersMouseExited

    private void btnLogOutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseEntered
        btnLogOut.setBackground(hover);
        btnLogOut.revalidate();
        btnLogOut.repaint();
    }//GEN-LAST:event_btnLogOutMouseEntered

    private void btnLogOutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogOutMouseExited
        btnLogOut.setBackground(normal);
        btnLogOut.revalidate();
        btnLogOut.repaint();
    }//GEN-LAST:event_btnLogOutMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPublish;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUsers;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
