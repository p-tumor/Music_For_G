import java.io.File;

public class Song {
    private String songName, songLength, artistName;
    private final File SONG;

    public Song(File song){
        SONG = song;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongLength() {
        return songLength;
    }

    public String getArtistName() {
        return artistName;
    }

    public File getSong() {
        return SONG;
    }

    @Override
    public String toString() {
        return SONG+"";
    }
}
