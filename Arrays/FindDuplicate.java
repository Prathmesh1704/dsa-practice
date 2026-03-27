/* 287 Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space. */


/* approach 1 brute force  
class FindDuplicate {
    public int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        return -1;
    }
}


*/


/* Approach 2 sorting 

import java.util.*;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
}

*/

/* Arrpoach 3 HashSet 


class Solution {
    public int findDuplicate(int[] nums) {
      Set<Integer> set = new HashSet();
      for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
             return nums[i];
           
        }
        else set.add(nums[i]);
      }
        
        return -1;
    }
}



*/

/* Approach 3 

class Solution {
    public int findDuplicate(int[] nums) {
      Set<Integer> set = new HashSet();
      for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
             return nums[i];
           
        }
        else set.add(nums[i]);
      }
        
        return -1;
    }
}


*/


/* Approach 5 Floyds hare and tortoise method


 class Solution {
    public int findDuplicate(int[] nums) {
      int slow =nums[0];
      int fast = nums[0];

      while(true){
        slow = nums[slow];
        fast = nums[nums[fast]];
        if(slow==fast){
            break;
        }

      }
      int slow2=nums[0];
      while(slow2!= slow){
        slow=nums[slow];
        slow2=nums[slow2];
      } return slow;
    
        
      }
    }













*/