public class AllFactors {

    public static void main(String[] args) {

    }

//    public static void printFactors(int number) {
//
//        if(number < 1) {
//            System.out.println("Invalid Value");
//        }
//        for(int i = 1; i <= number; i++) {
//            if(number % i == 0) {
//                System.out.println(i + "");
//            }
//        }
//    }

    public static void printFactors(int number) {

        if(number < 1) {
            System.out.println("Invalid Value");
        }

        int i = 0;
        while(i < number) {
            i++;
            if(number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
