package Stacks_Queues.Monotonic_Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement2 {
    public static int[] greaterElement2Brute(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];

        for(int i = 0 ; i < n ; i++){
            nge[i] = -1;
            for(int step = 1 ; step < n ; step++){
                int j = (step+i)%n;

                if(arr[j] > arr[i]){
                    nge[i] = arr[j];
                    break;
                }
            }
        }
        return nge;
    }

    static int[] greaterElement2Optimal(int[] arr){
        int n = arr.length;
        int[] nge = new  int[n];

        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 2*n-1 ; i >= 0 ; i--){

            while(!stack.isEmpty() && stack.peek() <= arr[i%n]){
                stack.pop();
            }

            if(i < n){
                nge[i] = stack.isEmpty() ? -1 : stack.peek();
            }

            stack.push(arr[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2};
        System.out.println(Arrays.toString(greaterElement2Optimal(arr)));
    }
}
