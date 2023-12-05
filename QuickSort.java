import java.util.Arrays;

public class QuickSort {

    public static int partition(int[] array, int low, int high) {
        int pivot = array[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (array[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (array[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp2 = array[low];
        array[low] = array[j];
        array[j] = temp2;
        return j;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(array, low, high);
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] x = { 4, 6, 2, 5, 7, 9, 1, 3 };
        quickSort(x, 0, x.length - 1);
        System.out.println(Arrays.toString(x));
    }

}
