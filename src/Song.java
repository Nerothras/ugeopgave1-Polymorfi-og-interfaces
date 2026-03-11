public class Song extends MediaItem {

    private String artist;

    Song(String artist, String title, int durationSeconds) {
        super(title, durationSeconds);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("♪ Afspiller: " + getTitle() + " af " + artist);
    }
}