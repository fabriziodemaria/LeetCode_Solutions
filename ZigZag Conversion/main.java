class Solution {
        public String convert(String s, int nRows) {
                StringBuffer result = new StringBuffer("");
                if(s==null) return s;
        if(s.length()==1)return s;
        if(nRows==1)return s;
                        int i = 0;
             int step = nRows*2-2;
        int t = i;
        while(t<s.length()){
            result.append(s.charAt(t));
            t = t+step;
        }
        i++;
        while(i<nRows-1){
            //intermediate rows
            int step1 = (nRows-i-1)*2;
            int step2 = i * 2;
                        t = i;
            while(t<s.length()){
                result.append(s.charAt(t));
                t = t+step1;
                if(t>=s.length()) break;
                result.append(s.charAt(t));
                t = t+step2;
            }
            i++;
        }
        //last row
        t = i;
        while(t<s.length()){
            result.append(s.charAt(t));
            t = t+step;
        }
                return result.toString();
            }
}
