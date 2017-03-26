package list;

public class ListNode {
	private int value;
	private ListNode next;
	
	public ListNode(int i) {
		this.value = i;
		this.next = null;
	}
	
	public int getValue() {
		return value;
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
