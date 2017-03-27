package trees;

import trees.node.TreeNode;
import trees.node.TreeNodeComparator;

/**
 * 
 * @author PeterTheLiar
 *
 *	Problematic
 */
public class BinarySearchTree {
	TreeNode root = null;
	int size = 0;
	TreeNodeComparator tnComparator = new TreeNodeComparator(); 
	
	public BinarySearchTree() {
		
	}
	
	public TreeNode find(int key) {
		return find(root, key);
	}
	
	private TreeNode find(TreeNode node, int key) {
		if(node == null)
			return node;
		
		if(node.getKey() == key)
			return  node;
		
		if(!node.isInternal())
			return null;
		
		TreeNode nodeFound = null;
		if(key > node.getKey())
			nodeFound = find(node.getRight(), key);
		else
			nodeFound = find(node.getLeft(), key);
		return nodeFound;
	}
	
	public void add(TreeNode node) {
		size++;
		if(root == null) {
			root = node;			
			return;
		}
		
		add(root, node);
	}
	
	private void add(TreeNode nodeInTree, TreeNode newNode) {
		if(!nodeInTree.isInternal()) {
			if(tnComparator.isLess(nodeInTree, newNode))
				nodeInTree.setRight(newNode);
			else
				nodeInTree.setLeft(newNode);
			return;
		}
					
		if(nodeInTree.getLeft() == null && !tnComparator.isLess(nodeInTree, newNode)) {
			nodeInTree.setLeft(newNode);
			return;
		}
		if(nodeInTree.getRight() == null && tnComparator.isLess(nodeInTree, newNode)) {
			nodeInTree.setRight(newNode);
			return;
		}
		
		if(tnComparator.isLess(nodeInTree, newNode))
			add(nodeInTree.getRight(), newNode);
		else
			add(nodeInTree.getLeft(), newNode);
	}
	
	public void delete(int key) {
		
	}
}
