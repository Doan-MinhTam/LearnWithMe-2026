package com.shipping;

public class TestShipping {
    public static void main(String[] args) {
        ShippingCalculator calc = new ShippingCalculator();
        double[][] orders = { {1.5, 5}, {3.0, 12}, {0.5, 2}, {8.0, 20} };
        ShippingStrategy[] strategies = { new StandardShipping(), new ExpressShipping(), new SameDayShipping() };
        String[] names = { "Standard", "Express", "SameDay" };

        for (double[] order : orders) {
            System.out.println("Đơn hàng: " + order[0] + "kg, " + order[1] + "km");
            for (int i = 0; i < strategies.length; i++) {
                calc.setStrategy(strategies[i]);
                System.out.println("  " + names[i] + ": " + calc.computeFee(order[0], order[1]) + " VND");
            }
        }
    }
}