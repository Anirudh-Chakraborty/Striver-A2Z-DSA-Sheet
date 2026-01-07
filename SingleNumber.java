import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int nums[] = {1,2,3,2,3,4,6,5,1,6,5,5};
        SingleNumber callSingleNumber = new SingleNumber();
        System.out.println(callSingleNumber.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int k = 0;
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums[k]!=nums[k+1]) {
                return nums[k];
            }
        k++;
        if (nums[nums.length-2]!=nums[nums.length-1]) {
            return nums[nums.length-1];
        }

        while (k < nums.length-1) {
            if (nums[k-1]!=nums[k] && nums[k]!=nums[k+1]) {
                return nums[k];
            }
            k++;
        }

        return -1;
    }
}
