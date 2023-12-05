import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] x = { 13, 46, 24, 52, 20, 9 };
        int[] sortedArray = sort(x);

        System.out.println(Arrays.toString(sortedArray));
    }
}
