public class CarRental extends RentalService{
    private double period;
    private boolean driver;

    public CarRental(String custICNo, String custName, String custPhoneNo, double period, boolean driver) {
        super(custICNo, custName, custPhoneNo);
        this.period = period;
        this.driver = driver;
    }

    public void setPeriod(double period) {
        this.period = period;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    public double getPeriod() {
        return period;
    }

    public boolean getDriver() {
        return driver;
    }

    public String toString() {
        return "Period: " + period + "\nDriver: " + driver;
    }

    public double calcCharge() {
        double charge = 0;
        if (driver == true) {
            charge = 150;
        }

        if (period <= 6) {
            charge += 185 * period;
        } else if (period > 6 && period <= 12) {
            charge += 230 * period;
        } else if (period > 12 && period <= 24) {
            charge += 285 * period;
        } else if (period > 24) {
            charge += 285 + (25 * (period - 24));
        }

        return charge;
    }
}
