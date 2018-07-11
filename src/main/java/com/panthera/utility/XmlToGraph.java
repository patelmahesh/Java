/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;
import com.mxgraph.canvas.mxGraphics2DCanvas;
import com.mxgraph.canvas.mxICanvas;
import com.mxgraph.io.mxCodec;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxCellRenderer.CanvasFactory;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 *
 * @author Administrator
 */
public class XmlToGraph {

    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, DocumentException {
        String xml = "%3CmxGraphModel%20dx%3D%221363%22%20dy%3D%22887%22%20grid%3D%221%22%20gridSize%3D%2210%22%20guides%3D%221%22%20tooltips%3D%221%22%20connect%3D%221%22%20arrows%3D%221%22%20fold%3D%221%22%20page%3D%221%22%20pageScale%3D%221%22%20pageWidth%3D%22850%22%20pageHeight%3D%221100%22%20background%3D%22%23ffffff%22%3E%3Croot%3E%3CmxCell%20id%3D%220%22%2F%3E%3CmxCell%20id%3D%221%22%20parent%3D%220%22%2F%3E%3CmxCell%20id%3D%224%22%20value%3D%22%22%20style%3D%22endArrow%3Dnone%22%20parent%3D%221%22%20source%3D%222%22%20target%3D%223%22%20edge%3D%221%22%3E%3CmxGeometry%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%222%22%20value%3D%22%22%20parent%3D%221%22%20vertex%3D%221%22%3E%3CmxGeometry%20x%3D%22160%22%20y%3D%22280%22%20width%3D%22120%22%20height%3D%2260%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%223%22%20value%3D%22%22%20parent%3D%221%22%20vertex%3D%221%22%3E%3CmxGeometry%20x%3D%22340%22%20y%3D%22210%22%20width%3D%22120%22%20height%3D%2260%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%225%22%20value%3D%22%22%20style%3D%22shape%3Ddocument%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3BboundedLbl%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22120%22%20y%3D%22360%22%20width%3D%22120%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%226%22%20value%3D%22%22%20style%3D%22ellipse%3Bshape%3Dcloud%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22220%22%20y%3D%22130%22%20width%3D%22120%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%227%22%20value%3D%22%22%20style%3D%22shape%3Dhexagon%3Bperimeter%3DhexagonPerimeter2%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22425%22%20y%3D%22430%22%20width%3D%22120%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%228%22%20value%3D%22%22%20style%3D%22ellipse%3Bshape%3Dcloud%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%2290%22%20y%3D%22150%22%20width%3D%22120%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%229%22%20value%3D%22%22%20style%3D%22shape%3Dcube%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3BboundedLbl%3D1%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22425%22%20y%3D%2270%22%20width%3D%22120%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2210%22%20value%3D%22%22%20style%3D%22ellipse%3BwhiteSpace%3Dwrap%3Bhtml%3D1%3Baspect%3Dfixed%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%2280%22%20y%3D%2230%22%20width%3D%2280%22%20height%3D%2280%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2211%22%20value%3D%22Text%22%20style%3D%22text%3Bhtml%3D1%3BstrokeColor%3Dnone%3BfillColor%3Dnone%3Balign%3Dcenter%3BverticalAlign%3Dmiddle%3BwhiteSpace%3Dwrap%3Brounded%3D0%3B%22%20vertex%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20x%3D%22270%22%20y%3D%2270%22%20width%3D%2240%22%20height%3D%2220%22%20as%3D%22geometry%22%2F%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2212%22%20value%3D%22%22%20style%3D%22shape%3Dlink%3Bhtml%3D1%3BjettySize%3Dauto%3BorthogonalLoop%3D1%3B%22%20edge%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22215%22%20y%3D%22310%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22265%22%20y%3D%22260%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2213%22%20value%3D%22%22%20style%3D%22shape%3Dlink%3Bhtml%3D1%3BjettySize%3Dauto%3BorthogonalLoop%3D1%3B%22%20edge%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22180%22%20y%3D%22270%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22230%22%20y%3D%22220%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2214%22%20value%3D%22%22%20style%3D%22shape%3DflexArrow%3BendArrow%3Dclassic%3Bhtml%3D1%3BfillColor%3D%23ffffff%3B%22%20edge%3D%221%22%20parent%3D%221%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22130%22%20y%3D%22160%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22180%22%20y%3D%22110%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2215%22%20value%3D%22%22%20style%3D%22shape%3DflexArrow%3BendArrow%3Dclassic%3BstartArrow%3Dclassic%3Bhtml%3D1%3BfillColor%3D%23ffffff%3B%22%20edge%3D%221%22%20parent%3D%221%22%20source%3D%225%22%20target%3D%227%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22390%22%20y%3D%22450%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22440%22%20y%3D%22400%22%20as%3D%22targetPoint%22%2F%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3CmxCell%20id%3D%2216%22%20value%3D%22%22%20style%3D%22curved%3D1%3BendArrow%3Dclassic%3Bhtml%3D1%3B%22%20edge%3D%221%22%20parent%3D%221%22%20target%3D%229%22%3E%3CmxGeometry%20width%3D%2250%22%20height%3D%2250%22%20relative%3D%221%22%20as%3D%22geometry%22%3E%3CmxPoint%20x%3D%22310%22%20y%3D%22481.7931034482758%22%20as%3D%22sourcePoint%22%2F%3E%3CmxPoint%20x%3D%22611.6666666666667%22%20y%3D%22238%22%20as%3D%22targetPoint%22%2F%3E%3CArray%20as%3D%22points%22%3E%3CmxPoint%20x%3D%22540%22%20y%3D%22458%22%2F%3E%3CmxPoint%20x%3D%22600%22%20y%3D%22448%22%2F%3E%3CmxPoint%20x%3D%22600%22%20y%3D%22328%22%2F%3E%3CmxPoint%20x%3D%2270%22%20y%3D%22130%22%2F%3E%3CmxPoint%20x%3D%22490%22%20y%3D%22408%22%2F%3E%3CmxPoint%20x%3D%22640%22%20y%3D%22258%22%2F%3E%3C%2FArray%3E%3C%2FmxGeometry%3E%3C%2FmxCell%3E%3C%2Froot%3E%3C%2FmxGraphModel%3E";
        
        xml = URLDecoder.decode(xml, "UTF-8");
        System.out.println("Xml" + xml);

        try {

            String rootPath = "D:\\";
            // Create the PDF document.
            // rootPath is the present working directory path.
            Document document = new Document();

            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(new File(rootPath + "svg.pdf")));
            document.open();

            mxGraph graph = new mxGraph();
            // Parses XML into graph
            org.w3c.dom.Document doc1 = mxXmlUtils.parseXml(xml);
            mxCodec codec = new mxCodec(doc1);
            codec.decode(doc1.getDocumentElement(), graph.getModel());

            final PdfContentByte cb = writer.getDirectContent();

            mxGraphics2DCanvas can = (mxGraphics2DCanvas) mxCellRenderer.drawCells(graph, null, 1, null, new CanvasFactory() {
                @Override
                public mxICanvas createCanvas(int width, int height) {
                    Graphics2D g2 = cb.createGraphics(width, height);
                    return new mxGraphics2DCanvas(g2);
                }
            });
            can.getGraphics().dispose();
            document.close();
        } catch (Exception e) {
         e.printStackTrace();
        }
    }
}
