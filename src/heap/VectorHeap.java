package heap;

import java.util.Vector;

/**
 * 
 * @author Peter C
 * 
 * size()      = O(1)
 * empty()     = O(1)
 * min()       = O(1)
 * insert()    = O(log(n))
 * removeMin() = O(log(n))
 * sort()	   = O(n*log(n))
 * find()      = TODO
 * 
 */
public class VectorHeap extends Heap {
	Vector<TreeNode> vector = new Vector<TreeNode>();
	TreeNodeComparator TreeNodeComparator = new TreeNodeComparator();
	
	public VectorHeap(TreeNode[] nodes) {
		//TODO: buttom-up heap construction
	}
	
	@Override
	public boolean empty() {
		return vector.isEmpty();
	}

	@Override
	public int size() {
		return vector.size();
	}
	
	@Override
	public void append(TreeNode node) {
		vector.add(node);		
	}
	
	@Override
	public void removeLast() {
		vector.remove(vector.size()-1);		
	}

	public void insert(TreeNode node) {
		append(node);
		
		int nodePos = vector.size()-1;
		int parentPos;
		// bubble up
		while(nodePos != 0) {
			parentPos = parent(nodePos);
			if(!TreeNodeComparator.isLess(vector.elementAt(nodePos), vector.elementAt(parentPos)))
				break;
			swap(nodePos, parentPos);
			nodePos = parentPos;
		}
	}
	
	public TreeNode min() {
		return vector.elementAt(root());
	}
	
	public TreeNode removeMin() {
		if(vector.size() == 0) 
			return null;
		if(vector.size() == 1) {
			TreeNode temp = vector.elementAt(root());
			removeLast();
			return temp;
		}
		swap(root(), last());
		removeLast();
		
		int nodePos = root();
		// bubble down
		while(hasLeft(nodePos)) {
			int smallerChildPos = left(nodePos);
			if(hasRight(nodePos) && TreeNodeComparator.isLess(vector.elementAt(right(nodePos)), vector.elementAt(smallerChildPos)))
				smallerChildPos = right(nodePos);
			if(!TreeNodeComparator.isLess(vector.elementAt(smallerChildPos), vector.elementAt(nodePos)))
				break;
			swap(smallerChildPos, nodePos);
			nodePos = smallerChildPos;
		}
		
		return vector.elementAt(nodePos);
	}

	public 
	@Override
	public void swap(int index1, int index2) {
		TreeNode temp = vector.elementAt(index1);
		vector.set(index1, vector.elementAt(index2)); 
		vector.set(index2, temp);
	}

	@Override
	public int find(int key) {
		// TODO:
		throw new RuntimeException("Not implemented yet");
	}

	@Override
	public int root() {
		return 0;
	}

	@Override
	public int last() {
		return vector.size()-1;
	}

	@Override
	public int left(int index) {
		return index*2+1;
	}

	@Override
	public int right(int index) {
		return index*2+2;
	}

	@Override
	public int parent(int index) {
		return (index-1)/2;
	}

	@Override
	public boolean hasLeft(int index) {
		return index*2+1 < vector.size();
	}

	@Override
	public boolean hasRight(int index) {
		return index*2+2 < vector.size();
	}
}
