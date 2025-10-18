package exercise3;

public class BusinessMortgage extends Mortgage {

    public BusinessMortgage(String mortgageId, String customerName, double amount, double primeRate, int term) {
        super(mortgageId, customerName, "Business", amount, primeRate + 0.01, term);
    }
}
