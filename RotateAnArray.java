public class RotateAnArray {
    public static void main(String[] args) {
        int nums[] = { 2, 3, 4, 5 };
        int k = 3;

        RotateAnArray callRotateAnArray = new RotateAnArray();
        callRotateAnArray.rotate(nums, k);
    }

    public void rotate(int[] nums, int k) {
        int x = 0;

        while (x < k) {
            int key = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = key;
            x++;

            // for printing
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println("After Printing" + x + "times");

        }

    }
}
