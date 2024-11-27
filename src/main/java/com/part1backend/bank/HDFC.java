package main.java.com.part1backend.bank;

public class HDFC extends Bank {
    @Override
    public double getTransactionCharges() {
        return transactionCharges + 30.0;  // Specific charges for HDFC
    }
}
