package binarysearchtree;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {
	BinarySearchTree bsTree;
	@Before
	public void setUp() throws Exception {
		 bsTree = new BinarySearchTree();
		 bsTree.add(new TreeNode(0, 2));
		 bsTree.add(new TreeNode(3, 5));
 		 bsTree.add(new TreeNode(1, 3));
		 bsTree.add(new TreeNode(10, 12));
		 bsTree.add(new TreeNode(8, 10));
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testFind() {
		assertEquals(null, bsTree.find(10000));
		assertEquals(2, bsTree.find(0).getValue());
		assertEquals(5, bsTree.find(3).getValue());
		assertEquals(3, bsTree.find(1).getValue());
		assertEquals(12, bsTree.find(10).getValue());
		assertEquals(10, bsTree.find(8).getValue());
	}

}
