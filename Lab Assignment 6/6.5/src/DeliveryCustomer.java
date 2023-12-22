public class DeliveryCustomer extends Customer{
    private String address;

    public DeliveryCustomer(String customerName, char packageMenu, String address) {
        super(customerName, packageMenu);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return super.toString() + "\nAddress: " + address;
    }

    public double calculatePrice(double km) {
        double price = 0;
        switch (getPackageMenu()) {
            case 'A':
            case 'a':
                price = 100;
                break;
            case 'B':
            case 'b':
                price = 150;
                break;
            case 'C':
            case 'c':
                price = 200;
                break;
            default:
                System.out.println("Invalid package menu");
                break;
        }

        if (km > 15) {
            price += 10;
        }
        
        return price;
    }
}
