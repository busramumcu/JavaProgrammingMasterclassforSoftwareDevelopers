package com.company;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.SortedMap;

public class Bank {

    private  String accountNumber;
    private  double customerBalance;
    private  String customerName;
    private  String email;
    private  String phoneNumber;



    public Bank() {
        this(2.50, "56789", "Default name", "Default email","Default phone");
        System.out.println("Empty constructor called");
    }

    public Bank(double customerBalance, String accountNumber, String customerName, String email, String phoneNumber) {
        System.out.println("Account constructor with parameters called.");
        this.customerBalance = customerBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return customerBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.customerBalance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double depositFunds (double depositAmount) {

        customerBalance += depositAmount;
        return customerBalance;
    }
    public void withdrawFunds (double depositAmount) {

        if (this.customerBalance - depositAmount < 0) {
            System.out.println("Only " + this.customerBalance + " available. Withdrawal not processed");
        }else {
            this.customerBalance -= depositAmount;
            System.out.println("Withdrawal of " +depositAmount + " processed. Remaining balance = " + this.customerBalance);
        }
    }
}
