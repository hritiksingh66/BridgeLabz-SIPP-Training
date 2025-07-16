package LinearAndBinarySearch;

import java.util.*;
import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String str = sc.nextLine();

      StringBuilder sb = new StringBuilder("");
      Set<Character> set = new HashSet<>();
      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (!set.contains(ch)) {
          set.add(ch);
          sb.append(ch);
        }
      }

      System.out.println(sb.toString());
    }
  }

}
