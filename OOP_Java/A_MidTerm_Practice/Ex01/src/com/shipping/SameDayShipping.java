package com.shipping;

public class SameDayShipping implements ShippingStrategy {
    // phí = 50000 + weightKg * 4000 + distanceKm * 800
    @Override
    public double calculateFee(double weightKg, double distanceKm) { /* TODO */
        return 50000 + weightKg * 4000 + distanceKm * 800;
    }
}