package com.mehnaaz.sdk.bank.handlers;

import com.mehnaaz.sdk.bank.annotations.AuthenticateCard;
import com.mehnaaz.sdk.bank.dao.BankDB;
import com.mehnaaz.sdk.bank.model.Card;

public class UserAccountHandler {
    BankDB bankDB;

    public  UserAccountHandler (BankDB db){
        bankDB = db;
    }

  // throw exception like cant exct

    // Should this be synchoronized. .. if so on what.
   // perhaps through cheque / slip or wahtever.
    public synchronized  void withdraw(int amount , String accountId) {
          int balance =   bankDB.getBalance(accountId);
          bankDB.setBalance(  balance - amount, accountId); // will throw contraints like below whatever ..
    }

    public synchronized boolean deposit (int amount , String accountId) {
       int balance =   bankDB.getBalance(accountId);
       return bankDB.setBalance(amount+balance , accountId);
    }

   public synchronized int getBalance (String accountId) {
        return bankDB.getBalance(accountId);

    }

    @AuthenticateCard
    public synchronized  boolean withdrawWithCard(int amount , String accountId, Card card, String pin) {
      if(  card.getEncryptedPin().equals( card.encryptPin(pin)))
               {
                   int balance =   bankDB.getBalance(accountId);
                return    bankDB.setBalance(  balance - amount, accountId); // will throw contraints like below whatever ..
        }
        else
            return false;
    }


}
