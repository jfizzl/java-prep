import Orders.Order;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    private String user;
    private String email;
    private String address;
    private int number;
    private List<Order> orders = new ArrayList<>();

    public User(String user, String email, String address,
                int number, Order order) {
        this.user = user;
        this.email = email;
        this.address = address;
        this.number = number;
        orders.add(order);

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        orders.add(order);
    }

    public abstract boolean authoriseUser();
}
