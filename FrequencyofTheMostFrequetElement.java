import java.util.Arrays;

public class FrequencyofTheMostFrequetElement {
    public static void main(String[] args) {
        int nums [] = {3,9,6};
        int k = 2;

        System.out.println(maxFrequency(nums, k));
    }
    public static int maxFrequency(int[] nums, int k) {
     
        int greatest = nums[0];
        int maxFrequency = 0;
        for(int i = 0; i<nums.length; i++){
            if (nums[i]>greatest) {
                greatest = nums[i];
            }
        }
        System.out.println(greatest + "Is the Greatest");
    
        for(int i = 0; i< nums.length; i++){
            if (greatest - nums[i] <= k) {
               nums[i] = nums[i] + (greatest - nums[i]);
               k = k - (greatest- nums[i]); 
            }
        }

        for(int i = 0; i<nums.length; i++){
            if (nums[i]==greatest) {
                maxFrequency++;
            }
        }

        // while (k>=0) {
        //     for(int i = 0; i<nums.length; i++){

        //     }
        // }

        //Mistake -- 

        System.out.println(Arrays.toString(nums));
        return maxFrequency;
    }
}
