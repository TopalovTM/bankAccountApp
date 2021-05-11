package com.company;

public class Savings extends Account{

    //list properties specific to the savings account
    int safetyDepositBoxId;
    int safetyDepositBoxKey;

    //constructor to initialize settings for the savings properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        //distinguishing between savings (1) and checking (2) accounts in account number
        this.accountNumber = "1" + this.accountNumber;
    }

    //list methods specific to the savings account

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
    }
}
