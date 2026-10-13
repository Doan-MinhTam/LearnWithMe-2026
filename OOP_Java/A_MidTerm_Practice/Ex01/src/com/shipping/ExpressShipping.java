package com.shipping;

public class ExpressShipping implements ShippingStrategy {
    // phí = 25000 + weightKg * 3000 + distanceKm * 500
    @Override
    public double calculateFee(double weightKg, double distanceKm) { /* TODO */
            return 25000 + weightKg * 3000 + distanceKm * 500;
    }
}