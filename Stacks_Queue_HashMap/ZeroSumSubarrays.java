import java.util.*;

public class ZeroSumSubarrays {
    
    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;
        
        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }
            
            sumMap.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        List<int[]> subarrays = findZeroSumSubarrays(arr);
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Zero sum subarrays:");
        for (int[] subarray : subarrays) {
            System.out.println("From index " + subarray[0] + " to " + subarray[1]);
        }
    }
}