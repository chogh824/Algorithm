import java.lang.Math.*;

class Solution {
    public long solution(long n) {
        double root = Math.sqrt(n);
        if (root == (long) root) {
            return (long) Math.pow(root + 1, 2);
        } else {
            return -1;
        }
    }
}