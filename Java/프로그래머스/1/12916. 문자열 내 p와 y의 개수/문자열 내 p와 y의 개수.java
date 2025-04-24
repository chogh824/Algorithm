class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            } else if (s.charAt(i) == 'y') {
                count--;
            } else {
                continue;
            }
        }
        if (count == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}