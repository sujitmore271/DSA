package Stacks_Queues.Monotonic_Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class NextGreaterElement {
    static int[] nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = n-1 ; i >= 0 ; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                nge[i] = -1;
            }else{
                nge[i] = stack.peek();
            }
            stack.push(arr[i]);

        }
        return nge;

    }
    public static void main(String[] args) {
       int[] arr = {1, 2, 4, 3};

        int[] result = nextGreaterElement(arr);

        System.out.println(Arrays.toString(result));
    }
}
