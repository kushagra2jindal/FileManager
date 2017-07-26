/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Open_document {
    public Open_document(String s)
    {
        if(Desktop.isDesktopSupported())
        {
            try {
                Desktop.getDesktop().open(new File(s));
            } catch (IOException ex) {
            }
        }
    }
}
