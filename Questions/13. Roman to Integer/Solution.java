class Solution {
    public int romanToInt(final String s) {
        int total = 0;
        char previous = 'S';

        for (char current : s.toCharArray()) {
            total += val(previous, current);
            previous = current;
        }

        return total;
    }

    private int val(final char previous, final char current) {
        switch (current) {
            case 'I':
                return 1;
            case 'V':
                return previous == 'I' ? 3 : 5;
            case 'X':
                return previous == 'I' ? 8 : 10;
            case 'L':
                return previous == 'X' ? 30 : 50;
            case 'C':
                return previous == 'X' ? 80 : 100;
            case 'D':
                return previous == 'C' ? 300 : 500;
            case 'M':
                return previous == 'C' ? 800 : 1000;
            default:
                return 0;
        }
    }
}