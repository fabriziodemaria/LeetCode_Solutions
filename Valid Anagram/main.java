class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
                for (char ch : s.toCharArray()) {
            Character c = new Character(ch);
            if (map.containsKey(c)) {
                map.put(c,map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }
                for (char ch : t.toCharArray()) {
            Character c = new Character(ch);
            if (map.containsKey(c)) {
                if (map.get(c) == 0) {
                    return false;
                }
                map.put(c,map.get(c)-1);
                if (map.get(c) == 0) {
                    map.remove(c);
                }
            } else {
                return false;
            }
        }
                if (map.size() == 0)
            return true;
        return false;
    }
}
