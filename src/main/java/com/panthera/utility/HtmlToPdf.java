/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.StringReader;
import com.itextpdf.tool.xml.XMLWorkerHelper;

/**
 *
 * @author Administrator
 */
public class HtmlToPdf {
    
     Document doc;String procedure_name;String code;String dep_name;

 
String issueDate;

    public void setDoc(Document doc) {
        this.doc = doc;
    }

    public void setProcedure_name(String procedure_name) {
        this.procedure_name = procedure_name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }
     
     
     Image hrimg    ;
      Image hlimg ;

    public void setHrimg(Image hrimg) {
        this.hrimg = hrimg;
    }

    public void setHlimg(Image hlimg) {
        this.hlimg = hlimg;
    }

   
     

    public static void main(String[] args) {
        try {
            Document document = new Document(PageSize.LETTER);
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("d://testpdf.pdf"));
            document.open();
            document.addAuthor("Real Gagnon");
            document.addCreator("Real's HowTo");
            document.addSubject("Thanks for your support");
            document.addCreationDate();
            document.addTitle("Please read this");

            XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
            
            String str = "<html><head></head><body><a href='http://www.rgagnon.com/howto.html'><b>Real's HowTo</b></a></body></html>";
            worker.parseXHtml(pdfWriter, document, new StringReader(str));
            document.close();
            System.out.println("Done.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
