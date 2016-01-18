class Solution {
    public int lengthOfLastWord(String s) {
        /*
        int len = 0;
        int len2 = 0;
                for(int i = 0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))) {
                len++;
            } else {
                if(len!=0){
                    len2=len;
                    len=0;
                }
            }
        }
        if(len==0){
            return len2;
        }
        return len;
        */
        int len = 0;
        if(s==null || s.length()==0)return len;
        int i = s.length();
        while(i>0){
            i--;
            if(Character.isLetter(s.charAt(i)))break;
        }
        while(i>=0){
            if(!Character.isLetter(s.charAt(i)))break;
            len++;
            i--;
        }
                return len;
    }
}
