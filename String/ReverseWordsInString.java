/*151 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces. */


//Approach 1 
package String;

import java.util.*;

public class ReverseWordsInString {

    public String reverseWords(String s) {
        // Remove leading and trailing spaces and split words
        String[] str = s.trim().split("\\s+");

        StringBuilder ss = new StringBuilder();

        // Traverse from last word to first
        for (int i = str.length - 1; i >= 0; i--) {
            ss.append(str[i]);

            // Add space between words
            if (i > 0) {
                ss.append(" ");
            }
        }

        return ss.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInString obj = new ReverseWordsInString();

        String input = "  the sky   is blue  ";

        String result = obj.reverseWords(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed Words: " + result);
    }
}



/* Approach 2 -


class Solution {

    // Main function to reverse words in a string
    public String reverseWords(String s) {

        // If input string is null, return null
        if (s == null) {
            return null;
        }

        // Convert string to character array
        char[] a = s.toCharArray();

        // Length of array
        int n = a.length;

        // Step 1: Reverse the entire string
        reverse(a, 0, n - 1);

        // Step 2: Reverse each word individually
        reverseW(a, n);

        // Step 3: Remove extra spaces and return final string
        return cleanSpace(a, n);
    }

    // Function to reverse characters between index i and j
    private void reverse(char[] a, int i, int j) {

        while (i < j) {

            // Swap characters
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            // Move pointers
            i++;
            j--;
        }
    }

    // Function to reverse each word in the array
    void reverseW(char[] a, int n) {

        int i = 0, j = 0;

        while (i < n) {

            // Skip spaces to find start of word
            while (i < j || (i < n && a[i] == ' '))
                i++;

            // Move j to end of word
            while (j < i || (j < n && a[j] != ' '))
                j++;

            // Reverse the word from i to j-1
            reverse(a, i, j - 1);
        }
    }

    // Function to remove extra spaces
    String cleanSpace(char[] a, int n) {

        int i = 0; // pointer for placing characters
        int j = 0; // pointer for scanning

        // Skip leading spaces
        while (j < n && a[j] == ' ')
            j++;

        while (j < n) {

            // Copy characters of the word
            while (j < n && a[j] != ' ') {
                a[i++] = a[j++];
            }

            // Skip spaces between words
            while (j < n && a[j] == ' ')
                j++;

            // Add single space if another word exists
            if (j < n) {
                a[i++] = ' ';
            }
        }

        // Create final string from array
        return new String(a).substring(0, i);
    }
}







*/