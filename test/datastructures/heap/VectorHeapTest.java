package datastructures.heap;

import static org.junit.Assert.*;
import heap.TreeNode;
import heap.VectorHeap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class VectorHeapTest {
	VectorHeap vHeap = new VectorHeap();
	
	@Before
	public void setUP() {
		
	}
	
	@After
	public void tearDown() {
		
	}
	
	@Test
	public void testMin() {
		vHeap.insert(new TreeNode(1, 3));
		vHeap.insert(new TreeNode(0, 2));
		vHeap.insert(new TreeNode(4, 6));
		vHeap.insert(new TreeNode(8, 10));
		vHeap.insert(new TreeNode(2, 4));
		
		assertEquals(0, vHeap.min().getKey());
		
		vHeap.removeMin();
		assertEquals(1, vHeap.min().getKey());
		
		vHeap.removeMin();
		assertEquals(2, vHeap.min().getKey());
		
		vHeap.removeMin();
		assertEquals(4, vHeap.min().getKey());
		
		vHeap.removeMin();
		assertEquals(8, vHeap.min().getKey());
		
		vHeap.removeMin();
		assertEquals(0, vHeap.size());
	}
}
