package sorting_algo;

import java.util.Arrays;

public class SelectionSort1 {

    public static void Ssort(int[] num) {
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // find index of minimum element
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }

            // swap after inner loop
            int temp = num[min];
            num[min] = num[i];
            num[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] num = {2, 3, 1, 5, 4};
        Ssort(num);
        System.out.println(Arrays.toString(num));
    }
}
