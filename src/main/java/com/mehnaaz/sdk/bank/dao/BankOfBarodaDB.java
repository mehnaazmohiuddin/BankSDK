package com.mehnaaz.sdk.bank.dao;

import java.util.HashMap;


//making this singleton so that only one time its initalized. as its a data source we dont want multiple instances of this class
// however the down side is it cant be tested out easily.
public class BankOfBarodaDB implements BankDB{

    HashMap <String, Integer> accounts = new HashMap<>(5);

    private  BankOfBarodaDB instance;

    private  BankOfBarodaDB (){
        accounts.put("account1", 1000);
        accounts.put("account2", 2000);
        accounts.put("account3", 10);
        accounts.put("account4", 500);
    }


    public BankOfBarodaDB getInstance (){
        if(instance == null){
            BankOfBarodaDB bankDB = new    BankOfBarodaDB ();
            instance = bankDB;
            return  bankDB;
        }else
            return instance;

    }

    @Override
    public boolean setBalance(int balance, String accountID) {
     accounts.put(accountID,balance);
     return true;
    }

    @Override
    public int getBalance(String accountId) {
        return accounts.get(accountId);
    }
}
