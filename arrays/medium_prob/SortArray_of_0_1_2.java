package arrays.medium_prob;
public class SortArray_of_0_1_2 {

    //Optimal
    public static void sort(int[] arr){
        int low = 0 , mid = 0 , high = arr.length-1;

        while (mid < high) {
            if(arr[mid]==0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                  int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }


    // brute
    public void sortZeroOneTwo(int[] nums) {
  int n = nums.length;
    int zero = 0, one = 0, two = 0;

   
    for (int i = 0; i < n; i++) {
        if (nums[i] == 0) zero++;
        else if (nums[i] == 1) one++;
        else two++;
    }

    
    int i = 0;
    while (i < n) {
        if (zero > 0) {
            nums[i] = 0;
            zero--;
        } else if (one > 0) {
            nums[i] = 1;
            one--;
        } else {
            nums[i] = 2;
            two--;
        }
        i++;
    }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
    }
}
}