import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    
    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        
        int maxLength = 0;
        
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;
                
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        
        return maxLength;
    }
    
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        
        System.out.println("Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        int result = longestConsecutive(nums);
        System.out.println("\nLongest consecutive sequence length: " + result);
        
        // Test with another array
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("\nArray 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
        System.out.println("\nLongest consecutive sequence length: " + longestConsecutive(nums2));
    }
}