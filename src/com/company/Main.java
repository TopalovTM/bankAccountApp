package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Checking check1 = new Checking("Tom Holland", "212323233", 1500);
//        Savings sav1 = new Savings("Rob Stark", "47348927",1200);
//        sav1.compound();
//        sav1.showInfo();
//        System.out.println("****************");
//        check1.compound();
//        check1.showInfo();

        List<Account> accounts = new LinkedList<Account>();

        //reading the CSV file
        String file = "C:\\Users\\Dell\\GitHub\\bankAccountApp\\NewBankAccounts.csv";

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")){
                accounts.add(new Savings(name, sSN, initDeposit));
            }
            else if(accountType.equals("Checking")){
                accounts.add(new Checking(name, sSN, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        //show info for a specific account
        //accounts.get(5).showInfo();

        //iterating through the list
        for(Account acc : accounts){
            System.out.println("\n****************");
            acc.showInfo();
        }

    }
}
