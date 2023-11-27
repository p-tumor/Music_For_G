import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class AudioHandler {
    private boolean isLooping;
    private Clip song;
    private AudioInputStream audioInput;
    public AudioHandler(File songFile) throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        audioInput = AudioSystem.getAudioInputStream(songFile);
        song = AudioSystem.getClip();
        isLooping = false;
        song.open(audioInput);
    }

    public void songControl(int choice) throws LineUnavailableException, IOException {
        final int START_SONG = 1;
        final int TOGGLE_LOOP = 2;
        final int STOP_SONG = 0;
        switch(choice){
            case START_SONG -> {
                if(!song.isRunning()) song.start();
            }
            case STOP_SONG -> {
                if(song.isRunning()) song.stop();
            }
            case TOGGLE_LOOP ->{
                if(isLooping) {
                    song.loop(0);
                    
                }
                else {
                    song.loop(Clip.LOOP_CONTINUOUSLY);
                    isLooping = true;
                }
            }
        }
    }
    public void end(){
        song.close();
    }

    public boolean isLooping() {
        return isLooping;
    }
}
