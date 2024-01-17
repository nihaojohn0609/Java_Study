public class LargestPrime {

    public static void main(String[] args) {

    }

//    public static int getLargestPrime(int number) {
//
//        while (number < 2) {
//            return -1;
//        }
//
//        for(int i = 2; i < number; i++) { // can optimize with i <= number / 2
//            if(number % i == 0) {
//                number /= i;
//                i--;  // neutralize the i++ increment to check i again
//            }
//        }
//        return number;
//    }

//    public static int getLargestPrime(int number) {
//        if(number < 2) {
//            return -1;
//        }
//        int i = 2;
//        while(i <= number / 2) {    // optimized loop
//            if(number % i == 0) {
//                number /= i;    // assign number as the opposite pair of i, so number = number / i
//                continue;   // don't increment if testing new number is divisible
//            }
//            i++;    // increment only if no divisor found
//        }
//        return number;
//    }

//    public static int getLargestPrime(int number) {
//        if(number <= 1) {
//            return -1;
//        }
//        for(int i = 2; i <= number / 2; i++) {
//            if(number % i == 0) {
//                number = getLargestPrime(number / i);   // recursion, call itself
//            }
//        }
//        return number;
//    }

//    public static int getLargestPrime(int number) {
//        if(number <= 1) {
//            return -1;
//        }
//        for(int i = number-1; i >= 2; i--) {
//            if(number % i == 0) {
//                number = i;
//            }
//        }
//        return number;
//    }

    public static int getLargestPrime(int number) {
        if(number <= 1) {
            return -1;
        }
        for(int i = number / 2; i >= 2; i--) {  // optimized, start at number / 2
            if(number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}
