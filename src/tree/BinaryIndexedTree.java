package tree;

/*
 * aka Fenwick Tree
 * 
 * It's an extra array storing partial sum of another array
 * Index in tree is original array's +1
 * While updating value, a node's parent is at the node's index PLUS the index's lowest bit
 * While getting value, sum, a node's parent is at the node's index MINUS the index's lowest bit
 * 
 * biTree[n] returns the sum of first n elements in the array
 */
public class BinaryIndexedTree {
	int[] originalArray;
	int[] biTree;
	
	public BinaryIndexedTree(int[] originalArray) {
		this.originalArray = originalArray;
		biTree = new int[this.originalArray.length+1];
		
		constructTree();
	}

	public void updateValue(int index, int value) {
		System.out.println(String.format("Updating Tree"));
		while(index < biTree.length) {
			biTree[index] += value;
			System.out.println(String.format("\tupdating value in tree for index:[%d], value:[%s]", index, value));
			index += getLowBit(index);
		}
	}

	public int getSum(int index) {
		System.out.println(String.format("Retrieving Sum"));
		int sum = 0;
		while(index>0) {
			sum += biTree[index];
			System.out.println(String.format("\tAdding value to sum from index:[%d], value:[%s]", index, biTree[index]));
			index -= getLowBit(index);
		}
		
		return sum;
	}
	
	public void printTree() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tree: [");
		for(int i=0; i<biTree.length; i++) {
			sb.append(biTree[i]);
			sb.append(" ");
		}
		sb.append("]");
		System.out.println(sb.toString());
	}
	
	private void constructTree() {
		System.out.println(String.format("Constructing Tree"));
		// init 0's in biTree
		for(int i=0; i<biTree.length; i++) {
			biTree[i] = 0;
		}
		
		// filling biTree by adding value to node at index+1 and all its ancestors
		for(int i=0; i<originalArray.length;i++) {
			updateValue(i+1, originalArray[i]);
		}
	}

	private int getLowBit(int index) {
		return (-index) & index;
	}

}
