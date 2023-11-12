<<<<<<< HEAD
=======
//Package

>>>>>>> main
package pharmacy;

public class Medicine {

<<<<<<< HEAD
    private String medicineId;
    private String name;
    private String type;
    private String company;
    private String description;
    private double price;

    public Medicine(String medicineId, String name, String type, String company, String description, double price) {
        this.medicineId = medicineId;
        this.name = name;
        this.type = type;
        this.company = company;
        this.description = description;
        this.price = price;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "medicineId='" + medicineId + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
=======
    public String medName;
    public String medType;
    public String medCompany;
    public String medDescription;
    public float medPrice;
>>>>>>> main
}
