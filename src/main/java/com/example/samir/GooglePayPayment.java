package com.example.samir;

public class GooglePayPayment implements PaymentStrategy{
    private String DPAN;


    public GooglePayPayment(String DPAN) {
        this.DPAN = DPAN;
    }

    @Override
    public void pay(double amount) {
        System.out.println(DPAN + ": Paying " + amount + " " + "payment through via google pay.");
    }






}
