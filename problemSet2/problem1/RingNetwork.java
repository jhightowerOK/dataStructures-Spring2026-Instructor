package problem1;

public class RingNetwork {
	private Node head;
	private Node tail;
	
	public RingNetwork() {
		head=null;
		tail=null;
	}
	
	public void addNode(String id) {
		Node node = new Node(id);
		if(this.head==null) {
			head=node;
			tail=node;
		}else {
			tail.next=node;
			node.next=head;
			node.prev=tail;
			tail=node;
			head.prev=tail;
		}
	}
	
	public void show() {
		Node current=head;
		do{
			System.out.printf("------------\n");
			System.out.printf("Ref:  %s\n",current);
			System.out.printf("Data: %s\n",current.id);
			System.out.printf("Next: %s\n\n",current.next);
			System.out.printf("Prev: %s\n\n",current.prev);
			current=current.next;
		}while(current!=head);
	}
}
