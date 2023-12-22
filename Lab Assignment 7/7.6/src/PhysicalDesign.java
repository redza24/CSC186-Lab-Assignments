public class PhysicalDesign extends DesignService {
    private int physicalType;
    private boolean printing;
    private int numCopy;

    public PhysicalDesign(String custName, double deposit, boolean urgentOrder, int physicalType, boolean printing, int numCopy) {
        super(custName, deposit, urgentOrder);
        this.physicalType = physicalType;
        this.printing = printing;
        this.numCopy = numCopy;
    }

    public int getPhysicalType() {
        return physicalType;
    }

    public boolean isPrinting() {
        return printing;
    }

    public int getNumCopy() {
        return numCopy;
    }

    public String toString() {
        return super.toString() + "\nPhysical type: " + physicalType + "\nPrinting: " + printing;
    }

    public double calcPayment() {
        double charge = 0;
        double addCharge = 0;

        switch (physicalType) {
            case 1:
                charge = 250;
                addCharge = 40;
                break;
            case 2:
                charge = 250;
                addCharge = 10;
                break;
            case 3:
                charge = 150;
                addCharge = 35;
                break;
            case 4:
                charge = 100;
                addCharge = 3;
                break;
            default:
                System.out.println("Invalid physical type");
                break;
        }

        if (printing) {
            charge += addCharge * numCopy;
        }

        if (urgentOrder) {
            charge += 50;
        }

        return charge - deposit;
    }
}
