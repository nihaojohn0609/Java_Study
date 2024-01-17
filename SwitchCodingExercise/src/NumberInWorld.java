public class NumberInWorld {

    public static void main(String[] args) {

    }

    public static void printNumberInWorld(int number) {

        String parameterNumber = switch(number) {
            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "other";
        };
        System.out.println(parameterNumber);
    }

//    public static void printNumberInWord(int number){
//        switch(number){
//            case 0:
//                System.out.println("ZERO");
//                break;
//            case 1:
//                System.out.println("ONE");
//                break;
//            case 2:
//                System.out.println("TWO");
//                break;
//            case 3:
//                System.out.println("THREE");
//                break;
//            case 4:
//                System.out.println("FOUR");
//                break;
//            case 5:
//                System.out.println("FIVE");
//                break;
//            case 6:
//                System.out.println("SIX");
//                break;
//            case 7:
//                System.out.println("SEVEN");
//                break;
//            case 8:
//                System.out.println("EIGHT");
//                break;
//            case 9:
//                System.out.println("NINE");
//                break;
//            default:
//                System.out.println("OTHER");
//                break;
//        }
//
//    }
//    public static void printNumberInWord(int number){
//        if (number == 0){
//            System.out.println("ZERO");
//        } else if (number == 1){
//            System.out.println("ONE");
//        } else if (number == 2){
//            System.out.println("TWO");
//        } else if (number == 3){
//            System.out.println("THREE");
//        } else if (number == 4){
//            System.out.println("FOUR");
//        } else if (number == 5){
//            System.out.println("FIVE");
//        } else if (number == 6){
//            System.out.println("SIX");
//        } else if (number == 7){
//            System.out.println("SEVEN");
//        } else if (number == 8){
//            System.out.println("EIGHT");
//        } else if (number == 9){
//            System.out.println("NINE");
//        } else
//            System.out.println("OTHER");
//    }
}
