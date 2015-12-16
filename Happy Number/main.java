class Solution {
    public boolean isHappy(int n) {
        String number = new Integer(n).toString();
        while (new Integer(number) >= 10) {
            int sum = 0;
            for (char c : number.toCharArray()) {
                sum += (new Integer(c - '0'))*(new Integer(c - '0'));
            }
            if (sum == 1) return true;
            number = new Integer(sum).toString();
        }
        return new Integer(number) == 7 || new Integer(number) == 1;
    }
}
