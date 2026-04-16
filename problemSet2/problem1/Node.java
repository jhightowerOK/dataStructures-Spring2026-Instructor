package problem1;

public class Node {
	public String id;
	public Node prev;
	public Node next;
	
	public Node(String id) {
		this.id=id;
		this.prev=this;
		this.next=this;
	}
}
