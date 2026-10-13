package com.shipping;

public class StandardShipping implements ShippingStrategy {
    // phí = 15000 + weightKg * 2000 + distanceKm * 300
    @Override
    public double calculateFee(double weightKg, double distanceKm) { /* TODO */
        return 15000 + weightKg * 2000 + distanceKm * 300;
    }
}