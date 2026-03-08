/* 238 Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation. */

import java.util.Arrays;


class ProductOfArrayExceptSelf {

    // Function that returns an array where each element is the
    // product of all elements of nums except itself
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length; // store the length of the input array

        int ans[] = new int[n]; // create result array of same size as nums

        Arrays.fill(ans,1); // initialize all elements of ans with 1 (neutral value for multiplication)

        int curr = 1; // variable to store running product (prefix product)

        // First loop: calculate prefix products (product of elements before index i)
        for(int i=1;i<n;i++){

            curr *= nums[i-1]; // multiply current product with previous element of nums

            ans[i] *= curr;  // store prefix product in ans[i]
                            // equivalent to ans[i] = ans[i-1] * nums[i-1]
        }

        curr = 1; // reset curr to calculate suffix products

        // Second loop: calculate suffix products (product of elements after index i)
        for(int i=n-2;i>=0;i--){

            curr *= nums[i+1]; // multiply current product with next element of nums

            ans[i] *= curr; // multiply prefix product already in ans[i] with suffix product
                           // equivalent to ans[i] = ans[i+1] * nums[i+1]
         }

         return ans; // return the final result array
    }
}
