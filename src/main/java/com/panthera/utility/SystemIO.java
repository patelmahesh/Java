/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.panthera.utility;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class SystemIO {

    public static void main(String[] args) {

        String fullPath = File.separator + "u01" + File.separator + "app" + File.separator + "temp" + File.separator
                + "upload" + File.separator;

        System.out.println(fullPath);

    }

}
