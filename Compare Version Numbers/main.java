class Solution {
        private class StringTokenizer {
                List<String> ls = null;
        int pointer = 0;
                public StringTokenizer(String in, String sperator) {
            ls = new ArrayList<String>();
            StringBuffer str= new StringBuffer(""); 
            for (char c : in.toCharArray()) {
                if (c - '.' == 0) {
                    ls.add(str.toString());
                    str = new StringBuffer("");
                } else {
                    str.append(c);
                }
            }
            ls.add(str.toString());
        }
                public boolean hasMoreElements() {
            if (pointer >= ls.size()) return false;
            return true;
        }
                public String nextElement() {
            pointer++;
            return ls.get(pointer-1);
        }
    }
            public int compareVersion(String version1, String version2) {
                StringTokenizer st1 = new StringTokenizer(version1, new String("."));
        StringTokenizer st2 = new StringTokenizer(version2, new String("."));
                while (st1.hasMoreElements() && st2.hasMoreElements()) {
            int a = new Integer(st1.nextElement());
            int b = new Integer(st2.nextElement());
                        if (a > b) return 1;
            if (a < b) return -1;
        }
        if (st1.hasMoreElements() && !st2.hasMoreElements()) {
            while (st1.hasMoreElements()) {
                for (char c : st1.nextElement().toCharArray()) {
                    if (c - '0' != 0) { 
                        return 1;
                    }
                }
            }
        }
        if (st2.hasMoreElements() && !st1.hasMoreElements()) {
            while (st2.hasMoreElements()) {
                for (char c : st2.nextElement().toCharArray()) {
                    if (c - '0' != 0) { 
                        return -1;
                    }
                }
            }
        }
        return 0;
    }
}
