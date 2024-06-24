package inflearn.myAlgorithmn.leetcode;

import java.util.*;

public class no451 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        // Convert input string to character array
        char[] str = s.toCharArray();

        // Create an array to store frequency of each character
        int[] freq = new int[128];

        // Count the frequency of each character in the input string
        for (int i = 0; i < str.length; i++) {
            freq[str[i]]++;
        }

        // Sort the characters based on their frequency
        for (int i = 0; i < str.length;) {
            char cmax = ',';  // Initialize cmax to some character not present in the input string

            // Find the character with the maximum frequency
            for (int j = 0; j < 128; j++) {
                if (freq[j] > freq[cmax]) {
                    cmax = (char) j;
                }
            }

            // Append the characters to the result string based on their frequency
            while (freq[cmax] != 0) {
                str[i++] = cmax;
                freq[cmax]--;
            }
        }

        // Convert the character array back to a string and return it
        return new String(str);
    }
}
