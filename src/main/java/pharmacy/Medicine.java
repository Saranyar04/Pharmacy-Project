package pharmacy;

import enums.CompanyName;
import enums.MedicineType;
import exceptions.InvalidPriceException;

import java.util.function.BiFunction;

public class Medicine {

    private String medicineId;
    private String name;
    private MedicineType type;
    private CompanyName company;
    private String description;
    private double price;

    public Medicine(String medicineId, String name, MedicineType type, CompanyName company, String description, double price) throws InvalidPriceException {
        if (price <= 0) {
            throw new InvalidPriceException("Price is invalid.");
        }
        this.medicineId = medicineId;
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + " " + s2;
        this.name = concatenate.apply(type.getMedicineType(), name);
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

    public CompanyName getCompany() {
        return company;
    }

    public void setCompany(CompanyName company) {
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
}
