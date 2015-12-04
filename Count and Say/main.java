class Solution {
    public String countAndSay(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        String current = new String("1");
        StringBuffer tmp = null;
                for (int i = 1; i < n; i++) {
            //calculate next iteration and put it in current
            // System.out.println(current);
            tmp = new StringBuffer("");
            int index = 0;
            int counter = 0;
            char val = current.charAt(0);
            while (index < current.length()) {
                if (current.charAt(index) == val) {
                    counter++;
                    index++;
                } else {
                    tmp.append(String.valueOf(counter));
                    tmp.append(val);
                    counter = 1;
                    val = current.charAt(index);
                    index++;
                }
            }
            tmp.append(String.valueOf(counter));
            tmp.append(val);
            current=tmp.toString();
        }
        return current;
    }
}
