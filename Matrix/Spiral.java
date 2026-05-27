package Matrix;

import java.util.Scanner;

public class Spiral {
     public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter no of rows:");
        
        int rows= sc.nextInt();
        System.out.print("Enter no of Cols:");

        int cols = sc.nextInt();

        int [][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        int n = arr.length;
        int top =0;
        int left =0;
        int right=n-1;
        int bottom = n-1;

        while(top<=bottom && left<=right){


            for(int i =left;i<=right;i++){
                System.out.print(arr[top][i] + " ");

            }top++;

            for(int j=top;j<=bottom;j++){
                System.out.print(arr[j][right] + " ");
            }right--;

            if(top<=bottom){
                for(int i =right;i>=left;i--){
                    System.out.print(arr[bottom][i]+ " ");
                }bottom--;

            }
            if(right<=left){
                for(int j=bottom;j>=top;j++){
                    System.out.print(arr[left][j]+" ");
                }left++;
            }
        }
    
}
}