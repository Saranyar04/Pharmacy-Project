package enums;

public enum CompanyName {

    MDCLABORATORIES("MDC Laboratories"),
    TILAB("TI Lab"),
    PNCPHARMACY("PNC Pharmacy");

    private final String companyName;

    CompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}
