class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
                while(l<r) {
            int i = l + (r-l)/2;
            if (nums[i] > nums[l] && nums[i] > nums[r]) {
                //go right with no i
                l = i + 1;
            } else if (nums[i] < nums[l] && nums[i] < nums[r]) {
                //go left with i
                r = i;
            } else {
                return (nums[l] > nums[r]) ? nums[r] : nums[l];
            }
        }
        return nums[l];
    }
}
