public class Performer extends Artist{
    private int workingHours;
    private String genre;

    public Performer() {
        super();
        this.workingHours = 0;
        this.genre = "";
    }

    public Performer(String artistName, double payment, int workingHours, String genre) {
        this.artistProfession = "Performer";
        this.artistName = artistName;
        this.payment = payment;
        this.workingHours = workingHours;
        this.genre = genre;
    }

    public void setWorkingHours() {
        this.workingHours = workingHours;
    }

    public void setGenre() {
        this.genre = genre;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public String getGenre() {
        return genre;
    }

    public String toString() {
        return "Artist Name: " + artistName + "\nWorking Hours: " + workingHours + "\nPayment: " + payment;
    }

    public double payArtist(double payment, int workingHours) {
        double totalPayment = payment * workingHours;
        if (workingHours > 24) {
            totalPayment += 500;
        }
        return totalPayment;
    }
    
} //end class
