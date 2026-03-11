public class Audiobook extends MediaItem {

    private String author;

    public Audiobook(String title, String author, int durationSeconds) {
        super(title, durationSeconds);
        this.author = author;
    }

    @Override
    public void play() {
        System.out.println("📖 Afspiller lydbog: \"" + getTitle() + "\" af " + author);    }


}