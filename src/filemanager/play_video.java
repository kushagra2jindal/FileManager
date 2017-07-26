/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemanager;

import java.io.IOException;

/**
 *
 * @author Asus
 */
public class play_video {
    public play_video(String s)
    {
                ProcessBuilder pb=new ProcessBuilder("C:\\Program Files (x86)\\VLC\\vlc.exe",s);
        try {
            Process start=pb.start();
        } catch (IOException ex) {}
    }
}
