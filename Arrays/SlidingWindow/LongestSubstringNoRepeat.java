//variable Sliding Window
package SlidingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringNoRepeat {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxlen=Integer.MIN_VALUE;

            
        
        for(int right=0;right<s.length();right++){

            char ch = s.charAt(right);



            while(set.contains(ch)){
               set.remove(s.charAt(left));
               left++;
            }
            
            set.add(ch);
                


          

            maxlen = Math.max(maxlen,right-left+1);

        }


       
        System.out.println(maxlen);
       
    }
    
}
