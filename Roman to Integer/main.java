class Solution {
    public int romanToInt(String s) {
                HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
                int value = 0;
        int tmp = 0;
        int i = 0;
                while (i < s.length()) {
            tmp = map.get(s.charAt(i));
            while (i+1 < s.length() && s.charAt(i+1) == s.charAt(i)) {
                tmp += map.get(s.charAt(i));
                i++;
            }
                        if (i+1 < s.length()) {
                if (map.get(s.charAt(i+1)) > map.get(s.charAt(i))) {
                    value += (map.get(s.charAt(i+1)) - tmp);
                    i++;
                    i++;
                } else {
                    value += (tmp);
                    i++;
                }
            } else {
                value += tmp;
                i++;
            }
        }
                return value;
                    }
}
