package trees;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tree.BinaryIndexedTree;

public class BinaryIndexedTreeTest {
	@Before
	public void setUP() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void test() {
		int[] arr = {1, 2, 3};
		BinaryIndexedTree biTree = new BinaryIndexedTree(arr);
		assertEquals(1, biTree.getSum(1));
		assertEquals(3, biTree.getSum(2));
		assertEquals(6, biTree.getSum(3));
		biTree.printTree();
	}
	
	@Test
	public void test2() {
		int[] arr = {1, 3, 2};
		BinaryIndexedTree biTree = new BinaryIndexedTree(arr);
		assertEquals(1, biTree.getSum(1));
		assertEquals(4, biTree.getSum(2));
		assertEquals(6, biTree.getSum(3));
		biTree.printTree();
	}
	
	@Test
	public void test3() {
		int[] arr = {1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2, 1, 3, 2};
		BinaryIndexedTree biTree = new BinaryIndexedTree(arr);
		assertEquals(1, biTree.getSum(1));
		assertEquals(4, biTree.getSum(2));
		assertEquals(6, biTree.getSum(3));
		biTree.printTree();
	}
}
