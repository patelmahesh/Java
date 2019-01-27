/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author Administrator
 */
public class FileToBlob {

    public static void main(String[] args) {
        String fullPath = "C:\\Users\\Public\\Pictures\\Sample Pictures\\";
        Integer addictsId = null;

        final File[] files = new File(fullPath).listFiles();
        if (null == files) {
            System.out.println("No Files");
        }
        for (File file : files) {
            Integer attachmentType = 4;

            String fileName = file.getName();

            try {

                byte[] fileData = Files.readAllBytes(file.toPath());
                // 2.3 create new fileMeta
                System.out.println("Files " + fileData + " " + fileName);

            } catch (IOException e) {
                e.printStackTrace();

            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }

}
