/**
 * Service quản lý đơn hàng - tuân thủ Single Responsibility Principle
 */
public class OrderService {
    private java.util.List<Product> products;
    private java.util.List<Order> orders;
    
    public OrderService() {
        this.products = new java.util.ArrayList<>();
        this.orders = new java.util.ArrayList<>();
    }
    
    public void addProduct(Product product) throws InvalidPriceException {
        if (!product.isValid()) {
            throw new InvalidPriceException("Invalid product data");
        }
        products.add(product);
    }
    
    public Product findProductById(String productId) throws InvalidOrderException {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        throw new InvalidOrderException("Product with ID '" + productId + "' not found");
    }
    
    public void createOrder(Order order) throws InvalidOrderException {
        if (!order.isValid()) {
            throw new InvalidOrderException("Invalid order data");
        }
        orders.add(order);
    }
    
    public Order findOrderById(String orderId) throws InvalidOrderException {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId)) {
                return order;
            }
        }
        throw new InvalidOrderException("Order with ID '" + orderId + "' not found");
    }
    
    public void processPayment(String orderId) throws InvalidOrderException, PaymentFailedException {
        Order order = findOrderById(orderId);
        order.pay();
    }
    
    public java.util.List<Product> getAllProducts() {
        return new java.util.ArrayList<>(products);
    }
    
    public java.util.List<Order> getAllOrders() {
        return new java.util.ArrayList<>(orders);
    }
    
    public java.util.List<Product> getProductsByCategory(String category) {
        java.util.List<Product> result = new java.util.ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                result.add(product);
            }
        }
        return result;
    }
}