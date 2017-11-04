public class Time {
    public static void main(String args[]) {
        int hour = 22, minute = 55, second = 7,
                hrMidnight = 24 - hour, minMidnight = 60 - minute, secMidnight = 60 - second;
        System.out.print("It is ");
        System.out.print(hrMidnight + " hours, " + minMidnight + " minutes, and " + secMidnight);
        System.out.print(" seconds to midnight.");
    }
}