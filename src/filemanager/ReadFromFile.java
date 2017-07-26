/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.awt.List;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Asus
 */
public class ReadFromFile {
    public static ArrayList readFrom(String s) throws FileNotFoundException, IOException{

        ArrayList a=new ArrayList();
        Scanner sc=new Scanner(new File(s));
        while(sc.hasNext()){
           a.add(sc.nextLong());
        }  
       return a;
    }
    public static ArrayList readFrom1(String s) throws FileNotFoundException, IOException{

        ArrayList a=new ArrayList();
        Scanner sc=new Scanner(new File(s));
        while(sc.hasNext()){
           a.add(sc.next());
        }  
       return a;
    }
   /* public static void main(String args[]) throws IOException{
        ArrayList a=readFrom("D:\\FileManager\\details\\detail.txt");
        System.out.println(a);
        Double arr[]=new Double[8];
        for(int i=0;i<a.size();i++){
            arr[i]=(Double)a.get(i);
        }
        
    }*/
    
}
