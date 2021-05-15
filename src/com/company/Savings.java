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
        setSafetyDepositBox();
    }


    //list methods specific to the savings account
    private void setSafetyDepositBox(){
        this.safetyDepositBoxId = (int) (Math.random() * Math.pow(10,3));
        this.safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }

    @Override
    public void showInfo() {
        System.out.println("ACCOUNT TYPE: Savings");
        super.showInfo();
        System.out.println(
                " Savings Account Features" +
                "\n Safety Deposit Box ID: " + this.safetyDepositBoxId +
                "\n Safety Deposit Box Key: " + this.safetyDepositBoxKey
        );
    }

    @Override
    public void setRate() {
        //savings rate is 25 points less than the base rate
        rate = getBaseRate() - 0.25;
    }

}
