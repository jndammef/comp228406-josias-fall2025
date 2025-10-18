package exercise3;

public abstract class Mortgage implements MortgageConstants {
    private String mortgageId;
    private String mortgageType;
    private String customerName;
    private double amount;
    private double interestRate;
    private int term;

    public Mortgage(String mortgageId, String mortgageType, String customerName, double amount, double interestRate, int term) {
        this.mortgageId = mortgageId;
        this.customerName = customerName;
        this.mortgageType = mortgageType;

        // No mortgage amounts should be over $300,000
        if (amount > MAX_MORTGAGE_AMOUNT) {
            this.amount = MAX_MORTGAGE_AMOUNT;
        } else {
            this.amount = amount;
        }

        this.interestRate = interestRate;

        // Force any invalid term to short-term (1 year) as stated in the instructions
        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }
    }

    public String getMortgageId() {
        return mortgageId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void getMortgageInfo() {
        double totalOwed = amount + (amount * interestRate * term);

        System.out.println("Bank: " + BANK_NAME);
        System.out.println("Mortgage Number: " + mortgageId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Mortgage Type: " + mortgageType);
        System.out.printf("Mortgage Amount: $%.2f%n", amount);
        System.out.printf("Interest Rate: %.2f%%%n", interestRate * 100);
        System.out.println("Term: " + term + " year(s)");
        System.out.printf("Total Amount Owed: $%.2f%n", totalOwed);
    }
}
