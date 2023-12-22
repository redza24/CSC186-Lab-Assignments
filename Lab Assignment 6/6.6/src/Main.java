import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in); // for strings
        Scanner in1 = new Scanner(System.in); // for numbers
        RoomActivity[] room = new RoomActivity[2];

        System.out.println("\tEnter room activity information");
        for (int i = 0; i < room.length; i++) {
            System.out.println();
            System.out.println("\tRoom " + (i + 1));
            System.out.print("Enter activity name: ");
            String activityName = in.nextLine();
            System.out.print("Enter organiser: ");          
            char organiser = in.nextLine().charAt(0);
            System.out.print("Enter budget: ");
            double budget = in1.nextDouble();
            System.out.print("Enter date: ");
            String date = in.nextLine();
            System.out.print("Enter room type: ");
            String roomType = in.nextLine();
            System.out.print("Enter number of participants: ");
            int numOfParticipants = in1.nextInt();

            room[i] = new RoomActivity(activityName, organiser, budget, date, roomType, numOfParticipants);

        }

        System.out.println();
        System.out.println("\tBooked Activities");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null) {
            System.out.println("Activity Name: " + room[i].getActivityName());
            }
        }
    
        System.out.println();
        System.out.println("\tBookings by Private Organisers");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null && room[i].getOrganiser() == 'P' || room[i].getOrganiser() == 'p') {
                System.out.println(room[i].toString());
                System.out.println("Charges: " + room[i].roomCharges());
                System.out.println();
            }
        }

        System.out.println("\tBookings for lab with more than 30 participants");
        int cntLab = 0;
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null && room[i].getRoomType().equalsIgnoreCase("lab") && room[i].getNumOfParticipants() > 30) {
                System.out.println(room[i].toString());
                System.out.println();
                cntLab++;
            }
        }
        System.out.println("Total number of lab with more than 30 participants: " + cntLab);

        in.close();
        in1.close();
    }
}
