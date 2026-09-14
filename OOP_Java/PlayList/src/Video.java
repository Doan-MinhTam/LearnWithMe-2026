// Video.java
public class Video extends Media implements Playable {
    private String quality; // Ví dụ: "1080p", "4K"

    public Video(String title, String quality, int durationInSeconds) {
        super(title, durationInSeconds);
        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Playing video: '" + title + "' [" + quality + "]");
    }

    @Override
    public void stop() {
        System.out.println("Stopping video: '" + title + "'");
    }

    @Override
    public String getInfo() {
        return "Video[Title: " + title + ", Quality: " + quality + ", Duration: " + durationInSeconds + "s]";
    }
}