package binarysearchtree;

public class TreeNode {
	int key;
	int value;
	TreeNode left;
	TreeNode right;

	public TreeNode(int key, int value) {
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public int getKey() {
		return key;
	}
	
	public int getValue() {
		return value;
	}
	
	public  boolean isInternal() {
		return (left != null || right != null);
	}

	public TreeNode getLeft() {
		return this.left;
	}

	public TreeNode getRight() {
		return this.right;
	}
	
	public void setLeft(TreeNode node) {
		this.left = node;		
	}
	
	public void setRight(TreeNode node) {
		this.right = node;
	}
}
