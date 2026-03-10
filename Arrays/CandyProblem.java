/* 135 There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.

You are giving candies to these children subjected to the following requirements:

Each child must have at least one candy.
Children with a higher rating get more candies than their neighbors.
Return the minimum number of candies you need to have to distribute the candies to the children. */

/*Approach 1 Two Pass */

import java.util.Arrays;

public class CandyProblem {

    public int candy(int[] ratings) {
        int n = ratings.length;

        // Array to store candies for each child
        int[] candies = new int[n];

        // Step 1: Give each child at least 1 candy
        Arrays.fill(candies, 1);

        // Step 2: Left to Right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Step 3: Right to Left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
                candies[i] = candies[i + 1] + 1;
            }
        }

        // Step 4: Calculate total candies
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += candies[i];
        }

        return result;
    }

    public static void main(String[] args) {
        CandyProblem obj = new CandyProblem();

        int[] ratings = {1, 0, 2};

        int result = obj.candy(ratings);

        System.out.println("Minimum candies required: " + result);
    }
}

/*Time complexity - o(n) , Space - o(n) */


/*Approach 2 Greedy one Pass 

import java.util.*;

public class Solution {

    public int candy(int[] ratings) {
        if (ratings.length == 0) {
            return 0;
        }

        int res = 1, up = 0, down = 0, peak = 0;

        for (int i = 1; i < ratings.length; i++) {
            int prev = ratings[i - 1];
            int curr = ratings[i];

            if (prev < curr) {          // increasing slope
                up++;
                down = 0;
                peak = up;
                res += 1 + up;
            } 
            else if (prev == curr) {   // equal ratings
                up = 0;
                down = 0;
                peak = 0;
                res += 1;
            } 
            else {                     // decreasing slope
                up = 0;
                down++;
                res += 1 + down;

                if (peak >= down) {
                    res--;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] ratings = {1, 0, 2};

        int result = obj.candy(ratings);

        System.out.println("Minimum candies required: " + result);
    }
}



Time -o(n) , space = o(1)

*/