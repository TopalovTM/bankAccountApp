package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String file = "C:\\Users\\Dell\\GitHub\\bankAccountApp\\NewBankAccounts.csv";

//        Checking check1 = new Checking("Tom Holland", "212323233", 1500);
//        Savings sav1 = new Savings("Rob Stark", "47348927",1200);
//        sav1.compound();
//        sav1.showInfo();
//        System.out.println("****************");
//        check1.compound();
//        check1.showInfo();

        //reading the CSV file
        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for(String[] accountHolder : newAccountHolders){
            System.out.println("NEW ACCOUNT");
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
            System.out.println(accountHolder[3]);
        }

    }
}
