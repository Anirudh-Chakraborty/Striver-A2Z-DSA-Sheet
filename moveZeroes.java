public class moveZeroes {
    public static void main(String[] args) {
        //int[] nums = { 0, 1, 0, 3,0,1,4,5,0,9,0,0, 12 };
        int nums [] = {0,0,1};
        moveZeroes callMoveZeroes = new moveZeroes();
        callMoveZeroes.moveZeroes(nums);
        callMoveZeroes.moveZeroes_2(nums);
        for (int i : nums) {
            System.out.println(i);
        }
    }

    public void moveZeroes(int[] nums) {
            int k = 0;
            
        for (int i = 0; i < nums.length - 1-k; i++) {
            boolean bool = false;
            for (int j = 0; j < nums.length - 1-k; j++) {
                if (nums[j] == 0) {
                    bool = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (bool== true) {
                k++;
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }
    }

    // 0, 1, 0, 3,0,1,4,5,0,9,0,0, 12 ;
    void moveZeroes_2(int nums[]){
     int k = 0;
        for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 0) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
        k++;
    }
    }
}
}