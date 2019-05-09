<%-- 
    Document   : index
    Created on : May 9, 2019, 9:15:07 AM
    Author     : dpimac
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page  isELIgnored="false" %>


<%@page pageEncoding="UTF-8" 
        import="org.apache.batik.transcoder.image.JPEGTranscoder,java.nio.*,org.apache.batik.transcoder.*,java.awt.*,java.io.*,java.util.*" %>
<html>
    <head>
        <title>Java Sample</title>
    </head>
    <%try{%>

    <body>
        <h3>Java Samples</h3>
        <% 
               
        String xml1 = "<svg width=\"600\" height=\"300\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\"> <rect x=\"40\" y=\"20\" rx=\"20\" ry=\"20\" width=\"250\" height=\"250\" "
                + "style=\"fill:red;stroke:black;stroke-width:1;\" /></svg>";


   //     String xml1 = "<svg width=\"641\" height=\"1124\" viewBox=\"0 0 641 1124\" version=\"1.1\" xmlns=\"\" xmlns:xlink=\"http://www.w3.org/1999/xlink\"><g><path stroke-width=\"1.0\" stroke=\"#6482B9\" fill=\"#6482B9\" d=\"M 190.5 95.0 L 196.5 92.0 L 195.0 95.0 L 196.5 98.0 z\"></path><path d=\"M 539.5 95.0 L 365.0 95.0 L 190.0 95.0\" stroke=\"#6482B9\" fill=\"none\" stroke-width=\"1.0\"></path></g><rect x=\"540\" y=\"45\" width=\"100\" height=\"100\" fill=\"#C3D9FF\" stroke=\"#6482B9\" stroke-width=\"1.0\"></rect><text font-weight=\"normal\" font-decoration=\"none\" font-size=\"11\" font-family=\"Arial,Helvetica\" fill=\"#774400\" text-anchor=\"middle\"><tspan x=\"589\" y=\"92\">يبسيبسيب سيب سيب</tspan><tspan x=\"589\" y=\"103\">سيبسيب سيب</tspan></text><g><path stroke-width=\"1.0\" stroke=\"#6482B9\" fill=\"#6482B9\" d=\"M 107.5 1062.5 L 104.5 1056.5 L 107.5 1058.0 L 110.5 1056.5 z\"></path><path d=\"M 95.0 190.5 L 95.0 626.5 L 107.5 626.5 L 107.5 1063.0\" stroke=\"#6482B9\" fill=\"none\" stroke-width=\"1.0\"></path></g><ellipse cx=\"95\" cy=\"95\" rx=\"95\" ry=\"95\" fill=\"#C3D9FF\" stroke=\"#6482B9\" stroke-width=\"1.0\"></ellipse><text font-weight=\"normal\" font-decoration=\"none\" font-size=\"11\" font-family=\"Arial,Helvetica\" fill=\"#774400\" text-anchor=\"middle\"><tspan x=\"95\" y=\"76\">&lt;div&gt;&lt;br&gt;&lt;/div&gt;fghfhfgf</tspan><tspan x=\"95\" y=\"87\">hgfhgfhgf&lt;div&gt;cv&lt;/div&gt;&lt;div&gt;b&lt;/di</tspan><tspan x=\"95\" y=\"98\">v&gt;&lt;div&gt;cxvb&lt;/div&gt;&lt;div&gt;c&lt;/div&gt;&lt;d</tspan><tspan x=\"95\" y=\"109\">iv&gt;b&lt;/div&gt;&lt;div&gt;xc&lt;/div&gt;&lt;div&gt;bv&lt;/</tspan><tspan x=\"95\" y=\"120\">div&gt;&lt;div&gt;cx&lt;/div&gt;&lt;div&gt;&lt;br&gt;&lt;/div&gt;</tspan></text><rect x=\"50\" y=\"1063\" width=\"115\" height=\"60\" fill=\"#C3D9FF\" stroke=\"#6482B9\" stroke-width=\"1.0\"></rect><text font-weight=\"normal\" font-decoration=\"none\" font-size=\"11\" font-family=\"Arial,Helvetica\" fill=\"#774400\" text-anchor=\"middle\"><tspan x=\"107\" y=\"1090\">يبسيبس يبسيب سيب</tspan><tspan x=\"107\" y=\"1101\">سيبسيبسي</tspan></text></svg>";
        java.io.InputStream stream = new ByteArrayInputStream(xml1.getBytes());

         
        
        TranscoderInput input_svg_image = new TranscoderInput(stream);
        //Step-2: Define OutputStream to JPG file and attach to TranscoderOutput
      
         ByteArrayOutputStream baos_1 = new ByteArrayOutputStream();
        TranscoderOutput output_jpg_image = new TranscoderOutput(baos_1);
        // Step-3: Create JPEGTranscoder and define hints
        JPEGTranscoder my_converter = new JPEGTranscoder();
        my_converter.addTranscodingHint(JPEGTranscoder.KEY_QUALITY, new Float(.9));
        // Step-4: Write output
        my_converter.transcode(input_svg_image, output_jpg_image);
        // Step 5- close / flush Output Stream
               byte[] byteStream = baos_1.toByteArray();

                String s = Base64.getEncoder().encodeToString(byteStream);

        %>
        
        <img alt="img" src="data:image/jpeg;base64,<%=s%>"/>
    </body>
    <%}catch(Exception e){out.print(e);}%>
</html>