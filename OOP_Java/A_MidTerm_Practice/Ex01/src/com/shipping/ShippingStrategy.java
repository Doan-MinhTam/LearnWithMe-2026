package com.shipping;

public interface ShippingStrategy {
    double calculateFee(double weightKg, double distanceKm);
}