package main;

import lists.LinkedList;
import trees.node.ListNode;

public class main {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList(1, 2);
		linkedList.print();
		
		linkedList.reverse();
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

		linkedList.reverse();
		linkedList.print();
	}
}
