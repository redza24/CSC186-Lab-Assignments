public class House {
    private String buyerName;
    private long ic;
    private String gender;
    private boolean bumiputera;

    public House(String buyerName, long ic, String gender, boolean bumiputera) {
        this.buyerName = buyerName;
        this.ic = ic;
        this.gender = gender;
        this.bumiputera = bumiputera;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public long getIc() {
        return ic;
    }

    public String getGender() {
        return gender;
    }

    public boolean isBumiputera() {
        return bumiputera;
    }

    public String toString() {
        return "Buyer Name: " + buyerName + "\nIC Number: " + ic + "\nGender: " + gender + "\nBumiputera: " + bumiputera + "\n";
    }
}
