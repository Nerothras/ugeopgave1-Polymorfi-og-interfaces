public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();


        player.add(new Song("Queen", "Somebody to Love", 300));
        player.add(new Song("Disturbed", "Indestructible", 190));


        player.add(new Podcast("Misfits", "Fitz", 5000));
        player.add(new Podcast("Bad Friends", "Bobby Lee", 6400));


        player.add(new Audiobook("Lord of the Rings - Return of the King", "Tolkien", 445000));
        player.add(new Audiobook("Fellowship of the Ring", "Tolkien", 32344));


        player.printPlaylist();

        System.out.println("\nStarter afspilning:\n");
        player.playAll();

        // Samlet spilletid
        int totalSeconds = player.getTotalDuration();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("\nSamlet spilletid: " + hours + ":" + minutes + ":" + seconds);
    }
}