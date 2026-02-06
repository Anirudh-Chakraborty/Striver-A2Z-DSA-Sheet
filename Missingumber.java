import java.util.Arrays;

public class Missingumber {
    public static void main(String[] args) {
        int nums[] = {0,1};
        //{ 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        Missingumber callMissingumber = new Missingumber();
        System.out.println(callMissingumber.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (nums[0] != 0) {
            return 0;
        }
        if (nums[n - 1] != n) {
            return n;
        }
        int a = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] + 1 != nums[i + 1]) {
                a = nums[i] + 1;

            }

        }
        return a;
    }
}
