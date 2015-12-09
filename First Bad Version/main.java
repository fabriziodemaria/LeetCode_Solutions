class VersionControl.
      boolean isBadVersion(int version); */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = (n)/2;
        int l = 1;
        int r = n;
                while(r > l){
            System.out.println("l " + l + " and r " + r);
            if (isBadVersion(i)) {
                //go left
                r = i;
                i = l + (r-l)/2;
            } else {
                //go right
                l = i + 1;
                i = l + (r-l)/2;
            }
        }
        return isBadVersion(l) ? l : (l+1);
            }
}
