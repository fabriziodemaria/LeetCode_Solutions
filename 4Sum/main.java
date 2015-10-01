class Solution {
            public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
                Arrays.sort(num);
        HashSet<ArrayList<Integer>> hashSet = new HashSet<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
             for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int k = j + 1;
                int l = num.length - 1;
                     while (k < l) {
                    int sum = num[i] + num[j] + num[k] + num[l];
                         if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else if (sum == target) {
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        temp.add(num[l]);
                             if (!hashSet.contains(temp)) {
                            hashSet.add(temp);
                            result.add(temp);
                        }
                        //better than l-- r++ , we avoid loss of time in case of duplicates.
                        //break;
                        l--;
                        k++;
                    }
                }
            }
        }
             return result;
    }
                        /*
    List<List<Integer>> solution = new LinkedList<List<Integer>>();
    List<Integer> current = new LinkedList<Integer>();
        public List<List<Integer>> fourSum(int[] num, int target) {
                Arrays.sort(num);
                recursion(num,target, 0, 0);
        return solution;
            }
        private void recursion(int[] num, int target, int position, int level){
                if(level==4){
            //we have to check the sum
            int sum = current.get(0)+current.get(1)+current.get(2)+current.get(3);
                if (sum == target) {
                    //add solution 
                    solution.add(new LinkedList<Integer>(current));
                }
            return;     
        }
        //we have to add elements, not four yet...
        for(int i = position; i<num.length; i++){
            //we have to go on with recursion
            current.add(num[i]);
                        int tmpsum = 0;
            for(int t = 0; t < level+1; t++){
                tmpsum += current.get(t);
            }
            if(tmpsum>target) break;
                        recursion(num,target,position+1,level+1);
        }
    }
*/
}
