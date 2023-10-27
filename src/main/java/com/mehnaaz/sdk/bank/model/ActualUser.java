package com.mehnaaz.sdk.bank.model;


// for demoing that the class in same package can access the package-private members.
public class ActualUser extends  User{

    public void addSurName(String surname){
       this.name =  this.name+surname;
    }

}
