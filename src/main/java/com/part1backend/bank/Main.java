package main.java.com.part1backend.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ICICI icici = new ICICI();
        HDFC hdfc = new HDFC();

        System.out.println("Bank transaction charges: " + bank.getTransactionCharges());
        System.out.println("ICICI transaction charges: " + icici.getTransactionCharges());
        System.out.println("HDFC transaction charges: " + hdfc.getTransactionCharges());
    }
}
