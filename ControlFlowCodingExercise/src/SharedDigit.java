public class SharedDigit {

    public static void main(String[] args) {

    }

//    public static boolean hasSharedDigit(int x, int y) {
//
//        if(x < 10 || x > 99 || y < 10 || y > 99) {
//            return false;
//        } else {
//            return ((x / 10 == y / 10) || (x / 10 == y % 10) || (x % 10 == y / 10) || (x % 10 == y % 10));
//        }
//    }

    public static boolean hasSharedDigit(int n1, int n2) {
        if (n1 < 10 || n2 < 10 || n1 > 99 || n2 > 99) return false;

        int i, n1_digit;
        while (n1 != 0) {
            i = n2;
            n1_digit = n1 % 10;
            while (i != 0) {
                if (n1_digit == i % 10) {
                    System.out.println("Shared digit = " + n1_digit);
                    return true;
                }
                i /= 10;
            }
            n1 /= 10;
        }
        return false;
    }
}
