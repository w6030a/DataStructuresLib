package trees.node;

public class TreeNode extends Node {
	TreeNode left;
	TreeNode right;

	public TreeNode(int key, int value) {
		super(key, value);
		this.left = null;
		this.right = null;
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
