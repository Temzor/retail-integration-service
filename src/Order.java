public class Order {
    private int orderID;
    private int quantity;
    public Order(int orderID, int quantity) {
        this.orderID = orderID;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
