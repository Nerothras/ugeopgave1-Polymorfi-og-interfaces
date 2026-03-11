import java.util.ArrayList;

public class MediaPlayer {


    private ArrayList<Playable> playlist = new ArrayList<>();

    public void add(Playable item){
    playlist.add(item);


    }

    public void playAll() {
        for (Playable item : playlist) {
            item.play();

        }

    }

    public int getTotalDuration(){
        int total =  0;
        for (Playable item : playlist) {
            total += item.getDurationSeconds();
        }
        return total;
    }


    public void printPlaylist(){
        for (Playable item : playlist) {
            int seconds = item.getDurationSeconds();
            int minutes = seconds/60;
            int sec = seconds%60;
            System.out.println(item.getTitle() + ": " + minutes + ":" + sec);
        }

    }





}
