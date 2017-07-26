/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Asus
 */
public class AllFiles {
    static String s1;
  //  static int ni=0,nv=0,nd=0,na=0,yi=0,yv=0,yd=0,ya=0;
    static ArrayList sizei=new ArrayList();
    static ArrayList sizev=new ArrayList();
    static ArrayList sized=new ArrayList();
    static ArrayList sizea=new ArrayList();
    static ArrayList arri=new ArrayList();
    static ArrayList arrv=new ArrayList();
    static ArrayList arrd=new ArrayList();
    static ArrayList arra=new ArrayList();
    static ArrayList pathi=new ArrayList();
    static ArrayList pathv=new ArrayList();
    static ArrayList pathd=new ArrayList();
    static ArrayList patha=new ArrayList();
    //static int ndown=0;
    static ArrayList sizedown=new ArrayList();
    static ArrayList down=new ArrayList();
    static ArrayList pathdown=new ArrayList();
    private static Object Transfer;
    
     public static String extension(File f)
     {
        String a=f.getName();
        String s="";
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='.')
            {
                for(int j=i;j<a.length();j++)
                {
                    s=s+a.charAt(j);
                }
                break;
            }
        }
        return s;
    }
     
     static void dr(File f)throws IOException
    {
        if(f.isDirectory())
        {
            if(f.getName().equals("download"))
            {
                File flist[]=f.listFiles();
                for(int i=0;i<flist.length;i++)
                {
                   down.add(flist[i].getName());
                   File f1=flist[i];
                   sizedown.add(f1.length());
                   pathdown.add(f1.getPath());
                  
                }
            }
            //System.out.println("directory "+f.getName());
            File flist[]=f.listFiles();
            try{
            for(int i=0;i<flist.length;i++)
            {
                if(flist[i].isDirectory())
                {
                    dr(flist[i]);
                }
                
                else
                {
                    s1=extension(flist[i]);
                    if(s1.equals(".png")||s1.equals(".jpg")||s1.equals(".tif")||s1.equals(".gif"))
                    {
                        arri.add(flist[i].getName());
                        File f1=flist[i];
                        sizei.add(f1.length());
                        pathi.add(f1.getPath());
                        
                        //File f1=flist[i];
                       // sizei=sizei+f1.length();
                    }
                    else if(s1.equals(".avi")||s1.equals(".3gpp")||s1.equals(".asf")||s1.equals(".mov")||s1.equals(".avchd")||s1.equals(".flv")||s1.equals(".mpg")||s1.equals(".mp4")||s1.equals(".wmv")||s1.equals(".h.264")||s1.equals(".divx"))
                    {
                        arrv.add(flist[i].getName());
                        File f1=flist[i];
                        sizev.add(f1.length());
                        pathv.add(f1.getPath());
                        
                        //File f1=flist[i];
                        
                    }
                    else if(s1.equals(".doc")||s1.equals(".docx")||s1.equals(".xls")||s1.equals(".xlsx")||s1.equals(".ppt")||s1.equals(".pptx")||s1.equals(".html")||s1.equals(".pages")||s1.equals(".txt"))
                    {
                        arrd.add(flist[i].getName());
                        File f1=flist[i];
                        sized.add(f1.length());
                        pathd.add(f1.getPath());
                        
                    }
                    else if(s1.equals(".mp3"))
                    {
                        arra.add(flist[i].getName());
                        File f1=flist[i];
                        sizea.add(f1.length());
                        patha.add(f1.getPath());
                        
                    }
                }
            }
            }catch(Exception e){}
        }
        else
        {
            s1=extension(f);
                    if(s1.equals(".png")||s1.equals(".jpg")||s1.equals(".tif")||s1.equals(".gif"))
                    {
                     
                        arri.add(f.getName());
                        File f1=f;
                        sizei.add(f1.length());
                        pathi.add(f1.getPath());
                       
                    }
                     else if(s1.equals(".avi")||s1.equals(".asf")||s1.equals(".mov")||s1.equals(".avchd")||s1.equals(".flv")||s1.equals(".mpg")||s1.equals(".mp4")||s1.equals(".wmv")||s1.equals(".h.264")||s1.equals(".divx"))
                    {
                     
                        arrv.add(f.getName());
                        File f1=f;
                        sizev.add(f1.length());
                        pathv.add(f1.getPath());
                       
                    }
                     else if(s1.equals(".doc")||s1.equals(".docx")||s1.equals(".xls")||s1.equals(".xlsx")||s1.equals(".ppt")||s1.equals(".pptx")||s1.equals(".html")||s1.equals(".pages")||s1.equals(".txt"))
                    {
                       
                        arrd.add(f.getName());
                        File f1=f;
                        sized.add(f1.length());
                        pathd.add(f.getPath());
                      
                    }
                    else if(s1.equals(".mp3"))
                    {
                        
                        arra.add(f.getName());
                        File f1=f;
                        sizea.add(f1.length());
                        patha.add(f1.getPath());
                        
                    }
        }
    }
     public static void dr2() throws FileNotFoundException, IOException{
         sizei=ReadFromFile.readFrom("D:\\FileManager\\Size\\sizei.txt");
         sizev=ReadFromFile.readFrom("D:\\FileManager\\Size\\sizev.txt");
         sizea=ReadFromFile.readFrom("D:\\FileManager\\Size\\sizea.txt");
         sized=ReadFromFile.readFrom("D:\\FileManager\\Size\\sized.txt");
         
         arri=ReadFromFile.readFrom1("D:\\FileManager\\array\\arri.txt");
         arrv=ReadFromFile.readFrom1("D:\\FileManager\\array\\arrv.txt");
         arra=ReadFromFile.readFrom1("D:\\FileManager\\array\\arra.txt");
         arrd=ReadFromFile.readFrom1("D:\\FileManager\\array\\arrd.txt");
         
         pathi=ReadFromFile.readFrom1("D:\\FileManager\\path\\pathi.txt");
         pathv=ReadFromFile.readFrom1("D:\\FileManager\\path\\pathi.txt");
         patha=ReadFromFile.readFrom1("D:\\FileManager\\path\\pathi.txt");
         pathd=ReadFromFile.readFrom1("D:\\FileManager\\path\\pathi.txt");
         
     }
     public static void toFiles() throws IOException{
        Tranfer t=new Tranfer();
        Iterator i1=sizei.iterator();
        while(i1.hasNext()){
            String s=String.valueOf(i1.next());
            Tranfer.insert("D:\\FileManager\\Size\\sizei.txt",s);
            Tranfer.insert("D:\\FileManager\\Size\\sizei.txt","  ");
        }
        
        Iterator i2=sizev.iterator();
        while(i2.hasNext()){
            String s=String.valueOf(i2.next());
            Tranfer.insert("D:\\FileManager\\Size\\sizev.txt",s);
            Tranfer.insert("D:\\FileManager\\Size\\sizev.txt","  ");
        }
        Iterator i3=sized.iterator();
        while(i3.hasNext()){
            String s=String.valueOf(i3.next());
            Tranfer.insert("D:\\FileManager\\Size\\sized.txt",s);
            Tranfer.insert("D:\\FileManager\\Size\\sized.txt","  ");
        }
        Iterator i4=sizea.iterator();
        while(i4.hasNext()){
            String s=String.valueOf(i4.next());
            Tranfer.insert("D:\\FileManager\\Size\\sizea.txt",s);
            Tranfer.insert("D:\\FileManager\\Size\\sizea.txt","  ");
        }
        Iterator i5=arri.iterator();
        while(i5.hasNext()){
            String s=String.valueOf(i5.next());
            Tranfer.insert("D:\\FileManager\\array\\arri.txt",s);
            Tranfer.insert("D:\\FileManager\\array\\arri.txt","  ");
        }
        Iterator i6=arrv.iterator();
        while(i6.hasNext()){
            String s=String.valueOf(i6.next());
            Tranfer.insert("D:\\FileManager\\array\\arrv.txt",s);
            Tranfer.insert("D:\\FileManager\\array\\arrv.txt","  ");
        }
        Iterator i7=arrd.iterator();
        while(i7.hasNext()){
            String s=String.valueOf(i7.next());
            Tranfer.insert("D:\\FileManager\\array\\arrd.txt",s);
            Tranfer.insert("D:\\FileManager\\array\\arrd.txt","  ");
        }
        Iterator i8=arra.iterator();
        while(i8.hasNext()){
            String s=String.valueOf(i8.next());
            Tranfer.insert("D:\\FileManager\\array\\arra.txt",s);
            Tranfer.insert("D:\\FileManager\\array\\arra.txt","  ");
        }
        Iterator i9=pathi.iterator();
        while(i9.hasNext()){
            String s=String.valueOf(i9.next());
            Tranfer.insert("D:\\FileManager\\path\\pathi.txt",s);
            Tranfer.insert("D:\\FileManager\\path\\pathi.txt","  ");
        }
        Iterator i10=pathv.iterator();
        while(i10.hasNext()){
            String s=String.valueOf(i10.next());
            Tranfer.insert("D:\\FileManager\\path\\pathv.txt",s);
            Tranfer.insert("D:\\FileManager\\path\\pathv.txt","  ");
        }
        Iterator i11=pathi.iterator();
        while(i11.hasNext()){
            String s=String.valueOf(i11.next());
            Tranfer.insert("D:\\FileManager\\path\\pathd.txt",s);
            Tranfer.insert("D:\\FileManager\\path\\pathd.txt","  ");
        }
        Iterator i12=pathi.iterator();
        while(i12.hasNext()){
            String s=String.valueOf(i12.next());
            Tranfer.insert("D:\\FileManager\\path\\patha.txt",s);
            Tranfer.insert("D:\\FileManager\\path\\patha.txt","  ");
        }
        
     }
        public int number_image() throws IOException
         {
           Tranfer.insert("D:\\FileManager\\details\\detail.txt",Integer.toString(arri.size()));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
             return arri.size();
         }
         public long size_image() throws IOException
        {
           long s=0;
            Iterator i=sizei.iterator();
            while(i.hasNext()){
                s=s+(long)i.next();
            } 
            Tranfer.insert("D:\\FileManager\\details\\detail.txt",Long.toString(s));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
         return s;
        }
     public int number_video() throws IOException
     {
         
         Tranfer.insert("D:\\FileManager\\details\\detail.txt",Integer.toString(arrv.size()));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
            return arrv.size();
     }
     public float size_video() throws IOException
     {
        long s=0;
            Iterator i=sizev.iterator();
            while(i.hasNext()){
                s=s+(long)i.next();
            }
            Tranfer.insert("D:\\FileManager\\details\\detail.txt",Long.toString(s));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
         return s;
     }
     public int number_document() throws IOException
     { 
       
         Tranfer.insert("D:\\FileManager\\details\\detail.txt",Integer.toString(arrd.size()));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");  
         return arrd.size();
     }
     public float size_document() throws IOException
     {
         long s=0;
            Iterator i=sized.iterator();
            while(i.hasNext()){
                s=s+(long)i.next();
            }
            Tranfer.insert("D:\\FileManager\\details\\detail.txt",Long.toString(s));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
         return s;
     }
     public int number_Audio() throws IOException
     {
          Tranfer.insert("D:\\FileManager\\details\\detail.txt",Integer.toString(arra.size()));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
         return arra.size();
     }
     public float size_Audio() throws IOException
     {
        long s=0;
            Iterator i=sized.iterator();
            while(i.hasNext()){
                s=s+(long)i.next();
            }
            Tranfer.insert("D:\\FileManager\\details\\detail.txt",Long.toString(s));
            Tranfer.insert("D:\\FileManager\\details\\detail.txt","  ");
         return s;
     }
      public void display_down()
     {
         int ndown=down.size();
         Object arr[][]=new Object[ndown][2];
         for(int i=0;i<ndown;i++)
         {
             arr[i][0]=down.get(i);
             arr[i][1]=new Float((float)sizedown.get(i)/(1024));
         }
         TableDemo tableDemo = new TableDemo();
         tableDemo.pamnel(arr);
       JFrame frame = new JFrame();
       frame.add(  new JScrollPane(TableDemo.jTable1) );
       TableDemo.jTable1.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               int r=TableDemo.jTable1.rowAtPoint(e.getPoint());
               int c=TableDemo.jTable1.columnAtPoint(e.getPoint());
               Open_document o1=new Open_document((String) pathdown.get(r));
           }
       });
       frame.pack();
       frame.setVisible( true );
     }
     public void display_images()
     {
         int yi=sizei.size();
         Object arr[][]=new Object[yi][3];
         for(int i=0;i<yi;i++)
         {
             //System.out.println(arri[i]);
             arr[i][0]=arri.get(i);
             arr[i][1]=new Long((Long)sizei.get(i)/(1024));
         }
         TableDemo tableDemo = new TableDemo();
         tableDemo.pamnel(arr);
       JFrame frame = new JFrame();
       frame.add(  new JScrollPane(TableDemo.jTable1) );
       TableDemo.jTable1.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               int r=TableDemo.jTable1.rowAtPoint(e.getPoint());
               int c=TableDemo.jTable1.columnAtPoint(e.getPoint());
               Open_document o1=new Open_document((String) pathi.get(r));
           }
       });
       frame.pack();
       frame.setVisible( true );
     }
     public void display_videos()
     {
         int yv=arrv.size();
         Object arr[][]=new Object[yv][2];
         for(int i=0;i<yv;i++)
         {
             //System.out.println(arri[i]);
             arr[i][0]=arrv.get(i);
             arr[i][1]=new Float((Long)sizev.get(i)/(1000*1024));
         }
         TableDemo tableDemo = new TableDemo();
         tableDemo.pamnel(arr);
       JFrame frame = new JFrame();
       frame.add(  new JScrollPane(TableDemo.jTable1) );
       TableDemo.jTable1.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               int r=TableDemo.jTable1.rowAtPoint(e.getPoint());
               int c=TableDemo.jTable1.columnAtPoint(e.getPoint());
              // System.out.println(pathv[r]);
               //System.out.println(arrv[r]);
               play_video p=new play_video((String) pathv.get(r));
           }
       });
       frame.pack();
       frame.setVisible( true );
     }
     public void display_documents()
     {
         int yd=sized.size();
         Object arr[][]=new Object[yd][2];
         for(int i=0;i<yd;i++)
         {
             //System.out.println(arri[i]);
             arr[i][0]=arrd.get(i);
             arr[i][1]=new Float((float)sized.get(i)/(1024));
         }
         TableDemo tableDemo = new TableDemo();
         tableDemo.pamnel(arr);
       JFrame frame = new JFrame();
       frame.add(  new JScrollPane(TableDemo.jTable1) );
       TableDemo.jTable1.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               int r=TableDemo.jTable1.rowAtPoint(e.getPoint());
               int c=TableDemo.jTable1.columnAtPoint(e.getPoint());
               Open_document o=new Open_document((String)pathd.get(r));
           }
       });
       frame.pack();
       frame.setVisible( true );
     }
     public void display_audio()
     {
         int ya=sizea.size();
         Object arr[][]=new Object[ya][2];
         for(int i=0;i<ya;i++)
         {
             //System.out.println(arri[i]);
             arr[i][0]=arra.get(i);
             arr[i][1]=new Float((Long)sizea.get(i)/(1024));
         }
         TableDemo tableDemo = new TableDemo();
         tableDemo.pamnel(arr);
       JFrame frame = new JFrame();
       frame.add(  new JScrollPane(TableDemo.jTable1) );
       TableDemo.jTable1.addMouseListener(new MouseAdapter()
       {
           public void mouseClicked(MouseEvent e)
           {
               int r=TableDemo.jTable1.rowAtPoint(e.getPoint());
               int c=TableDemo.jTable1.columnAtPoint(e.getPoint());
               //System.out.println(patha[r]+arra[r]);
               File q=new File((String)patha.get(r));
               play_video p=new play_video((String) patha.get(r));
           }
       });
       frame.pack();
       frame.setVisible( true );
     }

}

