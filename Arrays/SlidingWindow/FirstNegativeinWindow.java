//fixed sized
package SlidingWindow;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FirstNegativeinWindow {

    public static void firstNeginWin(int arr[],int k){


        int left =0;
        int l = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for(int right =0;right<l;right++){

            if(arr[right] < 0){
                q.add(arr[right]);
            }

            if(right-left+1==k){
                if(!q.isEmpty()){
                    System.out.println(q.peek());
                }
                else{
                    System.out.println(0);
                }
                
                if(!q.isEmpty() && arr[left]==q.peek()){
                q.remove();
                
            }

            left++;
            }

          

            

        }


        return ;


    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array:");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
       
        System.out.println("Enter size of Window:");
        int k = sc.nextInt();

        FirstNegativeinWindow.firstNeginWin(arr,k);
        




    }
    
}
