public class DineInCustomer extends Customer{
    private int numOfAdult;
    private int numOfChild;
    private char otherPackage;

    public DineInCustomer(String customerName, char packageMenu, int numOfAdult, int numOfChild, char otherPackage) {
        super(customerName, packageMenu);
        this.numOfAdult = numOfAdult;
        this.numOfChild = numOfChild;
        this.otherPackage = otherPackage;
    }

    public int getNumOfAdult() {
        return numOfAdult;
    }

    public int getNumOfChild() {
        return numOfChild;
    }

    public char getOtherPackage() {
        return otherPackage;
    }

    public String toString() {
        return super.toString() + "\nNumber of Adult: " + numOfAdult + "\nNumber of Child: " + numOfChild + "\nOther Package: " + otherPackage;
    }
}
