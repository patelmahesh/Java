/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.JPEGTranscoder;

/**
 *
 * @author dpimac
 * 
 */
public class SvgtoImage {

    public static void main(String[] args) throws  FileNotFoundException, TranscoderException, IOException {
        //Step -1: We read the input SVG document into Transcoder Input
       // String svg_URI_input = new File("chessboard.svg").toURL().toString();
        String svg_URI_input = "<svg width=\"600\" height=\"300\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"> <rect x=\"40\" y=\"20\" rx=\"20\" ry=\"20\" width=\"250\" height=\"250\" "
                + "style=\"fill:red;stroke:black;stroke-width:1;\" /></svg>";
        
        InputStream stream = new ByteArrayInputStream(svg_URI_input.getBytes(StandardCharsets.UTF_8));

       
        
        TranscoderInput input_svg_image = new TranscoderInput(stream);
        //Step-2: Define OutputStream to JPG file and attach to TranscoderOutput
        //OutputStream jpg_ostream = new FileOutputStream("chessboard.jpg");
        ByteArrayOutputStream baos_1 = new ByteArrayOutputStream();
        TranscoderOutput output_jpg_image = new TranscoderOutput(baos_1);
        // Step-3: Create JPEGTranscoder and define hints
        JPEGTranscoder my_converter = new JPEGTranscoder();
        my_converter.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(.9));
        // Step-4: Write output
        my_converter.transcode(input_svg_image, output_jpg_image);
        
         byte[] byteStream = baos_1.toByteArray();
         String s = new String(byteStream);
        System.out.println(s);
        // Step 5- close / flush Output Stream
        /*
        jpg_ostream.flush();
        jpg_ostream.close();
*/
        
        
    }

}
