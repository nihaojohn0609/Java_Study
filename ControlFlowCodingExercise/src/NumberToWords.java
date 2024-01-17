public class NumberToWords {

    public static void main(String[] args) {

    }

//    public static void numberToWords(int number) {
//
//        if (number < 0) {
//            System.out.print("Invalid Value");
//        }
//
//        int count = getDigitCount(number);
//        number = reverse(number);
//        for (int i = 0; i < count; i++) {
//            int lastDigit = number % 10;
//            switch (lastDigit) {
//                case 0:
//                    System.out.print("Zero ");
//                    break;
//                case 1:
//                    System.out.print("One ");
//                    break;
//                case 2:
//                    System.out.print("Two ");
//                    break;
//                case 3:
//                    System.out.print("Three ");
//                    break;
//                case 4:
//                    System.out.print("Four ");
//                    break;
//                case 5:
//                    System.out.print("Five ");
//                    break;
//                case 6:
//                    System.out.print("Six ");
//                    break;
//                case 7:
//                    System.out.print("Seven ");
//                    break;
//                case 8:
//                    System.out.print("Eight ");
//                    break;
//                case 9:
//                    System.out.print("Nine ");
//                    break;
//                default:
//                    break;
//            }
//            number /= 10;
//        }
//    }
//
//
//    public static int reverse(int number) {
//
//        int reverse = 0;
//        int lastDigit = 0;
//
//        int num = number;
//        while(num != 0) {
//
//            lastDigit = num % 10;
//            reverse *= 10;
//            reverse += lastDigit;
//            num /= 10;
//        }
//        return reverse;
//    }
//
//    public static int getDigitCount(int number) {
//
//        if (number < 0) {
//            return -1;
//        }
//        int count = 1;
//
//        while (number > 9) {
//            number /= 10;
//            count++;
//        }
//        return count;
//    }

//    public static void numberToWords(int number) {
//
//        if(number < 0) {
//            System.out.print("Invalid Value");
//        }
//
//        int count = getDigitCount(number);
//        number = reverse(number);
//        for(int i = 0; i < count; i++) {
//            int digit = number % 10;
//            switch(digit) {
//                case 0:
//                    System.out.print("Zero ");
//                    break;
//                case 1:
//                    System.out.print("One ");
//                    break;
//                case 2:
//                    System.out.print("Two ");
//                    break;
//                case 3:
//                    System.out.print("Three ");
//                    break;
//                case 4:
//                    System.out.print("Four ");
//                    break;
//                case 5:
//                    System.out.println("Five ");
//                    break;
//                case 6:
//                    System.out.println("Six ");
//                    break;
//                case 7:
//                    System.out.println("Seven ");
//                    break;
//                case 8:
//                    System.out.println("Eight ");
//                    break;
//                case 9:
//                    System.out.println("Nine ");
//                    break;
//                default:
//                    break;
//            }
//            number /= 10;
//        }
//    }
//
//    public static int reverse(int number) {
//        int num = (number < 0) ? number * -1 : number;
//        StringBuilder forwardSB = new StringBuilder(Integer.toString(num));
//        int reverse = Integer.parseInt(forwardSB.reverse().toString());
//        return (number < 0) ? reverse * -1 : reverse;
//    }
//
//    public static int getDigitCount(int number) {
//        return (number < 0) ? -1 : Integer.toString(number).length();
//    }

//    public static void numberToWords(int number) {
//        int reverseNum = reverse(number);
//        int count = getDigitCount(number);
//
//        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six",
//                "Seven", "Eight", "Nine", "Invalid Value"};
//        if(number >= 0) {
//            for(; count > 0; count--, reverseNum /= 10) {
//
//                System.out.print(words[reverseNum % 10] + " ");
//            }
//        } else {
//            System.out.print(words[10]);
//        }
//        System.out.println();
//    }
//
//    public static int getDigitCount(int number) {
//        return (number < 0) ? -1 : Integer.toString(number).length();
//    }
//
//    public static int reverse(int number) {
//
//        String str = "" + ((number < 0) ? number * -1 : number);
//        StringBuilder strNumber = new StringBuilder(str);
//        int reverseNum = Integer.parseInt(strNumber.reverse().toString());
//        return (number < 0) ? reverseNum * -1 : reverseNum;
//    }

    public static void numberToWords(int number) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Invalid Value"};

        if(number >= 0) {
            String numStr = Integer.toString(number);
            for(int i = 0; i < numStr.length(); i++) {
                System.out.print(words[Character.getNumericValue(numStr.charAt(i))] + " ");
            }
        } else {
            System.out.print(words[10]);    // catch all to print "Invalid Value"
        }
        System.out.println();   // print carriage return so cursor prompt on new line
    }
}
