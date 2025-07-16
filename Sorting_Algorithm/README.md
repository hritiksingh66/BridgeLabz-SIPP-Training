# Sorting Algorithms

Sorting is a fundamental operation in computer science that organizes elements in a particular order (ascending or descending). Java provides various sorting algorithms, each suited for different scenarios.

## 1. Bubble Sort

Bubble Sort is a simple sorting algorithm that repeatedly compares adjacent elements and swaps them if they are in the wrong order.

### Concept:
- Repeatedly swaps adjacent elements if they are in the wrong order
- The largest element bubbles to the end in each iteration

### Working Mechanism:
1. Start at the beginning of the array and compare the first two elements
2. If the first element is greater than the second, swap them
3. Move to the next adjacent pair and repeat the comparison and swapping process
4. After completing one full pass, the largest element "bubbles up" to its correct position
5. Repeat the process for the remaining unsorted elements until no swaps are needed

### Performance Analysis:
- **Best Case (Already Sorted)**: O(n) - One pass without swaps
- **Average Case**: O(n²) - Nested loops for comparison and swapping
- **Worst Case (Reverse Sorted)**: O(n²)
- **Space Complexity**: O(1) - In-place sorting
- **Stability**: Stable - Preserves the order of equal elements

### Use Cases:
- Suitable for small datasets or when elements are nearly sorted
- Not efficient for large datasets due to quadratic time complexity

### Code:
```java
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Optimization: Stop if no swaps occurred
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## 2. Insertion Sort

Insertion Sort works by building a sorted portion of the array one element at a time by picking an element and inserting it at the correct position within the sorted portion.

### Concept:
- Builds the sorted array one element at a time
- Works efficiently for small and nearly sorted arrays

### Working Mechanism:
1. Consider the first element as sorted
2. Pick the next element and compare it with the elements in the sorted portion
3. Shift elements in the sorted portion to make space for the new element
4. Insert the picked element into its correct position
5. Repeat this process until all elements are sorted

### Performance Analysis:
- **Best Case (Already Sorted)**: O(n) - Minimal shifts required
- **Average Case**: O(n²) - Nested loops for insertion
- **Worst Case (Reverse Sorted)**: O(n²)
- **Space Complexity**: O(1) - In-place sorting
- **Stability**: Stable - Maintains the order of equal elements

### Use Cases:
- Efficient for small datasets or nearly sorted arrays (adaptive sorting)
- Used in scenarios where insertions happen frequently, such as real-time systems

### Code:
```java
public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            // Move elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## 3. Merge Sort (Divide and Conquer)

Merge Sort follows the Divide and Conquer approach, where an array is recursively divided into two halves, sorted individually, and merged back together.

### Concept:
- Divides the array into two halves, sorts them recursively, and merges them
- Stable sorting algorithm

### Working Mechanism:
1. **Divide**: Split the array into two halves until each sub-array contains a single element
2. **Conquer**: Recursively sort both halves
3. **Merge**: Merge the two sorted halves by comparing elements and placing them in the correct order

### Performance Analysis:
- **Best Case**: O(n log n) - Always splits the array into halves
- **Average Case**: O(n log n) - Consistent performance across cases
- **Worst Case**: O(n log n)
- **Space Complexity**: O(n) - Extra space required for merging
- **Stability**: Stable - Maintains the order of equal elements

### Use Cases:
- Suitable for large datasets due to predictable O(n log n) time complexity
- Used in applications where stability is required, such as sorting linked lists
- Preferred when sorting datasets that cannot be modified in-place

### Code:
```java
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }
        while (i < n1) arr[k++] = leftArr[i++];
        while (j < n2) arr[k++] = rightArr[j++];
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## 4. Quick Sort (Divide and Conquer)

Quick Sort is another Divide and Conquer algorithm that selects a pivot element, partitions the array around it, and recursively sorts the left and right sub-arrays.

### Concept:
- Picks a pivot, partitions the array, and sorts recursively
- Efficient for large datasets

### Working Mechanism:
1. **Choose a Pivot**: Select an element (commonly the last element, first element, or a random element)
2. **Partition**: Rearrange elements such that elements smaller than the pivot move to the left, and elements greater than the pivot move to the right
3. **Recursive Sorting**: Apply Quick Sort on the left and right partitions
4. The process continues until the entire array is sorted

### Performance Analysis:
- **Best Case**: O(n log n) - Balanced partitions
- **Average Case**: O(n log n) - Efficient for random distributions
- **Worst Case (Already Sorted or Reverse Sorted)**: O(n²) - Occurs if poor pivot selection leads to unbalanced partitions
- **Space Complexity**: O(log n) - Recursive stack space
- **Stability**: Not stable - Swapping may change the relative order of equal elements

### Use Cases:
- Suitable for large datasets, particularly when implemented with a randomized pivot to avoid worst-case performance
- Commonly used in database indexing and high-performance applications

### Code:
```java
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
```

---

## Other Sorting Algorithms

| Algorithm | Best Case | Average Case | Worst Case | Space Complexity | Stability |
|-----------|-----------|--------------|------------|------------------|-----------|
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |
| Counting Sort | O(n+k) | O(n+k) | O(n+k) | O(k) | Yes |
| Radix Sort | O(nk) | O(nk) | O(nk) | O(n+k) | Yes |
| Bucket Sort | O(n+k) | O(n) | O(n²) | O(n) | Yes |

---

## Problem Solutions in This Folder

This folder contains implementations of various sorting algorithms applied to real-world scenarios:

1. **InsertionSortEmployeeIDs.java** - Sort employee IDs using Insertion Sort
2. **MergeSortBookPrices.java** - Sort book prices using Merge Sort
3. **QuickSortProductPrices.java** - Sort product prices using Quick Sort
4. **SelectionSortExamScores.java** - Sort exam scores using Selection Sort
5. **CountingSortStudentAges.java** - Sort student ages using Counting Sort

Each implementation demonstrates the practical application of sorting algorithms in different contexts, showcasing their strengths and appropriate use cases.