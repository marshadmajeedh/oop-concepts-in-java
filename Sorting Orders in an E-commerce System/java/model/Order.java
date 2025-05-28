package model;

import validator.ValidateTotalAmount;

public class Order {

    private String orderID;
    private String customerName;
    private double totalAmount;

    public Order(String orderID, String customerName) {
        this.orderID = orderID;
        this.customerName = customerName;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setTotalAmount(double totalAmount) {
        ValidateTotalAmount.validateTotalAmount(totalAmount);
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String toString() {
        return "Order details : "+orderID + "\t" + customerName + "\t" + totalAmount;
    }

}
