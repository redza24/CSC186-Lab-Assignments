import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DeliveryApp {
    public static void main(String[] args) {
        
        try { 
            BufferedReader in = new BufferedReader(new FileReader("deliveroo.txt"));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("earnings.txt")));
            
            out.println("Profit earned for each delivery");
            out.printf("%-20s%-15s\n", "Date(day)", "Profit");
            out.println("=======================================");
            
            int i = 0; //to count number of records
            int cntDelivery = 0; 
            double sumProfit = 0; 
            String inData;
            while ((inData = in.readLine()) != null) {
                String[] token = inData.split(",");
                String date = token[0].trim();
                String day = token[1].trim();
                String startTime = token[2].trim();
                double price = Double.parseDouble(token[5].trim());
                double priceMultiplier = Double.parseDouble(token[7].trim());
                double profit = (price * priceMultiplier) - price;
                
                if (isTimeLaterThan(startTime)) { //to count delivery after 9PM
                    cntDelivery++;
                }

                String dateDay = date + "(" + day.substring(0, 3) + ")"; //just to make it output date(day)
                out.printf("%-20sRM%-15.2f\n", dateDay, profit);
                
                sumProfit += profit; 
                i++;
            } //end while

            double avgProfit = sumProfit / i;
            out.println("=======================================");
            out.printf("Average profit for each order: RM%.2f", avgProfit);

            //print on console
            System.out.println("\nNumber of deliveries with start time at 9 PM or later: " + cntDelivery);
            System.out.println();
            
            //close all files
            in.close();
            out.close();
        } //end try

        catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        } 
        catch (IOException iox) {
            System.out.println(iox.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }

        
    } //end main

    public static boolean isTimeLaterThan(String startTime) { //to check if time is later than 9PM
        String[] parts = startTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        String meridiem = parts[2].split(" ")[1];
        
        if (meridiem.equalsIgnoreCase("PM") && hour < 12) {
            hour += 12;
        }
        
        LocalTime time = LocalTime.of(hour, Integer.parseInt(parts[1]));
        LocalTime targetTime = LocalTime.parse("21:00", DateTimeFormatter.ofPattern("HH:mm"));
        return time.isAfter(targetTime);
    } //end isTimeLaterThan
} //end class
