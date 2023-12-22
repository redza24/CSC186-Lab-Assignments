public class DigitalDesign extends DesignService{
    private int digitalType;

    public DigitalDesign(String custName, double deposit, boolean urgentOrder, int digitalType) {
        super(custName, deposit, urgentOrder);
        this.digitalType = digitalType;
    }

    public int getDigitalType() {
        return digitalType;
    }

    public String toString() {
        return super.toString() + "\nDigital type: " + digitalType;
    }

    public double calcPayment() {
        return 0;
    }
}
