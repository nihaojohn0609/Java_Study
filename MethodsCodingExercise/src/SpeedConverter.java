public class SpeedConverter {

    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour) {
//        if(kilometersPerHour < 0) {
//            return -1;
//        } else {
//            return Math.round(kilometersPerHour / 1.609);
//        }
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
//        if (kilometersPerHour < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
//        }
//    }
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}