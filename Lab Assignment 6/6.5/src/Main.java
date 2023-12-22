import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // for strings
        Scanner in1 = new Scanner(System.in); // for numbers
        DineInCustomer[] dine = new DineInCustomer[50];
        DeliveryCustomer[] deliver = new DeliveryCustomer[50];


        System.out.println("\tEnter dine-in information");
        for (int i = 0; i < dine.length; i++) {
            System.out.print("Enter customer name: ");
            String name = in.nextLine();
            System.out.print("Enter package menu: ");
            char menu = in.nextLine().charAt(0);
            System.out.print("Enter number of adult: ");
            int adult = in1.nextInt();
            System.out.print("Enter number of child: ");
            int child = in1.nextInt();
            System.out.print("Enter other package: ");
            char other = in.nextLine().charAt(0);

            dine[i] = new DineInCustomer(name, menu, adult, child, other);
        }

        double sumPriceDelivery = 0;
        System.out.println("\n\tEnter delivery information");
        for (int i = 0; i < deliver.length; i++) {
            System.out.print("Enter customer name: ");
            String name = in.nextLine();
            System.out.print("Enter package menu: ");
            char menu = in.nextLine().charAt(0);
            System.out.print("Enter address: ");
            String address = in.nextLine();
            System.out.print("Enter distance (km): ");
            double km = in1.nextDouble();
            sumPriceDelivery += km;

            deliver[i] = new DeliveryCustomer(name, menu, address);
        }

        int cntDineIn = 0;
        System.out.println("\nDine-in information");
        for (int i = 0; i < dine.length; i++) {
            if (dine[i].getCustomerName() != null) {
                System.out.println(dine[i]);
                cntDineIn++;
            }
        }
        System.out.println("Total number of dine-in customer: " + cntDineIn);
        System.out.println("Total price of all delivery customers: RM" + sumPriceDelivery);
        
    }
}
