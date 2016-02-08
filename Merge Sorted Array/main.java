class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int index = m + n - 1;
        m--;
        n--;
        while(index>=0){
                        if(m<0 && n>=0){
                //the other array is empty, so return after while;
                while(index>=0){
                    A[index]=B[n];
                    n--;
                    index--;
                }
                return;
            }
            else if(n<0 && m>=0){
                //no need to copy element on array A
                return;         
            }
                    //handle normal case
            if(A[m]>B[n]){
                A[index]=A[m];
                index--;
                m--;
            } else {
                A[index]=B[n];
                index--;
                n--;
            }
        }
    }
}
