package com.shipping;

public class ShippingCalculator {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // gọi đúng strategy hiện tại; nếu chưa setStrategy() thì ném IllegalStateException
    public double computeFee(double weightKg, double distanceKm) { /* TODO */
        // 1. Kiểm tra nếu chưa set strategy thì ném ngoại lệ
        if (strategy == null) {
            throw new IllegalStateException("Shipping strategy is not set!");
        }

        // 2. Gọi phương thức tính phí của strategy hiện tại
        return strategy.calculateFee(weightKg, distanceKm);
    }
}