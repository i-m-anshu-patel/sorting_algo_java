import java.util.Arrays;
//its all about selecting the smallest and swapping it
public class SelectionSort {
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] x = { 13, 46, 24, 52, 20, 9 };
        int[] sortedArray = sort(x);

        System.out.println(Arrays.toString(sortedArray));
    }
}
