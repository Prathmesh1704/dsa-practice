
/*189 Rotate  array  - rotate by k steps */


import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    public void rotat(int[]nums,int k){
        int n = nums.length;

        if(k>n){
            k=k%n;

        }
        reverse(nums,0,n-1); 
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int[]nums,int start,int end){
        while(start<end){
            int tmp = nums [start];
            nums[start]= nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements of array:");
        int n = sc.nextInt();
        int nums[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i=0;i<nums.length;i++){
             nums[i] =sc.nextInt();
        }
        System.out.println("Enter number of terms to rotate:");
        int k =  sc.nextInt();
        RotateArray arra = new RotateArray();
        arra.rotat(nums, k);

        System.out.println("Rotated array = " + Arrays.toString(nums));
        sc.close();



    }
    
}
