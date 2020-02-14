class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] array = new int[26];

        for (char c : s.toCharArray()) {
            array[c - 'a'] ++;
        }

        for (char c : t.toCharArray()) {
            array[c - 'a'] --;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }

        return true;
    }
}