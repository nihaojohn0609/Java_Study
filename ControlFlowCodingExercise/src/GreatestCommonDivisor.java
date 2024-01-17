public class GreatestCommonDivisor {

    public static void main(String[] args) {

    }

//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//
//        int biggerNumber = first > second ? first : second;
//        int smallerNumber = first > second ? second : first;
//        int divisor = smallerNumber;
//
//        while (divisor > 0) {
//            if (biggerNumber % divisor == 0 && smallerNumber % divisor == 0) {
//                return divisor;
//            }
//            divisor--;
//        }
//        return 0;
//    }
// }

//    public static int getGreatestCommonDivisor(int first, int second) {
//        if(first >= 10 && second >= 10) {
//            int min = first > second ? first : second;  // or Math.min(first, second);
//            int divisor = 0;
//            for(int i = min; i > 1; i--) {
//                if(first % i == 0 && second % i == 0) {
//                    return divisor = i;
//                }
//            }
//        }
//        return -1;
//    }
    
    // Euclid's Algorithm

    public static int getGreatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }
        while (first != second) {
            if (first > second) {
                first -= second;
            } else {
                second -= first;
            }
        }
        return first;
    }
}
