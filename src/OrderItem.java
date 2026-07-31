import java.math.BigDecimal;
import java.util.Date;

public class OrderItem {
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return getTotal().divide(new BigDecimal(quantity));
    }
}
