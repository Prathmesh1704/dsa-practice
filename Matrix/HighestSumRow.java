package Matrix;

import java.util.Scanner;
public class HighestSumRow {

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
        int Max = Integer.MIN_VALUE;
        int rowNumber=-1;
        for(int i=0;i<rows;i++){
            int sum=0;
            
            for(int j=0;j<arr[i].length;j++){

                sum+=arr[i][j];

                Max = Math.max(Max,sum);
                rowNumber=i;

            }
        }
        System.out.print("Highest row sum :" + Max );
        System.out.println("Row Number :" + rowNumber);
    }
    
}
