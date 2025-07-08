import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i);
        }
        
        return null;
    }
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        System.out.println("Array: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println("\nTarget: " + target);
        
        int[] result = twoSum(nums, target);
        
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No solution found");
        }
        
        // Test with another example
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println("\nTest 2 - Array: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println("\nTarget: " + target2);
        
        int[] result2 = twoSum(nums2, target2);
        if (result2 != null) {
            System.out.println("Indices: " + result2[0] + ", " + result2[1]);
            System.out.println("Values: " + nums2[result2[0]] + " + " + nums2[result2[1]] + " = " + target2);
        }
    }
}