class Solution {
        List<List<Integer>> result;
    int[] gcan;
    int target;
        public Solution(){
        result = new LinkedList<List<Integer>>();
    }
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
                //global gcan 
        gcan = new int[candidates.length];
        int t = 0;
        for(int i : candidates){
            gcan[t] = i;
            t++;
        }
                this.target = target;
                        Arrays.sort(gcan);
                int len = candidates.length;
        rec(new LinkedList(),0,0);
        return result;
            }
        private void rec(LinkedList<Integer> current, int actual, int barrier){
                if(actual == target){
            //we reached a solution
            result.add(new LinkedList(current));
        }
                if(actual > target){
            return;
        }
                for(int j : gcan){
            if(j<barrier) continue;
            actual = actual + j;
            current.add(j);
            rec(current,actual,j);
            current.removeLast();
            actual = actual - j;
        }
    }
}
