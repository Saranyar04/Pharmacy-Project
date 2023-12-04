package enums;

public enum PharmacyDetails {

    NAME("Firstaid Pharmacy"),
    ADDRESS("34 Main street, Manchester"),
    STATE("CONNECTICUT");

    private final String pharmacyDetails;

    PharmacyDetails(String pharmacyDetails) {
        this.pharmacyDetails = pharmacyDetails;
    }

    public String getPharmacyDetails() {
        return pharmacyDetails;
    }
}
