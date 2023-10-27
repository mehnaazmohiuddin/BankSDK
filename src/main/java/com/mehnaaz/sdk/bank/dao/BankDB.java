package com.mehnaaz.sdk.bank.dao;

public interface BankDB {
    public  boolean setBalance(  int balance, String accountID);
    public int getBalance(String accountId);

}
