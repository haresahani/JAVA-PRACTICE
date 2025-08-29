package oop.O1_WhyOOP;


class BanckAccount{
    String name;
    double balance;
}

class BankProcedural {
    //deposit
    static void deposit(BanckAccount acc, double amount) {
        acc.balance += amount;
    }

    //withdraw
    static void withdraw(BanckAccount acc, double amount) {
        if(acc.balance >= amount) {
            amount -= acc.balance;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    //print
    static void printBankDetails(BanckAccount acc) {
        System.out.println(acc.name + " Balance: " + acc.balance);
    }
}
public class Procedural {
    public static void main(String[] args) {
        BanckAccount acc = new BanckAccount();
        acc.name = "Hare";
        acc.balance = 900;

        BankProcedural.withdraw(acc, 333);
        BankProcedural.printBankDetails(acc);

    }
}
