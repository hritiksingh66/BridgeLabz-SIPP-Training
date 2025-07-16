package LinearAndBinarySearch;

import java.util.*;

public class ReverseString {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String str = sc.nextLine();

      StringBuilder sb = new StringBuilder(str);
      sb.reverse();
      System.out.println(sb.toString());
    }
  }
}