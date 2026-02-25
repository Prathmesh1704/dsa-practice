/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.*/

import java.util.Scanner;
class RemoveElement{

    public int remove(int[]nums , int val){
        int index= 0;
        for(int i = 0 ; i<nums.length;i++){
            if(nums[i]!= val){
                nums[index] = nums[i];
                index++;

            }
        }
        return index;
    
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int [] nums = new int[n];

        System.out.print("Enter elements of array:");
        for(int i = 0 ; i < n ; i++){
            nums[i] = sc.nextInt();

        }
        System.out.print("Enter number to remove:");
        int val = sc.nextInt();

        
        RemoveElement re = new RemoveElement();
        int newLength = re.remove(nums,val);
        System.out.println("New Length after removing element:" + newLength);

        System.out.println("Updated array:");
        for(int i = 0 ; i <newLength ; i++){
            System.out.print(nums[i] + " ");

        }
        sc.close();
        

    }
}

