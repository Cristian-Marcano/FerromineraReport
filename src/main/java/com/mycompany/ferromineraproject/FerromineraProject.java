package com.mycompany.ferromineraproject;

import com.mycompany.DB.Database;
import com.mycompany.models.User;
import com.mycompany.service.UserService;
import com.mycompany.utils.ShowJPanel;
import com.mycompany.view.InitBar;
import com.mycompany.view.LoginBar;
import com.mycompany.view.Logo;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.sql.SQLException;
import javax.swing.JOptionPane;


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
     * user: objeto que almacena los datos del usario al iniciar sesion
     */
    public static ShowJPanel board, contentP;
    public static User user;
    
    /**
     * Creates new form FerromineraProject
     */
    public FerromineraProject() {
        initComponents();
        
        try {
            if(new UserService().getCountUsers() == 0)
                board = initPanel(new InitBar(), dashboard, new Dimension(405,720));
            else board = initPanel(new LoginBar(), dashboard, new Dimension(405,720));
            
            contentP = initPanel(new Logo(), content, new Dimension(875,720));
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"Base de datos no encontrada","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
    private ShowJPanel initPanel(JPanel panel, JPanel container, Dimension size) {
        ShowJPanel show = new ShowJPanel(panel, container, size);
        show.showPanel();
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

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
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

        if(!Database.verifyController()) {
            JOptionPane.showMessageDialog(null,"Conector de Base de Datos, No encontrado","Alerta",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        
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
    // End of variables declaration//GEN-END:variables
}
