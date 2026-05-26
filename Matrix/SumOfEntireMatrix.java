package Matrix;

import java.util.Scanner;

public class SumOfEntireMatrix {
    public static void main(String[]args){
        int[][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        
    for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
            arr[i][j]= sc.nextInt();
         }
         System.out.println();
        }

    int sum=0;
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            sum+=arr[i][j];            


        }
    }
    System.out.print(sum);
    
}
}
