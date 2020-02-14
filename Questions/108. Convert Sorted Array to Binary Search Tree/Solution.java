/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return load(nums, 0, nums.length - 1);
    }

    private TreeNode load(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else if (start == end) {
            return new TreeNode(nums[start]);
        }

        int middle = (start + end + 1) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = load(nums, start, middle - 1);
        node.right = load(nums, middle + 1, end);
        return node;
    }
}