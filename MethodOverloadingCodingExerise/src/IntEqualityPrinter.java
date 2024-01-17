public class IntEqualityPrinter {

    public static void main(String[] args) {

    }

    public static void printEqual(int x, int y, int z) {

        System.out.println((x < 0) || (y < 0) || (z < 0) ? "Invalid Value" : (x == y && x == z) ? "All numbers are equal" : (x != y && x != z && y != z) ?
                "All numbers are different" : "Neither all are equal or different");

//        if(x < 0 || y < 0 || z < 0) {
//            System.out.println("Invalid Value");
//        } else if(x == y && x == z) {
//            System.out.println("All numbers are equal");
//        } else if(x != y && x != z && y != z) {
//            System.out.println("All numbers are different");
//        } else {
//            System.out.println("Neither all are equal or different");
//        }
    }
}
