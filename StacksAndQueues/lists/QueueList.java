package lists;

public class QueueList {
	private Frame head;
	private Frame tail;
	
	public QueueList() {
		this.head=null;
		this.tail=null;
	}
	
	
	public void enqueue(Frame frame) {
		if(this.head==null) {
			this.head=frame;
			this.tail=frame;
		}else {
			tail.next=frame;
			tail=frame;
		}
	}
	
	public Frame dequeue() {
		Frame frame=null;
		if(this.head!=null) {
			frame=head;
			head=head.next;
		}
		return frame;
	}

	public void show() {
		Frame current = head;
		while(current!=null) {
			System.out.printf("[%d]: %s\n", current.frameID, current.str);
			current=current.next;
		}
	}
	
	
	public static void main(String[] args) {
		QueueList queue = new QueueList();
		
		queue.enqueue(new Frame(1,"One"));
		queue.enqueue(new Frame(2,"Two"));
		queue.enqueue(new Frame(3,"Three"));
		queue.enqueue(new Frame(4,"Four"));
		
		queue.show();
		
		queue.dequeue();
		queue.show();
		
		
		
	}
}
