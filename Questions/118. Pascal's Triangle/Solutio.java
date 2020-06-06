class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> previousRow = i - 1 < 0 ? Collections.emptyList() : list.get(i - 1);
            list.add(generateRow(previousRow, i));
        }

        return list;
    }

    private List<Integer> generateRow(List<Integer> previousRow, int index) {
        if (previousRow.isEmpty()) {
            return Collections.singletonList(1);
        }

        List<Integer> row = new ArrayList<>(index + 1);

        for (int i = 0; i < index + 1; i++) {
            Integer a = i - 1 < 0 ? 0 : previousRow.get(i - 1);
            Integer b = i >= previousRow.size() ? 0 : previousRow.get(i);
            row.add(a + b);
        }

        return row;
    }
}