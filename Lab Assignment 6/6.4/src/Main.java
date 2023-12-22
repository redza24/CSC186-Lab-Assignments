import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        SoHo[] buyer = new SoHo[320];

        for (int i = 0; i < buyer.length; i++) {
            System.out.println();
            System.out.println("\tBuyer " + (i + 1));
            System.out.print("Enter buyer name: ");
            String buyerName = in.nextLine();
            System.out.print("Enter buyer IC number: ");
            long ic = in.nextLong();
            in.nextLine();
            System.out.print("Enter gender: ");
            String gender = in.nextLine();
            System.out.print("Bumiputera [true/false]: ");
            boolean bumiputera = in.nextBoolean();

            System.out.print("Enter unit price: ");
            double unitPrice = in.nextDouble();
            in.nextLine();
            System.out.print("Enter package [F/P/U]: ");
            char packages = in.next().charAt(0);
            in.nextLine();

            buyer[i] = new SoHo(buyerName, ic, gender, bumiputera, unitPrice, packages);
        }
        System.out.println();
        System.out.println("\tSoHo female buyers who bought fully furnished package: ");
        int cntFemale = 0;
        for (SoHo soho : buyer) {
            if (soho.getGender().equalsIgnoreCase("female")) {
                if (soho.getPackages() == 'F' || soho.getPackages() == 'f') {
                    System.out.println(soho.toString());
                    cntFemale++;
                }
            }
        }
        System.out.println("Total number of SoHo female buyers who bought fully furnished package: " + cntFemale);

        in.close();
    }
}
