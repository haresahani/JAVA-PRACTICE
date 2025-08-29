package oop.O1_WhyOOP;

import java.sql.SQLOutput;

class BankAccount{

    //attributes(properties)
   private String name;
    private double balance;

    //Constructor
    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    //method(function)
    //deposit
    void deposit(double amount) {
        balance += amount;
    }

    //withdraw
    void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Funds");
        }
    }

    //print
    void printBankdetails() {
        System.out.println( "Name: " + name + " balance: " + balance);
    }

}
public class OOP {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("Hare", 8900);
        bank.deposit(9083);
        bank.printBankdetails();
    }
}
