/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import com.itextpdf.awt.PdfPrinterGraphics2D;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.ImgTemplate;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.print.PrintTranscoder;

/**
 *
 * @author Administrator
 */
public class SvgPdfJsp {

    public static void main(String[] args) throws BadElementException ,DocumentException, FileNotFoundException  {
        
        String svg = "<svg width=\"600\" height=\"300\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"> <rect x=\"40\" y=\"20\" rx=\"20\" ry=\"20\" width=\"250\" height=\"250\" style=\"fill:red;stroke:black;stroke-width:1;\" /></svg>";
        String rootPath = "D:\\";
        // Create the PDF document.
        // rootPath is the present working directory path.
        Document document = new Document();

        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(rootPath + "svg.pdf")));
        document.open();

        // Add paragraphs to the document...
        document.add(new Paragraph("Paragraph 1"));
        document.add(new Paragraph(" "));

        
        int width = 500;
        int height = 500;
        PdfContentByte cb = writer.getDirectContent();
        PdfTemplate template = cb.createTemplate(width, height);
        //Graphics2D g2 = template.createGraphics(width, height);
        PdfPrinterGraphics2D g2 = new PdfPrinterGraphics2D(cb, width, height, null, PrinterJob.getPrinterJob());
        PrintTranscoder prm = new PrintTranscoder();
        InputStream is = new ByteArrayInputStream(svg.getBytes());
        TranscoderInput ti = new TranscoderInput(is);
        prm.transcode(ti, null);

        PageFormat pg = new PageFormat();
        Paper pp = new Paper();
        pp.setSize(width, height);
        pp.setImageableArea(0, 0, width, height);
        pg.setPaper(pp);
        prm.print(g2, pg, 0);
        g2.dispose();

        ImgTemplate img = new ImgTemplate(template);
        document.add(img);
         document.close();
    }

}



/*


*/
