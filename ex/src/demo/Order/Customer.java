package Order;

import java.time.LocalDate;
import java.util.Arrays;

public class Customer {
  private Order[] orders;


  public Customer(Order order) {
    this.orders = new Order[] {order};
  }

  public Customer(Order[] orders) {
    this.orders = orders;
  }

  public boolean deleteOrder(int orderId) {
    boolean found = false;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId == this.orders[i].getOrderId()) {
        found = true;
      }
    }
    if (!found) {
      return false;
    }

    Order[] arr = new Order[this.orders.length - 1];
    int idx = 0;
    for (int i = 0; i < this.orders.length; i++) {
      if (orderId != this.orders[i].getOrderId()) {
        arr[idx++] = this.orders[i];
      }
      this.orders = arr;
    }
    return found;
  }

  public String toString() {
    return Arrays.toString(orders);
  }

  public static void main(String[] args) {
    Order o1 = new Order(1, LocalDate.of(2023, 12, 5));
    o1.addItem(new Item("abc", 20.0, 5));
    o1.addItem(new Item("efd", 1.0, 1));
    o1.addItem(new Item("efd", 2.0, 2));
    // Order o2 = new Order(2, LocalDate.of(2023, 12, 5));
    Customer customer = new Customer(new Order[] {o1});

    System.out.println(customer);


  }
}
