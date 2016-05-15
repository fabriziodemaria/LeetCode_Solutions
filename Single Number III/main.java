class Solution {
        public int[] singleNumber(int[] nums) {
                HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
                for (int i : nums) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
                int[] res = new int[2];
        int i = 0;
                for (Integer k : map.keySet()) {
            if (map.get(k) == 1) {
                res[i] = k;
                i++;
            }
        }
                return res;
            }
}
