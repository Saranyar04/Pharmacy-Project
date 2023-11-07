package pharmacy;

public class OverTheCounter extends Medicine {

    private String otcId;
    private String uses;

    public OverTheCounter(String name, String type, String company, String description, double price, String otcId, String uses) {
        super (name, type, company, description, price);
        this.otcId = otcId;
        this.uses = uses;
    }

    public String getOtcId() {
        return otcId;
    }

    public String getUses() {
        return uses;
    }

    public void setOtcId(String otcId) {
        this.otcId = otcId;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }
}
