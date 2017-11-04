public class Zool {
    /**
     * zool is a method to print your various thoughts
     * @param x -> the thought index
     * @param y -> your first pet
     * @param z -> the street you grew up on
     */
    static void zool(int x, String y, String z) {
        System.out.println(x + ". " + y + " and " + z);
    }

    /**
     * printAmerican is a method to print the date in American format
     * @param day -> the current day (e.g - Saturday)
     * @param month -> the current month
     * @param date -> the current day of the month (e.g - 13)
     * @param year -> the current year
     */
    static void printAmerican(String day, String month, int date, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    /**
     * printEuropean is a method to print the date in European format
     * @param day -> the current day (e.g - 13)
     * @param month -> the current month
     * @param year -> the current year
     */
    static void printEuropean(int day, String month, int year) {
        System.out.println(day + " " + month + ", " + year);
    }
    public static void main(String[] args) {
        zool(11, "Dory", "D");
        printAmerican("Sunday", "October", 29, 2017);
        printEuropean(29, "October", 2017);
    }
}