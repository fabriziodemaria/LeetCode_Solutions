class Solution {
    public int titleToNumber(String s) {
                int sol = 0;
                for(int i = 0; i<s.length(); i++){
            int tmp = (int)s.charAt(i)-'A'+1;
            sol *= 26;
            sol = sol + tmp;
        }
                return sol;
            }
}
