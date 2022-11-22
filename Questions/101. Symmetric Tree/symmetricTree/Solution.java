package symmetricTree;

import java.util.Arrays;

class Solution {

    public static boolean isSymmetric(TreeNode root) {
        return false;
    }

    public static void main(String[] args) {
        test(false, new Integer[]{3, 9, 20, null, null, 15, 7});
        test(false, new Integer[]{1, 2});
        test(true, new Integer[]{null});
        test(true, new Integer[]{1, 2, 2, 3, 3, 3, 3, 4, null, null, null, null, null, null, 4});
        test(false, new Integer[]{1, 2, 2, 0, 3, 3, 3, 4, null, null, null, null, null, null, 4});
    }

    private static void test(boolean expectedResult, Integer[] testData) {
        boolean calculatedResult = isSymmetric(readNode(0, testData));
        boolean passed = calculatedResult == expectedResult;
        System.out.println((passed ? "Passed" : "Failed") + " - " + Arrays.toString(testData)
                + (passed ? "" : " Calculated result: " + calculatedResult + "; expected result: " + expectedResult));
    }

    private static TreeNode readNode(int i, Integer[] array) {
        if (i >= array.length || array[i] == null) {
            return null;
        }

        TreeNode node = new TreeNode(array[i]);
        node.left = readNode(i * 2 + 1, array);
        node.right = readNode(i * 2 + 2, array);
        return node;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}