package com.company;

public abstract class Account implements IBaseRate{
    //list common properties for savings and checking account
    String name;
    String sSN; //social security number 9-digit
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    //constructor to set base properties and initialize account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        //Set account number:
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber(){
        //getting the last two digits of the SSN
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        //generating a unique 5-digit code
        int uniqueID = index;
        //generating a random 3-digit number
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    //list the common methods withdraw deposit etc
    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance
        );
    }
}
