package com.company;

public abstract class Account implements IBaseRate{
    //list common properties for savings and checking account
    private String name;
    private String sSN; //social security number 9-digit
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    //constructor to set base properties and initialize account
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN = sSN;
        this.balance = initDeposit;

        //Set account number:
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber(){
        //getting the last two digits of the SSN
        String lastTwoOfSSN = sSN.substring(sSN.length()-2);
        //generating a unique 5-digit code
        int uniqueID = index;
        //generating a random 3-digit number
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    //compounding the interest rate
    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    //list the common methods - transaction

    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
        printBalance();
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Insufficient funds! Balance: " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            printBalance();
        }
    }

    public void transfer(String toAcc, double amount){
        if (amount > balance){
            System.out.println("Insufficient funds! Transfer not possible! Balance: " + balance);
        }
        else{
            balance -= amount;
            System.out.println("Transferring $" + amount + " to " + toAcc);
            printBalance();
        }
    }

    public void printBalance(){
        System.out.println("Your balance is: $" + balance);
    }

    public void showInfo(){
        System.out.println(
                "NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE: " + rate + "%"
        );
    }
}
