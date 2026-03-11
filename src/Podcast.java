public class Podcast extends MediaItem {

    private String host;

    public Podcast(String title, String host, int durationSeconds) {
        super(title, durationSeconds);
        this.host = host;
    }

    @Override
    public void play() {
        System.out.println("🎙 Afspiller podcast: " + getTitle() + " med " + host);
    }
}