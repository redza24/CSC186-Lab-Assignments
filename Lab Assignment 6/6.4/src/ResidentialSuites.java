public class ResidentialSuites extends House{
    private String residentialSuiteType; //A: 1 room, B: 2 rooms, C: 3 rooms

    public ResidentialSuites(String buyerName, long ic, String gender, boolean bumiputera, String residentialSuiteType) {
        super(buyerName, ic, gender, bumiputera);
        this.residentialSuiteType = residentialSuiteType;
    }

    public String getResidentialSuiteType() {
        return residentialSuiteType;
    }

    public String toString() {
        return super.toString() + "Residential Suite Type: " + residentialSuiteType + "\n";
    }

    public double residentialPrice() {
        double price = 0;
        return price;
    }
    
}
