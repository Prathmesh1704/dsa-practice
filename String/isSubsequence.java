/*392 Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false */
package String;

public class isSubsequence {
    public boolean isSubseq(String s, String t) {
        int l1=s.length();
        int l2=t.length();
        int i=0,j=0;
        if(l1>l2){
            return false;

        }
        if(l1==0){
            return true;
        }
        while(i<l1 && j<l2){
            char c = s.charAt(i);
            if(c==t.charAt(j)){
                i++;
            }
            j++;
       

        if(i==l1){
            return true;
        }
        }


       
    return false;       
    }
   
}
    

