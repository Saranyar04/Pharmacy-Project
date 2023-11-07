package pharmacy;

public class PrescriptionDrug extends Medicine {

    private String medId;
    private String dosage;
    private String specialInstruction;

    public PrescriptionDrug(String name, String type, String company, String description, double price, String medId, String dosage, String specialInstruction) {
        super (name, type, company, description, price);
        this.medId = medId;
        this.dosage = dosage;
        this.specialInstruction = specialInstruction;
    }

    public String getMedId() {
        return medId;
    }

    public String getDosage() {
        return dosage;
    }

    public String getSpecialInstruction() {
        return specialInstruction;
    }

    public void setMedId(String medId) {
        this.medId = medId;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public void setSpecialInstruction(String specialInstruction) {
        this.specialInstruction = specialInstruction;
    }
}
