import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    
    public static void insertionSort(int[] employeeIDs) {
        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];
            int j = i - 1;
            
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }
            employeeIDs[j + 1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] employeeIDs = {1045, 1002, 1078, 1001, 1056, 1023, 1089, 1012};
        
        System.out.println("Original Employee IDs: " + Arrays.toString(employeeIDs));
        
        insertionSort(employeeIDs);
        
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }
}