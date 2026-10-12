import java.util.*;

class MilkTeaManager {
    private List<MilkTea> orders;

    public MilkTeaManager() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(MilkTea order) {
        orders.add(order);
    }

    public List<MilkTea> getAllOrders() {
        return orders;
    }

    public MilkTea findOrderById(String orderId) {
        for (MilkTea o : orders) {
            if (o.getOrderId().equals(orderId)) {
                return o;
            }
        }
        return null;
    }

    public List<MilkTea> searchOrdersByCustomerName(String keyword) {
        List<MilkTea> result = new ArrayList<>();
        if (keyword == null) return result;
        String key = keyword.toLowerCase();
        for (MilkTea o : orders) {
            if (o.getCustomerName().toLowerCase().contains(key)) {
                result.add(o);
            }
        }
        return result;
    }

    public List<MilkTea> getOrdersCanGetGift() {
        List<MilkTea> result = new ArrayList<>();
        for (MilkTea o : orders) {
            if (o.canGetGift()) {
                result.add(o);
            }
        }
        return result;
    }

    public List<MilkTea> getTopOrders(int n) {
        List<MilkTea> sorted = sortByTasteScore(false);
        if (n <= 0) return new ArrayList<>();
        if (n >= sorted.size()) return sorted;
        return new ArrayList<>(sorted.subList(0, n));
    }

    public List<MilkTea> sortByTasteScore(boolean ascending) {
        List<MilkTea> result = new ArrayList<>(orders);
        if (ascending) {
            result.sort((a, b) -> Double.compare(a.getTasteScore(), b.getTasteScore()));
        } else {
            result.sort((a, b) -> Double.compare(b.getTasteScore(), a.getTasteScore()));
        }
        return result;
    }

    public List<MilkTea> sortByCustomerName() {
        List<MilkTea> result = new ArrayList<>(orders);
        result.sort((a, b) -> a.getCustomerName().compareToIgnoreCase(b.getCustomerName()));
        return result;
    }

    public double calculateAverageTasteScore() {
        if (orders.isEmpty()) return 0;
        double sum = 0;
        for (MilkTea o : orders) {
            sum += o.getTasteScore();
        }
        return sum / orders.size();
    }

    public double calculateTotalRevenue() {
        double total = 0;
        for (MilkTea o : orders) {
            total += o.calculateTotal();
        }
        return total;
    }
}