public class Supermarket {
    private String itemName;
    private int qty;
    private double unitPrice;

    public Supermarket(String itemName, int qty, double unitPrice) {
        this.itemName = itemName;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
        
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}