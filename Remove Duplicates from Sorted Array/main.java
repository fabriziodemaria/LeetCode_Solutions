class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int counter = 0;
        while (i < nums.length) {
            int current = nums[i];
            nums[counter] = current;
            i++;
            counter++;
            while (i < nums.length && nums[i] == current){
                i++;
            }
        }
        return counter;
    }
}
