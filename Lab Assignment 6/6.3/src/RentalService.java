public class RentalService {
    protected String custICNo;
    protected String custName;
    protected String custPhoneNo;

    public RentalService(String custICNo, String custName, String custPhoneNo) {
        this.custICNo = custICNo;
        this.custName = custName;
        this.custPhoneNo = custPhoneNo;
    }

    public void setCustICNo(String custICNo) {
        this.custICNo = custICNo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustPhoneNo(String custPhoneNo) {
        this.custPhoneNo = custPhoneNo;
    }

    public String getCustICNo() {
        return custICNo;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustPhoneNo() {
        return custPhoneNo;
    }

    public String toString() {
        return "Customer IC No: " + custICNo + "\nCustomer Name: " + custName + "\nCustomer Phone No: " + custPhoneNo;
    }

    
}
