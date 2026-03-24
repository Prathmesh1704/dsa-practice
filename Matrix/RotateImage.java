/*48 You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

  */

package Matrix;
class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++){
            int low = 0;
            int high = n - 1;

            while(low < high){
                int temp = matrix[i][low];
                matrix[i][low] = matrix[i][high];
                matrix[i][high] = temp;
                low++;
                high--;
            }
        }
    }
}


/* Approach 2 

class Solution {
    public void rotate(int[][] matrix) {
        int l = 0;
        int r = matrix.length - 1;

        while (l < r) {
            for (int i = 0; i < r - l; i++) {

                int top = l;
                int bottom = r;

                // save top-left
                int topLeft = matrix[top][l + i];

                // bottom-left -> top-left
                matrix[top][l + i] = matrix[bottom - i][l];

                // bottom-right -> bottom-left
                matrix[bottom - i][l] = matrix[bottom][r - i];

                // top-right -> bottom-right
                matrix[bottom][r - i] = matrix[top + i][r];

                // top-left -> top-right
                matrix[top + i][r] = topLeft;
            }
            l++;
            r--;
        }
    }
}




*/