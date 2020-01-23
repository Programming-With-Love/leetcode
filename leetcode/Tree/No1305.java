package Algorithm.leetcode.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * No1305
 * 
 * Created by tujietg on Jan 23, 2020
 */
public class No1305 {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		addList(root1);
		addList(root2);
		Collections.sort(list);
		return list;
	}

	public void addList(TreeNode node) {
		if (node == null) {
			return;
		}
		list.add(node.val);
		addList(node.left);
		addList(node.right);
	}

}
