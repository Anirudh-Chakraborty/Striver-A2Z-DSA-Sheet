public class SubarraySumsEqualsK {
    public static void main(String[] args) {
        int nums [] = {1,2,3};
        int k = 3;

        SubarraySumsEqualsK callEqualsK = new SubarraySumsEqualsK();
        System.out.println(callEqualsK.subarraySum(nums, k));
    }

    private int subarraySum(int [] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i; j<nums.length; j++){
                sum+=nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}
