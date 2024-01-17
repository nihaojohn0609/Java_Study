import java.util.Arrays;

public class ReverseArray {

    private static void reverse(int[] array) {

        int maxIndex = array.length-1;
        int halfLength = array.length / 2;
        System.out.print("Array = " + Arrays.toString(array));
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("Reversed Array = " + Arrays.toString(array));

//        int first = 0;
//        int last = array.length-1;
//        System.out.print("Array = " + Arrays.toString(array));
//        while(last > first) {
//            int temp = array[first];
//            array[first] = array[last];
//            array[last] = temp;
//            first++;
//            last--;
//        }
//        System.out.println("Reversed Array = " + Arrays.toString(array));

//        System.out.print("Array = " + Arrays.toString(array));
//        for(int first = 0, last = array.length-1; last > first; first++, last--) {
//            int temp = array[first];
//            array[first] = array[last];
//            array[last] = temp;
//        }
//        System.out.println("Reversed Array = " + Arrays.toString(array));
    }
}
