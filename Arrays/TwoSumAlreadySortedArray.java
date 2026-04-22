/* 

167. Two Sum II - Input Array Is Sorted
Solved
Medium
Topics
premium lock icon
Companies
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers index1 and index2, each incremented by one, as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space */
public class TwoSumAlreadySortedArray {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            int front =numbers[i];
            int back=numbers[j];
            if(front+back==target){
                res[0] =i+1;
                res[1] =j+1;
                break;

            }
            else if(front+back >target){
                j--;
            }
            else{
                i++;
                
            }
        }
         return res;

       

    }
     
}
    
