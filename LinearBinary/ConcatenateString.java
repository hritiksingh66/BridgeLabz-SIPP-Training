package LinearAndBinarySearch;

import java.util.Scanner;

public class ConcatenateString {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      int n = sc.nextInt();
      String[] arr = new String[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.next();
      }

      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < n; i++) {
        sb.append(arr[i]);
      }
      System.out.println(sb.toString());
    }
  }
}