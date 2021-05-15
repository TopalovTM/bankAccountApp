package com.company;

public class Main {

    public static void main(String[] args) {

        Checking check1 = new Checking("Tom Holland", "212323233", 1500);
        Savings sav1 = new Savings("Rob Stark", "47348927",1200);

        sav1.showInfo();
        System.out.println("****************");
        check1.showInfo();
    }
}
