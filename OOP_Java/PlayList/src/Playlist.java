// Playlist.java
public class Playlist {
    private final String name;
    private final Playable[] items; // Mảng chứa các đối tượng có thể phát
    private int itemCount;

    public Playlist(String name, int capacity) {
        this.name = name;
        this.items = new Playable[capacity];
        this.itemCount = 0;
    }

    public void addItem(Playable item) {
        if (itemCount < items.length) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Playlist is full. Cannot add more items.");
        }
    }

    /**
     * Phát tất cả các mục trong playlist theo thứ tự.
     * Hành động:
     * - In ra thông báo bắt đầu phát playlist.
     * - Dùng vòng lặp để duyệt qua tất cả các mục hiện có.
     * - Với mỗi mục, gọi phương thức play() của nó.
     *   (Tính đa hình: Java sẽ tự động gọi đúng phương thức play() của Audio hoặc Video).
     * - In ra thông báo kết thúc playlist.
     */
    public void playAll() {
        System.out.println("\n>>> Playing Playlist: " + name + " <<<");
        for (int i = 0; i < itemCount; i++) {
            items[i].play();
        }
        System.out.println(">>> Playlist finished. <<<");
    }

    /**
     * Tính tổng thời lượng của toàn bộ playlist.
     * @return Tổng thời lượng tính bằng giây.
     * Hành động:
     * - Khởi tạo biến 'totalDuration' bằng 0.
     * - Dùng vòng lặp duyệt qua tất cả các mục.
     * - Với mỗi mục, gọi phương thức getDuration() và cộng dồn vào 'totalDuration'.
     */
    public int getTotalDuration() {
        int totalDuration = 0;
        for (int i = 0; i < itemCount; i++) {
            totalDuration += items[i].getDuration();
        }
        return totalDuration;
    }

    /**
     * Tìm mục có thời lượng dài nhất trong playlist.
     * @return Đối tượng Playable có thời lượng dài nhất, hoặc null nếu playlist trống.
     * Hành động:
     * - Nếu playlist trống (itemCount == 0), trả về null.
     * - Giả sử mục đầu tiên là dài nhất.
     * - Dùng vòng lặp duyệt từ mục thứ hai.
     * - So sánh thời lượng của mục hiện tại với mục đang dài nhất.
     * - Nếu mục hiện tại dài hơn, cập nhật lại.
     */
    public Playable findLongestItem() {
        if (itemCount == 0) {
            return null;
        }
        Playable longest = items[0];
        for (int i = 1; i < itemCount; i++) {
            if (items[i].getDuration() > longest.getDuration()) {
                longest = items[i];
            }
        }
        return longest;
    }

    // Phương thức này cung cấp sẵn để hiển thị thông tin playlist
    public void showPlaylist() {
        System.out.println("\n--- Playlist: " + name + " ---");
        for (int i = 0; i < itemCount; i++) {
            System.out.println((i + 1) + ". " + items[i].getInfo());
        }
        System.out.println("--------------------------------");
    }
}