package hackerrank;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Convert strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Check if lengths are different (not anagrams)
        if (a.length() != b.length()) {
            return false;
        }

        // Create an array to count frequency of each character
        int[] count = new int[26]; // For English alphabets (26 letters)

        // Iterate through the first string and increment the count for each character
        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
        }

        // Iterate through the second string and decrement the count for each character
        for (int i = 0; i < b.length(); i++) {
            count[b.charAt(i) - 'a']--;
        }

        // Check if any count is not zero, meaning they are not anagrams
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        // If all counts are zero, they are anagrams
        return true;
    }


    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}