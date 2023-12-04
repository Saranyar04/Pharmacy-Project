package enums;

public enum InsuranceRate {
    PLAN_A(10),
    PLAN_B(20),
    PLAN_C(30),
    NO_INSURANCE(0);

    private final int plan;

    InsuranceRate(int plan) {
        this.plan=plan;
    }

    public double getRate() {
        return plan;
    }
}
