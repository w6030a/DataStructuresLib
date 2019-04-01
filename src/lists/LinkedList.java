package lists;

import trees.node.ListNode;

/**
 * 
 * @author PeterTheLiar
 *
 *	problematic
 */
public class LinkedList {
	ListNode head = null;
	int size = 0;
	
	public LinkedList(int... nums) {
		for(int i : nums) {
			add(new ListNode(i));
		}
	}
	
	public ListNode head() {
		return head;
	}
	
	public int size() {
		return size;
	}
	
	public boolean empty() {
		return head == null;
	}
	
	public void add(ListNode node) {
		if(head == null)
			head = node;
		
		ListNode temp  = getLast();
		temp.setNext(node);
		node.setNext(null);
		this.size++;
	}
	
	private ListNode getLast() {
		ListNode temp  = head;
		
		while(temp.hasNext()) {
			temp = temp.getNext();
		}
		
		return temp;
	}
	
	public void delete(ListNode node) {

	}
	
	public void removeDuplicate() {
		ListNode current = head;
		
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
		ListNode temp = head;
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
	
	public void reverse() {
		ListNode last = null;
		ListNode curr = head();
		ListNode temp;
		
		while(curr != null) {
			temp = curr.getNext();
			curr.setNext(last);
			
			last = curr;
			curr = temp;
		}
		
		this.head = last;
	}
}
