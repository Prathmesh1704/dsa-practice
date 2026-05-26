package Matrix;

import java.util.Scanner;

public class Transpose {

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
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
        System.out.print(arr[i][j] + " ");
            }System.out.println();

        }

        for(int i=0;i<rows;i++){
            for(int j =i;j<cols;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }System.out.println();

        }
         for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
        System.out.print(arr[i][j]+ " ");
            }
            System.out.println();


    
}

}
}