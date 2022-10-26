package maxDepthOfBinaryTree;

import java.util.Arrays;

class Solution {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        test(3, new Integer[]{3, 9, 20, null, null, 15, 7});
        test(2, new Integer[]{1, 2});
        test(0, new Integer[]{null});
        test(4, new Integer[]{1, 2, 3, 4, 5, 6, 6, 6, 6, 6});
    }

    private static void test(int expectedResult, Integer[] testData) {
        int calculatedResult = maxDepth(readNode(0, testData));
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