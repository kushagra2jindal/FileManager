/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Asus
 */
public class Tranfer {
    public Tranfer(){
        boolean success;
        success=(new File("D:\\FileManager\\Size")).mkdirs();
        if(!success){
            System.out.println("not created");
        }
        success=(new File("D:\\FileManager\\path")).mkdirs();
        if(!success){
            System.out.println("not created");
        }
        success=(new File("D:\\FileManager\\array")).mkdirs();
        if(!success){
            System.out.println("not created");
        }
        success=(new File("D:\\FileManager\\details")).mkdirs();
        if(!success){
            System.out.println("not created");
        }
    }
    public static void insert(String path,String data) throws IOException{
       FileWriter fw=new FileWriter(path,true);
       BufferedWriter bw=new BufferedWriter(fw); 
       bw.write(data);
       bw.close();
       fw.close();
    }
}
