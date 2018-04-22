/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility;

import com.itextpdf.awt.PdfGraphics2D;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import org.apache.batik.anim.dom.SAXSVGDocumentFactory;
import org.apache.batik.bridge.BridgeContext;
import org.apache.batik.bridge.DocumentLoader;
import org.apache.batik.bridge.GVTBuilder;
import org.apache.batik.bridge.UserAgent;
import org.apache.batik.bridge.UserAgentAdapter;
import org.apache.batik.gvt.GraphicsNode;
import org.apache.batik.util.XMLResourceDescriptor;
import org.w3c.dom.svg.SVGDocument;


/**
 *
 * @author Administrator
 */
public class SvgToPDF {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        try {
            
        
        
// SVG as a text string.
        String svg = "<svg>...</svg>";
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
        Graphics2D g2d = new PdfGraphics2D(cb, 725, 400);
        SVGDocument chart = factory.createSVGDocument(rootPath, new StringReader(svg));
        GraphicsNode chartGfx = builder.build(ctx, chart);
        chartGfx.paint(g2d);
        g2d.dispose();

// Add paragraphs to the document...
        document.add(new Paragraph("Paragraph 2"));
        document.add(new Paragraph(" "));

        document.close();
        } catch (DocumentException | FileNotFoundException e) {
        }
    }

}
