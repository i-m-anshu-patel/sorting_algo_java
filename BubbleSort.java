import java.util.Arrays;

public class BubbleSort {
     public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
         for(int j = 0; j < array.length - i -1; j++){
            if (array[j]>array[j+1]) {
                int temp = array[j+1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
    }
        return array;
    }

    public static void main(String[] args) {
        int[] x = { 13, 46, 24, 52, 20, 9 };
        int[] sortedArray = sort(x);

        System.out.println(Arrays.toString(sortedArray));
    }
}
