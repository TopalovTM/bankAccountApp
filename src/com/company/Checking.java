package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Checking extends Account{

    //list properties specific to the checking account
    private int debitCardNumber;
    private int debitCardPin;
    //constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN,initDeposit);
        //distinguishing between savings (1) and checking (2) accounts in account number
        this.accountNumber = "2" + this.accountNumber;
        setDebitCard();
    }

    //list any methods specific to the checking account

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));
    }
    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Checking");
        super.showInfo();
        System.out.println(" Checking Account Features" +
                "\n Debit Card Number: " + debitCardNumber +
                "\n Debit Card PIN: " + debitCardPin);
    }

    @Override
    public void setRate() {
        //checking rate is 15% of the base rate
        rate = getBaseRate() * 0.15;
    }


}
