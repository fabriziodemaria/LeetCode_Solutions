class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] sorted = new int[numbers.length];
                int t = 0;
        for(int i : numbers){
            sorted[t] = i;
            t++;
        }
                Arrays.sort(sorted);
        //sorted array
                int l = 0;
        int r = sorted.length-1;
                while(l<r){
            int tmp = sorted[l]+sorted[r];
            if(tmp<target){
                l++;
            } else if (tmp>target){
                r--;
            } else {
                break;
            }
        }
                int l1=0;
        int r1=numbers.length-1;
        while(numbers[l1]!=sorted[l]) l1++;
        while(numbers[r1]!=sorted[r]) r1--;
                int[] res = new int[2];
        if(l1<r1){
            res[0] = l1+1;
            res[1] = r1+1;
        } else {
            res[1] = l1+1;
            res[0] = r1+1;
        }
        return res;
    }
}
