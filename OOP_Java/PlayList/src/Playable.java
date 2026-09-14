// Playable.java
public interface Playable {
    void play();
    void stop();
    int getDuration(); // Trả về thời lượng tính bằng giây
    String getInfo();  // Trả về thông tin chi tiết
}