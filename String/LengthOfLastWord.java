/*58 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only. */


package String;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        // Remove leading and trailing spaces
        s = s.trim();

        int length = 0;

        // Traverse from end of string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                length++;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        LengthOfLastWord obj = new LengthOfLastWord();

        String s = "Hello World";

        int result = obj.lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);
    }
}