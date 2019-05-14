/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;


import com.mxgraph.io.mxCodec;
import com.mxgraph.util.mxCellRenderer;
import com.mxgraph.util.mxXmlUtils;
import com.mxgraph.view.mxGraph;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.w3c.dom.Document;

/**
 *
 * @author dpimac
 */
public class MxGraphSvgImage {

    public static void main(String[] args) throws FileNotFoundException {
        String xml = "<mxGraphModel><root><mxCell id=\\\"0\\\"/><mxCell id=\\\"1\\\" parent=\\\"0\\\"/><mxCell id=\\\"3\\\" parent=\\\"1\\\" style=\\\"ellipse\\\" value=\\\"\\\" vertex=\\\"1\\\"><mxGeometry as=\\\"geometry\\\" height=\\\"160.0\\\" width=\\\"160.0\\\" x=\\\"270.0\\\" y=\\\"40.0\\\"/></mxCell><mxCell id=\\\"4\\\" parent=\\\"1\\\" style=\\\"shape=cylinder\\\" value=\\\"\\\" vertex=\\\"1\\\"><mxGeometry as=\\\"geometry\\\" height=\\\"160.0\\\" width=\\\"120.0\\\" x=\\\"240.0\\\" y=\\\"350.0\\\"/></mxCell><mxCell id=\\\"5\\\" parent=\\\"1\\\" style=\\\"shape=hexagon\\\" value=\\\"\\\" vertex=\\\"1\\\"><mxGeometry as=\\\"geometry\\\" height=\\\"120.0\\\" width=\\\"160.0\\\" x=\\\"570.0\\\" y=\\\"360.0\\\"/></mxCell><mxCell edge=\\\"1\\\" id=\\\"6\\\" parent=\\\"1\\\" source=\\\"4\\\" target=\\\"5\\\" value=\\\"\\\"><mxGeometry as=\\\"geometry\\\" height=\\\"100.0\\\" relative=\\\"1\\\" width=\\\"100.0\\\"><mxPoint as=\\\"sourcePoint\\\" x=\\\"390.0\\\" y=\\\"350.0\\\"/><mxPoint as=\\\"targetPoint\\\" x=\\\"560.0\\\" y=\\\"420.0\\\"/></mxGeometry></mxCell><mxCell id=\\\"7\\\" parent=\\\"1\\\" style=\\\"rhombus\\\" value=\\\"\\\" vertex=\\\"1\\\"><mxGeometry as=\\\"geometry\\\" height=\\\"160.0\\\" width=\\\"160.0\\\" x=\\\"530.0\\\" y=\\\"50.0\\\"/></mxCell></root></mxGraphModel>";

        FileOutputStream fos = new FileOutputStream(new File("grapgh"));

        try {
            if (xml != null) {
                xml = xml.replace("ellipse", "shape=ellipse");
            }
            mxGraph graph = new mxGraph();

            // Parses XML into graph
            Document doc = mxXmlUtils.parseXml(xml);
            mxCodec codec = new mxCodec(doc);
            codec.decode(doc.getDocumentElement(), graph.getModel());

            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();

            BufferedImage image = mxCellRenderer.createBufferedImage(graph, null, 1, Color.WHITE, false, null);
           
   
            

            

            ImageIO.write(image, "jpg", bos);
            bos.writeTo(fos);

          /*  byte[] imageBytes = bos.toByteArray();
            Base64 base64 = new Base64();
            String imageString = base64.encodeBase64String(imageBytes);*/
            bos.close();

        } catch (IOException e) {
        }
    }

}
