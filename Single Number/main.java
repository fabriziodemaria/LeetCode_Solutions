class Solution {
    public int singleNumber(int[] A) {{
            for (int i = 1; i < A.length; ++i)
                A[0] ^= A[i];
             return A[0];
        } 
    }
}
