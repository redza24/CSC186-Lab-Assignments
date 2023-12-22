public class RoomActivity extends Activity{
    private String roomType;
    private int numOfParticipants;

    public RoomActivity(String activityName, char organiser, double budget, String date, String roomType, int numOfParticipants) {
        super(activityName, organiser, budget, date);
        this.roomType = roomType;
        this.numOfParticipants = numOfParticipants;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNumOfParticipants() {
        return numOfParticipants;
    }

    public String toString() {
        return super.toString() + "\nRoom Type: " + roomType + "\nNumber of Participants: " + numOfParticipants;
    }

    public double roomCharges() {
        double charge = 0;
        switch (getOrganiser()) {
            case 'G':
            case 'g':
                charge = 1500;                
                break;
            case 'P':
            case 'p':
                charge = 25 * numOfParticipants;
                break;
            case 'U':
            case 'u':
                charge = 10 * numOfParticipants;
                break;
            default:
                System.out.println("Invalid organiser type");
                break;
        }
        return charge;
    }
}
