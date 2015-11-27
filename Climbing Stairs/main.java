class Solution {
    public int climbStairs(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
                int current = 2;
        int prev1 = 2;
        int prev2 = 1;
                for (int i = 2; i < n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
                return current;
    }
}
