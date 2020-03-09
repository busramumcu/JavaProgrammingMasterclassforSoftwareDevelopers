package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.withdrawFunds(100.0);
        bank.depositFunds(50.0);
        bank.withdrawFunds(100.0);

        VipCustomer vipCustomer1 = new VipCustomer ();
        System.out.println(vipCustomer1.getCustomerName());

        VipCustomer vipCustomer2 = new VipCustomer (56789.00, "Busra");
        System.out.println(vipCustomer2.getCustomerName());

        VipCustomer vipCustomer3 = new VipCustomer (56789.00, "Ozan","busramumcu@gmail.com");
        System.out.println(vipCustomer3.getCustomerName());


    }
}
