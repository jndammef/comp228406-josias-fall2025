package exercise1;

public abstract class Insurance {
    private String insuranceType;
    private double monthlyCost;

    //    We set our constructor
    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
        this.monthlyCost = 0.0;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public double getMonthlyCost() {
        return monthlyCost;
    }

    protected void setMonthlyCost(double cost) {
        this.monthlyCost = cost;
    }

    // This abstract methods will be defined later in the subclasses
    public abstract void setInsuranceCost(double cost);
    public abstract void displayInfo();
}

