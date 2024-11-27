package main.java.com.part1backend.bank;

public class ICICI extends Bank {
    @Override
    public double getTransactionCharges() {
        return transactionCharges + 20.0;  // Specific charges for ICICI
    }
}
