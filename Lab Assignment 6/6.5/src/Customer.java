public class Customer {
    protected String customerName;
    private char packageMenu;

    public Customer(String customerName, char packageMenu) {
        this.customerName = customerName;
        this.packageMenu = packageMenu;
    }

    public String getCustomerName() {
        return customerName;
    }

    public char getPackageMenu() {
        return packageMenu;
    }

    public String toString() {
        return "Customer Name: " + customerName + "\nPackage Menu: " + packageMenu;
    }
}
