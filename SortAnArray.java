import java.util.*;

public class SortAnArray {

    public static void main(String[] args) {
        int nums[] = { 15, 12, 7, 8, 3 };

        System.out.println(sortArray_Bubble(nums));
        System.out.println(sortArray_Insertion(nums));
    }

    public static int[] sortArray_Bubble(int[] nums) {
        // Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            boolean swaped = false;
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swaped = true;
                }
            }
            if (!swaped) {
                break;
            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return nums;
    }

    public static int[] sortArray_Insertion(int[] nums){
        
        for(int i = 1; i< nums.length; i++){
            int key = nums[i];
            int j = i-1;

            while (j>=0 && nums[j]>key) {
                nums[j+1] = nums[j];
                j--;
            }

            nums[j+1] = key;
        }


        for(int i = 0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
        
        return nums;
    }

}
