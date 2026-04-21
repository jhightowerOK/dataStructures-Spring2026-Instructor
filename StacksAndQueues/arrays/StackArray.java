package arrays;

public class StackArray {
	private Frame[] frames;
	private int stackPtr;
	
	public StackArray(int size) {
		this.frames = new Frame[size];
		this.stackPtr=-1;
	}
	
	public void push(Frame frame) {
		this.stackPtr++;
		this.frames[this.stackPtr]=frame;
	}
	
	public Frame pop() {
		Frame frame = this.frames[this.stackPtr];
		if(this.stackPtr>=0) {
			this.stackPtr--;
		}
		return frame;
	}
	
	public Frame peek() {
		Frame frame=null;
		if(this.stackPtr>=0) {
			frame=this.frames[this.stackPtr];
		}
		return frame;
	}
	
	public static void main(String[] args) {
		StackArray stack = new StackArray(20);
		
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
