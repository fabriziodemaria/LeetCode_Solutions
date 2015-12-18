class Solution {
    public int rob(int[] num) {
                if (num == null || num.length == 0) {
            return 0;
        }
        int a = 0;
        int b = 0;
        int tmp;
        for (int i = 0; i < num.length; i++) {
            tmp = b;
            b = Math.max(a + num[i], b);
            a = tmp;
        }
        return b;
    }
}
