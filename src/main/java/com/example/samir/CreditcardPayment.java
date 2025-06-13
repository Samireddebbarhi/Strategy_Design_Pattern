package com.example.samir;

public class CreditcardPayment implements PaymentStrategy{
    private String CardHolderName;
    private String cvv;
    private String expiryDate;
    private String cardType;
    private String cardNumber;

public CreditcardPayment(String CardHolderName, String cvv, String expiryDate, String cardType, String cardNumber) {
    this.CardHolderName = CardHolderName;
    this.cvv = cvv;
    this.expiryDate = expiryDate;
    this.cardType = cardType;
    this.cardNumber = cardNumber;

}
    @Override
    public void pay(double amount) {
        System.out.println(" Processing " + amount + " credit card");
    }
}
