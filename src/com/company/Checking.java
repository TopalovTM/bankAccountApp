package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Checking extends Account{
    //list properties specific to the checking account
    int debitCardNumber;
    int debitCardPin;
    //constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN,initDeposit);
        //distinguishing between savings (1) and checking (2) accounts in account number
        this.accountNumber = "2" + this.accountNumber;
    }

    //list any methods specific to the checking account

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
    }
}
