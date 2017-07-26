/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class TableDemo {
     public static JTable jTable1;
    public void pamnel(Object data[][]) {
           //initComponents();
             String[] columnNames = {"Name","Size"};                    
         jTable1 = new JTable(data, columnNames); 
     } 
}
