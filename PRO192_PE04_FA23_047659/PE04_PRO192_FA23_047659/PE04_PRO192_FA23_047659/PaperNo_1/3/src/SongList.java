
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AnhVuNAV
 */
public class SongList extends TreeSet<Song>{
    public void addSong(Song song){
        this.add(song);
    }
    
    public Song getSongMaxDuration(){
        Song max = null;
        for (Song s: this) {
            if(max == null || s.getDuration() > max.getDuration()){
                max = s;
            }
        }
        return max;
    }
    
    public void printSongList(){
        for(Song s: this){
            System.out.println(s);
        }
    }
}
