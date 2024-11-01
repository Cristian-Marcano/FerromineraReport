package com.mycompany.utils;

import java.awt.Component;
import java.awt.Dimension;
import java.util.List;
import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Cristian
 */
public class ShowJPanel {
    private Dimension size;
    private JPanel panel, container;
    private GroupLayout containerLayout;
    
    public ShowJPanel(JPanel p, JPanel contain, Dimension size) {
        InitPanels(p, contain);
        this.size = size;
    }
    
    private void InitPanels(JPanel p, JPanel contain) {
        panel = p;
        container = contain;
        containerLayout = new GroupLayout(container);
    }
    
    public void SetPanel(JPanel p) {
        panel = p;
    }
    
    public void RefreshContainer() {
        container.revalidate();
        container.repaint();
    }
    
    public void ShowPanel() {
        panel.setSize(size);
        
        container.removeAll();
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        container.setLayout(containerLayout);
        
        RefreshContainer();
    }
    
    public void ShowItemsPanel(List<JPanel> panelList) throws Exception {
        if(panel.getComponent(0) instanceof JScrollPane) {
            
            JScrollPane scroll = (JScrollPane) panel.getComponent(0);
            
            JPanel panelContent = (JPanel) scroll.getViewport().getView();
            
            GroupLayout panelContentLayout = new GroupLayout(panelContent);
            
            panelContent.setLayout(panelContentLayout);
            
            GroupLayout.SequentialGroup hSequentialGroupLayout = panelContentLayout.createSequentialGroup();
            GroupLayout.ParallelGroup hParallelGroupLayout = panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING);
            
            GroupLayout.SequentialGroup vGroupLayout = panelContentLayout.createSequentialGroup();
            
            hSequentialGroupLayout.addGap(10, 90, 90);
            
            for(JPanel item: panelList) {
                
                hParallelGroupLayout.addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, item.getMaximumSize().width);
                
                vGroupLayout.addGap(42, 42, 42)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE);
            }
            
            hSequentialGroupLayout.addGroup(hParallelGroupLayout).addGap(10, 90, 90);
            vGroupLayout.addContainerGap(20, Short.MAX_VALUE);
            
            panelContentLayout.setHorizontalGroup(
                panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, hSequentialGroupLayout)
            );
            
            panelContentLayout.setVerticalGroup(
                panelContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(vGroupLayout)
            );
            
            panelContent.revalidate();
            panelContent.repaint();
            
        } else throw new Exception("the panel does not contain a JScrollPane"); //! Si el panel no contiene un JScrollPane retorna una Excepcion
    }
    
    public void ResizeScrollPane() throws Exception {
        if(panel.getComponent(0) instanceof JScrollPane) {
            
            JScrollPane scroll = (JScrollPane) panel.getComponent(0);
            
            JPanel panelContent = (JPanel) scroll.getViewport().getView();
            
            int heightSize = 42;
            
            for(Component comp: panelContent.getComponents()) 
                if(comp instanceof JPanel) heightSize += comp.getPreferredSize().height + 42;
            
            
            panelContent.setPreferredSize(new Dimension(panelContent.getPreferredSize().width, heightSize));
        } else throw new Exception("the panel does not contain a JScrollPane");
    }
}
