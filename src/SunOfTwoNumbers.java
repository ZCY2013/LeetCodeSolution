import java.util.HashMap;
import java.util.Map;

public class SunOfTwoNumbers {
    public static void main(String[] args) {
        int[] array = {0,4,3,0};
        int tar = 0;
        SunOfTwoNumbers sotn = new SunOfTwoNumbers();
        for(int i : sotn.twoSum(array, tar)){
            System.out.println(i);
        }
    }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int save = target - nums[i];
            if(map.containsKey(save))
            {
                return new int[]{map.get(save),i};
            }else{
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No solution could be found");
    }
}
