package com.mycompany.utils;

import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.mycompany.models.Novelties;
import com.mycompany.models.Report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Cristian
 * Clase que se encarga de generar el documento PDF
 */
public class PDFGenerator {
    
    /**
     * name: nombre que se le asignara al pdf
     * directory: dirección donde se generara/guardara el documento
     * userHome: obtener el nombre del usuario en el OS para dirigir el documento a la direccion de ese usuario
     * document: objeto que contendra el documento con su respectiva info
     */
    
    private String name;
    private String directory = "Documents";
    private String userHome = System.getProperty("user.home");
    private Document document;
    
    /**
     * 
     * @param name: nombre que se le asignara al documento
     */
    
    public PDFGenerator(String name) {
        this.name = name;
        document = new Document(PageSize.A4, 80,80,50,50);
    }
    
    //* Instancia el documento y lo abre para insertarle la informacion
    public void createDocument() throws DocumentException, FileNotFoundException {
        String documentPath = Paths.get(userHome, directory, name + ".pdf").toString();
        PdfWriter.getInstance(document, new FileOutputStream(documentPath));
        document.open();
    }
    
    //* Insertar al documento cabecera con 2 imagenes (una a la izquierda y otra a la derecha)
    public void insertTableHeaderImage(URL imageUrl1, URL imageUrl2, int scaleX, int scaleY) throws DocumentException, BadElementException, IOException {
        PdfPTable headerTable = new PdfPTable(2); // Tabla con 2 columnas
        headerTable.setWidthPercentage(100);
        headerTable.setWidths(new int[]{1, 1}); // Definir tamaños proporcionales

        // Cargar las imágenes
        Image leftImage = Image.getInstance(imageUrl1);
        Image rightImage = Image.getInstance(imageUrl2);
        rightImage.setAlignment(Image.ALIGN_RIGHT);

        // Ajustar el tamaño de las imágenes
        leftImage.scaleToFit(scaleX,scaleY);
        rightImage.scaleToFit(scaleX+30,scaleY);

        // Añadir las imágenes a las celdas de la tabla
        PdfPCell leftCell = new PdfPCell(leftImage);
        PdfPCell rightCell = new PdfPCell(rightImage);
        rightCell.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);

        // Quitar bordes de las celdas
        leftCell.setBorder(Rectangle.NO_BORDER);
        rightCell.setBorder(Rectangle.NO_BORDER);

        // Añadir celdas a la tabla
        headerTable.addCell(leftCell);
        headerTable.addCell(rightCell);

        // Añadir la tabla al documento
        document.add(headerTable);
    }
    
    //* Insertar imagen al documento
    public void insertImage(URL imageUrl, int aligment, int scaleX, int scaleY) throws DocumentException, BadElementException, IOException {
        Image image = Image.getInstance(imageUrl);
        image.scaleToFit(scaleX, scaleY);
        image.setAlignment(aligment);
        document.add(image);
    }
    
    //* Insertar texto
    public void insertText(String text, Font font, int spacing) throws DocumentException {
        Paragraph paragraph = new Paragraph(text, font);
        paragraph.setSpacingBefore(spacing);
        paragraph.setSpacingAfter(spacing);
        document.add(paragraph);
        
    }
    
    //* Insertar listado de texto
    public void insertTexts(List<String> texts, Font font, int spacing) throws DocumentException {
        for(String item: texts) {
            Paragraph paragraph = new Paragraph(item, font);
            paragraph.setSpacingAfter(spacing);
            document.add(paragraph);
        }
    }
    
    //* Insertar texto con valor (texto en negritas y valor normal)
    public void insertTextAndValue(String text, String value, Font fontText, Font fontValues, int spacing) throws DocumentException {
        Chunk textChunk = new Chunk(text + ": ", fontText);
        Chunk valueChunk = new Chunk(value + "\n", fontValues);
            
        Phrase phrase = new Phrase();
        phrase.add(textChunk);
        phrase.add(valueChunk);
        
        Paragraph paragraph = new Paragraph(phrase);
        paragraph.setSpacingBefore(spacing);
            
        document.add(paragraph);
    }
    
    //* Insertar textos con sus valores
    public void insertTextsAndValues(List<String[]> textsAndValues, Font fontText, Font fontValues, int spacing) throws DocumentException {
        for(String[] item: textsAndValues) {
            Chunk text = new Chunk("\t- " + item[0] + ": ", fontText);
            Chunk value = new Chunk(item[1] + "\n", fontValues);
            
            Phrase phrase = new Phrase();
            phrase.add(text);
            phrase.add(value);
            
            Paragraph paragraph = new Paragraph(phrase);
            paragraph.setSpacingBefore(spacing);
            
            document.add(paragraph);
        }
    }
    
    //* Insertar Tabla (tabla especifica que necesita la app)
    public void insertReportTable(List<Object[]> reports) throws DocumentException {
        PdfPTable table = new PdfPTable(4);
        
        table.setWidthPercentage(100);
        table.setSpacingBefore(10);
        table.setSpacingAfter(20);

        // Encabezados de la tabla
        table.addCell("Tipo de Novedad");
        table.addCell("Fecha");
        table.addCell("Hora");
        table.addCell("Descripción");
        
        for(Object[] item: reports) {
            table.addCell(((Novelties) item[1]).getName());
            table.addCell(new SimpleDateFormat("yyyy-MM-dd").format(((Report) item[0]).getCreateAt()));
            table.addCell(((Report) item[0]).getSchedule());
            table.addCell(((Report) item[0]).getContent());
        }
        
        document.add(table);
    }
    
    //* Cerrar documento para poder leerlo
    public void closeDocument() {
        document.close();
    }
}
