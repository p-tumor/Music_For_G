import java.io.File;
import java.util.ArrayList;

public class SongFolderHandler {
    public static ArrayList<Song> getSongList(){
        File[] songFolder = new File("songs").listFiles();
        ArrayList<Song> songs = new ArrayList<>();

        for(File song : songFolder){
            songs.add(new Song(song));
        }
        System.out.println(songs.get(0));
        return songs;
    }
}
