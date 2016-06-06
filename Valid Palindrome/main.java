class Solution {
    public boolean isPalindrome(String s) {
        int inizio;
        int fine;
        boolean exp = true;
        String s1 = s.toLowerCase();
                inizio = 0;
        fine = s.length()-1;
                if(s==null){
            return true;
        }
                if(s.length()==0){
            return true;
        }
                if(s.length()==1){
            return true;
        }
                while(fine>=inizio){
            while(inizio<(s1.length()) && !Character.isLetterOrDigit(s1.charAt(inizio))){
                inizio++;
            }
                        while(fine>=0 && (!Character.isLetterOrDigit(s1.charAt(fine)))){
                fine--;
            }
                        if(inizio>=s.length() || fine<0){
                return exp;
            }
                        if (s1.charAt(inizio) != s1.charAt(fine)) {
                exp = false;
            }
                        inizio++;
            fine--;
        }
        return exp;
    }
}
