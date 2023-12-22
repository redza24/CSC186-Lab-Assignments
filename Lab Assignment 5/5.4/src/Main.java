import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        try {
            Supermarket[] arrStore = new Supermarket[100];

            BufferedReader in = new BufferedReader(new FileReader("20180221.txt"));
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("reportSale.txt")));

            out.printf("%-30s%-15s%-15s%-10s", "Item", "Quantity", "Price(RM)", "Sub total(RM)");

            int i = 0;
            double sum = 0;
            String inData = null;
            while((inData = in.readLine()) != null) {
                String[] tokens = inData.split(",");

                String itemName = tokens[0];
                int qty = Integer.parseInt(tokens[1]);
                double unitPrice = Double.parseDouble(tokens[2]);
                sum = qty * unitPrice;

                Supermarket supermarket = new Supermarket(itemName, qty, unitPrice);
                arrStore[i] = supermarket;

                out.println();
                out.printf("%-30s%-15s%-15s%-10.2f", supermarket.getItemName(), supermarket.getQty(), supermarket.getUnitPrice(), sum );
                
                i++;
            }

            out.println();
            out.println();
            out.printf("TOTAL SALE for date: 21st, February 2018 is: RM %.2f", sum);

            in.close();
            out.close();
            
        } //end try

        catch (FileNotFoundException fnf) {
            System.out.println(fnf.getMessage());
        } catch (IOException iox) {
            System.out.println(iox.getMessage());
        } catch (Exception e) {
            System.out.println("Problem: " + e.getMessage());
        }

    } // end main
} //end class
