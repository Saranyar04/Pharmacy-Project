package enums;

public enum TaxRate {
    TAX(7.5);

    private final double taxRate;

    TaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
