package model;

import java.util.Date;

public class Order {

    int id;

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    long contact;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    String customerName;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getRestaurantName() {
        return restaurantName;
    }


    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }


    public Date getOrderDate() {
        return orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    String deliveryAddress;
    Date orderDate;
    double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String restaurantName;

}
