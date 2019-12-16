package Algorithm.leetcode.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Created by tujietg on Dec 16, 2019
 */
public class No257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> endList = new ArrayList<String>();
		if (root != null) {
			fun(root, "", endList);
		}
		return endList;
	}

	void fun(TreeNode root, String path, List<String> endList) {
		if (root.left == null && root.right == null) {
			endList.add(path + root.val);
		}
		if (root.left != null) {
			fun(root.left, path + root.val + "->", endList);
		}

		if (root.right != null) {
			fun(root.right, path + root.val + "->", endList);
		}
	}
}
