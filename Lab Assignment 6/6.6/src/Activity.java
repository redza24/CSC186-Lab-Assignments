public class Activity {
    private String activityName;
    private char organiser;
    private double budget;
    private String date;

    public Activity(String activity, char organiser, double budget, String date) {
        this.activityName = activityName;
        this.organiser = organiser;
        this.budget = budget;
        this.date = date;
    }

    public String getActivityName() {
        return activityName;
    }

    public char getOrganiser() {
        return organiser;
    }

    public double getBudget() {
        return budget;
    }

    public String getDate() {
        return date;
    }

    public String toString() {
        return "Activity: " + activityName + "\nOrganiser: " + organiser + "\nBudget: " + budget + "\nDate: " + date;
    }
}
