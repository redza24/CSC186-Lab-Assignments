import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in); // for strings
        Scanner in1 = new Scanner (System.in); // for others

        System.out.print("Enter number of order: ");
        int numOrder = in1.nextInt();
        DesignService[] ds = new DesignService[numOrder];

        for (int i = 0; i < numOrder; i++) {
            System.out.println();
            System.out.println("\tOrder " + (i + 1));
            System.out.print("Enter customer name: ");
            String custName = in.nextLine();

            System.out.print("Enter deposit: ");
            double deposit = in1.nextDouble();

            System.out.print("Is urgent order? [true/false]: ");
            boolean urgentOrder = in1.nextBoolean();

            System.out.print("\n\t1. Physical Design\n\t2. Digital Design\nEnter your choice [1-2]: ");
            int choice = in1.nextInt();

            if (choice == 1) {
                System.out.println();
                System.out.print("\t1. Banner\n\t2. Brochure\n\t3. Poster\n\t4. BusinessCard\nEnter your choice: [1-4]");
                int physicalType = in1.nextInt();
                System.out.print("Enter Printing (true/false): ");
                boolean print = in1.nextBoolean();

                int copy = 0;
                if (print) {
                    System.out.print("Enter number of copy: ");
                    copy = in1.nextInt();
                }
                
                ds[i] = new PhysicalDesign(custName, deposit, urgentOrder, physicalType, print, copy);
            } else if (choice == 2) {
                System.out.print("\n\t1. Website\n\t2. Advertisement\nEnter Digital Type: [1-2]");
                int digitalType = in1.nextInt();

                ds[i] = new DigitalDesign(custName, deposit, urgentOrder, digitalType);
            }//end if
        } //end for

        
        System.out.println();
        System.out.println("\tPhysical Design Order List");
        boolean foundPhysicalOrder = false;
        int cntUrgentWebsite = 0;
        for (DesignService designService : ds) {
			// Display all physical order
            if (designService.getCustName() != null) { 
                if (designService instanceof PhysicalDesign) {
                PhysicalDesign pd = (PhysicalDesign) designService;
					System.out.println(pd);
					System.out.println("Payment: RM" + pd.calcPayment());
					System.out.println();
					foundPhysicalOrder = true;
				}
			}
			if (designService instanceof DigitalDesign) {
				// Count and display total urgent website design order
				DigitalDesign dd = (DigitalDesign) designService;
				if (dd.isUrgentOrder()) {
					if(dd.getDigitalType() == 1) {
						cntUrgentWebsite++;
					}
				}
			}
        }
        if (!foundPhysicalOrder) {
                System.out.println("No Physical Order Available.");
        }
        System.out.println();
        System.out.println("Total urgent website design order: " + cntUrgentWebsite);

        
        in.close();
        in1.close();
    } //end main
} //end class
