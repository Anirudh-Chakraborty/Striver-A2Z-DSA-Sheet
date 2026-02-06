public class MaxConsecutiveOnes {
    public static void main(String[] args) {
    int nums[] = {1,0,0,1,1,1,0,0};    
        MaxConsecutiveOnes callMaxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(callMaxConsecutiveOnes.findMaxConsecutiveOnes(nums));
}

    public int findMaxConsecutiveOnes(int[] nums) {
        int k = 0;
        int a = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i]==1) {
               a++;
               if (a>k) {
                k = a;
               } 
            }else{
                a = 0;
            }
        }
        return k;
    }
}
