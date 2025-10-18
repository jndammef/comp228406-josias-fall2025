package exercise3;

public class PersonalMortgage extends Mortgage {

    public PersonalMortgage(String mortgageId, String customerName, double amount, double primeRate, int term) {
        super(mortgageId, customerName, "Personal", amount, primeRate + 0.02, term); // "Personal" added here because it should not be changed by the user
        // and so that the compiler should match the number of arguments passed with those inherited from the superclass
    }
}
