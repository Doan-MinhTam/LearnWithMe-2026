// Audio.java
public class Audio extends Media implements Playable {
    private String artist;

    public Audio(String title, String artist, int durationInSeconds) {
        super(title, durationInSeconds);
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("Playing audio: '" + title + "' by " + artist);
    }

    @Override
    public void stop() {
        System.out.println("Stopping audio: '" + title + "'");
    }

    @Override
    public String getInfo() {
        return "Audio[Title: " + title + ", Artist: " + artist + ", Duration: " + durationInSeconds + "s]";
    }
}