package Matrix;

import java.util.Scanner;

/* 
public class RowWiseSum {
    public static void main(String[]args){
        int[][] arr = new int[][]{
            {1,2,3,4},{5,6,7,8},{9,10,11,12}
        };


            for(int i=0;i<arr.length;i++){
                int sum =0;
                for(int j=0;j<arr[i].length;j++){
                    sum+=arr[i][j];

                }
                System.out.println(sum);
            }
            System.out.println();
        }

}

*/




public class RowWiseSum {
    public static void main(String[]args){
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
            arr[i][j]=sc.nextInt();   
         }System.out.println();        }


        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
            System.out.print(arr[i][j]+ " ");

         }
         System.out.println();
        
         
         }


}
}









