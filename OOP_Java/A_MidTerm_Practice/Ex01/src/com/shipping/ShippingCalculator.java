package com.shipping;

public class ShippingCalculator {
    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    // gọi đúng strategy hiện tại; nếu chưa setStrategy() thì ném IllegalStateException
    public double computeFee(double weightKg, double distanceKm) { /* TODO */ }
}