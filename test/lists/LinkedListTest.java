package lists;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.node.ListNode;

public class LinkedListTest {

	@Test
	public void testAddNodesSeparately() {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		LinkedList linkedList = new LinkedList();
		linkedList.add(node1);
		linkedList.print();
		linkedList.add(node2);
		linkedList.print();
		linkedList.add(node3);
		linkedList.print();
	}
	
	@Test
	public void testAddNodesAtInitialization() {
		LinkedList linkedList = new LinkedList(1, 2, 3);
		linkedList.print();
	}

	@Test
	public void testAddNodesAtInitializationAndSeparately() {
		LinkedList linkedList = new LinkedList(1, 2, 3);
		linkedList.print();
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		
		linkedList.add(node1);
		linkedList.print();
		linkedList.add(node2);
		linkedList.print();
		linkedList.add(node3);
		linkedList.print();
		
		
	}
}
