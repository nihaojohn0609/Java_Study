public class PerfectNumber {

    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int number) {

        if(number < 1) {
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return number == sum;
    }

//    public static boolean isPerfectNumber(int number) {
//
//        int sum = 0;
//        for(int i = 1; i < number / 2; i++) { // loop only half of number
//            if(number % i == 0) {
//                sum += i;
//            }
//        }
//        return  number == sum && number > 1;
//    }

//    public static boolean isPerfectNumber(int number) {
//
//        if(number < 1) {
//            return false;
//        }
//        int sum = 1;
//        for(int i = 2; i < Math.sqrt(number); i++) {
//            if(number % i == 0) {
//                sum += (i + number / i);
//            }
//        }
//        return sum == number;
//    }
}
