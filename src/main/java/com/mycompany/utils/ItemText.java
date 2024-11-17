package com.mycompany.utils;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Cristian
 * Clase que ayuda en el reescalado de JTextArea y cambia el tamaño del panel contenedor
 * del JTextArea para que no aparezcan el scroll en estos
 */
public class ItemText {
    
    /**
     * itemPanel: panel contenedor del JTextArea
     * scroll: scroll del JTextArea
     * text: el JTextArea
    */
    
    private JPanel itemPanel;
    private JScrollPane scroll;
    private JTextArea text;
    private boolean first = true;
    
    //* Constructor
    public ItemText(JPanel item, JScrollPane itemScroll, JTextArea itemText) {
        itemPanel = item;
        scroll = itemScroll;
        text = itemText;
    }
    
    //* Reescalador del JTextArea y del panel
    public void textResize() {
        int width = text.getWidth();
        // Obtener la altura de la fuente
        int lineHeight = text.getFontMetrics(text.getFont()).getHeight();
        // Obtener el texto actual
        String string = text.getText();
        // Dividir el texto en líneas
        String[] lines = string.split("\n");
        int totalLines = 0;

        // Calcular el número total de líneas necesarias
        for (String line : lines) {
            // Calcular el ancho del texto de la línea
            int lineWidth = text.getFontMetrics(text.getFont()).stringWidth(line);
            // Si el ancho de la línea es mayor que el ancho del JTextArea, se necesita más de una línea
            if (lineWidth > width) {
                totalLines += Math.ceil((double) lineWidth / width);
            } else {
                totalLines++;
            }
        }
                
        int heightText = ((lineHeight) * totalLines);
        
        int height = itemPanel.getPreferredSize().height + heightText - text.getPreferredSize().height;
        
        if(first) {
            first = false;
            itemPanel.setPreferredSize(new Dimension(itemPanel.getPreferredSize().width, itemPanel.getPreferredSize().height + heightText + 5));
        } else itemPanel.setPreferredSize(new Dimension(itemPanel.getPreferredSize().width, height));
            
        
        text.setPreferredSize(new Dimension(text.getWidth(), heightText));
        scroll.revalidate();
        text.revalidate();
        scroll.repaint();
        text.repaint();
    }
}
