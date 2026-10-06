import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

abstract class Order {
    public String orderId;
    public String symbol;
    public int quantity;

    public Order(String orderId, String symbol, int quantity) {
        this.orderId = orderId;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public abstract double getExecutionPrice(double currentMarketPrice);

    public abstract String getInfo();
}

class LimitOrder extends Order {
    public double limitPrice;

    public LimitOrder(String orderId, String symbol,
                      int quantity, double limitPrice) {
        super(orderId, symbol, quantity);
        this.limitPrice = limitPrice;
    }

    @Override
    public double getExecutionPrice(double currentMarketPrice) {
        return limitPrice;
    }

    @Override
    public String getInfo() {
        return String.format(
                "[%s] %s x %d | Type: LIMIT | Limit Price: %.1f",
                orderId,
                symbol,
                quantity,
                limitPrice
        );
    }
}

class MarketOrder extends Order {

    public MarketOrder(String orderId, String symbol, int quantity) {
        super(orderId, symbol, quantity);
    }

    @Override
    public double getExecutionPrice(double currentMarketPrice) {
        return currentMarketPrice;
    }

    @Override
    public String getInfo() {
        return String.format(
                "[%s] %s x %d | Type: MARKET",
                orderId,
                symbol,
                quantity
        );
    }
}

