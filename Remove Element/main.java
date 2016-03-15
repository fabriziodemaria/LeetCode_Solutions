class Solution {
        int len;
        public int removeElement(int[] A, int elem) {
                if(A==null) return 0;
        if(A.length==0) return 0;
                len = A.length;
        Arrays.sort(A);
                int index = findElemPosition(A, 0, A.length-1, elem);
        if (index == -1) return A.length;
        removeElem(A,index,elem);
        return len;
    }
        private int findElemPosition(int[] A, int start, int end, int elem){
                if(start==end) {
            if(A[start]==elem) return start;
            return -1;
        }
                int c = (start+end)/2;
                if(elem<A[c]){
            return findElemPosition(A,start,c,elem);
        } if(elem>A[c]){
            return findElemPosition(A,c+1,end,elem);            
        } else {
            return c;
        }
            }
        private void removeElem(int[] A, int index, int elem){
                int current = index;
                while(current >= 0 && A[current]==elem){
            current--;
        }
        current++;
                while(current<A.length && A[current]==elem){
            A[current] = A[--len];
            current++;
        }
                    }
}
