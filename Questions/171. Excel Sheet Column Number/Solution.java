class Solution {
    public int titleToNumber(final String s) {
        final char[] array = s.toCharArray();
        int total = 0;

        for (int i = array.length - 1; i >= 0; i --) {
            int times = 1;

            for (int j = 0; j < array.length - 1 - i; j ++) {
                times *= 26;
            }

            total += (array[i] - 'A' + 1) * times;
        }

        return total;
    }
}