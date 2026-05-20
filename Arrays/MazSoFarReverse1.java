
import java.util.Scanner;

public class MazSoFarReverse1 {

    static int kadane(int arr[]){


        int maxSoFar = arr[0];
        int current =arr[0];

        for(int i=1;i<arr.length;i++){

            current = Math.max(arr[i],current+arr[i]);
            maxSoFar = Math.max(maxSoFar,current);
        }
        return maxSoFar;
    }


    static void reverse(int [] arr , int left ,int right){
        while(left<right){
            int temp =arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }



    public static void main(String  [] args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
      

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        int answer = kadane(arr);

        int best = answer;
        for(int i=0;i<n;i++){
            for(int j =i ;j<n;j++){

                reverse(arr,i,j);
                answer =Math.max(answer,kadane(arr));

                reverse(arr,i,j);
                
            }

            
        }
        System.out.println(answer);

        
    }


    
}
