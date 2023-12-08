package Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

public class Order {

  private LocalDate localDate;
  private int orderId;
  private Item[] items;

  public Order(int orderId, LocalDate localDate) {
    this.orderId = orderId;
    this.localDate = localDate;
    this.items = new Item[0];
  }

  public LocalDate getLocalDate() {
    return this.localDate;
  }

  public int getOrderId() {
    return this.orderId;
  }

  public void setLocalDate(LocalDate localDate) {
    this.localDate = localDate;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public void addItem(Item item) {
    int i = 0;
    Item[] newItems = new Item[this.items.length + 1];
    for (i = 0; i < this.items.length; i++) {
      newItems[i] = items[i];
    }
    newItems[i] = item;
    this.items = newItems;
  }

  public void addItem2(Item item) {
    Item[] newItems = Arrays.copyOf(this.items, this.items.length + 1);
    newItems[newItems.length - 1] = item;
    this.items = newItems;
  }

  public double totalAmount() {
    BigDecimal sum = new BigDecimal(0);
    if (items != null) {
      for (int i = 0; i < this.items.length; i++) {
        sum = sum.add(BigDecimal.valueOf(items[i].totalAmount()));
      }
      return sum.doubleValue();
    }
    return 0;
  }


  public String toString() {
    return "Order Id: " + this.orderId + "  Buy Date: " + this.localDate
        + "  Total Amount: " + totalAmount();
  }

}
