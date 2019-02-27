/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import com.itextpdf.text.Document;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Graphics2D;
import java.io.FileOutputStream;

/**
 *
 * @author Administrator
 */
public class PdfExport {

    /* public PdfExport() throws Exception {

        // Creates graph with model
        mxGraph graph = new mxGraph();
        Object parent = graph.getDefaultParent();

        graph.getModel().beginUpdate();
        try {
            Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80,
                    30);
            mxCell v2 = (mxCell) graph.insertVertex(parent, null, "World!",
                    240, 150, 80, 30);
            graph.insertEdge(parent, null, "e1", v1, v2);
        } finally {
            graph.getModel().endUpdate();
        }

        mxRectangle bounds = graph.getGraphBounds();
        Document document = new Document(new Rectangle((float) (bounds
                .getWidth()), (float) (bounds.getHeight())));
        PdfWriter writer = PdfWriter.getInstance(document,
                new FileOutputStream("D:\\example.pdf"));
        document.open();
        final PdfContentByte cb = writer.getDirectContent();

        mxGraphics2DCanvas canvas = (mxGraphics2DCanvas) mxCellRenderer
                .drawCells(graph, null, 1, null, new CanvasFactory() {
                    public mxICanvas createCanvas(int width, int height) {
                        Graphics2D g2 = cb.createGraphics(width, height);
                        return new mxGraphics2DCanvas(g2);
                    }
                });

        canvas.getGraphics().dispose();
        document.close();
    }

    public static void main(String[] args) {
        try {
            new PdfExport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/
}
