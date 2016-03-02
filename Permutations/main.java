class Solution {
        List<List<Integer>> result;
    LinkedList<Integer> tmp;
    int[] flags;
         public List<List<Integer>> permute(int[] num) {
                result = new LinkedList<List<Integer>>();
        tmp = new LinkedList<Integer>();
        flags = new int[num.length];
                permute(num,0);
                return result;
            }
        private void permute(int[] num, int tmpi){
                if(tmpi==num.length){
            //reached a correct permutation
            result.add((LinkedList<Integer>)tmp.clone());
        }
                for(int i = 0; i < num.length; i++){
            if(flags[i]==0){
                flags[i] = 1;        
                tmp.add(num[i]);
                permute(num,tmpi+1);
                tmp.removeLast();
                flags[i] = 0;
            }
        }
            }
}
