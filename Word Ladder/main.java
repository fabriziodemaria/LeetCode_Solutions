class Solution {
        public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
                Queue<String> qwe = new LinkedList<String>();
        HashMap<String,Integer> m = new HashMap<String,Integer>();
                qwe.offer(beginWord);
        m.put(beginWord,1);
                while(!qwe.isEmpty()){
            String currentW = qwe.poll();
            for(int i = 0; i<currentW.length(); i++){
                String s = currentW;
                                for(char c = 'a'; c <='z'; c++){
                    s = s.substring(0,i) + new String("" + c) + s.substring(i+1,beginWord.length());
                    if(s.equals(endWord)) return m.get(currentW)+1;
                    if(wordDict.contains(s)){
                        if(!m.containsKey(s)){
                            qwe.offer(s);
                            m.put(s,m.get(currentW)+1);
                        }
                    }
                }
                            }
                    }
                return 0;
    }
}
