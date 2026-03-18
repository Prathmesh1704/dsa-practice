/* 68 
Example 1:

Input: words = ["This", "is", "an", "example", "of", "text", "justification."], maxWidth = 16
Output:
[
   "This    is    an",
   "example  of text",
   "justification.  "
]
 */

package String;

import java.util.*;

class TextJustification {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i = 0;

        while (i < words.length) {
            StringBuilder sb = new StringBuilder();

            while (i < words.length && sb.length() + words[i].length() + 1 <= maxWidth) {
                sb.append(words[i]).append(" ");
                i++;
            }

            String str = sb.toString().trim();

            if (i < words.length) {
                ans.add(addSpaces(str, maxWidth));
            } else {
                StringBuilder last = new StringBuilder(str);
                while (last.length() < maxWidth) {
                    last.append(" ");
                }
                ans.add(last.toString());
            }
        }
        return ans;
    }

    private String addSpaces(String s, int width) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");

        int count = arr.length - 1;

        if (count == 0) {
            StringBuilder temp = new StringBuilder(s);
            while (temp.length() < width) {
                temp.append(" ");
            }
            return temp.toString();
        }

        int totalChars = 0;
        for (String word : arr) {
            totalChars += word.length();
        }

        int totalSpaces = width - totalChars;
        int equalSpaces = totalSpaces / count;
        int moreSpaces = totalSpaces % count;

        String spaces = "";
        for (int i = 0; i < equalSpaces; i++) {
            spaces += " ";
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            if (i < count) {
                if (moreSpaces-- > 0) {
                    sb.append(spaces + " ");
                } else {
                    sb.append(spaces);
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        TextJustification obj = new TextJustification();

        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;

        List<String> result = obj.fullJustify(words, maxWidth);

        for (String line : result) {
            System.out.println("|" + line + "|");
        }
    }
}