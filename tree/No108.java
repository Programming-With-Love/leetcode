
/**
 * Created by tujietg on Nov 6, 2019
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length - 1);
    }

    // 方法对数组生成树 每个数组的中间值等于每个树或者子树的根节点
    public static TreeNode toBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = toBST(nums, start, mid - 1);
        node.right = toBST(nums, mid + 1, end);
        return node;
    }
}