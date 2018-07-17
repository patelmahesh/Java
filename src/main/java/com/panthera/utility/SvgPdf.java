/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.GVTBuilder;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.svg.SVGDocument;

import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.StringReader;

/**
 *
 * @author Administrator
 */
public class SvgPdf {

    public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException {

        // SVG as a text string.
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

        // Boilerplate for drawing the SVG to the PDF.
        String parser = XMLResourceDescriptor.getXMLParserClassName();
        SAXSVGDocumentFactory factory = new SAXSVGDocumentFactory(parser);
        UserAgent userAgent = new UserAgentAdapter();
        DocumentLoader loader = new DocumentLoader(userAgent);
        BridgeContext ctx = new BridgeContext(userAgent, loader);
        ctx.setDynamicState(BridgeContext.DYNAMIC);
        GVTBuilder builder = new GVTBuilder();
        PdfContentByte cb = writer.getDirectContent();

        // Parse the SVG and draw it to the PDF.
        Graphics2D g2d = new PdfGraphics2D(cb, 500, 500);
        SVGDocument chart = factory.createSVGDocument(null, new StringReader(svg));
        GraphicsNode chartGfx = builder.build(ctx, chart);
        chartGfx.paint(g2d);
        g2d.dispose();

        // Add paragraphs to the document...
        document.add(new Paragraph("Paragraph 2"));
        document.add(new Paragraph(" "));

        document.close();
        
        PdfPTable table = new PdfPTable(2);
        table.setTotalWidth(770);
        
        

    }
}
