package trees.node;

public class ListNode extends Node {
	private ListNode next;
	
	public ListNode(int value) {
		super(0, value);
		this.next = null;
	}
	
	public ListNode getNext() {
		return next;
	}
	
	public void setNext(ListNode node) {
		this.next = node;
	}
	
	public boolean hasNext() {
		return next != null;
	}
}
