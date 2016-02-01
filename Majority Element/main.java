class Solution {
    public int majorityElement(int[] num) {
                int tmp = 1;
                //quicksort the array
        //quicks(num,0,num.length-1);
                //Arrays.sort(num);
        insertions(num);
        if(num.length==1) return num[0];
                //linear complexity
        for(int i = 1; i<num.length; i++){
            if(num[i]==num[i-1]){
                tmp++;
                if(tmp>=((num.length+1)/2)){
                    return num[i];
                }
            } else {
                tmp = 1;
            }
        }
                return 0;
            }
        private void quicks(int[] num, int l, int r){
                if(l>=r){
            return;
        }
                int p = pivot(num,l,r);
        quicks(num,l,p-1);
        quicks(num,p+1,r);
            }
        private int pivot(int[] num, int l, int r){
        int p = (l+r)/2;
        int i = l;
        int j = r;
        while(i<j){
            while(num[i]<num[p]) i++;
            while(num[j]>num[p]) j--;
            if(i<j){
                int tmp = num[i];
                num[i] = num[j];
                num[j] = tmp;
            }
            i++;
            j--;
        }
        return i;
    }
        private void insertions(int[] num){
                for(int i = 1; i<num.length; i++){
            int j = i;
            while(j>=1 && num[j-1]>num[j]){
                //swap
                int tmp = num[j-1];
                num[j-1] = num[j];
                num[j] = tmp;
                j--;
            }
        }
            }
}
