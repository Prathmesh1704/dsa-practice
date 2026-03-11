/*42 Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

  */



import java.util.*;

class TrapingRainwater {

    public int trap(int[] height) {
        int n = height.length;

        int[] left = new int[n];
        int[] right = new int[n];

        // Initialize first and last
        left[0] = height[0];
        right[n - 1] = height[n - 1];

        // Fill left max array
        for (int i = 1; i < n; i++) {
            if (height[i] > left[i - 1]) {
                left[i] = height[i];
            } else {
                left[i] = left[i - 1];
            }
        }

        // Fill right max array
        for (int i = n - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) {
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }
        }

        // Calculate trapped water
        int water = 0;
        for (int i = 0; i < n; i++) {
            int x = Math.min(left[i], right[i]);
            water += x - height[i];
        }

        return water;
    }

    public static void main(String[] args) {
        TrapingRainwater obj = new TrapingRainwater();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        int result = obj.trap(height);

        System.out.println("Total trapped rain water: " + result);
    }
}


