package com.mycompany.ferromineraproject;

import com.mycompany.utils.ShowJPanel;
import com.mycompany.view.ForgotBar;
import com.mycompany.view.InitBar;
import com.mycompany.view.LoginBar;
import com.mycompany.view.MenuAdminBar;
import com.mycompany.view.MenuBar;
import com.mycompany.view.ReportForm;
import com.mycompany.view.ScrollReportContent;
import com.mycompany.view.ScrollUserContent;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 *
 * @author Cristian
 * Clase principal donde se ejecuta la ventana del programa
 * y confirma si los demas modulos/paquetes estan listos
 */
public class FerromineraProject extends javax.swing.JFrame {
    
    /** 
     * Objetos que ayudan la integracion de componentes a la ventana
     * 
     * board: objeto que ayuda la integracion de paneles al dashboard
     * contentP: objeto que ayuda la integracion de paneles al content
     */
    public static ShowJPanel board, contentP;
    
    /**
     * Creates new form FerromineraProject
     */
    public FerromineraProject() {
        initComponents();
        
        board = InitPanel(new MenuAdminBar(), dashboard, new Dimension(405,720));
//        contentP = InitPanel(new ScrollReportContent(), content, new Dimension(875,720));
//        contentP = InitPanel(new ScrollUserContent(), content, new Dimension(875,720));
        contentP = InitPanel(new ReportForm(), content, new Dimension(875,720));

//        ScrollReportContent.InitReportContent();
//        ScrollUserContent.InitUserContent();
    }
    
    private ShowJPanel InitPanel(JPanel panel, JPanel container, Dimension size) {
        ShowJPanel show = new ShowJPanel(panel, container, size);
        show.ShowPanel();
        return show;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        content = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1032, 680));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        background.setBackground(new java.awt.Color(255, 255, 255));

        dashboard.setBackground(new java.awt.Color(247, 34, 34));
        dashboard.setToolTipText("");
        dashboard.setMinimumSize(new java.awt.Dimension(405, 720));

        javax.swing.GroupLayout dashboardLayout = new javax.swing.GroupLayout(dashboard);
        dashboard.setLayout(dashboardLayout);
        dashboardLayout.setHorizontalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 405, Short.MAX_VALUE)
        );
        dashboardLayout.setVerticalGroup(
            dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setMinimumSize(new java.awt.Dimension(600, 720));
        content.setPreferredSize(new java.awt.Dimension(875, 720));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ferrominera_logo.png"))); // NOI18N
        logo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //* Reescalamiento del dashboard, para cuando aumente de tamaño la ventana
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        int width = this.getWidth() / 4;
        
        if(width >= dashboard.getMinimumSize().width ) 
            dashboard.setPreferredSize(new Dimension(width, this.getHeight()));
        else 
            dashboard.setPreferredSize(new Dimension(dashboard.getMinimumSize().width, this.getHeight()));
        
        background.revalidate();
        this.revalidate();
        background.repaint();
        this.repaint();
    }//GEN-LAST:event_formComponentResized

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FerromineraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FerromineraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FerromineraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FerromineraProject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        */
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FerromineraProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel content;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
