public class Vehicle {
    private String type;
    private String plateNo;
    private double price;

    public Vehicle(String type, String plateNo, double price) {
        this.type = type;
        this.plateNo = plateNo;
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public String getPlateNo() {
        return this.plateNo;
    }

    public double getPrice() {
        return this.price;
    }
}
