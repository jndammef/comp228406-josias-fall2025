package exercise1;

public class Life extends Insurance {
    public Life() {
        super("Life Insurance");
    } // This will inherit from Insurance super class

    @Override
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}