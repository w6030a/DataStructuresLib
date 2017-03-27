package lists;

import trees.node.ListNode;

/**
 * 
 * @author PeterTheLiar
 *
 *	problematic
 */
public class LinkedList {
	ListNode begin = null;
	int size = 0;
	
	public LinkedList(int... nums) {
		for(int i : nums) {
			add(new ListNode(i));
		}
	}
	
	public ListNode begin() {
		return begin;
	}
	
	public int size() {
		return size;
	}
	
	public boolean empty() {
		return begin == null;
	}
	
	public void add(ListNode node) {
		if(begin == null)
			begin = node;
		
		ListNode temp  = begin;
		// get the last node
		while(temp.getNext() != null) {
			temp = temp.getNext();
		}
		temp.setNext(node);
		node.setNext(null);
		this.size++;
	}
	
	public void delete(ListNode node) {

	}
	
	public void removeDuplicate() {
		ListNode current = begin;
		
		while(current.hasNext()) {
			print(current);
			print();
			ListNode temp = current.getNext();
			if(current.getNext().getValue() == current.getValue()) {
				current.setNext(current.getNext().getNext());
				size--;
			}
			current = temp;
		}
	}
	
	public void print() {
		ListNode temp = begin;
		while(temp != null) {
			System.out.print(temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}
	
	public void print(ListNode node) {
		ListNode temp = node;
		while(temp != null) {
			System.out.print(temp.getValue());
			temp = temp.getNext();
		}
		System.out.println();
	}
}
