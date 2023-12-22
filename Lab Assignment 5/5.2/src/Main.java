import java.io.*;

public class Main {
    public static void main(String[] args) {

        try {
            Vehicle[] arrCar = new Vehicle[100];

            BufferedReader in = new BufferedReader(new FileReader("Car.txt"));
            PrintWriter outSelangor = new PrintWriter(new BufferedWriter(new FileWriter("selangor.txt")));
            PrintWriter outTerengganu = new PrintWriter(new BufferedWriter(new FileWriter("terengganu.txt")));

            outSelangor.println("Type\t\tPlate Number\tPrice (RM)");
            outSelangor.println("----\t\t------------\t----------");
            outTerengganu.println("Type\t\tPlate Number\tPrice (RM)");
            outTerengganu.println("----\t\t------------\t----------");

            int i = 0;
            double sumSelangor = 0.0, sumTerengganu = 0.0;
            String inData;
            while ((inData = in.readLine()) != null) {
                String[] tokens = inData.split(";");

                String type = tokens[0];
                String plateNo = tokens[1];
                double price = Double.parseDouble(tokens[2]);

                Vehicle vehicle = new Vehicle(type, plateNo, price);
                arrCar[i] = vehicle;

                if (vehicle.getPlateNo().charAt(0) == 'B') {
                    outSelangor.println(vehicle.getType() + "\t\t" + vehicle.getPlateNo() + "\t\t\t" + vehicle.getPrice());

                    sumSelangor += vehicle.getPrice();
                } else if (vehicle.getPlateNo().charAt(0) == 'T') {
                    outTerengganu.println(vehicle.getType() + "\t\t" + vehicle.getPlateNo() + "\t\t\t" + vehicle.getPrice());

                    sumTerengganu += vehicle.getPrice();
                }

                i++;
            } //end while

            outSelangor.println("\nTotal price: RM" + sumSelangor);
            outTerengganu.println("\nTotal price: RM" + sumTerengganu);

            // Close the output files
            outSelangor.close();
            outTerengganu.close();
            in.close();

        } catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        } catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }

    } //end main
} //end class
