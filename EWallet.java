import java.util.ArrayList;

public class EWallet {
    ArrayList<Double> transactions = new ArrayList<>();

    void addTransaction(double amount) {
        transactions.add(amount);
    }

    double getTotalSpent() {
        double total = 0;
        for (int i = 0; i < transactions.size(); i++) {
            total += transactions.get(i);
        }
        return total;
    }

    double getLargestTransaction() {
        if (transactions.size() == 0) return 0;

        double max = transactions.get(0);
        for (int i = 1; i < transactions.size(); i++) {
            if (transactions.get(i) > max) {
                max = transactions.get(i);
            }
        }
        return max;
    }

    void printAllTransactions() {
        System.out.println("All Transactions:");
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println("₹" + transactions.get(i));
        }
    }

    void printAboveThreshold(double threshold) {
        System.out.println("Transactions above ₹" + threshold + ":");
        for (int i = 0; i < transactions.size(); i++) {
            if (transactions.get(i) > threshold) {
                System.out.println("₹" + transactions.get(i));
            }
        }
    }

    void refundLastTransaction() {
        if (transactions.size() > 0) {
            double refunded = transactions.remove(transactions.size() - 1);
            System.out.println("Refunded ₹" + refunded);
        } else {
            System.out.println("No transaction to refund.");
        }
        printAllTransactions();
    }

    public static void main(String[] args) {
        EWallet myWallet = new EWallet();

        myWallet.addTransaction(200.0);
        myWallet.addTransaction(150.0);
        myWallet.addTransaction(600.0);
        myWallet.addTransaction(50.0);
        myWallet.addTransaction(800.0);
        myWallet.addTransaction(400.0);
        myWallet.addTransaction(1200.0);
        myWallet.addTransaction(300.0);
        myWallet.addTransaction(90.0);
        myWallet.addTransaction(1000.0);

        myWallet.printAllTransactions();
        System.out.println("Total spent: ₹" + myWallet.getTotalSpent());
        System.out.println("Largest transaction: ₹" + myWallet.getLargestTransaction());
        myWallet.printAboveThreshold(500);
        myWallet.refundLastTransaction();
    }
}
