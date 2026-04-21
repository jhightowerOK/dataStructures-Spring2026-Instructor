package lists;

import lists.Frame;

public class StackList {
	private Frame stackPtr;
	
	public StackList() {
		this.stackPtr=null;
	}
	
	public void push(Frame frame) {
		if(this.stackPtr==null) {
			this.stackPtr=frame;
		}else {
			frame.next=this.stackPtr;
			this.stackPtr=frame;
		}
	}
	
	public Frame pop() {
		Frame frame = this.stackPtr;
		this.stackPtr=this.stackPtr.next;
		return frame;
	}
	
	public Frame peek() {
		return this.stackPtr;
	}
	
	public static void main(String[] args) {
		StackList stack = new StackList();
		
		stack.push(new Frame(1,"One"));
		System.out.println(stack.peek().toString());
		
		stack.push(new Frame(2,"Two"));
		System.out.println(stack.peek().toString());
		
		stack.push(new Frame(3,"Three"));
		System.out.println(stack.peek().toString());
		
		stack.pop();
		System.out.println(stack.peek().toString());
		
		
		
	}
}
