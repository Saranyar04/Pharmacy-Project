package enums;

public enum MedicineType {

    PRESCRIPTION("Prescription"),
    OVER_THE_COUNTER("Over the counter");

    private final String medicineType;

    MedicineType(String medicineType) {
        this.medicineType = medicineType;
    }

    public String getMedicineType() {
        return medicineType;
    }
}
