package ru.temzor.retail.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class Order {
    private final UUID id;
    private final List<OrderItem> items;

    public Order(UUID id, List<OrderItem> items) {
        this.id = id;
        this.items = items;
    }

    public void addItem(OrderItem item) {
        if (item == null)         {
            throw new IllegalArgumentException("item cannot be null");
        } else {
            items.add(item);
        }
    }

    public boolean removeItem(UUID productId) {
        items.removeIf(item -> item.equals(productId));
        return false;
    }

    public BigDecimal getTotal() {
        return BigDecimal.ZERO;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public UUID getId() {
        return id;
    }
}
