import java.util.Scanner;

public class ArtistApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Artist[] artists = new Artist[50];

        // Input data for each artist
        for (int i = 0; i < artists.length; i++) {
            System.out.println();
            System.out.println("\tArtist " + (i + 1));
            System.out.println("Enter artist type (1 - Performer, 2 - Painter):");
            int artistProfession = in1.nextInt();

            System.out.println("Enter artist name:");
            String artistName = in.nextLine();

            System.out.println("Enter payment:");
            double payment = in1.nextDouble();

            if (artistProfession == 1) {
                System.out.println("Enter working hours:");
                int workingHours = in1.nextInt();

                System.out.println("Enter genre:");
                String genre = in.nextLine();

                artists[i] = new Performer(artistName, payment, workingHours, genre);
            } else if (artistProfession == 2) {
                System.out.println("Enter number of paintings:");
                int numOfPainting = in1.nextInt();

                artists[i] = new Painter(artistName, payment, numOfPainting);
            }
        }

        // Display the details of Performer objects from the Rock genre with payment > RM 10000.00
        System.out.println("\n\tPerformers from the Rock genre with payment > RM 10000.00:");
        for (Artist artist : artists) {
            if (artist instanceof Performer) {
                Performer performer = (Performer) artist;
                if (performer.getGenre().equalsIgnoreCase("Rock") && performer.getPayment() > 10000.00) {
                    System.out.println(performer);
                    System.out.println();
                }
            }
        }

        // Display the details of Painter objects with more than 10 paintings sold
        System.out.println("\n\tPainters with more than 10 paintings sold:");
        for (Artist artist : artists) {
            if (artist instanceof Painter) {
                Painter painter = (Painter) artist;
                if (painter.getNumOfPainting() > 10) {
                    System.out.println(painter);
                    System.out.println();
                }
            }
        }

        in.close();
        in1.close();
    } // end main
} // end class
