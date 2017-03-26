package binarysearchtree;

public class TreeNodeComparator {

	public boolean isLess(TreeNode node1, TreeNode node2) {
		return node1.getKey() < node2.getKey();
	}
}
