public class EvenDigitSum {

    public static void main(String[] args) {

    }

    public static int getEvenDigitSum(int number) {

        if(number < 0) {
            return -1;
        }

        int sum = 0;

        while(number != 0) {
            int remainder = number % 10;
            number /= 10;
            if(remainder % 2 == 0) {
                sum += remainder;
            }
        }
        return sum;
    }

//    public static int getEvenDigitSum (int number){
//
//        if (number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        int remainder = 0;
//        while (number != 0) {
//            remainder = number % 10;
//            sum += (remainder % 2 == 0) ? remainder : 0;
//            number /= 10;
//        }
//        return sum;
//    }
}
