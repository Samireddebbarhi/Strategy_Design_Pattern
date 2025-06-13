package com.example.samir;

public class PaypalPayment implements PaymentStrategy{
    private String email;
    public PaypalPayment(String email) {
        this.email = email;
    }
@Override
    public void pay(double amount) {
        System.out.println("Paypal Payment");
}
}
