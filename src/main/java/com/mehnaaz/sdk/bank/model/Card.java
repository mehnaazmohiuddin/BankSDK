package com.mehnaaz.sdk.bank.model;


import com.mehnaaz.sdk.bank.handlers.UserAccountHandler;

// issue a card . verify  a card .
public class Card {
    String cardNumber;
    int maxCardLimit; // max limit the user can withdraw from atm.
    int ifsci; //to know which bank issued it.
    String encryptedPin;
    User owner;

    UserAccountHandler userAccountHandler;



    public  String getEncryptedPin(){
        return  encryptedPin;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public int getMaxCardLimit() {
        return maxCardLimit;
    }

    public int getIfsci() {
        return ifsci;
    }

    public User getOwner() {
        return owner;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public  String encryptPin(String pin){
        // currently using no encryption . it could be SHA etc. with a
        return pin;
    }


    public  boolean isPinValid(String pin){
      return   encryptPin(pin).equals(this.encryptedPin);
    }



}
