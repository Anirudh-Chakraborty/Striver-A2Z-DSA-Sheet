import java.util.ArrayList;
import java.util.List;

public class RearrangeElementSign {
  public static void main(String[] args) {
    int nums[] = {1,2,3,-3,-4,-5,-2,8};
    rearrangeArray(nums);
} 
  
  public static int[] rearrangeArray(int[] nums) {
    List<Integer> list_positive = new ArrayList<>();
List<Integer> list_negetive = new ArrayList<>();
    
    for(int i = 0; i< nums.length; i++){
        if (0 <=nums[i]) {
            list_positive.add(nums[i]);
        }
        else{
            list_negetive.add(nums[i]);
        }
    }
    int positive = 0;
    int negetive = 0;
    for(int i = 0; i< nums.length; i++){
        if (i % 2 == 0) {
            nums[i] = list_positive.get(positive);
            positive++; 
        }
        else{
            nums[i] = list_negetive.get(negetive);
            negetive++;
        }
    }

        return nums;
    }


}
