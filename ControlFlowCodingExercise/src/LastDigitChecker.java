public class LastDigitChecker {

    public static void main(String[] args) {

    }

//    public static boolean hasSameLastDigit(int x, int y, int z) {
//
//        if(x < 10 || x > 1000 || y < 10 || y > 1000 || z < 10 || z > 1000) {
//            return false;
//        } else {
//            return ((x % 10 == y % 10) || (x % 10 == z % 10) || (y % 10 == z % 10));
//        }
//    }
//
//    public static boolean isValid(int number) {
//
//        if(number < 10 || number > 1000) {
//            return false;
//        } else {
//            return true;
//        }
//    }

    public static boolean isValid(int num) {
        return (num >= 10) && (num <= 1000);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(isValid(a) && isValid(b) && isValid(c)) {
            a %= 10;
            b %= 10;
            c %= 10;
            return (a == b) || (a == c) || (b == c);
        }
        return false;
    }
}
