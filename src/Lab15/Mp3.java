package Lab15;

public class Mp3 extends MusicPlayer {
    public Mp3(Song[] library) {
        super(library);
    }

    @Override
    public void play() {
        System.out.println("Mp3 odtwarza"+ getCurrentSong());
    }

    @Override
    public void pause() {
        System.out.println("Mp3 pauza"+ getCurrentSong());
    }

    @Override
    public void stop() {
        System.out.println("Mp3 stop"+ getCurrentSong());
    }
}
