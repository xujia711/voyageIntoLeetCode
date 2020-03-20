class Solution {
    public int firstUniqChar(String s) {
        if (s == null || s.equals("")) {
            return -1;
        }

        if (s.length() == 1) {
            return 0;
        }

        int index = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int i = s.indexOf(c);

            if (i >= 0 && i == s.lastIndexOf(c)) {
                index = i < index ? i : index;
            }
        }

        return index == s.length() ? -1 : index;
    }
}