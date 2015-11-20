class Solution {
        int bestdifference;
    int best;
        public int threeSumClosest(int[] num, int target) {
                Arrays.sort(num);
        bestdifference = Integer.MAX_VALUE;
                for(int i = 0; i<num.length-2; i++){
                        int k = i+1;
            int j = num.length-1;
                        while(k<j){
                                int current = num[i]+num[k]+num[j];
                int difference = Math.abs(current-target);
                if(difference<bestdifference){
                    bestdifference = difference;
                    best = current;
                }
                if(current<target){
                    k++;
                    continue;
                } else if (current > target){
                    j--;
                    continue;
                } else {
                    return current;
                }
                            }
                                }
     return best;
                 }
}
