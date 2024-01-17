public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

    }

    public static void printYearsAndDays(long minutes) {
        System.out.println((minutes < 0) ? "Invalid Value" : (minutes + " min = " + minutes / (60 * 24 * 365) + " y and " + minutes / (60 * 24) % 365 + " d"));

//        if(minutes < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            long years = minutes / 525600;
//            long days = (minutes / 1440) % 365;
//
//            System.out.println(minutes + " min = " + years + " y and " + days + " d");
//        }
    }
}
