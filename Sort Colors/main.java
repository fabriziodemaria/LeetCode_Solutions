class Solution {
        public void sortColors(int[] nums) {
        // int[] helperArray = new int[nums.length];
        int r = 0;
        int w = 0;
        int b = 0;
                for (int i = 0; i < nums.length; i++) {
            switch (nums[i]) {
                case 0:
                    r++;
                    break;
                case 1:
                    w++;
                    break;
                case 2:
                    b++;
                    break;
            }
        }
        int i = 0;
        while (r > 0) {
            nums[i] = 0;
            i++;
            r--;
        }
        while (w > 0) {
            nums[i] = 1;
            i++;
            w--;
        }
        while (b > 0) {
            nums[i] = 2;
            i++;
            b--;
        }
    }
}
