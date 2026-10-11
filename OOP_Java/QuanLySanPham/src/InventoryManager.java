/**
 * Class quản lý kho hàng
 */
 import java.util.*;
class InventoryManager {
    private List<Product> products;
    
    public InventoryManager() {
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public List<Product> getAllProducts() {
        return products;
    }
    
    /**
     * Tìm sản phẩm theo ID
     */
    public Product findProductById(String productId) {
        for (Product p : products) {
            if (p.getProductId().equals(productId)) {
                return p;
            }
        }
        return null;
    }
    
    /**
     * Tìm sản phẩm theo tên (tìm kiếm gần đúng)
     */
    public List<Product> searchProductsByName(String keyword) {
        List<Product> result = new ArrayList<>();
        String lowerKeyword = keyword.toLowerCase();
        
        for (Product p : products) {
            if (p.getName().toLowerCase().contains(lowerKeyword)) {
                result.add(p);
            }
        }
        return result;
    }
    
    /**
     * Lọc sản phẩm cần nhập hàng
     */
    public List<Product> getProductsNeedRestock() {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.needsRestock()) {
                result.add(p);
            }
        }
        return result;
    }
    
    /**
     * Sắp xếp sản phẩm theo giá (Bubble Sort)
     */
    public List<Product> sortByPrice(boolean ascending) {
        List<Product> sorted = new ArrayList<>(products);
        int n = sorted.size();
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                double price1 = sorted.get(j).calculateFinalPrice(0);
                double price2 = sorted.get(j + 1).calculateFinalPrice(0);
                
                boolean shouldSwap = ascending ? (price1 > price2) : (price1 < price2);
                
                if (shouldSwap) {
                    Product temp = sorted.get(j);
                    sorted.set(j, sorted.get(j + 1));
                    sorted.set(j + 1, temp);
                }
            }
        }
        return sorted;
    }
    
    /**
     * Tính tổng giá trị kho hàng
     */
    public double calculateTotalInventoryValue() {
        double total = 0;
        for (Product p : products) {
            total += p.calculateInventoryValue();
        }
        return total;
    }
}