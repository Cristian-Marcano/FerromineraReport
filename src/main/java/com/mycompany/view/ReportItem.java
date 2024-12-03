package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import com.mycompany.models.Novelties;
import com.mycompany.utils.ItemText;
import com.mycompany.models.Report;
import com.mycompany.models.User;
import com.mycompany.service.ReportService;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Cristian
 */
public class ReportItem extends javax.swing.JPanel {
    
    public ItemText objItemText;
    public Report report;
    public Novelties nov;
    public User user, userEdit;
    public Timer timer;
    
    /**
     * Creates new form report
     * @param report: objeto que almacena el contenido en esta interfaz
     * @param novelty: objeto que tiene el nombre de la novedad que esta relacionada el report
     * @param user: objeto que almacena el usuario que publico este report
     * @param userEdit: objeto que contiene al admin-supervisor que edito este report
     */
    public ReportItem(Report report, Novelties novelty, User user) {
        initComponents();
        this.report = report;
        this.nov = novelty;
        this.user = user;
        setValues();
        objItemText = new ItemText(this, scroll, text);
    }
    
    public ReportItem(Report report, Novelties novelty, User user, User userEdit) {
        initComponents();
        this.report = report;
        this.nov = novelty;
        this.user = user;
        this.userEdit = userEdit;
        setValues();
        objItemText = new ItemText(this, scroll, text);
    }
    
    private void setValues() {
        publisher.setText(user.getUsername() + " publicó");
        if(userEdit==null) editor.setVisible(false);
        else editor.setText(userEdit.getUsername() + " editó");
        date.setText(report.getCreateAt().toLocalDateTime().format(DateTimeFormatter.ofPattern("d 'de' MMMM 'del' YYYY")));
        schedule.setText(report.getSchedule());
        text.setText(report.getContent());
        novelty.setText(nov.getName());
        if(FerromineraProject.user.getRole().equals("Analista")) panelBtns.setVisible(false);
        if(report.isChecked()) {
            check.setSelected(true);
            check.setEnabled(false);
        }
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
        panelBtns = new javax.swing.JPanel();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        datetimePanel = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        panelSchedule = new javax.swing.JPanel();
        schedule = new javax.swing.JLabel();
        novelty = new javax.swing.JLabel();
        scroll = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        footer = new javax.swing.JPanel();
        separatorFooter = new javax.swing.JSeparator();
        check = new javax.swing.JCheckBox();
        comments = new javax.swing.JLabel();

        setBackground(new java.awt.Color(230, 230, 230));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(128, 128, 128)));
        setMinimumSize(new java.awt.Dimension(250, 217));

        publisher.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        publisher.setForeground(new java.awt.Color(30, 30, 30));
        publisher.setText("{user} publico");

        editor.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        editor.setForeground(new java.awt.Color(30, 30, 30));
        editor.setText("{admin} edito");

        panelBtns.setBackground(new java.awt.Color(180, 180, 180));
        panelBtns.setPreferredSize(new java.awt.Dimension(100, 35));

        btnRemove.setBackground(new java.awt.Color(205, 205, 205));
        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_logo.png"))); // NOI18N
        btnRemove.setToolTipText("Eliminar Reporte");
        btnRemove.setBorder(null);
        btnRemove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(205, 205, 205));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edit_logo.png"))); // NOI18N
        btnEdit.setToolTipText("Editar Reporte");
        btnEdit.setBorder(null);
        btnEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBtnsLayout = new javax.swing.GroupLayout(panelBtns);
        panelBtns.setLayout(panelBtnsLayout);
        panelBtnsLayout.setHorizontalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBtnsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
        );
        panelBtnsLayout.setVerticalGroup(
            panelBtnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
            .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

        panelSchedule.setBackground(new java.awt.Color(65, 75, 178));
        panelSchedule.setForeground(new java.awt.Color(255, 255, 255));

        schedule.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        schedule.setForeground(new java.awt.Color(255, 255, 255));
        schedule.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        schedule.setText("{schedule}");

        javax.swing.GroupLayout panelScheduleLayout = new javax.swing.GroupLayout(panelSchedule);
        panelSchedule.setLayout(panelScheduleLayout);
        panelScheduleLayout.setHorizontalGroup(
            panelScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelScheduleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(schedule, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelScheduleLayout.setVerticalGroup(
            panelScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(schedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        novelty.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        novelty.setForeground(new java.awt.Color(30, 30, 30));
        novelty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        novelty.setText("Novedad");
        novelty.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(65, 75, 178)));

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
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        comments.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comments.setForeground(new java.awt.Color(30, 30, 30));
        comments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/comment_logo.png"))); // NOI18N
        comments.setText("Comentar");
        comments.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        comments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comments.setIconTextGap(10);
        comments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                commentsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout footerLayout = new javax.swing.GroupLayout(footer);
        footer.setLayout(footerLayout);
        footerLayout.setHorizontalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(footerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(separatorFooter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        footerLayout.setVerticalGroup(
            footerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separatorFooter)
            .addComponent(comments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
            .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(datetimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(publisher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(139, 312, Short.MAX_VALUE)
                        .addComponent(panelSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scroll)
                            .addComponent(novelty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(publisher))
                    .addComponent(panelBtns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(editor)
                    .addComponent(datetimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(panelSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(novelty)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 15, Short.MAX_VALUE)
                .addGap(6, 6, 6)
                .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //* Reescala el JTextArea
    private void textComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_textComponentResized
        objItemText.textResize();
    }//GEN-LAST:event_textComponentResized

    //* 
    private void commentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_commentsMouseClicked
        ScrollReportContent reportsContent = new ScrollReportContent(report.getId());
        
        FerromineraProject.contentP.setPanel(reportsContent);
        FerromineraProject.contentP.showPanel();
        
        reportsContent.initReportCommentContent();
    }//GEN-LAST:event_commentsMouseClicked

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        if(check.isSelected()) {
            // Iniciar el temporizador de 30 segundos
            timer = new Timer(30000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) { // Llama a la función después de 30 segundos
                    try {
                        ReportService reportService = new ReportService();
                        reportService.checkReport(report.getId());
            
                        check.setSelected(true);
                        check.setEnabled(false);
                        
                    } catch(SQLException e) {
                        System.err.println(e.getMessage());
                        JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexión con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
                    } catch(Exception e) {
                        System.err.println(e.getMessage());
                        JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                }
            });
            timer.setRepeats(false); // Asegúrate de que el temporizador no se repita
            timer.start(); // Iniciar el temporizador
        } else {
            // Si se desmarca, detener el temporizador
            if(timer != null) {
                timer.stop();
            }
        }
    }//GEN-LAST:event_checkActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        FerromineraProject.contentP.setPanel(new ReportForm(report));
        FerromineraProject.contentP.showPanel();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(JOptionPane.showConfirmDialog(null,"¿Esta seguro de eliminar este reporte?", "Advertencia",
                                         JOptionPane.OK_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)!=0) return;
        
        try {
            ReportService reportService = new ReportService();
            reportService.removeReport(report.getId());
            
            Component comp = this.getParent();
            while((!(comp instanceof JFrame)) && (!(comp instanceof ScrollReportContent)) && comp != null) {
                comp = comp.getParent(); 
            }
        
            if(comp instanceof ScrollReportContent) {
                ScrollReportContent reportContentPane = (ScrollReportContent) comp, reportsContent;
                
                if(!reportContentPane.sentencesAndValues.isEmpty()) 
                    reportsContent = new ScrollReportContent(reportContentPane.sentencesAndValues);
                else reportsContent = new ScrollReportContent(); 
                
                FerromineraProject.contentP.setPanel(reportsContent);
                FerromineraProject.contentP.showPanel();
                
                reportsContent.initReportContent();
            }
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexión con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JCheckBox check;
    private javax.swing.JLabel comments;
    private javax.swing.JLabel date;
    private javax.swing.JPanel datetimePanel;
    private javax.swing.JLabel editor;
    private javax.swing.JPanel footer;
    private javax.swing.JLabel novelty;
    private javax.swing.JPanel panelBtns;
    private javax.swing.JPanel panelSchedule;
    private javax.swing.JLabel publisher;
    private javax.swing.JLabel schedule;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JSeparator separatorFooter;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
