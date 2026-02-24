import java.util.*;
public class Twosum {

    public static int[] twoSum(int[] num,int target){
    Map<Integer,Integer>map = new HashMap<>();
    for(int i=0;i<num.length;i++){
        int diff= target-num[i];
        if(map.containsKey(diff)){
            return new int[]{map.get(diff),i};
        }
        map.put(num[i],i);
    }
    return new int[] {};
    
    
    }


    public static void main(String[] args){
        int num[] = {2,4,5,6,8};
        int target = 10;

        int result [] = twoSum(num,target);
        if(result.length ==2){
            System.out.println("Indices :"+result[0]+","+result[1]);
            System.out.println("Values:"+num[result[0]]+","+num[result[1]]);
        }
        else{
            System.out.println("No Two numbers foundthat add up to the target");

        }
        }
    }
    

