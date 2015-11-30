class Solution {
        int[] flags;
    LinkedList<List<Integer>> sol = new LinkedList<List<Integer>>();
    LinkedList<Integer> tmp = new LinkedList<Integer>();
        public List<List<Integer>> combine(int n, int k) {
                flags = new int[n];
        recur(1,n,k);
        return sol;
            }
        private void recur(int c, int n, int k){
                if(k==0){
            sol.add(new LinkedList<Integer>(tmp));
            return;
        }
                for(int i = c; i<=n; i++){
            if(flags[i-1]==0){
                flags[i-1]=1;
                tmp.add(i);
                recur(i+1,n, k-1);
                tmp.removeLast();
                flags[i-1]=0;
            }
                        }
    }
}
