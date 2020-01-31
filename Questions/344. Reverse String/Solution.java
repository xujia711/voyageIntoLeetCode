class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i * 2 < s.length - 1; i++) {
            int r = s.length - 1 - i;
            char t = s[r];
            s[r] = s[i];
            s[i] = t;
        }
    }
}