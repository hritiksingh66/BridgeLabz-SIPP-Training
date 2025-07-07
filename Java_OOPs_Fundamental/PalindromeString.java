package level_1;
import java.util.*;
class Palindrome{
	String s;
    public boolean isPalindrome(String s){
    	s = s.toLowerCase();
		StringBuffer sb = new StringBuffer();
		int c = 0;
		for(int i = (s.length() - 1); i >= 0; i--) {
			sb.append(s.charAt(i));
			c++;
		}
		for(int i = 0; i < c; i++) {
			if(sb.charAt(i) != s.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String st = sc.nextLine();
		Palindrome str = new Palindrome();
		System.out.println("The String is Palindrome " + str.isPalindrome(st));
	}
}
