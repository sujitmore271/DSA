package sorting_algo;
import java.util.Arrays;

public class QuickSort {
    class Solution{

        public static int partition(int[] arr, int low, int high) {
    int pivot = arr[low]; // Corrected: Use low, not 0
    int i = low;
    int j = high;

    while (i < j) {
        // Find the first element GREATER than pivot
        while (arr[i] <= pivot && i <= high - 1) {
            i++;
        }
        // Find the first element SMALLER than pivot
        while (arr[j] > pivot && j >= low + 1) {
            j--;
        }
        if (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    // Swap pivot into its correct place
    int temp = arr[low];
    arr[low] = arr[j];
    arr[j] = temp;

    return j; // This is the partition index
}

public static void qsort(int[] arr, int low, int high) {
    if (low < high) {
        int pIndex = partition(arr, low, high);
        qsort(arr, low, pIndex - 1);
        qsort(arr, pIndex + 1, high); // Corrected: pIndex is already sorted
    }
}
    
    }
    public static void main(String[] args) {
        int[] A = {9,4,2,3,1,6,8,7,5};
        Solution.qsort(A, 0, A.length-1);

        System.out.println(Arrays.toString(A));

    }
}
