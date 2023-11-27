import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        AudioHandler audio = new AudioHandler(new File("songs/Joey Bada$$   - “Love Is Only A Feeling“ (Official Audio) (320 kbps).wav"));
        Scanner reader = new Scanner(System.in);
        String userResponse = "";
        while(!userResponse.equals("Q")){
            System.out.println("""
                    (S)tart song.
                    S(T)op song.
                    Toggle (L)oop.
                    (Q)uit."""
            );
            userResponse = reader.next().toUpperCase();
            switch(userResponse){
                case "S" -> audio.songControl(1);
                case "T" -> audio.songControl(0);
                case "L" -> audio.songControl(2);
                case "Q" -> audio.end();
            }
            System.out.println(audio.isLooping());
        }

    }
}