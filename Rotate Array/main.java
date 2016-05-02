class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] tmp = new int[nums.length];
                for (int i = 0; i <= nums.length-1-k; i++) {
            tmp[i] = nums[i];
        }
                for (int i = 0; i < k; i++) {
            nums[i] = nums[nums.length-k+i];
        }
                for (int i = k; i < nums.length; i++) {
            nums[i] = tmp[i-k];
        }
    }
}
