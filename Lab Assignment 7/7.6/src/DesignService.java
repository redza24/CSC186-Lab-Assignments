public abstract class DesignService {
    protected String custName;
    protected double deposit;
    protected boolean urgentOrder;

    public DesignService(String custName, double deposit, boolean urgentOrder) {
        this.custName = custName;
        this.deposit = deposit;
        this.urgentOrder = urgentOrder;
    }

    public String getCustName() {
        return custName;
    }

    public double getDeposit() {
        return deposit;
    }

    public boolean isUrgentOrder() {
        return urgentOrder;
    }

    public String toString() {
        return "Customer name: " + custName + "\nDeposit: RM" + deposit + "\nUrgent order: " + urgentOrder;
    }

    public abstract double calcPayment();
}
