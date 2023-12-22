import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); //for string
        Scanner in1 = new Scanner(System.in); //for number
        CarRental[] carRentals = new CarRental[10];

        double charge = 0;
        double sumCharge = 0;
        for (int i = 0; i < carRentals.length; i++) {
            System.out.println();
            System.out.println("\tCustomer " + (i + 1));
            System.out.print("Enter Customer IC No: ");
            String custICNo = in.nextLine();
            System.out.print("Enter Customer Name: ");
            String custName = in.nextLine();
            System.out.print("Enter Customer Phone No: ");
            String custPhoneNo = in.nextLine();
            System.out.print("Enter Rental Period: ");
            double period = in1.nextDouble();
            System.out.print("Driver [true/false]: ");
            boolean driver = in1.nextBoolean();
            carRentals[i] = new CarRental(custICNo, custName, custPhoneNo, period, driver);

            charge = carRentals[i].calcCharge();
            System.out.printf("Charge: RM%.2f\n", charge);
            sumCharge += charge;
        } //end for

        System.out.println();
        System.out.printf("Total charge: RM%.2f\n", sumCharge);
        System.out.println();
        System.out.println("Customers who rented cars with the driver option:");
        for (CarRental carRental : carRentals) {
            if (carRental.getDriver()) {
                System.out.println(carRental.getCustName());
            }
        } //end for

    } //end main
} //end class
