import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));  // true
        System.out.println(isAnagram("hello", "world"));    // false
    }

    public static boolean isAnagram(String str1, String str2) {
        // Check if strings have different lengths
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert to lowercase and sort characters
        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        
        // Compare sorted character arrays
        return Arrays.equals(chars1, chars2);
    }
}