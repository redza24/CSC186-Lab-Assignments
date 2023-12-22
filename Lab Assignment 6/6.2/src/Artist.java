public class Artist {
    protected String artistProfession;
    protected String artistName;
    protected double payment;

    public Artist() {
        this.artistProfession = "";
        this.artistName = "";
        this.payment = 0;
    }

    public Artist(String artistProfession, String artistName, double payment) {
        this.artistProfession = artistProfession;
        this.artistName = artistName;
        this.payment = payment;
    }

    public void setArtistProfession() {
        this.artistProfession = artistProfession;
    }

    public String getArtistProfession() {
        return artistProfession;
    }

    public void setArtistName() {
        this.artistName = artistName;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setPayment() {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public String toString() {
        return "Artist Profession: " + artistProfession + "\nArtist Name: " + artistName + "\nPayment: " + payment;
    }
} //end class