import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MusicDisplay extends JFrame{
    MusicDisplay(){
        this.setSize(400,500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        ArrayList<Song> songList = SongFolderHandler.getSongList();

        JButton startSong = new JButton("Start");
        JButton stopSong = new JButton("Stop");

        this.add(startSong, BorderLayout.NORTH);
        this.add(stopSong, BorderLayout.SOUTH);

        this.setVisible(true);
    }
}
