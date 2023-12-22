public class SoHo extends House{
    private double unitPrice;
    private char packages;

    public SoHo(String buyerName, long ic, String gender, boolean bumiputera, double unitPrice, char packages) {
        super(buyerName, ic, gender, bumiputera);
        this.unitPrice = unitPrice;
        this.packages = packages;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public char getPackages() {
        return packages;
    }

    public String toString() {
        return super.toString() + "Unit Price: " + unitPrice + "\nPackages: " + packages + "\n";
    }
    
    public double sohoPrice() {
        double price = 0;
        if (packages == 'F' || packages == 'f') {
            price = unitPrice + 50000.00;
        } else if (packages == 'P' || packages == 'p') {
            price = unitPrice + 20000.00;
        } else if (packages == 'U' || packages == 'u') {
            price = unitPrice;
        } else {
            System.out.println("Invalid package");
        }

        if (super.isBumiputera()) { // bumiputera buyers get 10% discount
            price = price - (price * 0.10);
        }

        return price;
    }
}
