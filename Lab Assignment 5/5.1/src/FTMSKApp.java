import java.io.*;
import java.util.*;

public class FTMSKApp {
    public static void main(String[] args) {
        
        try {
            // Open all files
            BufferedReader in = new BufferedReader(new FileReader ("FTMSK.txt"));
            PrintWriter outCS110 = new PrintWriter(new BufferedWriter(new FileWriter("CS110Male.txt")));
            PrintWriter outCS111 = new PrintWriter(new BufferedWriter(new FileWriter("CS111Male.txt")));
            
            outCS110.println("\t\tMale Students in CS110");
            outCS110.printf("%-15s%-30s%-10s\n", "Matrix Number", "Name", "Part");
            outCS111.println("\t\tMale Students in CS111");
            outCS111.printf("%-15s%-30s%-10s\n", "Matrix Number", "Name", "Part");
            
            // Read data from input file
            int cntCS110 = 0;
            int cntCS111 = 0;
            String inData = null;
            while((inData = in.readLine()) != null) {
                // Tokenize the record intro field
                StringTokenizer at = new StringTokenizer(inData, ";");
                String matrixNum = at.nextToken();
                String studName = at.nextToken();
                String program = at.nextToken();
                String part = at.nextToken();
                String gender = at.nextToken();

                // Manipulation
                if (program.equalsIgnoreCase("CS110") && gender.equalsIgnoreCase("M")) {
                    outCS110.printf("%-15s%-30s%-10s\n", matrixNum, studName, part);
                    cntCS110++;
                }
                if (program.equalsIgnoreCase("CS111") && gender.equalsIgnoreCase("M")) {
                    outCS111.printf("%-15s%-30s%-10s\n", matrixNum, studName, part);
                    cntCS111++;
                }
            } //end while
            
            outCS110.println("\nNumber of male students for CS110: " + cntCS110);
            outCS111.println("\nNumber of male students for CS111: " + cntCS111);

            // Close all files
            in.close();
            outCS110.close();
            outCS111.close();
        } //end try block

        // Catch block
        catch(FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        }

        catch(IOException iox) {
            System.out.println(iox.getMessage());
        }

        catch(Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }
    } //end main
} //end class
