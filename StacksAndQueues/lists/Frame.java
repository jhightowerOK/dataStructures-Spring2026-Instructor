package lists;

public class Frame {
	int frameID;
	String str;
	Frame next;
	
	public Frame(int id, String str) {
		this.frameID=id;
		this.str=str;
		this.next=null;
	}
	
	public String toString() {
		return "[" + this.frameID + "]: " + this.str; 
	}
}
