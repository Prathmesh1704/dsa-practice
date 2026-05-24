//fixed sized sliding window
package SlidingWindow;

import java.util.Scanner;

public class MaxSumSubarray {
    

    public static int maxSumInWindow(int arr[],int k){
        int l = arr.length;
        int left =0;
        int sum=0;
        int ans=Integer.MIN_VALUE;
        


        for(int right=0;right<l;right++){

            sum+=arr[right];
            if(right-left+1>k){
                sum-=arr[left];
                left++;
            }


            if(right-left+1==k){
            ans = Math.max(ans,sum);
            }
        }

        return ans ;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array: n");
        int n = sc.nextInt();
        int [] arr = new int[n];

         for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("Enter the window size : k ");
        int k = sc.nextInt();
        
       

        int a = MaxSumSubarray.maxSumInWindow(arr, k);
        System.out.println(a);


    }
    
}
