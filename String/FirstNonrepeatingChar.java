package String;

import java.util.HashMap;

public class FirstNonrepeatingChar {
    public static void main(String[]args){
        String s = "swiss";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.get(ch)==1){
            
                System.out.println(ch);
                break;
            }
        }
        
    }
}
    
