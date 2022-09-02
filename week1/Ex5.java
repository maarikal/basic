package week1;

public class Ex5 {
    // psvm lühikäsk
    public static void main(String[] args) {
        int days = 365;
        int hours = 24;
        int minutes = 60;
        int seconds = 60;

        int secondsInYear = days * hours * minutes * seconds;
        System.out.println("WITH INT - There are " + secondsInYear + " seconds in a year.");

        System.out.println("ONLY WITH CALCULATION - There are " + (365 * 24 * 60 * 60) + " seconds in a year.");
    }
}
