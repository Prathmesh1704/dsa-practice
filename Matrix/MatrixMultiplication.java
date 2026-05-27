package Matrix;

public class MatrixMultiplication {


    public static void main(String[] args){
        int A[][] = new int [][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int B[][] = new int[][]{
            {3,2,1},
            {6,5,4},
            {9,8,7}
        };

        int rowsA= A.length;
        int colsA=A[0].length;

        int rowsB = B.length;
        int colsB = B[0].length;

        int result[][] = new int[rowsA][colsB];

        if(colsA!=rowsB){
            System.out.println("Multipication not possible");
        }
        else{

            for(int i=0;i<rowsA;i++){
                for(int j=0;j<colsB;j++){
                    for(int k=0;k<colsA;k++){
                        result[i][j]+=A[i][k]*B[k][j];
                    }
                }
            }

        }
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result.length;j++){
                System.out.print(result[i][j]+ " ");
            }System.out.println();
        }

    }

    
}
