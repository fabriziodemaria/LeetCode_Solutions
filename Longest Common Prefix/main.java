class Solution {
    public String longestCommonPrefix(String[] strs) {
                if(strs.length<1) return new String("");
                Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length-1];
                int len = 0;
        while(len<a.length() && len<b.length() && a.charAt(len)==b.charAt(len)){
                len++;
        }
                if(len==0) return new String("");
        return a.substring(0,len);
    }
}
