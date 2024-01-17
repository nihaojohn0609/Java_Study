public class FirstAndLastDigitSum {

    public static void main(String[] args) {

    }

//    public static int sumFirstAndLastDigit(int number) {
//
//        if(number < 0) {
//            return -1;
//        }
//
//        int lastDigit = number % 10;
//        while(number > 9) {
//            number /= 10;
//        }
//        return lastDigit + number;
//    }

    public static int sumFirstAndLastDigit(int number) {

        if(number >= 0) {
            int sum = 0;
            for(int i = number; i != 0; i /= 10) {
                int lastDigit = number % 10;
                sum = lastDigit + i;
            }
            return sum;
        }
        return -1;
    }
}
