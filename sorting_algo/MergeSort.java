package sorting_algo;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    class Solution{

        public static void realMerge(int arr[], int low , int mid , int high){
            ArrayList<Integer> temp = new ArrayList<>();
            int left = low ;
            int right = mid+1;    
            
            while (left <= mid && right <= high ) {
                    if(arr[left] < arr[right]){
                            temp.add(arr[left]);
                            left++;
                    }
                    else {
                        temp.add(arr[right]);
                        right++;
                    }
                }

            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }
             while(right <= high){
                temp.add(arr[right]);
                right++;
            }


            for(int i = low ; i<= high ; i++){
                arr[i] = temp.get(i-low);
            }

        }



        public static void realSort(int arr[],int low , int high){

             int mid = (low + high)/2;
            if(low >= high) return ;
            realSort(arr, low, mid);
            realSort(arr, mid+1 , high);
            realMerge(arr,low, mid , high);

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Solution.realSort(arr, 0, n-1);
        System.out.println("array after sorting");
         for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
