import java.util.*;

class Solution {
    public String solution(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        if (len % 2 == 0) {
            sb.append(s.charAt(len/2 - 1));
            sb.append(s.charAt(len/2));
        } else {
            sb.append(s.charAt(len/2));
        }
        return sb.toString();
    }
}