import java.util.*;

class AntiqueManager {
    private List<Antique> antiques;

    public AntiqueManager() {
        this.antiques = new ArrayList<>();
    }

    public void addAntique(Antique antique) {
        antiques.add(antique);
    }

    public List<Antique> getAllAntiques() {
        return antiques;
    }

    /**
     * Tìm món đồ theo mã.
     * Đầu vào: itemId
     * Đầu ra:
     * - trả về Antique nếu tìm thấy
     * - trả về null nếu không tìm thấy
     */
    public Antique findAntiqueById(String itemId) {
        // TODO
        for (Antique at : antiques) {
            if (at.getItemId().equalsIgnoreCase(itemId)) {
                return at;
            }
        }
        return null;
    }

    /**
     * Tìm các món đồ có tên chứa từ khóa.
     * Đầu vào: keyword
     * Đầu ra: danh sách món đồ phù hợp, nếu không có thì trả về danh sách rỗng
     */
    public List<Antique> searchAntiquesByName(String keyword) {
        // TODO
        ArrayList<Antique> lists = new ArrayList<>();
        for (Antique at : antiques) {
            if (at.getItemName().contains(keyword)) {
                lists.add(at);
            }
        }
        return lists;
    }

    /**
     * Lấy danh sách món đồ đủ điều kiện trưng bày.
     * Đầu ra: danh sách món đồ thỏa điều kiện, nếu không có thì trả về danh sách rỗng
     */
    public List<Antique> getAntiquesCanDisplay() {
        // TODO
        ArrayList<Antique> lists = new ArrayList<>();
        for (Antique at : antiques) {
            if (at.canDisplayInExhibition()) {
                lists.add(at);
            }
        }
        return lists;
    }

    /**
     * Lấy top n món đồ có độ hiếm cao nhất.
     * Đầu vào: n
     * Đầu ra: danh sách tối đa n món đồ
     */
    public List<Antique> getTopAntiques(int n) {
        // TODO
        List<Antique> sorted = sortByRarityScore(false);
        if (n <= 0) return new ArrayList<>();
        if (n >= sorted.size()) return sorted;
        return new ArrayList<>(sorted.subList(0, n));
    }

    /**
     * Sắp xếp món đồ theo độ hiếm.
     * Đầu vào:
     * - ascending = true: tăng dần
     * - ascending = false: giảm dần
     * Đầu ra: danh sách mới đã sắp xếp
     */
    public List<Antique> sortByRarityScore(boolean ascending) {
        // TODO
        ArrayList<Antique> newList = new ArrayList<>(antiques);
        newList.sort(Comparator.comparingDouble(Antique::getRarityScore));
        if (!ascending) {
            newList.sort(Comparator.comparingDouble(Antique::getRarityScore).reversed());

        }
        return newList;
    }

    /**
     * Sắp xếp món đồ theo tên A-Z.
     * Đầu ra: danh sách mới đã sắp xếp
     */
    public List<Antique> sortByName() {
        // TODO
        List<Antique> result = new ArrayList<>(antiques);
        result.sort(Comparator.comparing(Antique::getItemName, String.CASE_INSENSITIVE_ORDER));
        return result;
    }

    /**
     * Tính độ hiếm trung bình.
     * Đầu ra:
     * - trả về độ hiếm trung bình
     * - nếu danh sách rỗng thì trả về 0
     */
    public double calculateAverageRarityScore() {
        // TODO
        double totalRarity= 0.0;
        for (Antique antique : antiques) {
            totalRarity += antique.getRarityScore();
        }
        return totalRarity / antiques.size();
    }

    /**
     * Tính tổng giá trị của tất cả món đồ.
     * Đầu ra: tổng giá trị
     */
    public double calculateTotalValue() {
        // TODO
        double totalValue =0.0;
        for (Antique antique : antiques) {
            totalValue += antique.calculateTotalValue();
        }
        return totalValue;
    }
}