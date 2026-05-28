package String;

import java.util.HashMap;

public class CharacterFrequencyCounting {
    public static void main(String[]args){
        String s = "aabbcddee";

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            map.put(c,map.getOrDefault(c, 0) +1);
        }

        for(HashMap.Entry<Character,Integer>entry  : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());

        }
    }
    
}

