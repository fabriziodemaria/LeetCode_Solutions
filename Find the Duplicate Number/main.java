class Solution {
    public int findDuplicate(int[] nums) {
                int i = nums.length/2;
        int less = 0;
        int more = 0;
        int l = 1;
        int r = nums.length - 1;
                while (l < r) {
            more = less = 0;
            for (int j = 0; j < nums.length; j++) {
                if (r >= nums[j] && nums[j] >= l ) {
                    if (nums[j] <= i) {
                        less++;
                    } else {
                        more++;
                    }
                }
            }
            if (less > more) {
                r = i;
                i = l + (r-l)/2;
            } else {
                l = i + 1;
                i = l + (r-l)/2;
            }
            System.out.println("l " + l + " and r " + r + " and i " + i);
        }
                return r;
                    }
}
