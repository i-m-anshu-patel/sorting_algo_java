import java.util.Arrays;

public class MergeSort {
    public static void divide(int arr[], int startingIndex, int endingIndex) {
        if (startingIndex == endingIndex) {
            return;
        }
        int middleIndex = (startingIndex + endingIndex) / 2;
        divide(arr, startingIndex, middleIndex);
        divide(arr, middleIndex + 1, endingIndex);
        conquer(arr, startingIndex, middleIndex, endingIndex);
    }

    public static void conquer(int arr[], int startingIndex, int middleIndex, int endingIndex) {
        int merged[] = new int[endingIndex - startingIndex + 1];
        int indexOfFirstArray = startingIndex;
        int indexOfSecondArray = middleIndex + 1;
        int x = 0;
        while (indexOfFirstArray <= middleIndex && indexOfSecondArray <= endingIndex) {
            if (arr[indexOfFirstArray] <= arr[indexOfSecondArray]) {
                merged[x++] = arr[indexOfFirstArray++];
            } else {
                merged[x++] = arr[indexOfSecondArray++];
            }
        }

        while (indexOfFirstArray <= middleIndex) {
            merged[x++] = arr[indexOfFirstArray++];
        }
        while (indexOfSecondArray <= endingIndex) {
            merged[x++] = arr[indexOfSecondArray++];
        }
        for (int i = 0, j = startingIndex; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void main(String args[]) {
        int[] x = { 4, 6, 2, 5, 7, 9, 1, 3 };
        divide(x, 0, x.length - 1);
        System.out.println(Arrays.toString(x));
    }
}
