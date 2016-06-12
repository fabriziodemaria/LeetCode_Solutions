class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
                if(s.length()==0) return false;
                      //  return recur(0,s,dict);     //too slow....
              boolean [] breakable = new boolean[s.length()+1];
        breakable[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(breakable[j]&&dict.contains(s.substring(j,i))){
                    breakable[i] = true;
                    break;
                }
            }
        }
        return breakable[s.length()];
                    }
                //It works but it is slowwwwww
    /*
    private boolean recur(int base, String s,Set<String> dict){
                if(base==s.length()) return true;
                int end = s.length()-1;
        for(int i = end; i>= base; i--){
            if(dict.contains(s.subSequence(base,i).toString())){
                if(recur(i,s,dict)) return true;
            }
            if(base==s.length()) return true;
        }
        return false;
    }
    */
}
