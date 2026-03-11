public abstract class MediaItem implements Playable {

    private String titel;
    private int durationSeconds;

    MediaItem(String title, int durationSeconds) {

        this.titel = title;
        this.durationSeconds = durationSeconds;
    }


    public String getTitle() {
        return titel;

    }


    public int getDurationSeconds() {
        return durationSeconds;
    }


}










