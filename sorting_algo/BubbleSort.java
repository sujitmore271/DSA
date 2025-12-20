package sorting_algo;

import java.util.Arrays;

public class BubbleSort {

    public static void BSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-1-i ; j++){
                if(arr[j+1] < arr[j]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,4,2,5,3,7};
        BSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
