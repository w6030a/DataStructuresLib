package trees;

import trees.node.Node;

public abstract class BinaryTreeInterface {
	// operations for a b-tree
	public abstract boolean empty();
	public abstract int size();
	public abstract int root(); // return index instead of the node
	public abstract int last(); // return index instead of the node
	public abstract void append(Node node);
	public abstract void removeLast(); // return index instead of the node
	public abstract int left(int index); // return index instead of the node
	public abstract int right(int index); // return index instead of the node
	public abstract int parent(int index); // return index instead of the node
	public abstract boolean hasLeft(int index);
	public abstract boolean hasRight(int index);
	public abstract void swap(int index1, int index2);
	public abstract int find(int key); // return index instead of the node
}
