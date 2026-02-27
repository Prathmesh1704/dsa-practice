/*169 Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/
  
/*Approaches are using - Sorted Array ,Hashmap , Moore Voting Algo*/


/*2. using Hashmap
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MajorityElement{

    public int solution(int[] nums){
        int n = nums.length;

        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i=0 ; i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                map.put(nums[i],count+1);
            }else{
                map.put(nums[i],1);

            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
            if(entry.getValue() > n/2 ){
                return entry.getKey();
            }
        }
        return -1;
    }
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MajorityElement obj = new MajorityElement();
        int result = obj.solution(nums);

        if (result != -1) {
            System.out.println("Majority Element is: " + result);
        } else {
            System.out.println("No Majority Element found.");
        }

        sc.close();
    }
}
 
*/


/* 2.Using Moore Voting Algo */ 

import java.util.Scanner;

class MajorityElement{

    public int solution(int[]nums){
        int count = 0;
        int candi= 0 ;
        for(int num:nums){
            if(count==0){
                candi=num;
            }
            if(num==candi){
                count++;
            }
            else{
                count--;
            }
            
        }
        return candi;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MajorityElement obj = new MajorityElement();
        int result = obj.solution(nums);

        System.out.println("Majority Element is: " + result);

        sc.close();
    }

}