package exercise1;

public class Health extends Insurance {
    public Health() {
        super("Health Insurance");
    }

    @Override //here we overwrite the abstract method
    public void setInsuranceCost(double cost) {
        setMonthlyCost(cost);
    }

    @Override
    public void displayInfo() {
        System.out.println("Insurance Type: " + getInsuranceType());
        System.out.println("Monthly Cost: $" + getMonthlyCost());
    }
}

