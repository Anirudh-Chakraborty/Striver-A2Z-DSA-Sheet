public class RotateAnArray {
    static RotateAnArray callRotateAnArray = new RotateAnArray();

    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5 };
        int k = 3;

        //callRotateAnArray.rotate_1(nums, k);
        callRotateAnArray.rotate_2(nums, k);
    }

    //Method one
    public void rotate_1(int[] nums, int k) {
        int x = 0;
        k = k % nums.length; // if length = 5, k == 100, it becomes useless therefore reduced the number
        while (x < k) {
            int key = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = key;
            x++;
        }
    }

    //Method Two - Best Time Complexity
    void rotate_2(int[] nums, int k){
        int n = nums.length;
        k = k % n ;
        callRotateAnArray.reverse(nums, 0, n-1);
        callRotateAnArray.reverse(nums, 0, k-1);
        callRotateAnArray.reverse(nums, k, n-1);

        //for printing
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

    void reverse(int [] nums, int start, int end){
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
