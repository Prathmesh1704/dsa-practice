/* 28 Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0. */


package String;

class IndexOfFirstOcc {

    // Function to find the first occurrence of 'needle' in 'haystack'
    public int strStr(String haystack, String needle) {

        // Length of needle (substring to search)
        int n = needle.length();

        // Length of haystack (main string)
        int m = haystack.length();

        // If needle is longer than haystack, it can't be found
        if (m < n) {
            return -1;
        }

        // Loop through each possible starting index in haystack
        // We only go till (m - n) because beyond that, needle can't fit
        for (int i = 0; i <= m - n; i++) {

            // Pointer for needle
            int j = 0;

            // Compare characters of needle with haystack
            // Continue while characters match
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;  // Move to next character
            }

            // If we matched all characters of needle
            if (j == n) {
                return i;  // Return starting index
            }
        }

        // If needle is not found in haystack
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        IndexOfFirstOcc obj = new IndexOfFirstOcc();

        String haystack = "hello";
        String needle = "ll";

        int result = obj.strStr(haystack, needle);

        System.out.println("Index of first occurrence: " + result);
    }
}
