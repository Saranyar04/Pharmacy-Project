package enums;

public enum CompanyName {

    MDC_LABORATORIES("MDC Laboratories"),
    TI_LAB("TI Lab"),
    PNC_PHARMACY("PNC Pharmacy");

    private final String companyName;

    CompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
