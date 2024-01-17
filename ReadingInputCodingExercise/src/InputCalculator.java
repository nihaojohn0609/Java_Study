import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true) {
            try {
                sum += Integer.parseInt(scanner.nextLine());
                count++;
            } catch(NumberFormatException nfe) {
                break;
            }
        }

        long avg = Math.round((double) sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        }

//    public static void inputThenPrintSumAndAverage() {
//
//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        double count = 0;    // used double so no need to cast later
//
//        while(scanner.hasNextInt()) {
//            sum += scanner.nextInt();
//            count++;
//        }
//        long avg = Math.round(sum / count);
//        System.out.println("SUM = " + sum + " AVG = " + avg);
//    }
}
