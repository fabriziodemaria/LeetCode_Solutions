class Solution {
        public int search(int[] A, int target) {
                //handle border cases!
        if(target<A[0] && target>A[A.length-1]) return -1;
        return rec(A,target,0,(A.length-1));
            }
        private int rec(int[] A, int target, int start, int end){
                if(start>end){
            return -1;
        }
                int c = (end+start)/2;
        //if element found  in middle position then return
        if(target==A[c]) return c;
                //else where to recur?
        if(A[end]>A[c]){
            //on the right of c all is greater than A[c]
            if(target<=A[end] && target>A[c]){
                return rec(A,target,c+1,end);
            } else {
                return rec(A,target,start,c-1);
            }
        } else if (A[start]<A[c]) {
            //on the left everything is smaller than A[c]
            if(target>=A[start] && target<A[c]){
                return rec(A,target,start,c-1);
            } else  {
                return rec(A,target,c+1,end);
            }
        }
                //if end not greater than c AND start not less than c...
        //Only possibility is that c is start or end, and so start or end differ by 1 at most...
        //Just check the remaining range between start and and (distance max is 1...)
        if(A[start]==target) return start;
        if(A[end]==target) return end;
                return -1;
            }
}
