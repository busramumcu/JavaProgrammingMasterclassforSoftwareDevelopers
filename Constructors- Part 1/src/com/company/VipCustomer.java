package com.company;

public class VipCustomer {

    private double creditLimit;
    private String customerName;
    private String customerMail;

    public VipCustomer() {
        this(560.00,"Default name","Default email");
    }

    public VipCustomer (double creditLimit,String customerName) {
     this(creditLimit,customerName,"unknown@gmail.com");
    }

    public VipCustomer(double creditLimit, String customerName, String customerMail) {
        this.creditLimit  = creditLimit;
        this.customerName = customerName;
        this.customerMail = customerMail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerMail() {
        return customerMail;
    }
}
