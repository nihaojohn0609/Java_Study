import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        int min = scanner.nextInt();
        scanner.close();
        return min;
    }

    private static int[] readElements(int array) {
        Scanner scanner = new Scanner(System.in);
        int[] elements = new int[array];
        for(int i = 0; i < elements.length; i++) {
            int enter = scanner.nextInt();
            elements[i] = enter;
        }
        return elements;

    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;
        for(int el : array) {
            if(el < min) {
                min = el;
            }
        }
        return min;

//        int[] sorted = Arrays.copyOf(array, array.length);
//        int temp;
//        boolean flag = true;
//        while(flag) {
//            flag = false;
//            for (int i = 0; i < sorted.length - 1; i++) {
//                if (sorted[i] < sorted[i+1]) {
//                    temp = sorted[i];
//                    sorted[i] = sorted[i+1];
//                    sorted[i+1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        return sorted[sorted.length-1];
    }
}
