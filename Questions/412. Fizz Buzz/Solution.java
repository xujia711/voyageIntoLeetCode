class Solution {
    public List<String> fizzBuzz(int n) {
        final List<String> strings = new ArrayList(n);

        for (int i = 1; i <= n; i++) {
            final boolean fizz = i % 3 == 0;
            final boolean buzz = i % 5 == 0;
            final String val;

            if (!fizz && !buzz) {
                val = String.valueOf(i);
            } else if (fizz && !buzz) {
                val = "Fizz";
            } else if (!fizz && buzz) {
                val = "Buzz";
            } else {
                val = "FizzBuzz";
            }

            strings.add(val);
        }

        return strings;
    }
}