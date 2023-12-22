public class Painter extends Artist{
    private int numOfPainting;

    public Painter() {
        super();
        this.numOfPainting = 0;
    }

    public Painter(String artistName, double payment, int numOfPainting) {
        this.artistProfession = "Painter";
        this.artistName = artistName;
        this.payment = payment;
        this.numOfPainting = numOfPainting;
    }

    public void setNumOfPaintings() {
        this.numOfPainting = numOfPainting;
    }

    public int getNumOfPainting() {
        return numOfPainting;
    }

    public String toString() {
        return "Artist Name: " + artistName + "\nNumber of Paintings: " + numOfPainting + "\nPayment: " + payment;
    }

    public double payArtist(double payment, int numOfPainting) {
        double totalPayment = payment * numOfPainting;
        if (numOfPainting > 5) {
            totalPayment += totalPayment * 0.1;
        }
        return totalPayment;
    }
}
