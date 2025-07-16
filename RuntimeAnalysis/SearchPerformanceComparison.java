import java.util.Arrays;
import java.util.Random;

public class SearchPerformanceComparison {
    
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        Random random = new Random();
        
        for (int size : sizes) {
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(size * 2);
            }
            
            int target = arr[size / 2];
            
            // Linear Search
            long startTime = System.nanoTime();
            linearSearch(arr, target);
            long linearTime = System.nanoTime() - startTime;
            
            // Binary Search (with sorting)
            startTime = System.nanoTime();
            Arrays.sort(arr);
            binarySearch(arr, target);
            long binaryTime = System.nanoTime() - startTime;
            
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search: " + (linearTime / 1_000_000.0) + " ms");
            System.out.println("Binary Search: " + (binaryTime / 1_000_000.0) + " ms");
            System.out.println();
        }
    }
}