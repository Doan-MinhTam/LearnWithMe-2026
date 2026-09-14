public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("My Workout Mix", 10);

        playlist.addItem(new Audio("Eye of the Tiger", "Survivor", 245));
        playlist.addItem(new Video("10-Minute Abs Workout", "1080p", 600));
        playlist.addItem(new Audio("Gonna Fly Now", "Bill Conti", 170));
        playlist.addItem(new Video("Advanced Yoga Poses", "4K", 1250));
        playlist.addItem(new Audio("We Will Rock You", "Queen", 122));

        playlist.showPlaylist();

        playlist.playAll();

        System.out.println("\nTotal Duration: " + playlist.getTotalDuration() + "s");

        Playable longest = playlist.findLongestItem();
        System.out.println("Longest Item: " + longest.getInfo());
    }
}