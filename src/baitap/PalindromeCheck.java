package baitap;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "madam"; // Test with other words to check
        System.out.println("Is " + word + " a palindrome? " + isPalindrome(word));
    }

}
