/*45 You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.

  */


import java.util.Scanner;

public class JumpGame2 {

    public int jump(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int end = 0;
        int farthest = 0;

        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, nums[i] + i);

            if (farthest >= n - 1) {
                ans++;
                return ans;
            }

            if (i == end) {
                ans++;
                end = farthest;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        JumpGame2 obj = new JumpGame2();
        int result = obj.jump(nums);

        System.out.println("Minimum jumps required: " + result);

        sc.close();
    }
}