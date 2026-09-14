// Media.java
public class Media {
    protected String title;
    protected int durationInSeconds;

    public Media(String title, int durationInSeconds) {
        this.title = title;
        this.durationInSeconds = durationInSeconds;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return durationInSeconds;
    }
}