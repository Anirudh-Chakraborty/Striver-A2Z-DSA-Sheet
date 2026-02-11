public class NextPermutation {
    static NextPermutation callNextPermutation = new NextPermutation();

    public static void main(String[] args) {
        int nums[] = { 1, 5, 4, 3, 2 };
        // if(1<x && x<swap)
        //

        // callNextPermutation.nextPermutation_1(nums);
        callNextPermutation.nextPermutation_2(nums);

        System.out.println();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    public void nextPermutation_1(int[] nums) {

        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i] > nums[i - 1]) {
                int temp = nums[i];
                nums[i] = nums[i - 1];
                nums[i - 1] = temp;
                return;
            }
        }

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

    }

    void nextPermutation_2(int[] nums) {
        int pivot = callNextPermutation.pivot(nums);
        if (pivot == -1) {
            reverse(0, nums);
            return;
        }

        System.out.println(nums[pivot]);
        System.out.println(pivot);

        int swap = pivot + 1;
        for (int i = nums.length - 1; i >= pivot + 1; i--) {
            if (nums[pivot] < nums[i] && nums[i]< nums[swap]) {
                swap = i;
            }
        }

        System.out.println("Swap");
        System.out.println(nums[swap]);
        System.out.println(swap);
        // swapping
        int temp = nums[pivot];
        nums[pivot] = nums[swap];
        nums[swap] = temp;

        reverse(pivot + 1, nums);

    }

    private void reverse(int start, int[] nums) {

        int left = start;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    int pivot(int[] nums) {
        int pivot = 0;
        for (int i = nums.length - 1; i >= 1; i--) {
            if (nums[i - 1] < nums[i]) {
                pivot = i - 1;
                return pivot;
            }
        }

        return -1;
    }
}
