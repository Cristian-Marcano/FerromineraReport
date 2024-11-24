package com.mycompany.view;

import com.mycompany.ferromineraproject.FerromineraProject;
import com.mycompany.models.Comment;
import com.mycompany.models.Novelties;
import com.mycompany.service.CommentService;
import com.mycompany.service.ReportService;
import com.mycompany.models.Report;
import com.mycompany.models.User;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.AdjustmentEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class ScrollReportContent extends javax.swing.JPanel {
    
    public int offset = 0, limit = 10, reportId;
    public List<String[]> sentencesAndValues = new ArrayList<>();
    public CommentaryForm commentaryForm = null;
    
    /**
     * Creates new form ScrollPublishContent
     */
    public ScrollReportContent() {
        initComponents();
    }
    
    public ScrollReportContent(int reportId) {
        this();
        this.reportId = reportId;
        commentaryForm = new CommentaryForm(reportId);
        
        scroll.getVerticalScrollBar().addAdjustmentListener((AdjustmentEvent e) -> {
            // Actualizar la posición del CommentaryForm
            changePosition();
        });
    }
    
    public ScrollReportContent(List<String[]> sentencesAndValues) {
        this();
        this.sentencesAndValues = sentencesAndValues;
    }
    
    @Override
    public void addNotify() {
        super.addNotify();
        
        try {
            FerromineraProject.contentP.resizeScrollPane();
        } catch(Exception e) { System.err.println(e.getMessage()); }
    }
    
    public void initReportContent() {
        List<JPanel> reportPanels = new ArrayList<>();
        List<Object[]> reports;
        
        try {
            ReportService reportService = new ReportService();
            reports = (sentencesAndValues.isEmpty()) ? reportService.getReports(limit, offset) : reportService.searchReports(sentencesAndValues, limit, offset);
            
            for(int i=0; i<reports.size(); i++) {
                if(((User) reports.get(i)[4]).getUsername()==null)
                    reportPanels.add(new ReportItem((Report) reports.get(i)[0],
                                                    (Novelties) reports.get(i)[1],
                                                    (User) reports.get(i)[3]));
                else 
                    reportPanels.add(new ReportItem((Report) reports.get(i)[0],
                                                     (Novelties) reports.get(i)[1],
                                                     (User) reports.get(i)[3],
                                                     (User) reports.get(i)[4]));
            }
            
            FerromineraProject.contentP.showItemsPanel(reportPanels);
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexión con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void initReportCommentContent() {
        List<JPanel> commentsByReportPanels = new ArrayList<>();
        List<Object[]> commentReportList;
        
        try {
            CommentService commentService = new CommentService();
            commentReportList = commentService.getComments(reportId);
            
            ReportService reportService = new ReportService();
            commentReportList.addFirst(reportService.getReport(reportId));
            
            for(int i=0; i<commentReportList.size(); i++) {
                if(i==0 && ((User) commentReportList.get(i)[4]).getUsername()==null)
                    commentsByReportPanels.add(new ReportItem((Report) commentReportList.get(i)[0],
                                                              (Novelties) commentReportList.get(i)[1],
                                                              (User) commentReportList.get(i)[3]));
                else if(i==0)
                    commentsByReportPanels.add(new ReportItem((Report) commentReportList.get(i)[0],
                                                              (Novelties) commentReportList.get(i)[1],
                                                              (User) commentReportList.get(i)[3],
                                                              (User) commentReportList.get(i)[4]));
                else
                    commentsByReportPanels.add(new Commentary((Comment) commentReportList.get(i)[0], (User) commentReportList.get(i)[1]));
            }
            
            FerromineraProject.contentP.showItemsPanel(commentsByReportPanels);
            
            reportContent.add(commentaryForm, 0);
            changePosition();
            
        } catch(SQLException e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Ocurrio un Error en la conexión con la Base de Datos","ERROR",JOptionPane.ERROR_MESSAGE);
        } catch(Exception e) {
            System.err.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"No se puede avanzar \n" + e.getMessage(),"Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //* Cambiar de posicion al CommentaryForm
    private void changePosition() {
        Dimension viewport = scroll.getViewport().getSize();
            
        Point p = new Point(0, viewport.height - 115 + scroll.getVerticalScrollBar().getValue());
        
        commentaryForm.setSize(viewport.width, 75);
        commentaryForm.setLocation(p);
        
        commentaryForm.revalidate();
        commentaryForm.repaint();
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
        reportContent = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(869, 720));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        scroll.setBorder(null);

        reportContent.setBackground(new java.awt.Color(255, 255, 255));
        reportContent.setPreferredSize(new java.awt.Dimension(600, 720));

        javax.swing.GroupLayout reportContentLayout = new javax.swing.GroupLayout(reportContent);
        reportContent.setLayout(reportContentLayout);
        reportContentLayout.setHorizontalGroup(
            reportContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        reportContentLayout.setVerticalGroup(
            reportContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        scroll.setViewportView(reportContent);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 869, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        try {
            FerromineraProject.contentP.resizeScrollPane();
            if(commentaryForm!=null) changePosition();
        } catch(Exception e) { System.err.println(e.getMessage()); }
    }//GEN-LAST:event_formComponentResized


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel reportContent;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
